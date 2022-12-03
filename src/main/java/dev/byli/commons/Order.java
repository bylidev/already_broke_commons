package dev.byli.commons;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private TickerPair tickerPair;
    private OrderStatus status;
    private OrderType type;
    private OrderSide side;
    private BigDecimal qty;
    private BigDecimal price;
    private String orderId;
    private String externalId;
    private Date createdAt;


}
