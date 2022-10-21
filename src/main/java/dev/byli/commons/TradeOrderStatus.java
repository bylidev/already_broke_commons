package dev.byli.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeOrderStatus {
    private String external_id;
    private UUID ticker_pair_id;
    private OrderStatus orderStatus;
}
