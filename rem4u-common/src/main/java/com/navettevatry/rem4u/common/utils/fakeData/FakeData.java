package com.navettevatry.rem4u.common.utils.fakeData;

import com.lyft.networking.apiObjects.*;
import com.navettevatry.rem4u.common.resources.dto.allocab.Quotation;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateResponse;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreated;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.AloCabResponse;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.*;
import com.navettevatry.rem4u.common.resources.dto.kapten.EstimatedPriceResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.kapten.KaptenPriceEstimate;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeEstimate;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.lecab.*;
import com.navettevatry.rem4u.common.resources.dto.olacab.*;
import com.navettevatry.rem4u.common.resources.dto.snapcar.*;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarResponse;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationResponseSubType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationResponseType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationsPresetRequestType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;
import com.uber.sdk.rides.client.model.PriceEstimate;
import com.uber.sdk.rides.client.model.Product;
import com.uber.sdk.rides.client.model.Promotion;
import com.uber.sdk.rides.client.model.TimeEstimate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FakeData {

    //AlloCab
    public static AloCabResponse tripCreateResponse = new AloCabResponse(
       );
    //Bcvtc
    public static Estimation estimation = new Estimation(
            Arrays.asList(
                    new Price("17","Berline", 17.655f, 16.441666666666666f, 36f,  36f, 32.73f,"4"),
                    new Price("18","Van", 52.965f, 32.88333333333333f, 88f,  88f, 80f,"7")
            ),
            true,
            null,
            "33 minutes",
            1973,
            "17,7 km",
            17655,
            "13 rue Jean Beausire, 75004 Paris",
            "63 Avenue Jean Jaurès, 93000 Bobigny",
            false,
            false,
            "Déplacement",
            0,
            0);
    public static List<Forfait> forfaits;
    public static List<CarClass> carClasses;
    public static List<Car> cars;

    //Kapten
    public static WaitingTimeResponseSuccess waitingTimeResponseSuccess = new WaitingTimeResponseSuccess(
            Arrays.asList(
                    new WaitingTimeEstimate("Eco",
                            "standard",
                            200),
                    new WaitingTimeEstimate("Berline",
                            "sedan",
                            341),
                    new WaitingTimeEstimate("Van",
                            "van",
                            360)
            )
    );

    public static EstimatedPriceResponseSuccess estimatedPriceResponseSuccess = new EstimatedPriceResponseSuccess(
            Arrays.asList(
                    new KaptenPriceEstimate(
                            "Eco",
                            "standard",
                            200,
                            600,
                            4000,
                            "EUR",
                            920,
                            1210,
                            "507f191e810c19729de860ea"
                    ),
                    new KaptenPriceEstimate(
                            "Berline",
                            "sedan",
                            341,
                            600,
                            4000,
                            "EUR",
                            1300,
                            1600,
                            "507f191e810c19729de860eb"
                    ),
                    new KaptenPriceEstimate(
                            "Van",
                            "Van",
                            360,
                            600,
                            4000,
                            "EUR",
                            1300,
                            1600,
                            "507f191e810c19729de860ec"
                    )
            )
            );

    //LeCab
    public static LocationsSearchResponse locationsSearchResponse = new LocationsSearchResponse(
            Arrays.asList(
                    new LocationResponse(
                            "00000000-0000-0000-0000-000000000000",
                            48.879624f,
                            2.303562f,
                            "1 Rue Léon Jost, 75017 Paris",
                            LocationResponseType.LEAF,
                            LocationResponseSubType.TRAIN,
                            ""),
                    new LocationResponse(
                            "00000000-0000-0000-0000-000000000000",
                            148.879624f,
                            23.303562f,
                            "1 Rue Léon Jost, 75017 Paris",
                            LocationResponseType.NODE,
                            LocationResponseSubType.AIRPORT,
                            "")
            )
    );

    public static LocationsPresetRequest locationsPresetRequest = new LocationsPresetRequest(
            "00000000-0000-0000-0000-000000000000",
            LocationsPresetRequestType.TRAIN
    );

    public static ServicesAvailableResponse servicesAvailableResponse = new ServicesAvailableResponse(
            new LocationResponse("00000000-0000-0000-0000-000000000000",
                    48.879624f,
                    2.303562f,
                    "1 Rue Léon Jost, 75017 Paris",
                    LocationResponseType.LEAF,
                    LocationResponseSubType.AIRPORT,
                    ""),
            Arrays.asList(
                    ServicesAvailableResponseType.ECO,
                    ServicesAvailableResponseType.GREEN,
                    ServicesAvailableResponseType.P508
            )
    );

    public static ServicesEstimateResponse servicesEstimateResponse = new ServicesEstimateResponse(
            new LocationResponse("00000000-0000-0000-0000-000000000000",
                    48.879624f,
                    2.303562f,
                    "1 Rue Léon Jost, 75017 Paris",
                    LocationResponseType.LEAF,
                    LocationResponseSubType.AIRPORT,
                    ""),
            7);

    public static JobsSearchResponse jobsSearchResponse = new JobsSearchResponse(
            "00000000-0000-0000-0000-000000000000");

    public static JobsEstimateResponse jobsEstimateResponse = new JobsEstimateResponse(
            new LocationResponse(
                    "00000000-0000-0000-0000-000000000000",
                    48.879624f,
                    2.303562f,
                    "1 Rue Léon Jost, 75017 Paris",
                    LocationResponseType.LEAF,
                    LocationResponseSubType.AIRPORT,
                    ""),
            Arrays.asList(
                    new LocationResponse(
                            "00000000-0000-0000-0000-000000000000",
                            48.8855659f,
                            2.312389f,
                            "114 Rue Cardinet, 75017 Paris",
                            LocationResponseType.LEAF,
                            null,
                            ""
                            )
            ),
            new LocationResponse(
                    "00000000-0000-0000-0000-000000000000",
                    48.879624f,
                    2.303562f,
                    "1 Rue Léon Jost, 75017 Paris",
                    LocationResponseType.LEAF,
                    LocationResponseSubType.AIRPORT,
                    ""),
            27.99f,
            30.79f,
            0,
            0,
            0,
            "00000000-0000-0000-0000-000000000000",
            "");

    //Lyft
    public static List<CostEstimate> costEstimates = Arrays.asList(
            new CostEstimate(
                    "ride type",
                    "dispaly name",
                    "EURO",
                    3453,
                    8000,
                    54d,
                    27894,
                    "5%"),
            new CostEstimate(
                    "ride type",
                    "dispaly name",
                    "EURO",
                    353,
                    546,
                    14d,
                    2394,
                    "20%")
    );

    public static List<Eta> etas = Arrays.asList(
            new Eta(
                    "ride type",
                    "dispaly name",
                    500
            ),
            new Eta(
                    "ride type",
                    "dispaly name",
                    600
            )
    );

    public static List<NearbyDriversByRideType> nearbyDriversByRideTypes = Arrays.asList(
            new NearbyDriversByRideType(
                    "ride type",
                    Arrays.asList(
                            new NearbyDriver(
                                    Arrays.asList(
                                            new LatLng(12d,124.23d),
                                            new LatLng(12d,124.23d)
                                    ))
                            )
                    ),
            new NearbyDriversByRideType(
                    "ride type",
                    Arrays.asList(
                            new NearbyDriver(
                                    Arrays.asList(
                                            new LatLng(12d,23d),
                                            new LatLng(105d,14.53d)
                                    ))
                    )
            )
    );

    public static List<RideType> rideTypes = Arrays.asList(
            new RideType(
                    "ride type",
                    "dispaly name",
                    3,
                    "url",
                    new PricingDetails(
                            15,
                            4,
                            18,
                            3,
                            5,
                            "USD",
                            null
                    )
            ),
            new RideType(
                    "ride type",
                    "dispaly name",
                    7,
                    "url",
                    new PricingDetails(
                            23,
                            3,
                            30,
                            6,
                            3,
                            "USD",
                            null
                    )
            )
    );

    //OlaCab
    public static RideEstimateResponse rideEstimateResponse = new RideEstimateResponse(
            new HotspotZone(
                    true,
                    "Choose from convenient pickup points to board your cab.",
                    10881,
                    Arrays.asList(
                            Arrays.asList(12.9468154f, 77.6472151f),
                            Arrays.asList(12.9474219f, 77.6475155f),
                            Arrays.asList(12.9478192f, 77.6467001f)
                    ),
                    Arrays.asList(
                            new PickupPoint(12.9509456f,77.6408958f,"Sunriver",10880),
                            new PickupPoint(12.9506006f,77.6417542f,"Cherry Hills",10881)
                    )
            ),
            Arrays.asList(
                    new Category(
                            "auto",
                            "Auto",
                            "INR",
                            "kilometre",
                            "minute",
                            1,
                            "0.2",
                            "false",
                            "http://d1foexe15giopy.cloudfront.net/auto.png",
                            Arrays.asList(
                                    10879, 10880, 10881
                            ),
                            new CancellationPolicy(
                                    15,
                                    "INR",
                                    5,
                                    "minute"
                            ),
                            Arrays.asList(
                                    new FareBreakup(
                                            "flat_rate",
                                            0,
                                            0,
                                            50,
                                            60,
                                            8,
                                            0,
                                            1,
                                            Arrays.asList(),
                                            false,
                                            false
                                    )
                            ),
                            Arrays.asList(
                                    new AllCab(12.9543501f,
                                            77.5438193f,
                                            "e0e7ba15f7249207c1d77ec07c1c06",
                                            534,
                                            15),
                                    new AllCab(12.9561008f,
                                            77.5464725f,
                                            "15f7249207c1d77e9207c1c0601d6c9c",
                                            135,
                                            10)
                            )
                    )
            ),
            Arrays.asList(
                    new RideEstimate(
                            "auto",
                            19.6f,
                            93,
                            227,
                            249,
                            30,
                            Arrays.asList(
                                    new BookingFeeBreakup(
                                            "Advance Booking Fee",
                                            30
                                    )
                            ),
                            new Taxes(11.87f),
                            new HubCharges(
                                    80,
                                    80,
                                    "Ola pick up charge"
                            ),
                            new Discounts(
                                    "custom",
                                    "BLR29",
                                    "AUTO",
                                    0,
                                    0,
                                    16
                            ),
                            new Upfront(
                                    238,
                                    "1:000008:50002738-7242",
                                    null,
                                    true
                            )
                    )
            ),
            Arrays.asList(
                    new PreviousCancellationCharge(
                            "INR","CRN123456789",25
                    ),

                    new PreviousCancellationCharge(
                            "INR","OSN123456789",50
                    )
            )
    );

    public static RideBooking rideBooking = new RideBooking(
            "SUCCESS",
            "CRN123456789",
            "Searching for a cab.",
            "Aabc-12as12if-123123a",
            70,
            "SECONDS");

    //snapCar
    public static SnapCarResponse bookingPrice = new SnapCarResponse(
      );

    public static ETAResult etaResult = new ETAResult(
            "OK",
            new ServiceClass(
                    null,
                    new LocalizedText(
                            "fr",
                            "en"
                    )
            ),
            24);
    public static SpecialArea specialArea = new SpecialArea(
            null,
            new LocalizedText(
                    "fr",
                    "en"
            ),
            new LocalizedText(
                    "fr",
                    "en"
            ),
            false,
            "",
            Arrays.asList(
                    new MeetingPoint(
                            null,
                            new LocalizedText(
                                    "fr",
                                    "en"
                            ),
                            new LocalizedText(
                                    "fr",
                                    "en"
                            )
                    )
            ),
            Arrays.asList(
                    new MeetingPoint(
                            null,
                            new LocalizedText(
                                    "fr",
                                    "en"
                            ),
                            new LocalizedText(
                                    "fr",
                                    "en"
                            )
                    )
            )
    );

    public static ServiceClass serviceClass = new ServiceClass(
            null,
            new LocalizedText(
                    "fr",
                    "en"
            )
    );

    //Uber
    //TODO: No setters and consctructor
    public static List<Product> products = new ArrayList<>();
    public static List<PriceEstimate> priceEstimates = new ArrayList<>();
    public static List<TimeEstimate> timeEstimates = new ArrayList<>();
    public static Promotion promotion = new Promotion();

}
