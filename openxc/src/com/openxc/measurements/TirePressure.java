package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

import com.openxc.units.Psi;

/**
 * A TirePressure represents a specific tire's pressure in PSI.
 */
public class TirePressure
        extends BaseMeasurement<State<TirePressure.TireId>> {
    public final static String ID = "tire_pressure";

    /**
     * The TireId is the specific tire on the vehicle.
     */
    public enum TireId {
        FRONT_LEFT,
        FRONT_RIGHT,
        REAR_LEFT,
        REAR_RIGHT
    }

    public TirePressure(State<TireId> value, Psi event) {
        super(value, event);
    }

    public TirePressure(TireId value, Psi event) {
        this(new State<TireId>(value), event);
    }

    public TirePressure(String value, Number event) {
        this(TireId.valueOf(value.toUpperCase(Locale.US)), new Psi(event));
    }

    @Override
    public Psi getEvent() {
        return (Psi) super.getEvent();
    }

    @Override
    public Number getSerializedEvent() {
        return getEvent().doubleValue();
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString();
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
