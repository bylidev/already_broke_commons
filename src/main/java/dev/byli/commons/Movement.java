package dev.byli.commons;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
    private UUID id;
    private LocalDate createdAt;
    private BigDecimal amount;
    private MovementType MovementType;
}
