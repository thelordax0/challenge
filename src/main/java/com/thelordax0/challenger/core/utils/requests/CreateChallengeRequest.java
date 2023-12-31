package com.thelordax0.challenger.core.utils.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateChallengeRequest {

    private String name;

    private double price;
}
