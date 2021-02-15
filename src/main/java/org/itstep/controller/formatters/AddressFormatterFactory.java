package org.itstep.controller.formatters;

import org.itstep.controller.domain.entity.Address;
import org.itstep.controller.domain.entity.Location;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class AddressFormatterFactory implements AnnotationFormatterFactory<AddressFormat> {

    @Override
    public Set<Class<?>> getFieldTypes() {
        Set<Class<?>> fieldTypes = new HashSet<>();
        fieldTypes.add(Address.class);
        System.out.println("fieldTypes = " + fieldTypes);
        return fieldTypes;
    }

    @Override
    public Printer<?> getPrinter(AddressFormat addressFormat, Class<?> aClass) {
        if(!Address.class.equals(aClass)) return null;
        return new AddressFormatter(addressFormat.divider());
    }

    @Override
    public Parser<?> getParser(AddressFormat addressFormat, Class<?> aClass) {
        if(!Address.class.equals(aClass)) return null;
        return new AddressFormatter(addressFormat.divider());
    }
}
