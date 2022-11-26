package dev.byli.commons;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
    private UUID id;
    private Date createdAt;
    private BigDecimal amount;
    private MovementType MovementType;
    private OrderStatus orderStatus;
}
