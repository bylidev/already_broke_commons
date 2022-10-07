package dev.byli.commons;

import java.util.UUID;

public class TickerPair {
    private UUID tickerPairId;
    private Ticker ticker;
    private Ticker pair;

    public UUID getTickerPairId() {
        return tickerPairId;
    }

    public void setTickerPairId(UUID tickerPairId) {
        this.tickerPairId = tickerPairId;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Ticker getPair() {
        return pair;
    }

    public void setPair(Ticker pair) {
        this.pair = pair;
    }
}
