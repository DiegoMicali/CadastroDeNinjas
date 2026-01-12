# Cadastro de Ninjas API

API RESTful desenvolvida para o gerenciamento de ninjas e suas missões. Este projeto foi criado com foco na aplicação de boas práticas de desenvolvimento backend com o ecossistema Spring.
**Projeto ainda em progresso

## Tecnologias Utilizadas

* **Java** & **Spring Boot**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para desenvolvimento)
* **Flyway** (Gerenciamento de migrações de banco de dados)
* **Lombok** (Redução de boilerplate code)
* **Maven** (Gerenciamento de dependências)
* **Swagger/OpenAPI** (Documentação da API)

## Arquitetura e Padrões

O projeto segue uma arquitetura em camadas (Layered Architecture) para garantir a separação de responsabilidades:

* **Controllers:** Gerenciamento das requisições HTTP e tratamento de respostas (ResponseEntity).
* **Services:** Implementação das regras de negócio.
* **Repositories:** Interação com o banco de dados via JPA.
* **DTOs (Data Transfer Objects):** Utilizados para trafegar dados entre as camadas e filtrar o que é exposto na API, isolando as Entidades de persistência.
* **Mappers:** Conversão entre Entidades e DTOs.

## Funcionalidades

* **CRUD Completo:** Criação, leitura, atualização e remoção de Ninjas.
* **Gestão de Missões:** Cadastro e acompanhamento de missões.
* **Relacionamentos:** Implementação de relacionamentos SQL (@OneToMany, @ManyToOne) entre Ninjas e Missões.
* **Tratamento de Erros:** Respostas HTTP padronizadas.
