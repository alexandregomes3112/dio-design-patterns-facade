# DESIGN PATTERNS - Java - Spring Framework

## Descrição
Este projeto é um exemplo de implementação do padrão de projeto Facade utilizando Spring Boot. O objetivo é demonstrar como simplificar a interação com um sistema complexo através de uma interface unificada. A aplicação simula um sistema de pedidos que valida clientes, verifica estoque e processa pagamentos.

## Estrutura do Projeto
A estrutura do projeto é organizada da seguinte forma:
- **Controller**: Contém os controladores REST que expõem as APIs.
- **Facade**: Implementa a fachada que simplifica a interação com os serviços.
- **Service**: Contém a lógica de negócios e interage com os repositórios.
- **Repository**: Interfaces que estendem JpaRepository para interagir com o banco de dados.
- **Entity**: Classes que representam as entidades do banco de dados.

## Dependências
As principais dependências utilizadas no projeto são:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Data JDBC
- Springdoc OpenAPI UI
- MySQL Connector Java
- Lombok

## Configuração
As configurações da aplicação estão no arquivo `application.properties`:
```properties
spring.application.name=Design patterns - Facade
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/facade_example
spring.datasource.username=root
spring.datasource.password=12345678

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.open-in-view=false

springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true
```

## Executando a Aplicação
Para executar a aplicação, utilize o Maven Wrapper incluído no projeto:
```sh
./mvnw spring-boot:run
```

Ou você pode executar diretamente em sua IDE de preferência. 
O arquivo de inicialização é o:
 `DesignPatternsFacadeApplication.java`

## Documentação e teste da API
A documentação da API gerada pelo Swagger pode ser acessada em:
```
http://localhost:8081/swagger-ui/index.html
```

## Dados de entrada
Para este teste adicionei manualmente no banco de dados os seguintes scripts em `SQL`:

```sql
use facade_example;
INSERT INTO customer (id, name)
VALUES 
(1, 'Fulado'), 
(2, 'Ciclano'),
(3, 'Bentrano');

```
```sql
use facade_example;
INSERT INTO inventory (product_id, stock)
VALUES 
(1, 100), 
(2, 1000),
(3, 10000);

```

## Endpoints
### Criar Pedido
- **URL**: `/orders/place`
- **Método**: `POST`
- **Parâmetros**:
  - 

customerId

 (String): ID do cliente
  - 

productId

 (String): ID do produto
  - 

quantity

 (int): Quantidade do produto
  - 

amount

 (double): Valor do pedido
- **Resposta**:
  - `200 OK`: Pedido realizado com sucesso
  - `400 Bad Request`: Erro na validação do pedido


## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
Este projeto está licenciado sob a Licença Apache 2.0. Veja o arquivo `LICENSE` para mais detalhes.
```

