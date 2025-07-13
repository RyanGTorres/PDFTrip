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

    @Column(name = "loja_vendedora")
    private String lojaVendedora;

    private String excursao;

    @Column(name = "data_saida")
    private Date dataSaida;

    @Column(name = "data_retorno")
    private Date dataRetorno;

    private String hotel;

    @OneToMany
    private List<InformacoesViagem> informacoesViagems;

    @OneToMany
    private List<Passageiro> passageiros;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_apartamento")
    private TipoApartamento tipoApartamento;
}
