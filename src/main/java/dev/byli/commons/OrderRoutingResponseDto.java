package dev.byli.commons;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderRoutingResponseDto {
    private String symbol;//: "BTCUSDT",
    private Long orderId;//: 28,
    private Integer orderListId;//: -1, //Unless OCO, value will be -1
    private String clientOrderId;//:"6gCrw2kRUAF9CvJDGP16IP",
    private Long transactTime;//1507725176595,
    private BigDecimal price;//:"0.00000000",
    private BigDecimal origQty;//:"10.00000000",
    private BigDecimal executedQty;//:"10.00000000",
    private String cummulativeQuoteQty;//:"10.00000000",
    private OrderRoutingEnumStatus status;//:"FILLED",
    private String timeInForce;//:"GTC",
    private String type;//:"MARKET",
    private OrderSide side;//:"SELL"

}
