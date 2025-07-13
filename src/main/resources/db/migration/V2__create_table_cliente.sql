CREATE TABLE cliente (
id BIGSERIAL PRIMARY KEY,
nome VARCHAR(255),
cpf VARCHAR(25),
rg VARCHAR(255),
email VARCHAR(255),
dd VARCHAR(10),
telefone VARCHAR(255),
endereco_id BIGSERIAL,
CONSTRAINT fk_cliente_endereco FOREIGN KEY (endereco_id) REFERENCES endereco(id)
);
