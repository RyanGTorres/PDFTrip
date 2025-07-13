CREATE TABLE viagem (
id BIGSERIAL PRIMARY KEY,
loja_vendedora VARCHAR(255),
excursao VARCHAR(255),
data_saida DATE,
data_retorno DATE,
hotel VARCHAR(255),
tipo_apartamento VARCHAR(20)
);