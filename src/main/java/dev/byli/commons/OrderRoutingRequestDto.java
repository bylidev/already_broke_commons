package dev.byli.commons;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRoutingRequestDto {
    BigDecimal qty;
    BigDecimal limitPrice;
    OrderType side;
}
