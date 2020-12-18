package com.navettevatry.rem4u.comparator.platforms;

import com.lyft.networking.ApiConfig;
import com.lyft.networking.LyftApiFactory;
import com.lyft.networking.apiObjects.*;
import com.lyft.networking.apis.LyftApi;
import com.navettevatry.rem4u.common.resources.dto.lyft.CostEstimatesRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.DriversRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.EtasRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.RidetypesRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.LyftRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.LyftResponsesMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CompletableFuture;


/**
 * Lyft needed APIs Service Class
 * Created By Chakib DAII
 */

@Service
public class LyftService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LyftService.class);

    @Value("${lyft.client-id}")
    private String CLIENT_ID;
    @Value("${lyft.client-secret}")
    private String CLIENT_SECRET;
    @Value("${lyft.server-token}")
    private String SERVER_TOKEN;

    private LyftApi lyftApi;

    @PostConstruct()
    void init() {
        LOGGER.debug("[LyftService] Post Construct");
        ApiConfig apiConfig = new ApiConfig.Builder()
                .setClientId(CLIENT_ID)
                .setClientToken(SERVER_TOKEN)
                .build();
        this.lyftApi = new LyftApiFactory(apiConfig).getLyftApi();
    }

    /**
     * Asynchronous Method to use to get Lyft response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getLyftResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[LyftService] getAlloCabResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = LyftResponsesMapper
                .costEstimatesListToVTCComparatorResponse(
                        this.getCosts(LyftRequestsMapper.VTCComparatorRequestToCostEstimatesRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .etasListToVTCComparatorResponse(
                            this.getEtas(LyftRequestsMapper.VTCComparatorRequestToEtasRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .rideTypesListToVTCComparatorResponse(
                            this.getRidetypes(LyftRequestsMapper.VTCComparatorRequestToRidetypesRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .nearbyDriversByRideTypesListToVTCComparatorResponse(
                            this.getDrivers(LyftRequestsMapper.VTCComparatorRequestToDriversRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LyftService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get Lyft response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getLyftResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[LyftService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;

        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .costEstimatesListToVTCComparatorResponse(
                            this.getCosts(LyftRequestsMapper.VTCComparatorRequestToCostEstimatesRequest.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .etasListToVTCComparatorResponse(
                            this.getEtas(LyftRequestsMapper.VTCComparatorRequestToEtasRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .rideTypesListToVTCComparatorResponse(
                            this.getRidetypes(LyftRequestsMapper.VTCComparatorRequestToRidetypesRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LyftResponsesMapper
                    .nearbyDriversByRideTypesListToVTCComparatorResponse(
                            this.getDrivers(LyftRequestsMapper.VTCComparatorRequestToDriversRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LyftService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }
        /**
         * get Costs
         * @param costEstimatesRequest
         * @return @{@link List<CostEstimate>}
         */
    public  List<CostEstimate> getCosts(CostEstimatesRequest costEstimatesRequest){

        LOGGER.debug("[LyftService] getCosts");
        List<CostEstimate> costEstimates = null;
        try {
            Response<CostEstimateResponse> response = lyftApi.getCosts(costEstimatesRequest.getStartLatitude(),
                    costEstimatesRequest.getStartLongitude(), costEstimatesRequest.getRideType(),
                    costEstimatesRequest.getEndLatitude(),costEstimatesRequest.getEndLongitude()).execute();
            costEstimates = response.body().cost_estimates;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return costEstimates;
    }

    /**
     * Get Time estimates
     * @param etasRequest
     * @return @{@link List<Eta>}
     */
    public  List<Eta> getEtas(EtasRequest etasRequest){
        LOGGER.debug("[LyftService] getEtas");
        List<Eta> etas = null;
        try {
            Response<EtaEstimateResponse> response;

            if(etasRequest.getRideType() != null && etasRequest.getDestinationLatitude() == null
                    && etasRequest.getDestinationLongitude() == null)
                response = lyftApi.getEtas(etasRequest.getLatitude(),etasRequest.getLongitude(),
                        etasRequest.getRideType()).execute();
            else if(etasRequest.getRideType() != null && etasRequest.getDestinationLatitude() != null
                    && etasRequest.getDestinationLatitude() != null)
                response = lyftApi.getEtas(etasRequest.getLatitude(),etasRequest.getLongitude(),
                        etasRequest.getRideType(),etasRequest.getDestinationLatitude(),
                        etasRequest.getDestinationLongitude()).execute();
            else
                response = lyftApi.getEtas(etasRequest.getLatitude(),etasRequest.getLongitude()).execute();
            etas = response.body().eta_estimates;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return etas;
    }

    /**
     * Get Near By Drivers
     * @param driversRequest
     * @return @{@link List<NearbyDriversByRideType>}
     */
    public  List<NearbyDriversByRideType> getDrivers(DriversRequest driversRequest){
        LOGGER.debug("[LyftService] getDrivers");
        List<NearbyDriversByRideType> nearbyDriversByRideTypes = null;
        try {
            Response<NearbyDriversResponse> response = lyftApi.getDrivers(driversRequest.getLatitude(),
                    driversRequest.getLongitude()).execute();
            nearbyDriversByRideTypes = response.body().nearby_drivers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nearbyDriversByRideTypes;
    }

    /**
     * get Ride types
     * @param ridetypesRequest
     * @return @{@link List<RideType>}
     */
    public  List<RideType> getRidetypes(RidetypesRequest ridetypesRequest){
        LOGGER.debug("[LyftService] getRideTypes");
        List<RideType> rideTypes = null;
        try {
            Response<RideTypesResponse> response = lyftApi.getRidetypes(ridetypesRequest.getLatitude(),
                    ridetypesRequest.getLongitude(), ridetypesRequest.getRideType()).execute();
            rideTypes = response.body().ride_types;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rideTypes;
    }
}
