package com.navettevatry.rem4u;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navettevatry.rem4u.common.resources.dto.EureCab.EuroCabRequest;
import com.navettevatry.rem4u.common.resources.dto.EureCab.EuroCabResponse;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.Coordinate;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficRequest;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficResponse;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.*;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.*;
import com.navettevatry.rem4u.common.resources.dto.here.*;
import com.navettevatry.rem4u.common.resources.dto.lecab.*;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.DropRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarRequest;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.dto.standard.Price;
import com.navettevatry.rem4u.common.resources.dto.uber.Idresponse;
import com.navettevatry.rem4u.common.resources.dto.uber.PickupTimeEstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.PriceEstimatesPromotionRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.ProductsRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.*;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.*;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.Address;
import com.navettevatry.rem4u.common.resources.enumeration.ComparatorSorter;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationsPresetRequestType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.PaymentType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.TripType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.comparator.Co2EmissionSorter;
import com.navettevatry.rem4u.common.utils.comparator.ComfortSorter;
import com.navettevatry.rem4u.common.utils.comparator.DelaySorter;
import com.navettevatry.rem4u.common.utils.comparator.PriceSorter;
import com.navettevatry.rem4u.common.utils.mapper.requests.LeCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.body.BooleanResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.comparator.comparatorLogic.ComparisonAlternatives;
import com.navettevatry.rem4u.comparator.comparatorLogic.ComparisonService;
import com.navettevatry.rem4u.comparator.controllers.RequestVTCsController;
import com.navettevatry.rem4u.comparator.enrichers.HereService;
import com.navettevatry.rem4u.comparator.enrichers.TomtomService;
import com.navettevatry.rem4u.comparator.platforms.*;
import com.uber.sdk.rides.client.model.PriceEstimate;
import com.uber.sdk.rides.client.model.Product;
import com.uber.sdk.rides.client.model.Promotion;
import com.uber.sdk.rides.client.model.TimeEstimate;
import okhttp3.*;
import org.apache.commons.lang3.StringEscapeUtils;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Rem4uComparatorApplication extends SpringBootServletInitializer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Rem4uComparatorApplication.class);

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    SnapCarService snapCarService;
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    LeCabService leCabService;

    @Autowired
    UberService uberService;

    @Autowired
    BcvtcService bcvtcService;

    @Autowired
    HereService hereService;

    @Autowired
    TomtomService tomtomService;

    @Autowired
    ComparisonService comparisonService;

    @Autowired
    RequestVTCsController requestVTCsController;

    @Autowired
    EureCabService euroCabService;

    @Autowired
    UrbanDriverService  urbanDriverService;

    @Autowired
    AlloCabService alloCabService;

    @Value("${spring.profiles.active}")
    private String profile;

    public static void main(String[] args) {
        SpringApplication.run(Rem4uComparatorApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Rem4uComparatorApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {

        if(profile.equals("dev")){
            RestTemplate restTemplate = new RestTemplate();
            org.springframework.http.HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(org.springframework.http.MediaType.APPLICATION_JSON));
            headers.add("Authorization", "X-Api-Key 89696335d20acc59d7060642ba312cc6"); //API key authentication

//        LocationsSearchRequest locationRequest = new LocationsSearchRequest(new LocationRequest(null,null,null,"12 rue médéric"), 1);

//        EstimationRequest estimationRequest1 = new EstimationRequest(1.1f,"commercial@navettevatry.fr","13 rue Jean Beausire, 75004 Paris","63 Avenue Jean Jaurès, 93000 Bobigny",4,50);
//
//        HttpEntity<EstimationRequest> entity = new HttpEntity<>(estimationRequest1 , headers);
//
//        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
//
//
//        String apikey= "538b2a08e0edc7e8ceb4a6f572e4d798";
//        Map<String, String> urlParams = new HashMap<>();
//        urlParams.put("api-key", apikey);
//
////        String url = "https://api.bcvtc.fr/v1/driver/fare/{api-key}";
//        String url = "https://api.bcvtc.fr/v1/driver/fare/538b2a08e0edc7e8ceb4a6f572e4d798";
//        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);
//        System.out.println(builder.buildAndExpand(urlParams).toUri());
//
//        ResponseEntity<EstimationResponse> estimationResponseResponseEntity = restTemplate.exchange(url/*builder.buildAndExpand(urlParams).toUri()*/, HttpMethod.POST, entity, EstimationResponse.class);
//        LOGGER.debug(estimationResponseResponseEntity.getBody().toString());

//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        okhttp3.MediaType mediaType = MediaType.parse("application/json");
//        RequestBody body = RequestBody.create(mediaType, "{\n    \"Email\":\"commercial@navettevatry.fr\",\n    \"PickUp\":\"13 rue Jean Beausire, 75004 Paris\",\n    \"DropOff\":\"63 Avenue Jean Jaurès, 93000 Bobigny\",\n    \"TripType\":1.1,\n    \"Hours\":4,\n    \"Kms\":50\n}");
//        Request request = new Request.Builder()
//                .url("https://api.bcvtc.fr/v1/driver/fare/538b2a08e0edc7e8ceb4a6f572e4d798")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/json")
//                .build();
//        Response response = client.newCall(request).execute();
//        LOGGER.debug(response.body().string());

            VTCComparatorRequest vtcComparatorRequest = new VTCComparatorRequest(false, new VTCLocation(null,43.296482F, 5.36978F,"12 rue médéric"),
                    new VTCLocation(null,45.760610f, 4.859190f,"Lyon Part Dieu"), true, new Date(),
                    new Passengers(1,1,1,3),
                    new TripTypeDetails(TripType.DEFAULT, null, null, null , null, null),
                    new TripOptions(null,null, 2,null));

            LocationsSearchRequest locationsSearchRequest = new LocationsSearchRequest(new LocationRequest(null,null,null,"12 rue médéric"), 4);
            try {
                LocationsSearchResponse locationsSearchResponse =leCabService.searchLocations(locationsSearchRequest);
                LOGGER.debug("No functions: "+locationsSearchResponse.toString());
                LocationsSearchResponse locationsSearchResponse1 =
                        leCabService.searchLocations(LeCabRequestsMapper.VTCComparatorRequestToLocationsSearchRequest.apply(vtcComparatorRequest));
                LOGGER.debug("using functions: "+locationsSearchResponse1.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try {
                LocationsSearchResponse locationsSearchResponse =leCabService.searchLocations(locationsSearchRequest);
                LocationsPresetRequest locationsPresetRequest = new LocationsPresetRequest(
                        locationsSearchResponse.getLocations().get(0).getId(), LocationsPresetRequestType.MEETING_POINT);
                LocationsSearchResponse locationsSearchResponse1 = leCabService.presetLocations(locationsPresetRequest);
                LOGGER.debug(locationsSearchResponse1.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            ServicesAvailableRequest servicesAvailableRequest = new ServicesAvailableRequest(new LocationRequest(null,null,null,"12 rue médéric"));
            try {
                ServicesAvailableResponse servicesAvailableResponse = leCabService.availableServices(servicesAvailableRequest);
                LOGGER.debug(servicesAvailableResponse.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }


            ServicesEstimateRequest servicesEstimateRequest = new ServicesEstimateRequest(new LocationRequest(null,null,null,"12 rue médéric"),
                    ServicesAvailableResponseType.P508, new PaymentShort(PaymentType.CASH_AT_DROP));
            try {
                ServicesEstimateResponse servicesEstimateResponse = leCabService.servicesEstimate(servicesEstimateRequest);
                LOGGER.debug(servicesEstimateResponse.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            JobsSearchRequest jobsSearchRequest = new JobsSearchRequest(new CustomReferences(new HashMap<>()));
            try {
//        LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jobsSearchRequest));
                JobsSearchResponse jobsSearchResponse = leCabService.jobsSearch(jobsSearchRequest);
                LOGGER.debug(jobsSearchResponse.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }
            ArrayList<StrictLocationRequest> stops = new ArrayList<>();
            stops.add(new StrictLocationRequest(null,new Float(48.8855659),new Float(2.312389)));
            JobsEstimateRequest jobsEstimateRequest = new JobsEstimateRequest("00000000-0000-0000-0000-000000000000",
                    new StrictLocationRequest(null,new Float(48.879624),new Float(2.303562)),
                    new StrictLocationRequest(null,new Float(48.879624),new Float(2.303562)),
                    stops,ServicesAvailableResponseType.P508,new Date(1464015360), new PaymentShort(PaymentType.CARD), "string");
            LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jobsEstimateRequest));
            try{
                JobsEstimateResponse jobsEstimateResponse = leCabService.jobsEstimate(jobsEstimateRequest);
                LOGGER.debug(jobsEstimateResponse.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                JobsEstimateResponse jobsEstimateResponse = leCabService.jobsQuote(jobsEstimateRequest);
                LOGGER.debug(jobsEstimateResponse.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                List<Product> products = uberService.getProducts(new ProductsRequest(37.79f, -122.39f));
                LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(products));
                List<TimeEstimate> timeEstimates = uberService.getPickupTimeEstimate(new PickupTimeEstimateRequest(37.79f, -122.39f,products.get(0).getProductId()));
                LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(timeEstimates));
                List<PriceEstimate> priceEstimates = uberService.getPriceEstimates(new PriceEstimatesPromotionRequest(37.79f, -122.39f,90.79f, -122.39f));
                LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(priceEstimates));
                Promotion promotion = uberService.getPromotion(new PriceEstimatesPromotionRequest(37.79f, -122.39f,90.79f, -122.39f));
                LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(promotion));
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                EstimationRequest estimationRequest = new EstimationRequest(1.1f,null,"13 rue Jean Beausire, 75004 Paris","63 Avenue Jean Jaurès, 93000 Bobigny",4,50);
                Estimation estimation = bcvtcService.getEstimation(estimationRequest);
//            EstimationResponse estimation = bcvtcService.getEstimation(estimationRequest);
                LOGGER.debug(estimation.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                List<Forfait> forfaits= bcvtcService.getForfaits();
//            ForfaitResponse forfaits= bcvtcService.getForfaits();
                LOGGER.debug(forfaits.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                List<CarClass> carClasses = bcvtcService.getClasses();
                LOGGER.debug(carClasses.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            try{
                List<Car> cars= bcvtcService.getCars();
                LOGGER.debug(cars.toString());
            }catch (Exception e){
                LOGGER.debug(e.toString());
            }

            //comparison test

            List<VTCLocation> vtcLocations = new ArrayList<>();
            vtcLocations.add(new VTCLocation("1",37.79f, -122.39f,"abcdefg"));
            vtcLocations.add(new VTCLocation("2",511.79f, 22.39f,"mnbv"));
            vtcLocations.add(new VTCLocation("asdasd",879.79f, 2.39f,"dssdsd"));
            vtcLocations.add(new VTCLocation("564",3.79f, -1.39f,"abewdsd"));
            vtcLocations.add(new VTCLocation("zxczfc",31.79f, -2.39f,"wewefg"));
            vtcLocations.add(new VTCLocation("asd",10.79f, -1546.39f,"sdsd"));

            List<VTCLocation> java8ComparatorSort = ComparisonAlternatives.java8ComparatorSorting(vtcLocations);
            List<VTCLocation> beanComparatorSort = ComparisonAlternatives.beanComparatorSorting(vtcLocations);
//      List<VTCLocation> GoogleGuavaComparisonChainSort = ComparaisonAlternatives.GoogleGuavaComparisonChainSorting(vtcLocations));
            List<VTCLocation> ApacheCommonsCompareToBuilderSort = ComparisonAlternatives.ApacheCommonsCompareToBuilderSorting(vtcLocations);
            LOGGER.debug("java8ComparatorSorting: "+java8ComparatorSort);
//        LOGGER.debug("beanComparatorSorting:",ComparaisonAlternatives.beanComparatorSorting(vtcLocations));
//        LOGGER.debug("GoogleGuavaComparisonChainSorting:",ComparaisonAlternatives.GoogleGuavaComparisonChainSorting(vtcLocations));
//        LOGGER.debug("ApacheCommonsCompareToBuilderSorting:",ComparaisonAlternatives.ApacheCommonsCompareToBuilderSorting(vtcLocations));
//        List<Float> myList = Arrays.asList(1f,3f,1f,3f,1f,3f,1f,3f,1f,3f,1f,3f,1f,3f);
//        ConsumptionRequest consumptionRequest = new ConsumptionRequest();
//        consumptionRequest.setFreeFlowSpeedTable(myList);
//        LOGGER.debug(myList.stream().map(x ->  {return String.format(","+x);}).collect(Collectors.toList()).toString());
//        LOGGER.debug(myList.toString().replace("[","").replace("]","").replace(" ",""));
//        System.out.println(myList.toString().replace("[","").replace("]","").replace(" ",""));

            List<Object> comp = new ArrayList<>();
            comp.add(new Co2EmissionSorter());
            comp.add(new ComfortSorter());
            comp.add(new PriceSorter());
            comp.add(new DelaySorter());

            LOGGER.debug(comp.stream().collect(Collectors.toList()).toString());

            List<ComparatorSorter> comparators = new ArrayList<>();
            comparators.add(ComparatorSorter.CO2_EMISSION_SORTER);
            comparators.add(ComparatorSorter.COMFORT_SORTER);
            comparators.add(ComparatorSorter.DELAY_SORTER);
            comparators.add(ComparatorSorter.PRICE_SORTER);
            //Comparator<Offer>  comparator = comparisonService.getComparatorFromChainOrder(comparators);
            //LOGGER.info(comparator.toString());

            List<Offer> offers = new ArrayList<>();
            offers.add(new Offer(VTCPlatformName.UBER
                    , new Driver("Chakib Daii","+21653467890",null,null)
                    , new Vehicle("BMW",4,6,false,false, ComfortType.BUSINESS,50f)
                    , new Price("USD",20.0f),5));
            offers.add(new Offer(VTCPlatformName.BCVTC
                    , new Driver("Chakib Daii","+21653467890",null,null)
                    , new Vehicle("BMW",4,6,false,false, ComfortType.STANDARD,20f)
                    , new Price("USD",40.0f),0));
            offers.add(new Offer(VTCPlatformName.LYFT
                    , new Driver("Chakib Daii","+21653467890",null,null)
                    , new Vehicle("BMW",4,6,false,false, ComfortType.BUSINESS,25f)
                    , new Price("USD",150.0f),10));
            offers.add(new Offer(VTCPlatformName.ALLOCAB
                    , new Driver("Chakib Daii","+21653467890",null,null)
                    , new Vehicle("BMW",4,6,false,false, ComfortType.STANDARD,15f)
                    , new Price("USD",10.0f),15));
            LOGGER.info(offers.toString());
            LOGGER.info(comparisonService.sortByComfort(offers,null,null).toString());
            LOGGER.info(comparisonService.sortByCo2Emission(offers,null,null).toString());
            LOGGER.info(comparisonService.sortByDelay(offers,null,null).toString());
            LOGGER.info(comparisonService.sortByPrice(offers,null,null).toString());
            List<ComparatorSorter> comparatorsChain = new ArrayList<>();
            comparatorsChain.add(ComparatorSorter.CO2_EMISSION_SORTER);
            comparatorsChain.add(ComparatorSorter.COMFORT_SORTER);
            comparatorsChain.add(ComparatorSorter.DELAY_SORTER);
            comparatorsChain.add(ComparatorSorter.PRICE_SORTER);

            LOGGER.info(comparisonService.sortByGivenchainOrder(offers,comparatorsChain,null).toString());
            LOGGER.info(comparisonService.sortByPriorities(offers,comparatorsChain,null).toString());

            try{
                ConsumptionRequest consumptionRequest = new ConsumptionRequest(new Location(new Float(52.533864),new Float(13.357444),null),
                        "car",new Location(new Float(52.512139),new Float(13.438468),null),"summary",
                        Arrays.asList(0,0.239f,27,0.239f,45,0.259f,60,0.196f,75,0.207f,90,0.238f,100,0.26f,110,0.296f,120,0.337f,130,0.351f,250,0.351f),
                        Arrays.asList(0,0.349f,27,0.319f,45,0.329f,60,0.266f,75,0.287f,90,0.318f,100,0.33f,110,0.335f,120,0.35f,130,0.36f,250,0.36f),
                        1.8f,9f,4.3f);
                ConsumptionResponse consumptionResponse = hereService.getConsumption(consumptionRequest);
                LOGGER.info(consumptionResponse.toString());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            try{
                WeatherRequest weatherRequest = new WeatherRequest("observation","Berlin-Tegel");
                WeatherResponse weatherResponse = hereService.getWeather(weatherRequest);
                LOGGER.info(weatherResponse.toString());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            GenericResponse genericResponse = requestVTCsController.getVTCResponse(vtcComparatorRequest);
            //VTCComparatorResponse vtcComparatorResponse = genericResponse.getBody();
            try {
                LOGGER.info("{}", ((ObjectResponse<VTCComparatorResponse>)genericResponse.getBody()).getObject().toString());
            }catch (Exception e){
                LOGGER.info("{}", ((BooleanResponse)genericResponse.getBody()).isSuccess());
            }

            GenericResponse genericResponse1 = requestVTCsController.getVTCResponseAsync(vtcComparatorRequest);
            //VTCComparatorResponse vtcComparatorResponse = genericResponse.getBody();
            try {
                LOGGER.info("{}", ((ObjectResponse<Boolean>)genericResponse.getBody()).getObject().toString());
            }catch (Exception e){
//            LOGGER.info("{}", ((BooleanResponse)genericResponse.getBody()).isSuccess());
            }

            try{
                EuroCabRequest euroCabRequest = new EuroCabRequest(null, "France", "ASDAPA, Rue de la 8éme Division, Compiègne, France", new Date("27/03/2020 02:03"));
                EuroCabResponse euroCabResponse = euroCabService.getData(euroCabRequest);
                LOGGER.info(euroCabResponse.toString());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }



             TraficRequest tr = new TraficRequest();
            Coordinate c = new Coordinate();
            c.setLatitude(44);
            c.setLongitude(25);
            tr.setPoint(c);
            LOGGER.debug(String.valueOf(tr.getPoint().getLatitude()));
            LOGGER.info("dhia");

            TraficResponse t = tomtomService.getTrafic(tr);
            LOGGER.info(String.valueOf(t.getFlowSegmentData().getCoordinates().getCoordinate()));

            try {
                TraficResponse traficSpeed = tomtomService.getTrafic(tr);
                LOGGER.info("dhia");

                LOGGER.info(String.valueOf(traficSpeed.getFlowSegmentData().getCoordinates().getCoordinate().get(0).getLatitude()));
            }catch (Exception e){
               LOGGER.info("dhia");

                LOGGER.info(e.toString());
            }

            try {
                EstimateRequest estimateRequest = new EstimateRequest();
                estimateRequest.setDate(new Date());
                estimateRequest.setPickup(new DropRequest(49.57456d,1.95596d));
                estimateRequest.setDrop(new DropRequest(49.57456d,1.95596d));
                EstimateResponse estimateResponse = leCabService.estimate(estimateRequest);

                LOGGER.info(estimateResponse.toString());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            try {
                Idresponse uberid = uberService.getIDdep(vtcComparatorRequest);
                Idresponse uberid2 = uberService.getIDArr(vtcComparatorRequest);

                UberRequest uberRequest = new UberRequest();
                uberRequest.setLocale("fr-FR");
                uberRequest.setPickupLocation(new PickupLocation(
                        uberid.getResults().get(0).getPlaceID(),"Marseille","","google_places","fr",43.296482,5.36978
                ));
                uberRequest.setDestination(new Destination(
                        uberid2.getResults().get(0).getPlaceID(), "Lyon Part Dieu", "Place Charles Béraudier, Lyon, France", "google_places", "fr-FR"));

                UberResponse uberResponse = uberService.getFareEstimates(uberRequest);
                LOGGER.info("ayoyo");

                LOGGER.info(uberResponse.getData().toString());
                // comfort type uber
                LOGGER.info(uberResponse.getData().getStatus().getVehicleViews().get("778").getName());
                VTCComparatorResponse g = new VTCComparatorResponse();
                LOGGER.info(uberResponse.getStatus());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            try {

                UrbanDriverTrafficRequest urbanDriverTrafficRequest = new UrbanDriverTrafficRequest();
                urbanDriverTrafficRequest.setDepLat(48.8476217f);
                urbanDriverTrafficRequest.setDepLng(2.361093f);
                urbanDriverTrafficRequest.setDestLat(49.4544677f);
                urbanDriverTrafficRequest.setDestlng(2.11151110000003f);

                TrafficResponse trafficResponse = urbanDriverService.urbanDriverTraffic(urbanDriverTrafficRequest);
                LOGGER.info("ayoyo2");

                LOGGER.info(trafficResponse.getDate());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }


                UrbanDriverRequest urbanDriverRequest = new UrbanDriverRequest();
                urbanDriverRequest.setDepLat(48.8476217f);
                urbanDriverRequest.setDepLng(2.361093f);
                urbanDriverRequest.setLocale("fr");
            System.out.println("ayoyo3"+urbanDriverRequest.toString());

            List<VehiculeResponse> vehiculeResponse = urbanDriverService.urbanDriver(urbanDriverRequest);

            System.out.println("mchet"+ vehiculeResponse.get(0).toString());
            try {
                // Price
                PassengerRequestsRequest ps = new PassengerRequestsRequest();
            Address ad2= new Address ();
            ad2.setLat(49.4544677);

ad2.setComplement("");
ad2.setzip_code("");
            ad2.setLong(2.1115111);
            ad2.setName("Paris Beauvais Airport, Route de l'Aéroport, Tillé, France");
            ps.setAddress_pick_up(ad2);
            Addresss ad1= new Addresss ();
            ad1.setLat(48.8708714);
                ad1.setComplement("");
                ad1.setzip_code("");
            ad1.setlong( 2.3322168);
            ad1.setName("Opéra, Place de l'Opéra, Paris, France");
            ps.setAddress_drop_off(ad1);
            ps.setChannel(1);
            ps.setType(1);
            System.out.println("wwiwou"+ps.toString());
            ps.setvehicle_type(vehiculeResponse.get(1));

                ObjectMapper mapper = new ObjectMapper();
                String h = mapper.writeValueAsString(vehiculeResponse.get(1) );
                System.out.println("ResultingJSONstring = " + h);
                String json = mapper.writeValueAsString(ps);
                    System.out.println("final = " + StringEscapeUtils.unescapeJava(json));
                    //System.out.println(json);
                System.out.println("ResultingJSONstring = " + ps.toString());



                PassengerRequestsResponse pss = urbanDriverService.urbanDriverPassengerRequest(StringEscapeUtils.unescapeJava(json));
                System.out.println("price = " + pss.toString());

                System.out.println("price = " + pss.getCustomerPriceString());


            }  catch (Exception e){

            LOGGER.info(e.getMessage());
        }


            try {

                AloCabRequest aloCabRequest = new AloCabRequest();
                aloCabRequest.setSession(new Session(5935629444071424l,
                        UUID.fromString("a7f0a5c8-1943-4351-aafc-f0b01e13ec13"),
                        UUID.fromString("7b19e707-2b58-4c29-bba4-4c1b58408604"),
                        "ag5zfmFsbG9jYWItcHJvZHIuCxIQUGFzc2VuZ2VyYWNjb3VudBiAgP6B5sbhCwwLEgRVc2VyGICA_qHKy9UIDA",
                        "Passenger"
                        ));
                aloCabRequest.setPeriod(0l);
                aloCabRequest.setDirection(Arrays.asList(
                        new Direction("MRS - Aéroport Marseille Provence", "airport",
                                new Position(43.441942,5.222013),null),

                        new Direction("Paris Gare de Lyon", "trainstation",
                                new Position(48.844839,2.374069),null)
                ));
                aloCabRequest.setDepartureAt(new Date());
                aloCabRequest.setSource("WEBAPPV3");
                aloCabRequest.setReception(false);
                aloCabRequest.setComms(0);
                AloCabResponse aloCabResponse = alloCabService.createBooking(aloCabRequest);

                LOGGER.info(aloCabResponse.getStatus(), aloCabResponse.toString());
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            OkHttpClient cf = new OkHttpClient().newBuilder()
                    .build();
            Request hg = new Request.Builder()
                    .url("https://api.classnco.com/api/v3/Urbandriver/vehicle_types?lat=48.8476217&long=2.361093")
                    .method("GET", null)
                    .addHeader("Connection", "keep-alive")
                    .addHeader("Cache-Control", "max-age=0")
                    .addHeader("Upgrade-Insecure-Requests", "1")
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.111 Safari/537.36 Edg/86.0.622.51")
                    .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                    .addHeader("Sec-Fetch-Site", "none")
                    .addHeader("Sec-Fetch-Mode", "navigate")
                    .addHeader("Sec-Fetch-User", "?1")
                    .addHeader("Sec-Fetch-Dest", "document")
                    .addHeader("Accept-Language", "en-US,en;q=0.9")
                    .addHeader("Cookie", "_ServerVTC_session=a004bEx6ejc5QTZ1TUxLVWtjRjMyMmo4MG1BMWpFcC85a1VVbHE4Z2dBQlNPeVkreGE4QUJra0x0R25iQWx3SG1vNFRJdHB0bi8rVUJ6V2krazhnN2JRM1N0R1ZHbGdUbnc3c2IwRW50dWM9LS0veC9VM2xFOENEaTdjclUrY1RUSFNRPT0%3D--f00f9e6de97a0fcc7172b3a4aa238263b0c897e3; _ServerVTC_session=V0NrYmhuRHVxaXp0WUh3aUdEbDFHcWZtc2dhUXNvZkk2R1R3UEF0MkxVMk8raWY5cEFWalNiRytVQ0JMaEwwZWRpZXhESGlTanpOL1lyWEtXcXRHNXRmV3RDMTVnS2dGWW9zaXRTd0lESTA9LS1QNTBFY3VHOCtoUFlMSWdPTUI0VjFBPT0%3D--46640f008316a8dc171e8ff613c20a1490c1e9af")
                    .addHeader("If-None-Match", "W/\"0b4480bf79956754f2cb4a8b39cb9efd\"")
                    .build();
            try {
                Response gf = cf.newCall(hg).execute();
               System.out.println("gggggg");

                LOGGER.info(gf.body().string());

            } catch (IOException e) {
                e.printStackTrace();
           }
//            OkHttpClient cc = new OkHttpClient().newBuilder()
//                    .build();
//            Request rr = new Request.Builder()
//                    .url("https://maps.googleapis.com/maps/api/geocode/json?latlng="+vtcComparatorRequest.getDepartureLocation().getLatitude()+","+vtcComparatorRequest.getDepartureLocation().getLongitude()+"&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0")
//                    .method("GET", null)
//                    .addHeader("authority", "maps.googleapis.com")
//                    .addHeader("cache-control", "max-age=0")
//                    .addHeader("upgrade-insecure-requests", "1")
//                    .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.150")
//                    .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//                    .addHeader("sec-fetch-site", "none")
//                    .addHeader("sec-fetch-mode", "navigate")
//                    .addHeader("sec-fetch-user", "?1")
//                    .addHeader("sec-fetch-dest", "document")
//                    .addHeader("accept-language", "en-US,en;q=0.9,fr;q=0.8")
//                    .build();
//            try {
//                Response rrr = cc.newCall(rr).execute();
//                 ResponseBody p = rrr.body();
//                System.out.println("wael");
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
           try {
               SnapCarRequest snp  = new SnapCarRequest();

snp.setEnd_lng(2.3743773f);
snp.setStart_lng(2.3516492f);
snp.setEnd_lat(48.84430380000001f);
snp.setStart_lat(48.858353f);
               SnapCarResponse snr = snapCarService.getDataa(snp);
               String[] prodStr = snr.toString().split(",");

               LOGGER.info(prodStr[0].replace(";","").replace("&","")+ "   ");

           }catch (Exception e){
                LOGGER.info(e.toString());
           }

        }

    }

}
