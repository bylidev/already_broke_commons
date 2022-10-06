package dev.byli.commons;

import java.util.UUID;

public class TickerPair {
    private UUID tickerPairId;
    private UUID tickerId;
    private UUID pairId;

    public UUID getTickerPairId() {
        return tickerPairId;
    }

    public void setTickerPairId(UUID tickerPairId) {
        this.tickerPairId = tickerPairId;
    }

    public UUID getTickerId() {
        return tickerId;
    }

    public void setTickerId(UUID tickerId) {
        this.tickerId = tickerId;
    }

    public UUID getPairId() {
        return pairId;
    }

    public void setPairId(UUID pairId) {
        this.pairId = pairId;
    }
}
