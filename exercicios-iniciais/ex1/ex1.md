# ☁️ Desafio: Consultoria de Serviços AWS

## 📋 Descrição do Cenário
Você foi contratado como consultor júnior em uma empresa de TI que está migrando seus sistemas para a nuvem usando **Java** e **AWS**.

Seu primeiro desafio é ajudar a equipe a identificar rapidamente qual serviço AWS deve ser utilizado para cada tipo de demanda recebida pelo suporte.

Sua solução será usada como base para automatizar o atendimento inicial do suporte, tornando o processo mais ágil e eficiente.

## 🎯 Objetivo
Criar um programa que, ao receber uma solicitação em texto simples, indique qual serviço AWS é o mais adequado com base em palavras-chave.

As regras de mapeamento são:

* **EC2**: Para demandas de "servidores virtuais".
* **S3**: Para "armazenamento de arquivos".
* **RDS**: Para "bancos de dados relacionais".
* **Lambda**: Para "execuções de código sob demanda".
* **Servico desconhecido**: Caso a solicitação não se encaixe em nenhuma das categorias acima.

## ⚙️ Requisitos Técnicos
1. Implemente um programa que leia uma string representando a solicitação do cliente.
2. Utilize apenas estruturas básicas de controle (`if/else`, `switch`) e sintaxe simples.
3. **Não** utilize bibliotecas externas.

## 📥 Entrada
* Uma única string representando a solicitação do cliente (ex: "Preciso de servidores virtuais para meu site").

## 📤 Saída
* Uma única string indicando o serviço AWS correspondente: `"EC2"`, `"S3"`, `"RDS"`, `"Lambda"` ou `"Servico desconhecido"`.

## 📝 Exemplos de Lógica

A tabela abaixo ilustra como o programa deve interpretar as entradas:

| Trecho na Entrada | Saída Esperada |
| :--- | :--- |
| "...servidores virtuais..." | EC2 |
| "...armazenamento de arquivos..." | S3 |
| "...bancos de dados relacionais..." | RDS |
| "...execuções de código sob demanda..." | Lambda |
| "Quero um café" | Servico desconhecido |

---

### 💡 Dica para solução
Como a entrada é uma frase completa, utilize o método `.contains()` da classe String para verificar se as palavras-chave específicas existem dentro da frase digitada pelo usuário.
