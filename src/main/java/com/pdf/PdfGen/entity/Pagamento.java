package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private BigDecimal desconto;

    private BigDecimal total;

    private String formaPagamento;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;
}
