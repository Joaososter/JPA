Projeto JPA - Sistema de Gestão de Produtos

Este projeto é um sistema simples de gestão de produtos desenvolvido em Java utilizando JPA (Java Persistence API) para acesso ao banco de dados, com o objetivo de demonstrar conceitos de persistência e manipulação de dados.

🚀 Começando

O objetivo deste projeto é permitir o cadastro, listagem, atualização e exclusão de produtos em um banco de dados MySQL. Ele serve como uma introdução à utilização de JPA para mapeamento objeto-relacional (ORM).

Enunciado:

Crie uma aplicação em Java que permita:
Cadastrar produtos (nome e preço).
Listar todos os produtos cadastrados.
Atualizar um produto existente pelo ID.
Deletar um produto existente pelo ID.
Utilize o banco de dados MySQL com persistência via JPA e o Hibernate como implementação.

📋 Pré-requisitos

Para utilizar este projeto, você precisará:

Java JDK 8 ou superior;
MySql;


 🔧 Instalação (Passo a Passo Simples)

1. Clone o repositório ou baixe os arquivos**:
   - Use o comando:
    bash
     git clone https://github.com/
     

2. Acesse o projeto:

3. Configure o banco de dados;
   - Crie o banco no MySQL:
    sql
     CREATE DATABASE produtos;
     
   - Atualize o arquivo `persistence.xml` com seu usuário e senha:
     xml
     <property name="javax.persistence.jdbc.user" value="root"/>
     <property name="javax.persistence.jdbc.password" value="sua_senha"/>
     

4. Compile o projeto:
 

5. Execute o programa;
 

🛠️ Construído com:

- Java
- MySQL 
- IDE VS CODE

📌 Versão

Versão 1.0 - Implementação inicial 


✒️ Autores
Joao Soster - trabalho inicial - Programação orientada a objetos
