package com.example.demo;

import com.example.demo.pojos.Tour;
import com.example.demo.pojos.TourPackage;
import com.example.demo.pojos.TourPackageResponse;
import com.example.demo.pojos.TourResponse;
import org.springframework.stereotype.Component;

@Component
public class TourPackageMapper {

    public TourPackageResponse mapTourPackage(TourPackage tourPackage) {
        return new TourPackageResponse(
                tourPackage.getId(),
                getTitle(tourPackage),
                tourPackage.getPrice()


        );
    }

    private String getTitle(TourPackage tourPackage) {
        return tourPackage.getDest() + " " + tourPackage.getDesc();
    }
}
