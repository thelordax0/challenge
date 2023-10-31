package com.thelordax0.challenger.core.utils.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdChallengeResponse {
    private int id;

    private String name;

    private double price;
}

