package com.sapo.edu.dto.connectDTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sapo.edu.dto.ServiceDTO;
import com.sapo.edu.entity.compositekey.TicketServiceId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
public class TicketServiceDTO {
    private TicketServiceId id;
    private ServiceDTO service;
    private BigDecimal stockPrice;
}
