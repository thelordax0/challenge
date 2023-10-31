package com.thelordax0.challenger.service.abstracts;

import com.thelordax0.challenger.core.utils.responses.GetAllChallengesResponse;
import com.thelordax0.challenger.core.utils.responses.GetByIdChallengeResponse;

import java.util.List;

public interface ChallengeService {
    List<GetAllChallengesResponse> getAll();
    GetByIdChallengeResponse getById(int id);
}
