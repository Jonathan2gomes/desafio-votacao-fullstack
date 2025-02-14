package com.db.votacao.api.service;

import com.db.votacao.api.model.Vote;
import com.db.votacao.api.repository.VoteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BatchVoteProcessor {
    private final VoteRepository voteRepository;

    @Async
    @Transactional
    public void processBatchVotes(List<Vote> votes) {
        voteRepository.saveAll(votes);
    }}