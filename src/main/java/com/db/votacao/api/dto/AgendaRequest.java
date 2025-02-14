package com.db.votacao.api.dto;

import lombok.Data;

@Data
public class AgendaRequest {
    private String title;
    private String description;
}