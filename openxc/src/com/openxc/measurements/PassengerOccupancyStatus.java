package com.openxc.measurements;

import com.openxc.units.Boolean;

public class PassengerOccupancyStatus extends BaseMeasurement<Boolean> {
    public final static String ID = "passenger_occupancy_status";

    public PassengerOccupancyStatus(Boolean value) {
        super(value);
    }

    public PassengerOccupancyStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
