package com.db.votacao.api.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class VotingException extends RuntimeException {
    private final HttpStatus status;
    private final String message;

    public VotingException(String message, HttpStatus status) {
        super(message);
        this.message = message;
        this.status = status;
    }
}