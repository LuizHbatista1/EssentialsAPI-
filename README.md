## API Básica em Java

Este projeto é uma API RESTful básica desenvolvida em Java usando o framework Spring Boot. A API fornece operações CRUD (Create, Read, Update, Delete) para gerenciar uma entidade simples, como "Produto". O objetivo deste projeto é demonstrar como configurar e construir uma API RESTful simples e eficaz utilizando Java e Spring Boot.

## Funcionalidades

Criação de Produtos: Permite a criação de novos produtos.

Listagem de Produtos: Recupera uma lista de todos os produtos cadastrados.

Consulta de Produto por ID: Recupera os detalhes de um produto específico usando seu ID.

Atualização de Produtos: Permite atualizar as informações de um produto existente.

Exclusão de Produtos: Permite deletar um produto usando seu ID.

## Tecnologias Utilizadas

Java: Linguagem de programação.

Spring Boot: Framework para criação de aplicações Java.

Spring Data JPA: Framework para persistência e gerenciamento de dados.

H2 Database: Banco de dados em memória para testes e desenvolvimento.

Maven: Ferramenta de automação de compilação e gerenciamento de dependências.


## Estrutura do Projeto

Controller: Contém os endpoints da API e mapeia as requisições HTTP.

Service: Contém a lógica de negócios da aplicação.

Repository: Interface para interação com o banco de dados.

Model: Contém as classes de modelo de dados, representando a entidade "Produto".
