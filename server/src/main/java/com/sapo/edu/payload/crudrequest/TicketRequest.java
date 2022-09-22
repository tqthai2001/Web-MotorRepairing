package com.sapo.edu.payload.crudrequest;

import com.sapo.edu.payload.connectrequest.TicketProductRequest;
import com.sapo.edu.payload.connectrequest.TicketServiceRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequest {
    @Size(max = 1024)
    private String description;
    @Size(max = 1024)
    private String note;
    @NotNull
    private Byte status = 0;
    private BigDecimal discount; // unit: vnd
    @NotNull
    private Long motorbikeId;
    private Long customerId;
    private Long repairingEmployeeId;
    @Size(max = 100)
    private String paymentMethod = "Thanh toán bằng tiền mặt";
    private LocalDateTime appointmentDate;
    private Set<TicketProductRequest> productRequestSet;
    private Set<TicketServiceRequest> serviceRequestSet;
}