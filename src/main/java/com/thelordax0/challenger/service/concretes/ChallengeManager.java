package com.thelordax0.challenger.service.concretes;

import com.thelordax0.challenger.core.utils.mappers.ModelMapperService;
import com.thelordax0.challenger.core.utils.responses.GetAllChallengesResponse;
import com.thelordax0.challenger.entities.Challenge;
import com.thelordax0.challenger.repository.abstracts.ChallengeRepository;
import com.thelordax0.challenger.service.abstracts.ChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ChallengeManager implements ChallengeService {

    private ChallengeRepository challengeRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllChallengesResponse> getAll() {
        List<Challenge> challenges=this.challengeRepository.findAll();
        List<GetAllChallengesResponse> response=challenges.stream().map(challenge -> this.modelMapperService.forResponse().map(challenge, GetAllChallengesResponse.class)).collect(Collectors.toList());


        return response;
    }
}