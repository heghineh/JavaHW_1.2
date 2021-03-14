package com.company.DistanceConverter;

public class DistanceConverter {
    public Miles convertMetersToMiles(Meters meters) {
        Miles miles = new Miles(meters.getDistance() / 1609.344);
        return miles;
    }

    public Meters convertMilesToMeters(Miles miles) {
        Meters meters = new Meters(miles.getDistance() * 1609.344);
        return meters;
    }
}