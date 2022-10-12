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
    private BigDecimal amount;

    private UUID orderId;
    private Date createdAt;

    public TickerPair getTickerPair() {
        return tickerPair;
    }

    public void setTickerPair(TickerPair tickerPair) {
        this.tickerPair = tickerPair;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}
