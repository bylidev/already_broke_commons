package dev.byli.commons;

import java.util.UUID;

public class TickerPair {
    private UUID tickerPairId;
    private Ticker tickerId;
    private Ticker pairId;

    public UUID getTickerPairId() {
        return tickerPairId;
    }

    public void setTickerPairId(UUID tickerPairId) {
        this.tickerPairId = tickerPairId;
    }

    public Ticker getTickerId() {
        return tickerId;
    }

    public void setTickerId(Ticker tickerId) {
        this.tickerId = tickerId;
    }

    public Ticker getPairId() {
        return pairId;
    }

    public void setPairId(Ticker pairId) {
        this.pairId = pairId;
    }
}
