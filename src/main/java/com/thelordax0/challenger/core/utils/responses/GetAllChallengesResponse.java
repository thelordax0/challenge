package com.thelordax0.challenger.core.utils.responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllChallengesResponse {
    private int id;

    private String name;

    private double price;
}
