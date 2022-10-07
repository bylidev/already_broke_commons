package dev.byli.commons;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

    private TickerPair tickerPair;
    private OrderStatus status;
    private OrderType type;

    private BigDecimal amount;
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
}
