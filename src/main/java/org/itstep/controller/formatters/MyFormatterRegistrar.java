package org.itstep.controller.formatters;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

public class MyFormatterRegistrar implements FormatterRegistrar {
    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatterForFieldAnnotation(new LocationFormatterFactory());
        formatterRegistry.addFormatterForFieldAnnotation(new AddressFormatterFactory());
    }
}
