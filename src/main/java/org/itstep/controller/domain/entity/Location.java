package org.itstep.controller.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private BigDecimal latitude;
    private BigDecimal longitude;
}
