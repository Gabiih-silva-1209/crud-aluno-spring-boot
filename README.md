🎓 CRUD Aluno – API com Spring Boot
📌 Descrição

Projeto desenvolvido como meu primeiro contato com Spring Boot, com foco na construção de uma API REST para gerenciamento de alunos.

A aplicação implementa operações básicas de CRUD (Create, Read, Update, Delete), permitindo cadastrar, listar, atualizar e remover alunos.

O objetivo é compreender a estrutura de um projeto backend utilizando Spring Boot e boas práticas iniciais de desenvolvimento.

🎯 Objetivo

Compreender a estrutura de um projeto Spring Boot

Criar uma API REST

Implementar operações CRUD

Trabalhar com requisições HTTP (GET, POST, PUT, DELETE)

Integrar aplicação com banco de dados

Aplicar organização em camadas (Controller, Service, Repository)

🛠️ Tecnologias Utilizadas

Java

Spring Boot

Spring Web

Spring Data JPA

Hibernate

Banco de Dados (H2 / MySQL – ajuste conforme você usou)

Maven

Git e GitHub

🧱 Estrutura do Projeto
📂 Controller

Responsável por expor os endpoints da API e receber as requisições HTTP.

📂 Service

Contém as regras de negócio da aplicação.

📂 Repository

Interface responsável pela comunicação com o banco de dados utilizando JPA.

📂 Model (Entity)

Classe que representa a entidade Aluno, mapeada para o banco de dados.

🔄 Operações Implementadas

➕ Criar aluno

📋 Listar todos os alunos

🔍 Buscar aluno por ID

✏️ Atualizar aluno

❌ Remover aluno

🌐 Endpoints da API (Exemplo)
Método	Endpoint	Descrição
GET	/alunos	Lista todos os alunos
GET	/alunos/{id}	Busca aluno por ID
POST	/alunos	Cadastra novo aluno
PUT	/alunos/{id}	Atualiza aluno
DELETE	/alunos/{id}	Remove aluno
⚙️ Configuração
Requisitos

Java 17+ (ou versão utilizada)

Maven instalado

IDE (IntelliJ, VS Code ou Spring Tool Suite)

Execução

Clonar o repositório

Abrir na IDE

Executar a classe principal (SpringBootApplication)

Acessar:

http://localhost:8080


Se estiver usando H2:

http://localhost:8080/h2-console

📊 Conceitos Aplicados

Arquitetura em camadas

Injeção de dependência

Mapeamento objeto-relacional (ORM)

Persistência com JPA

Criação de APIs REST

Tratamento básico de requisições HTTP

📘 Status

✔️ Projeto de estudo
🚀 Primeiro projeto utilizando Spring Boot
📚 Base para evolução com autenticação, validações e segurança

🔮 Possíveis Melhorias Futuras

Implementar validações com Bean Validation

Adicionar tratamento global de exceções

Implementar paginação

Documentar API com Swagger/OpenAPI

Implementar autenticação com Spring Security

📎 Autora

Gabrieli da Silva Marcelino
Desenvolvimento de Sistemas | Interesse em Backend e Arquitetura de Software
