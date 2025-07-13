package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "informacoes_viagem")
public class InformacoesViagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_apresentacao")
    private String horaApresentacao;

    @Column(name = "hora_saida")
    private String horaSaida;

    @Column(name = "local_embarque")
    private String localEmbarque;

    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
}
