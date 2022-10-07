package dev.byli.commons;

import java.util.UUID;

public class TickerPair {
    private UUID id;
    private Ticker ticker;
    private Ticker tickerPair;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Ticker getTickerPair() {
        return tickerPair;
    }

    public void setTickerPair(Ticker tickerPair) {
        this.tickerPair = tickerPair;
    }
}
