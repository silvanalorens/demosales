package com.example.demosales.model;

import lombok.*;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "id_person", nullable = false, foreignKey = @ForeignKey(name = "FK_SALE_PATIENT"))
    private Person person;

    private double total;

    @OneToMany(mappedBy = "sale", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<SaleDetail> detailList;
}
