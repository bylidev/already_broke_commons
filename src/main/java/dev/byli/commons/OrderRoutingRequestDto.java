package dev.byli.commons;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRoutingRequestDto {
    Float qty;
    Float price;
    Boolean sellOperation;
    Float fee;
    Float totalUsd;
    Float totalCrypto;
    Long orderId;
    Boolean completed=false;

}
