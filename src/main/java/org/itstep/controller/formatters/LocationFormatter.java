package org.itstep.controller.formatters;

import org.itstep.controller.domain.entity.Location;
import org.springframework.format.Formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

public class LocationFormatter implements Formatter<Location> {

    private final String divider;

    public LocationFormatter(String divider) {
        this.divider = divider;
    }

    @Override
    public Location parse(String s, Locale locale) throws ParseException {
        Location location = null;
        try {
            String[] loc = s.split(divider);
            location = new Location(BigDecimal.valueOf(Double.parseDouble(loc[0])),
                    BigDecimal.valueOf(Double.parseDouble(loc[1])));
        } catch (Throwable ex) {
            throw new ParseException(ex.getMessage(), 0);
        }
        return location;
    }

    @Override
    public String print(Location location, Locale locale) {
        return String.format(Locale.US,"%g%s %g", location.getLatitude(), divider, location.getLongitude());
    }
}
