package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "passageiro")
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sexo;

    private String rg;

    private LocalDate dataNascimento;

    private BigDecimal valorUnitario;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "viagem_id") // 👈 ESSA É A FK QUE FALTAVA
    private Viagem viagem;
}
