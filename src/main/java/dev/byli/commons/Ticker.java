package dev.byli.commons;

import java.util.UUID;

public class Ticker {
    private UUID tickerId;
    private String ticker;
    private String pair;

    public UUID getTickerId() {
        return tickerId;
    }

    public void setTickerId(UUID tickerId) {
        this.tickerId = tickerId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }
}
