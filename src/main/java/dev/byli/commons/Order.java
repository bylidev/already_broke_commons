package main.dev.byli.commons;

import java.time.LocalDate;

public class Order {
    private UUID tickerPairId;
    private OrderStatus status;
    private OrderType type;
    private LocalDate createdAt;

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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
