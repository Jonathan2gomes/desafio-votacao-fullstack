package com.db.votacao.api.dto;

import com.db.votacao.api.model.enums.VoteAbilityStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpfValidationResponse {
    private VoteAbilityStatusEnum status;
}
