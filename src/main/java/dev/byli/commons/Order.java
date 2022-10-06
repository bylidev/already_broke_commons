package dev.byli.commons;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID tickerPairId;
    private OrderStatus status;
    private OrderType type;

    private BigDecimal amount;
    private Date createdAt;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UUID getTickerPairId() {
        return tickerPairId;
    }

    public void setTickerPairId(UUID tickerPairId) {
        this.tickerPairId = tickerPairId;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
