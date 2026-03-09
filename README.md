# Projeto BPP - Artefatos Java 21

Projeto desenvolvido para a disciplina **Boas Práticas de Programação e Padrões de Projeto**, ministrada pelo professor **Gercino Sátiro Pedro Filho**, no curso de **Engenharia de Software (ESW)**.

O objetivo do projeto é desenvolver **classes independentes em Java 21** que auxiliem pequenos empresários em tarefas básicas de validação e cadastro de dados, utilizando **apenas recursos nativos da linguagem**, sem frameworks ou bancos de dados.  

---

# Objetivo do Projeto

Desenvolver **7 artefatos independentes em Java 21**, priorizando:

- Baixo acoplamento entre classes
- Código simples e reutilizável
- Uso de **arquivos planos (.txt e .csv)** para persistência de dados
- Compilação e execução via **terminal**
- Desenvolvimento em **editor de texto simples** (sem IDE)

A proposta busca reforçar o entendimento do funcionamento da linguagem Java e da compilação manual de programas.  

---

# Requisitos Funcionais

O sistema é composto pelos seguintes artefatos:

### RF01 - Autenticação Estática
Classe responsável por validar um **usuário e senha pré-definidos no código**.

Regras:
- A senha deve conter **pelo menos um caractere especial**.

---

### RF02 - Validação de CPF
Classe responsável por validar um **CPF**.

Características:
- Ignora caracteres não numéricos
- Realiza o cálculo dos **dígitos verificadores**

---

### RF03 - Validação de CNPJ
Classe independente para validação de **CNPJ**.

Características:
- Validação da estrutura
- Cálculo dos dígitos verificadores

---

### RF04 - Validação de E-mail
Classe responsável por:

- Validar o **formato padrão de e-mail**
- Verificar a **confirmação entre dois campos de e-mail**

---

### RF05 - Cadastro de Clientes
Responsável por registrar clientes contendo:

- Nome
- CPF
- E-mail

Os dados são persistidos no arquivo:

---

### RF06 - Tratamento de Duplicidade
Implementa uma lógica para:

- Impedir que **CPFs duplicados** sejam gravados
- Filtrar registros duplicados na exibição de dados

---

### RF07 - Leitura de Arquivo CSV
Classe responsável por ler e exibir os dados do arquivo:


Conteúdo do CSV:

- Código do estado
- Sigla do estado

Essa leitura **não possui vínculo direto com o cadastro de clientes**.

---

# Requisitos Não Funcionais

O projeto segue as seguintes regras técnicas:

- Linguagem: **Java 21**
- Ambiente: **Editor de texto simples**
- Persistência: **Arquivos TXT e CSV**
- Banco de Dados: **Não utilizado**
- Frameworks: **Não utilizados**
- Compilação: **javac**
- Execução: **linha de comando (CMD ou Shell)**

---

# Compilação

Para compilar o projeto:

```bash
javac *.java

java NomeDaClasse

java CadastroCliente
