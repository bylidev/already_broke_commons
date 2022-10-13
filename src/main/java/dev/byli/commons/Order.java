package dev.byli.commons;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private TickerPair tickerPair;
    private OrderStatus status;
    private OrderType type;
    private OrderSide side;
    private BigDecimal qty;
    private BigDecimal price;
    private UUID orderId;
    private String external_id;
    private Date createdAt;


}
