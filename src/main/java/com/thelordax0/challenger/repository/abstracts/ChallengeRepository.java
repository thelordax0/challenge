package com.thelordax0.challenger.repository.abstracts;

import com.thelordax0.challenger.entities.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge,Integer> {
}
