package com.thelordax0.challenger.service.abstracts;

import com.thelordax0.challenger.core.utils.responses.GetAllChallengesResponse;

import java.util.List;

public interface ChallengeService {
    List<GetAllChallengesResponse> getAll();
}
