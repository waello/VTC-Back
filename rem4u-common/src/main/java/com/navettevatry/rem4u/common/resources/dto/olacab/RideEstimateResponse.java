package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Chakib Daii.
 */
public class RideEstimateResponse implements Serializable {
    private HotspotZone hotspot_zone;
    private List<Category> categories;
    private List<RideEstimate> ride_estimate;
    private List<PreviousCancellationCharge> previous_cancellation_charges;

    public RideEstimateResponse() {
    }

    public RideEstimateResponse(HotspotZone hotspot_zone, List<Category> categories, List<RideEstimate> ride_estimate, List<PreviousCancellationCharge> previous_cancellation_charges) {
        this.hotspot_zone = hotspot_zone;
        this.categories = categories;
        this.ride_estimate = ride_estimate;
        this.previous_cancellation_charges = previous_cancellation_charges;
    }

    public HotspotZone getHotspot_zone() {
        return hotspot_zone;
    }

    public void setHotspot_zone(HotspotZone hotspot_zone) {
        this.hotspot_zone = hotspot_zone;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<RideEstimate> getRide_estimate() {
        return ride_estimate;
    }

    public void setRide_estimate(List<RideEstimate> ride_estimate) {
        this.ride_estimate = ride_estimate;
    }

    public List<PreviousCancellationCharge> getPrevious_cancellation_charges() {
        return previous_cancellation_charges;
    }

    public void setPrevious_cancellation_charges(List<PreviousCancellationCharge> previous_cancellation_charges) {
        this.previous_cancellation_charges = previous_cancellation_charges;
    }

    @Override
    public String toString() {
        return "RideEstimateResponse{" +
                "hotspot_zone=" + hotspot_zone +
                ", categories=" + categories +
                ", ride_estimate=" + ride_estimate +
                ", previous_cancellation_charges=" + previous_cancellation_charges +
                '}';
    }
}
