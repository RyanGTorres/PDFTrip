package com.pdf.PdfGen.entity;

import com.pdf.PdfGen.enuns.TipoApartamento;
import jakarta.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "viagem")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lojaVendedora;

    private String excursao;

    private Date dataSaida;

    private Date dataRetorno;

    private String hotel;

    @OneToMany(mappedBy = "viagem")
    private List<InformacoesViagem> informacoesViagems;

    @OneToMany(mappedBy = "viagem")
    private List<Passageiro> passageiros;

    @Enumerated(EnumType.STRING)
    private TipoApartamento tipoApartamento;
}
