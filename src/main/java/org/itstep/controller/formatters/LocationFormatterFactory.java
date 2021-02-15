package org.itstep.controller.formatters;

import org.itstep.controller.domain.entity.Location;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.HashSet;
import java.util.Set;

public class LocationFormatterFactory implements AnnotationFormatterFactory<LocationFormat> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        Set<Class<?>> fieldTypes = new HashSet<>();
        fieldTypes.add(Location.class);
        return fieldTypes;
    }

    @Override
    public Printer<?> getPrinter(LocationFormat locationFormat, Class<?> aClass) {
        if(!Location.class.equals(aClass)) return null;
        return new LocationFormatter(locationFormat.divider());
    }

    @Override
    public Parser<?> getParser(LocationFormat locationFormat, Class<?> aClass) {
        if(!Location.class.equals(aClass)) return null;
        return new LocationFormatter(locationFormat.divider());
    }
}
