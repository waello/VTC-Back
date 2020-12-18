package com.navettevatry.rem4u.common.utils.fakeData;

import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockUtils.class);

    public static VTCComparatorResponse getAlloCabResponse(VTCComparatorResponse vtcComparatorResponse){
        LOGGER.debug("[AlloCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = AlloCabResponsesMapper
                    .tripCreateRequestToVTCComparatorResponse(
                            FakeData.tripCreateResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse getBcvtcResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[BcvtcService] getBcvtcResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = BcvtcResponsesMapper
                    .estimationToVTCComparatorResponse(
                            FakeData.estimation,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        LOGGER.debug("[BcvtcService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse getKaptenResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[KaptenService] getKaptenResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = KaptenResponsesMapper
                    .estimatedPriceResponseSuccessToVTCComparatorResponse(
                            FakeData.estimatedPriceResponseSuccess,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = KaptenResponsesMapper
                    .waitingTimeResponseSuccessToVTCComparatorResponse(
                            FakeData.waitingTimeResponseSuccess,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[KaptenService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse getLeCabResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[LeCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        try {
            vtcComparatorResponse = LeCabResponsesMapper
                    .locationsSearchResponseToVTCComparatorResponse(
                            FakeData.locationsSearchResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        //TODO: verify use
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .locationsSearchResponseToVTCComparatorResponse(
                            FakeData.locationsSearchResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesAvailableResponseToVTCComparatorResponse(
                            FakeData.servicesAvailableResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesEstimateResponseToVTCComparatorResponse(
                            FakeData.servicesEstimateResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsSearchResponseToVTCComparatorResponse(
                            FakeData.jobsSearchResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            FakeData.jobsEstimateResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            FakeData.jobsEstimateResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LeCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse getLyftResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[LyftService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .costEstimatesListToVTCComparatorResponse(
                            FakeData.costEstimates,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .etasListToVTCComparatorResponse(
                            FakeData.etas,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .rideTypesListToVTCComparatorResponse(
                            FakeData.rideTypes,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .nearbyDriversByRideTypesListToVTCComparatorResponse(
                            FakeData.nearbyDriversByRideTypes,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LyftService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse getOlaCabResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[AlloCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = OlaCabResponsesMapper
                    .rideEstimateResponseToVTCComparatorResponse(
                            FakeData.rideEstimateResponse,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));
        return vtcComparatorResponse;
    }


    public static VTCComparatorResponse getSnapCarResponse(VTCComparatorResponse vtcComparatorResponse) throws Exception {
        LOGGER.debug("[SnapCarService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .bookingPriceToVTCComparatorResponse(
                            FakeData.bookingPrice,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .etaResultToVTCComparatorResponse(
                            FakeData.etaResult,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = com.navettevatry.rem4u.common.utils.mapper.responses.updated.SnapCarResponsesMapper
                    .specialAreaToVTCComparatorResponse(
                            FakeData.specialArea,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .serviceClassToVTCComparatorResponse(
                            FakeData.serviceClass,
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[SnapCarService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

}
