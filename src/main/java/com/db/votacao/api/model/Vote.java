package com.db.votacao.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(indexes = {
        @Index(name = "idx_vote_session_associate", columnList = "session_id,associate_id"),
        @Index(name = "idx_vote_session", columnList = "session_id")
})
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VotingSession session;

    private String associateId;
    private boolean voteValue;
}