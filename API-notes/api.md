## API (Application Programming Interface)
> Application Programming Interface
- **Application Programming** é criar uma solução que sirva e atenda a um problema de negócio.
- **Interface** é igual a um contrato.

### Portanto, API é uma aplicação programada de forma padronizada (interface), para servir dados seguindo algum protocolo de comunicação.

**E para quê serve?**

Para receber e processar dados em serviços, para então responder a outras aplicações (seja frontend ou backend).

**Características de uma Aplicação**
- Ter um protocolo de comunicação rígido (por exemplo o HTTP), tanto para **responder (response)** coisas, quanto para **requisições (request)**.
- Padrões de Arquitetura, que podem variar dependendo da organização.

### REST
> Representational State Transfer
- **Representational State** - é o "estado" em que o conteúdo está representado dentro de algum lugar, podendo ser em uma variável, objeto, arquivo, etc.
- **Transfer** - é a a transferência desse conteúdo, através de um protocolo.

**Conceito**

É um estilo de arquitetura ou um conjunto de regras e restrições para a criação de APIs web. Não é um protocolo e nem um código, é um "guia de boas práticas".

Para ser considerada REST, a arquitetura deve seguir certos princípios, sendo os principais:

- **Cliente-Servidor:** Separação total entre quem pede (frontend) e quem processa (backend).

- **Stateless (Sem estado):** O servidor não guarda o histórico (estado) do cliente entre as requisições. Cada pedido deve conter todas as informações necessárias para ser entendido sozinho.

- **Cacheable:** O gerenciamento eficiente de cache, se vai ou não ser armazenado pelo cliente. Os dados serão ou não cacheáveis? Isso deve ficar explícito.

- **Uniform Interface:** Uma forma padronizada de comunicação, respondendo fielmente ao tipo de contrato dela. (ex: uso correto dos verbos HTTP e URIs).

- **Layered System (Sistema em Camadas)**: O cliente não precisa saber se está conectado diretamente ao servidor final ou a um intermediário (como um balanceador de carga).
 

### RESTful

É o adjetivo dado a uma API que implementa e obedece a TODOS princípios do REST. 

**Conceito**

REST é a teoria (o conjunto de regras). RESTful é a prática (o sistema que segue essas regras). Se você cria uma API, mas ela não segue todas as regras do REST (por exemplo, guarda estado no servidor), ela é uma API, mas não é RESTful.

---

**Resumo comparativo**

| Termo | O que é? | Função Principal |
|------|----------|-----------------|
| API | Interface | Permitir que softwares conversem |
| REST | Arquitetura / Regras | Definir como essa conversa deve acontecer na Web |
| RESTful | Implementação | Nome dado ao sistema que segue o padrão REST |

