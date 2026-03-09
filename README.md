# Projeto Gestão ONG - Fábrica de Software (BPP)

[cite_start]Este repositório contém o desenvolvimento de artefatos independentes em **Java 21**, desenvolvidos para a disciplina de **Boas Práticas de Programação e Padrões de Projeto** (Curso: ESW - 2026/1)[cite: 52, 74].

## 🎯 Objetivo do Projeto
[cite_start]O objetivo principal é o desenvolvimento de 7 artefatos independentes para auxiliar pequenos empresários e ONGs que não possuem recursos para softwares complexos[cite: 2, 24]. [cite_start]O projeto prioriza a **independência de classes (baixo acoplamento)** e a não utilização de frameworks ou bancos de dados, seguindo uma abordagem de programação nativa[cite: 3].

## 🛠️ Restrições e Boas Práticas
[cite_start]Seguindo a proposta pedagógica de "Estudo de Caso" e aprendizado nativo, o projeto adota as seguintes diretrizes[cite: 58, 61]:
* [cite_start]**Linguagem:** Java 21[cite: 17, 91].
* [cite_start]**Ambiente:** Uso exclusivo de editores de texto básicos, sem o auxílio de IDEs ou Frameworks nesta fase[cite: 16, 59].
* [cite_start]**Persistência:** Uso de arquivos planos (`.txt` e `.csv`) em substituição a bancos de dados relacionais[cite: 18].
* [cite_start]**Compilação:** O código deve ser compilado via comando `javac` e executado via terminal (CMD/Shell)[cite: 19, 73].

## 📋 Requisitos Funcionais (Artefatos)
[cite_start]O sistema "Gestão ONG" contempla as seguintes funcionalidades[cite: 4, 25]:
1.  [cite_start]**RF01 - Autenticação Estática:** Validação de usuário e senha (mínimo de um caractere especial)[cite: 5, 6].
2.  [cite_start]**RF02 - Validação de CPF:** Classe para validar integridade do CPF, ignorando caracteres não numéricos[cite: 7].
3.  [cite_start]**RF03 - Validação de CNPJ:** Classe isolada para validação de registros de pessoa jurídica[cite: 8].
4.  [cite_start]**RF04 - Gestão de E-mail:** Validação de formato padrão e paridade entre dois campos de entrada[cite: 9].
5.  [cite_start]**RF05 - Cadastro de Clientes:** Captura de Nome, CPF e E-mail com persistência em `clientes.txt`[cite: 10].
6.  [cite_start]**RF06 - Tratamento de Duplicidade:** Impedir CPFs idênticos no arquivo e filtrar duplicatas na exibição[cite: 11].
7.  [cite_start]**RF07 - Leitura de Dados CSV:** Processamento e exibição do conteúdo do arquivo `estados.csv`[cite: 12].

## 📊 Modelagem UML
A documentação técnica inclui:
* [cite_start]**Diagrama de Caso de Uso:** Interações do Funcionário com as funcionalidades de Login, Validação e Cadastro[cite: 21, 22].
* [cite_start]**Diagrama de Classe:** Estrutura de classes independentes para garantir o reuso isolado de cada artefato[cite: 34, 35].

## 🚀 Instruções de Execução
Como o projeto exige compilação nativa, utilize os seguintes comandos no terminal:

1.  **Compilação:**
    ```bash
    javac NomeDaClasse.java
    ```
2.  **Execução:**
    ```bash
    java NomeDaClasse
    ```

---
**Curso:** Engenharia de Software (ESW) - 2026/1  
**Professor:** Gercino Satiro Pedro Filho  
[cite_start]**Data de Entrega (Fase 1):** 11/03/2026
