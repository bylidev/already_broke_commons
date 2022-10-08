package dev.byli.commons;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
public class Movement {
    private UUID id;
    private LocalDate createdAt;
    private BigDecimal amount;
    private MovementType MovementType;
}
