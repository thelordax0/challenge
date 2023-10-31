package com.thelordax0.challenger.api;

import com.thelordax0.challenger.core.utils.responses.GetAllChallengesResponse;
import com.thelordax0.challenger.core.utils.responses.GetByIdChallengeResponse;
import com.thelordax0.challenger.service.abstracts.ChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/challenge")
public class ChallengeControllers {

    private ChallengeService challengeService;

    @GetMapping()
    public List<GetAllChallengesResponse> getAll(){
        return this.challengeService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdChallengeResponse getAll(@PathVariable int id){
        return this.challengeService.getById(id);
    }
}
