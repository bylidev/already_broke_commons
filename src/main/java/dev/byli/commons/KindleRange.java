package dev.byli.commons;


public enum KindleRange {

    ONE_SECOND("1s"),
    ONE_MINUTE("1m"),
    TRHEE_MINUTES("3m"),
    FIVE_MINUTES("5m"),
    FIFTEEN_MINUTES("15m"),
    THIRTY_MINUTES("30m"),
    ONE_HOURS("1h"),
    TWO_HOURS("2h"),
    FOUR_HOURS("4h"),
    SIX_HOURS("6h"),
    EIGHT_HOURS("8h"),
    TWELVE_HOURS("12h"),
    ONE_DAY("1d"),
    THREE_DAY("3d"),
    ONE_WEEK("1w"),
    ONE_MONTH("1M");

    public final String name;

    KindleRange(String label) {
        this.name = label;
    }

    public String getBinanceRange(){
        return this.name;
    }

}
