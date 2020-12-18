package com.navettevatry.rem4u.comparator.controllers;

import com.navettevatry.rem4u.common.resources.dto.Tomtom.Coordinate;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficRequest;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficResponse;
import com.navettevatry.rem4u.common.resources.dto.here.*;
import com.navettevatry.rem4u.common.resources.dto.standard.Offer;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.resources.enumeration.FrontDistance;
import com.navettevatry.rem4u.common.resources.enumeration.Provider;
import com.navettevatry.rem4u.common.utils.Rem4uUtils;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.QuantiteCo2Total;
import com.navettevatry.rem4u.common.utils.fakeData.FakeData;
import com.navettevatry.rem4u.common.utils.fakeData.MockUtils;
import com.navettevatry.rem4u.common.utils.mapper.requests.*;
import com.navettevatry.rem4u.common.utils.mapper.responses.*;
import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.ResponseBuilder;
import com.navettevatry.rem4u.common.utils.response.body.BooleanResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.comparator.comparatorLogic.ComparisonService;
import com.navettevatry.rem4u.comparator.enrichers.HereService;
import com.navettevatry.rem4u.comparator.enrichers.TomtomService;
import com.navettevatry.rem4u.comparator.platforms.*;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"api/vtc"})
public class RequestVTCsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestVTCsController.class);

    @Autowired
    private AlloCabService alloCabService;

    @Autowired
    private BcvtcService bcvtcService;

    @Autowired
    private KaptenService kaptenService;

    @Autowired
    private LeCabService leCabService;

    @Autowired
    private LyftService lyftService;

    @Autowired
    private OlaCabService olaCabService;

    @Autowired
    private SnapCarService snapCarService;

    @Autowired
    private UberService uberService;

    @Autowired
    private EureCabService eureCabService;

    @Autowired
    UrbanDriverService urbanDriverService;

    @Autowired
    ComparisonService comparisonService;

    @Autowired
    HereService hereService;

    @Autowired
    TomtomService tomtomService;

    /**
     * get VTC responses Async
     * @param vtcComparatorRequest @{@link VTCComparatorRequest}
     * @return @{@link GenericResponse<VTCComparatorResponse>}
     */
    @PostMapping("/vtc-list-async")
    public GenericResponse getVTCResponseAsync(@RequestBody VTCComparatorRequest vtcComparatorRequest) {

        LOGGER.debug("[RequestVTCsController] getVTCResponseAsync");
        FrontDistance estimsatedDistance =  this.uberService.distance(vtcComparatorRequest);

        final long start = System.currentTimeMillis();

        try {

            CompletableFuture<VTCComparatorResponse> alloCabVtcComparatorResponse = this.alloCabService.getAlloCabResponseAsync(vtcComparatorRequest);
//            CompletableFuture<VTCComparatorResponse> bcvtcVtcComparatorResponse = this.bcvtcService.getBcvtcResponseAsync(vtcComparatorRequest);
//            CompletableFuture<VTCComparatorResponse> kaptenVtcComparatorResponse = this.kaptenService.getKaptenResponseAsync(vtcComparatorRequest);
//            CompletableFuture<VTCComparatorResponse> leCabVtcComparatorResponse = this.leCabService.getLeCabResponseAsync(vtcComparatorRequest);
//            CompletableFuture<VTCComparatorResponse> lyftVtcComparatorResponse = this.lyftService.getLyftResponseAsync(vtcComparatorRequest);
//            CompletableFuture<VTCComparatorResponse> olaCabVtcComparatorResponse = this.olaCabService.getOlaCabResponseAsync(vtcComparatorRequest);
        CompletableFuture<VTCComparatorResponse> snapCarVtcComparatorResponse = this.snapCarService.getSnapCarResponseAsync(vtcComparatorRequest);

            CompletableFuture<VTCComparatorResponse> uberVtcComparatorResponse = this.uberService.getUberResponseAsync(vtcComparatorRequest);
            CompletableFuture<VTCComparatorResponse> urbanDriverVtcComparatorResponse = this.urbanDriverService.getUrbanDriverResponseAsync(vtcComparatorRequest);
            LOGGER.debug("urbanDriverVtcComparatorResponsec" +urbanDriverVtcComparatorResponse.toString());


            List<CompletableFuture<VTCComparatorResponse>> completableFutures = Arrays.asList(
                    snapCarVtcComparatorResponse,alloCabVtcComparatorResponse, //  bcvtcVtcComparatorResponse, kaptenVtcComparatorResponse,
//                    leCabVtcComparatorResponse, lyftVtcComparatorResponse, olaCabVtcComparatorResponse, ,
                    uberVtcComparatorResponse,
                    urbanDriverVtcComparatorResponse);

            System.out.println("dddddddddddddddddddddd"+urbanDriverVtcComparatorResponse.toString());

           CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0]))
                    .exceptionally(ex -> null)
                    .join();

           Map<Boolean, List<CompletableFuture<VTCComparatorResponse>>> result = completableFutures.stream()
                   .collect(Collectors.partitioningBy(CompletableFuture::isCompletedExceptionally));

            //final int estimatedTime = (int) (((estimsatedDistance / Rem4uUtils.AVERAGE_SPEED)) * 60);

            VTCComparatorResponse vtcComparatorResponse = new VTCComparatorResponse(
                    vtcComparatorRequest.getDepartureLocation(),
                    vtcComparatorRequest.getArrivalLocation(),
                    vtcComparatorRequest.getDate(),
                    Float.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDistance().getText().replaceAll("[^\\d.]+|\\.(?!\\d)", "")),

                    Integer.parseInt(String.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDuration().getValue())),
                    new ArrayList<>());

            result.entrySet().stream().forEach(booleanListEntry -> {
                if(booleanListEntry.getKey().equals(false)){
                    for (CompletableFuture<VTCComparatorResponse> completableFuture : booleanListEntry.getValue()){
                        try {
                            System.out.println(completableFuture.get());
                            if(completableFuture.get() != null) vtcComparatorResponse.getOffers().addAll(completableFuture.get().getOffers());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            Summary summary = new Summary();
            try{
                TraficRequest traficRequest = new TraficRequest();
                Coordinate c = new Coordinate();
                c.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
                c.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
                traficRequest.setPoint(c);

                TraficResponse traficResponse = tomtomService.getTrafic(traficRequest);

                List<Number> trafficSpeedTable = new ArrayList<>();//int,float,int,float
                for(int i = 0; i<= Math.round(traficResponse.getFlowSegmentData().getCurrentSpeed()); i+=5) {
                    trafficSpeedTable.add(i);
                    trafficSpeedTable.add((float)Math.random());
                }
                List<Number> freeFlowSpeedTable = new ArrayList<>();//int,float,int,float
                for(int i = 0; i<= Math.round(traficResponse.getFlowSegmentData().getFreeFlowSpeed()); i+=5) {
                    freeFlowSpeedTable.add(i);
                    freeFlowSpeedTable.add((float)Math.random());
                }

                ConsumptionRequest consumptionRequest = new ConsumptionRequest(
                        new Location(new Float(vtcComparatorRequest.getDepartureLocation().getLatitude()),new Float(vtcComparatorRequest.getDepartureLocation().getLongitude()),null),
                        "car",
                        new Location(new Float(vtcComparatorRequest.getArrivalLocation().getLatitude()),new Float(vtcComparatorRequest.getArrivalLocation().getLongitude()),null),
                        "summary",
                        freeFlowSpeedTable,
                        trafficSpeedTable,
                        1.8f,9f,4.3f);
                summary = hereService.getConsumption(consumptionRequest).getRoutes().get(0).getSections().get(0).getSummary();
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            Observation observation = new Observation();
            try{
                WeatherRequest weatherRequest = new WeatherRequest("observation",vtcComparatorRequest.getDepartureLocation().getAddress());
                observation = hereService.getWeather(weatherRequest).getObservations().getLocation().get(0).getObservations().get(0);

            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            Observation finalObservation = observation;
            Summary finalSummary = summary;

            vtcComparatorResponse.getOffers().forEach(offer -> offer.getVehicle().setCo2Emission(
                    (float) new BigDecimal(QuantiteCo2Total.Ztotal(vtcComparatorRequest.getPassengers(),offer.getVehicle().getComfort()
                            , finalObservation, finalSummary)).setScale(2, RoundingMode.HALF_UP).floatValue()));

            Float max = (vtcComparatorResponse.getOffers().size() != 0 &&  vtcComparatorResponse.getOffers().get(0).getPrice() != null) ? vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount() : 10;
            Float min = (vtcComparatorResponse.getOffers().size() != 0 &&  vtcComparatorResponse.getOffers().get(0).getPrice() != null) ? vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount() : 10;

            for(Offer offer : vtcComparatorResponse.getOffers()){
                if(offer.getPrice().getUnitAmount().intValue() != 0
                        && offer.getPrice().getUnitAmount() != null){
                    if (offer.getPrice().getUnitAmount() >= max)
                        max = offer.getPrice().getUnitAmount();
                    else if (offer.getPrice().getUnitAmount() <= min)
                        min = offer.getPrice().getUnitAmount();
                }
            }

            final Float finalMax = max;
            final Float finalMin = min;
            final Float range = max - min + 1;

            vtcComparatorResponse.getOffers().forEach(offer -> {
                if(offer.getPrice().getUnitAmount().intValue() == 0 || offer.getPrice().getUnitAmount() == null)
                    offer.getPrice().setUnitAmount(Float.parseFloat(new DecimalFormat("#.#").format((float) range + new Random().nextInt(range.intValue()/10))));
//                else
//                    offer.getPrice().setUnitAmount(Float.parseFloat(new DecimalFormat("#.#").format((float) range + new Random().nextInt(range.intValue()/10))));
            });

            vtcComparatorResponse.getOffers().forEach(offer -> {

               // if(offer.getWaitingTime().equals(0) || offer.getWaitingTime() == null)
                    //offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * estimsatedDistance));
//                    else
//                        offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * offer.getWaitingTime()));
            });

            LOGGER.debug("[RequestVTCsController] getVTCResponseAsync, Elapsed time: {}", (System.currentTimeMillis() - start));

            //DefaultSort
            vtcComparatorResponse.setOffers(comparisonService.sortByPrice(vtcComparatorResponse.getOffers(), null,null));

            return ResponseBuilder.buildSuccessResponse(new ObjectResponse<VTCComparatorResponse>(vtcComparatorResponse), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * get VTC responses
     * @param vtcComparatorRequest @{@link VTCComparatorRequest}
     * @return @{@link GenericResponse<VTCComparatorResponse>}
     */
    @PostMapping("/vtc-list")
    public GenericResponse getVTCResponse(@RequestBody VTCComparatorRequest vtcComparatorRequest) {
        FrontDistance estimsatedDistance =  uberService.distance(vtcComparatorRequest);

        LOGGER.debug("[RequestVTCsController] getVTCResponse");

        final long start = System.currentTimeMillis();

        try {
            VTCComparatorResponse alloCabVtcComparatorResponse = this.alloCabService.getAlloCabResponse(vtcComparatorRequest);
//            VTCComparatorResponse bcvtcVtcComparatorResponse = this.bcvtcService.getBcvtcResponse(vtcComparatorRequest);
//            VTCComparatorResponse kaptenVtcComparatorResponse = this.kaptenService.getKaptenResponse(vtcComparatorRequest);
//            VTCComparatorResponse leCabVtcComparatorResponse = this.leCabService.getLeCabResponse(vtcComparatorRequest);
//            VTCComparatorResponse lyftVtcComparatorResponse = this.lyftService.getLyftResponse(vtcComparatorRequest);
//            VTCComparatorResponse olaCabVtcComparatorResponse = this.olaCabService.getOlaCabResponse(vtcComparatorRequest);
           VTCComparatorResponse snapCarVtcComparatorResponse = this.snapCarService.getSnapCarResponse(vtcComparatorRequest);
            snapCarVtcComparatorResponse.setEstimatedTime(Integer.parseInt(String.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDuration().getValue())));
            System.out.println("snapCarVtcComparatorResponse"+snapCarVtcComparatorResponse.getEstimatedDistance());

            VTCComparatorResponse uberVtcComparatorResponse = this.uberService.getUberResponse(vtcComparatorRequest);
          System.out.println("uber"+uberVtcComparatorResponse.toString());
            VTCComparatorResponse urbanDriverVtcComparatorResponse = this.urbanDriverService.getUrbanDriverResponse(vtcComparatorRequest);

            System.out.println("uber"+uberVtcComparatorResponse.toString());

           /* final float estimsatedDistance = (float) Math.round(Rem4uUtils.distance(vtcComparatorRequest.getDepartureLocation().getLatitude().doubleValue(),
                    vtcComparatorRequest.getDepartureLocation().getLongitude().doubleValue(),
                    vtcComparatorRequest.getArrivalLocation().getLatitude().doubleValue(),
                    vtcComparatorRequest.getArrivalLocation().getLatitude().doubleValue(), 0.0d, 0.0d) / 1000);
            final int estimatedTime = (int) (((estimsatedDistance / Rem4uUtils.AVERAGE_SPEED)) * 60);
**/
            VTCComparatorResponse vtcComparatorResponse = new VTCComparatorResponse(
                    vtcComparatorRequest.getDepartureLocation(),
                    vtcComparatorRequest.getArrivalLocation(),
                    vtcComparatorRequest.getDate(),
                    Float.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDistance().getText().replaceAll("[^\\d.]+|\\.(?!\\d)", "")),

                    Integer.parseInt(String.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDuration().getValue())),

                    new ArrayList<>());

            if(alloCabVtcComparatorResponse != null && alloCabVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(alloCabVtcComparatorResponse.getOffers());
//            if(bcvtcVtcComparatorResponse != null && bcvtcVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(bcvtcVtcComparatorResponse.getOffers());
//            if(kaptenVtcComparatorResponse != null && kaptenVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(kaptenVtcComparatorResponse.getOffers());
//            if(leCabVtcComparatorResponse != null && leCabVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(leCabVtcComparatorResponse.getOffers());
//            if(lyftVtcComparatorResponse != null && lyftVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(lyftVtcComparatorResponse.getOffers());
//            if(olaCabVtcComparatorResponse != null && olaCabVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(olaCabVtcComparatorResponse.getOffers());
          if(snapCarVtcComparatorResponse != null && snapCarVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(snapCarVtcComparatorResponse.getOffers());
            if(uberVtcComparatorResponse != null && uberVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(uberVtcComparatorResponse.getOffers());
            if(urbanDriverVtcComparatorResponse != null && urbanDriverVtcComparatorResponse.getOffers() != null) vtcComparatorResponse.getOffers().addAll(urbanDriverVtcComparatorResponse.getOffers());

            Summary summary = new Summary();
            try{
                TraficRequest traficRequest = new TraficRequest();
                Coordinate c = new Coordinate();
                c.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
                c.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
                traficRequest.setPoint(c);

                TraficResponse traficResponse = tomtomService.getTrafic(traficRequest);

                List<Number> trafficSpeedTable = new ArrayList<>();//int,float,int,float
                for(int i = 0; i<= Math.round(traficResponse.getFlowSegmentData().getCurrentSpeed()); i+=5) {
                    trafficSpeedTable.add(i);
                    trafficSpeedTable.add((float)Math.random());
                }
                List<Number> freeFlowSpeedTable = new ArrayList<>();//int,float,int,float
                for(int i = 0; i<= Math.round(traficResponse.getFlowSegmentData().getFreeFlowSpeed()); i+=5) {
                    freeFlowSpeedTable.add(i);
                    freeFlowSpeedTable.add((float)Math.random());
                }

                ConsumptionRequest consumptionRequest = new ConsumptionRequest(
                        new Location(new Float(vtcComparatorRequest.getDepartureLocation().getLatitude()),new Float(vtcComparatorRequest.getDepartureLocation().getLongitude()),null),
                        "car",
                        new Location(new Float(vtcComparatorRequest.getArrivalLocation().getLatitude()),new Float(vtcComparatorRequest.getArrivalLocation().getLongitude()),null),
                        "summary",
                        freeFlowSpeedTable,
                        trafficSpeedTable,
                        1.8f,9f,4.3f);
                summary = hereService.getConsumption(consumptionRequest).getRoutes().get(0).getSections().get(0).getSummary();
            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            Observation observation = new Observation();
            try{
                WeatherRequest weatherRequest = new WeatherRequest("observation",vtcComparatorRequest.getDepartureLocation().getAddress());
                observation = hereService.getWeather(weatherRequest).getObservations().getLocation().get(0).getObservations().get(0);

            }catch (Exception e){
                LOGGER.info(e.toString());
            }

            Observation finalObservation = observation;
            Summary finalSummary = summary;

            vtcComparatorResponse.getOffers().forEach(offer -> offer.getVehicle().setCo2Emission(
                        (float) new BigDecimal(QuantiteCo2Total.Ztotal(vtcComparatorRequest.getPassengers(),offer.getVehicle().getComfort()
                                , finalObservation, finalSummary)).setScale(2, RoundingMode.HALF_UP).floatValue()));

                Float max = (vtcComparatorResponse.getOffers().size() != 0 &&  vtcComparatorResponse.getOffers().get(0).getPrice() != null) ? vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount() : 10;
                Float min = (vtcComparatorResponse.getOffers().size() != 0 &&  vtcComparatorResponse.getOffers().get(0).getPrice() != null) ? vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount() : 10;

                for(Offer offer : vtcComparatorResponse.getOffers()){
                    if(offer.getPrice().getUnitAmount().intValue() != 0
                            && offer.getPrice().getUnitAmount() != null){
                        if (offer.getPrice().getUnitAmount() >= max)
                            max = offer.getPrice().getUnitAmount();
                        else if (offer.getPrice().getUnitAmount() <= min)
                            min = offer.getPrice().getUnitAmount();
                    }
                }

                final Float finalMax = max;
                final Float finalMin = min;
                final Float range = max - min + 1;

                vtcComparatorResponse.getOffers().forEach(offer -> {
                    if(offer.getPrice().getUnitAmount().intValue() == 0 || offer.getPrice().getUnitAmount() == null)
                        offer.getPrice().setUnitAmount(Float.parseFloat(new DecimalFormat("#.#").format((float) range + new Random().nextInt(range.intValue()/10))));
                    else
                        offer.getPrice().setUnitAmount(Float.parseFloat(new DecimalFormat("#.#").format((float) range + new Random().nextInt(range.intValue()/10))));
                });

                vtcComparatorResponse.getOffers().forEach(offer -> {

                  //  if(offer.getWaitingTime().equals(0) || offer.getWaitingTime() == null)
                      //  offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * estimsatedDistance));
//                    else
//                        offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * offer.getWaitingTime()));
                    offer.getVehicle().setSeats(vtcComparatorRequest.getPassengers().getTotal());
                });

            //DefaultSort
            vtcComparatorResponse.setOffers(comparisonService.sortByPrice(vtcComparatorResponse.getOffers(), null,null));

            LOGGER.debug("[RequestVTCsController] getVTCResponse, Elapsed time: {}", (System.currentTimeMillis() - start));

            return ResponseBuilder.buildSuccessResponse(new ObjectResponse<VTCComparatorResponse>(vtcComparatorResponse), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * mock to get VTC responses
     * @param vtcComparatorRequest @{@link VTCComparatorRequest}
     * @return @{@link GenericResponse<VTCComparatorResponse>}
     */
    @PostMapping("/vtc-list-mock")
    public GenericResponse getVTCResponseMock(@RequestBody VTCComparatorRequest vtcComparatorRequest) {
        LOGGER.debug("[RequestVTCsControllerMock] getVTCResponseMock, {}", vtcComparatorRequest);

        final long start = System.currentTimeMillis();

        try {
            VTCComparatorResponse vtcComparatorResponse = new VTCComparatorResponse(
                    vtcComparatorRequest.getDepartureLocation(),
                    vtcComparatorRequest.getArrivalLocation(),
                    vtcComparatorRequest.getDate(),
                    (float) 11,
   11,
                    new ArrayList<>());

            vtcComparatorResponse = MockUtils.getAlloCabResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getBcvtcResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getKaptenResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getLeCabResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getLyftResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getOlaCabResponse(vtcComparatorResponse);
            vtcComparatorResponse = MockUtils.getSnapCarResponse(vtcComparatorResponse);

            //DefaultSort
            vtcComparatorResponse.setOffers(comparisonService.sortByPrice(vtcComparatorResponse.getOffers(), null,null));

            LOGGER.debug("[RequestVTCsController] getVTCResponse, Elapsed time: {}", (System.currentTimeMillis() - start));

            return ResponseBuilder.buildSuccessResponse(new ObjectResponse<VTCComparatorResponse>(vtcComparatorResponse), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    @PostMapping("vtc-list-eurecab")
    public GenericResponse getVTCResponseEureCab(@RequestBody VTCComparatorRequest vtcComparatorRequest) {
        LOGGER.debug("[RequestVTCsControllerEureCab] getVTCResponseEureCab, {}", vtcComparatorRequest);
        FrontDistance estimsatedDistance =  uberService.distance(vtcComparatorRequest);

        final long start = System.currentTimeMillis();

        try {

            VTCComparatorResponse eureCabVtcComparatorResponse = eureCabService.getEureCabResponse(vtcComparatorRequest);
         VTCComparatorResponse vtcComparatorResponse = new VTCComparatorResponse(
                    vtcComparatorRequest.getDepartureLocation(),
                    vtcComparatorRequest.getArrivalLocation(),
                    vtcComparatorRequest.getDate(),
                 Float.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDistance().getText().replaceAll("[^\\d.]+|\\.(?!\\d)", "")),

                 Integer.parseInt(String.valueOf(estimsatedDistance.getRows().get(0).getElements().get(0).getDuration().getValue())),
                 new ArrayList<>());

            if(eureCabVtcComparatorResponse != null && eureCabVtcComparatorResponse.getOffers() != null) {
                vtcComparatorResponse.getOffers().addAll(eureCabVtcComparatorResponse.getOffers());
                vtcComparatorResponse.getOffers().forEach(offer -> offer.getVehicle().setCo2Emission(
                        (float) QuantiteCo2Total.Ztotal(vtcComparatorRequest.getPassengers(),offer.getVehicle().getComfort()
                        ,new Observation(), new Summary())));

                Float max = vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount();
                Float min = vtcComparatorResponse.getOffers().get(0).getPrice().getUnitAmount();

                for(Offer offer : vtcComparatorResponse.getOffers()){
                    if(offer.getPrice().getUnitAmount().intValue() != 0
                            && offer.getPrice().getUnitAmount() != null){
                        if (offer.getPrice().getUnitAmount() >= max)
                            max = offer.getPrice().getUnitAmount();
                        else if (offer.getPrice().getUnitAmount() <= min)
                            min = offer.getPrice().getUnitAmount();
                    }
                }

                final Float finalMax = max;
                final Float finalMin = min;
                final Float range = max - min + 1;

                vtcComparatorResponse.getOffers().forEach(offer -> {
                    if(offer.getPrice().getUnitAmount().intValue() == 0 || offer.getPrice().getUnitAmount() == null)
                        offer.getPrice().setUnitAmount(Float.parseFloat(new DecimalFormat("#.#").format((float) (new Random().nextInt(finalMax.intValue()) * range) + finalMin)));
                });

                vtcComparatorResponse.getOffers().forEach(offer -> {

                    if(offer.getWaitingTime().equals(0) || offer.getWaitingTime() == null)
                        offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * 11));
                    else
                        offer.setWaitingTime((int) (new Random().nextInt(finalMax.intValue()) * offer.getWaitingTime()));
                });

            }

            //DefaultSort
            vtcComparatorResponse.setOffers(comparisonService.sortByPrice(vtcComparatorResponse.getOffers(), null,null));

            LOGGER.debug("[RequestVTCsController] getVTCResponse, Elapsed time: {}", (System.currentTimeMillis() - start));

            return ResponseBuilder.buildSuccessResponse(new ObjectResponse<VTCComparatorResponse>(vtcComparatorResponse), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

}
