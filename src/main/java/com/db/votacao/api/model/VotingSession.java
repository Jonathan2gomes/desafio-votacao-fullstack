package com.db.votacao.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VotingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Agenda agenda;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isOpen;

    public boolean isSessionOpen() {
        LocalDateTime now = LocalDateTime.now();
        return isOpen && now.isBefore(endTime);
    }
}