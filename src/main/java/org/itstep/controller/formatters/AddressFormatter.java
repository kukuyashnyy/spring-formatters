package org.itstep.controller.formatters;

import org.itstep.controller.domain.entity.Address;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class AddressFormatter implements Formatter<Address> {

    private final String divider;

    public AddressFormatter(String divider) {
        this.divider = divider;
    }

    @Override
    public Address parse(String s, Locale locale) throws ParseException {
        Address address = null;
        try {
            String[] addr = s.split(divider);
            address = new Address(addr[0],
                    addr[1],
                    addr[2],
                    addr[3]);
        } catch (Throwable ex) {
            throw new ParseException(ex.getMessage(), 0);
        }
        return address;
    }

    @Override
    public String print(Address address, Locale locale) {
        return String.format(Locale.US, "%s%s %s%s %s%s %s",
                address.getCity(),
                divider,
                address.getStreet(),
                divider,
                address.getBuilding(),
                divider,
                address.getFlat());
    }
}
