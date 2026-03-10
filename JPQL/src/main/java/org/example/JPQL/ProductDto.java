package org.example.JPQL;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ProductDto {
    private String name;
    private int price;
    private LocalDate mfd;

}
