# 🚀 API de Gerenciamento de Projetos

API REST desenvolvida utilizando Java e Spring Boot, com o objetivo de realizar o gerenciamento de projetos por meio de operações HTTP.

## 📋 Funcionalidades

A aplicação disponibiliza os seguintes recursos:

- **Cadastrar projeto:** permite registrar um novo projeto.
- **Listar projetos:** retorna todos os projetos cadastrados.
- **Buscar projeto por ID:** permite consultar um projeto específico a partir do seu identificador.

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA 
- Maven
- REST API

## 📦 Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- [Git](https://git-scm.com/)
- Maven 

## ⚙️ Instalação

1. Clone este repositório:

```bash
git clone https://github.com/diogofallo/msprojetos.git
```

2. Acesse a pasta do projeto:

```bash
cd msprojetos
```

3. Compile o projeto e baixe as dependências:

```bash
./mvnw clean install
```

No Windows, utilize:

```powershell
.\mvnw.cmd clean install
```

## ▶️ Executando a aplicação

Para iniciar a aplicação, execute:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Por padrão, a aplicação Spring Boot utiliza a porta `8080`, salvo configuração diferente.

## 🌐 Endpoints da API

| Método HTTP | Endpoint         | Descrição                |
| ----------- | ---------------- | ------------------------ |
| POST        | `/msprojetos`                | Cadastrar um projeto      |
| GET         | `/msprojetos/lista-projetos` | Lista todos os projetos   |
| GET         | `/msprojetos/{id}`           | Busca um projeto pelo ID |

### Exemplos de requisições

**Cadastrar projeto**

```http
POST /msprojetos
```

**Listar projetos**

```http
GET /msprojetos/lista-projetos
```

**Buscar projeto por ID**

```http
GET /msprojetos/1
```

## 📁 Estrutura do projeto

```text
src/
├── main/
│   ├── java/
│   │   └── com/example/project/
│   │       ├── controller/
│   │       ├── dto/
│   │       ├── mapper/
│   │       ├── model/
│   │       ├── repository/
│   │       └── model/
│   │       ├── responses/
│   │       └── service/
│   └── resources/
│       └── application.yaml
└── test/
```

*A estrutura acima é ilustrativa e pode variar conforme a organização do projeto.*

## 👨‍💻 Autor

Desenvolvido por Diogo Alló.

## 📄 Licença

Este projeto está sob a licença MIT.
