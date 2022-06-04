CREATE TABLE regioes (
    id_regiao NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    nm_regiao VARCHAR2(50) NOT NULL,
    CONSTRAINT regioes_pk PRIMARY KEY (id_regiao)
);

CREATE TABLE doencas (
    id_doenca NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    nm_doenca VARCHAR2(50) NOT NULL,
    CONSTRAINT doencas_pk PRIMARY KEY(id_doenca)
);

CREATE TABLE zonas (
    id_zona NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    nm_zona VARCHAR2(50) NOT NULL,
    CONSTRAINT zonas_pk PRIMARY KEY(id_zona)
);

CREATE TABLE faixas_etarias (
    id_faixa_etaria NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    vl_idade_inicial NUMBER NOT NULL,
    vl_idade_final NUMBER NOT NULL,
    CONSTRAINT faixas_etarias_pk PRIMARY KEY(id_faixa_etaria)
);

CREATE TABLE dados_monitoramento (
    id_monitoramento NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    id_regiao NUMBER NOT NULL,
    id_doenca NUMBER NOT NULL,
    id_faixa_etaria NUMBER NOT NULL,
    id_zona NUMBER NOT NULL,
    dt_registro DATE NOT NULL,
    ds_sexo CHAR(1) NOT NULL,
    is_gestante BOOLEAN NOT NULL,
    nr_casos_confirmados NUMBER NOT NULL,
    nr_casos_suspeitos NUMBER NOT NULL,
    nr_obitos NUMBER NOT NULL,
    CONSTRAINT dados_monitoramento_pk PRIMARY KEY(id_monitoramento),
    CONSTRAINT dados_monitoramento_regioes_fk FOREIGN KEY(id_regiao) REFERENCES regioes(id_regiao),
    CONSTRAINT dados_monitoramento_doencas_fk FOREIGN KEY(id_doenca) REFERENCES doencas(id_doenca),
    CONSTRAINT dados_monitoramento_faixas_etarias_fk FOREIGN KEY(id_faixa_etaria) REFERENCES faixas_etarias(id_faixa_etaria),
    CONSTRAINT dados_monitoramento_zonas_fk FOREIGN KEY(id_zona) REFERENCES zonas(id_zona)
);