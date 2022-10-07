package dev.byli.commons;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TickerRangeDataDto {
    private TickerPair tickerPair;
    private KindleRange range;
    private BigDecimal max;
    private BigDecimal min;
    private BigDecimal current;
}
