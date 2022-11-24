package com.example.demosales.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@IdClass(DetailProductPK.class)
public class DetailProduct {
    @Id
    private SaleDetail saleDetail;
    @Id
    private Product product;
}
