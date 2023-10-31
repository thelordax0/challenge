package com.thelordax0.challenger.api;

import com.thelordax0.challenger.core.utils.requests.CreateChallengRequest;
import com.thelordax0.challenger.core.utils.responses.GetAllChallengesResponse;
import com.thelordax0.challenger.core.utils.responses.GetByIdChallengeResponse;
import com.thelordax0.challenger.service.abstracts.ChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void getAll(@RequestBody CreateChallengRequest createChallengRequest){
         this.challengeService.add(createChallengRequest);
    }
}
