package org.itstep.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.itstep.controller.domain.entity.Address;
import org.itstep.controller.domain.entity.Location;
import org.itstep.controller.formatters.AddressFormat;
import org.itstep.controller.formatters.LocationFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDto {
    private Integer id;
    private String client;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime orderDateTime;
    @LocationFormat(divider = ";")
    private Location location;
    @AddressFormat(divider = ";")
    private Address address;
    private Map<String, String> orderList;
}
