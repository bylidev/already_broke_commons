package dev.byli.commons;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Founds {
    private BigDecimal total;
}
