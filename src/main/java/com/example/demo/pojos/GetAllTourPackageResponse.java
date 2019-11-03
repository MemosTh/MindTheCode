package com.example.demo.pojos;

import java.util.List;

public class GetAllTourPackageResponse {

    private List<TourPackageResponse> tourPackageResponses;

    public GetAllTourPackageResponse(List<TourPackageResponse> tourPackageResponses) {
        this.tourPackageResponses = tourPackageResponses;
    }

    public List<TourPackageResponse> getTourPackageResponses() {
        return tourPackageResponses;
    }

    public void setTourPackageResponses(List<TourPackageResponse> tourPackageResponses) {
        this.tourPackageResponses = tourPackageResponses;
    }
}
