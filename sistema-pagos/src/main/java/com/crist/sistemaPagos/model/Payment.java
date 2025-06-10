package com.crist.sistemaPagos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionUID = -8438521681767814312L;

    private Double amount;

    private String customer;

    private LocalDateTime dateTime;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'of' MMMM 'of' yyyy", new Locale("en", "NY"));
        String dateFormatter = dateTime.format(formatter);
        return "Payment of $" + amount + " for " + customer + " the " + dateFormatter;
    }
}
