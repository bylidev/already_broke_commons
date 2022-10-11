package dev.byli.commons;

import lombok.*;

import java.util.UUID;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
