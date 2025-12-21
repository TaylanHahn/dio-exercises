# 🌩️ Desafio: Identificação de Serviços AWS

## 📋 Descrição do Cenário
Você foi contratado como consultor de TI por uma startup que está migrando seus sistemas para a nuvem usando **Java** e **AWS**.

Durante a transição, a equipe precisa de uma ferramenta simples para identificar rapidamente o tipo de serviço AWS a partir de um código de operação enviado por outros times.

O sucesso da migração depende da precisão dessa identificação, pois comandos errados podem causar atrasos e custos extras.

## 🎯 Objetivo
Sua tarefa é criar um programa que, ao receber o código de operação, identifique corretamente o serviço AWS correspondente ou informe que o código é inválido.

As regras de negócio são:
* **EC2**: Se o código for exatamente "EC2".
* **S3**: Se o código for exatamente "S3".
* **Lambda**: Se o código for exatamente "Lambda".
* **Inválido**: Qualquer outra variação (incluindo letras minúsculas como "ec2").

## ⚙️ Requisitos Técnicos
1. Implemente um programa que leia uma string representando o código de operação.
2. Utilize apenas estruturas de controle básicas (`if`, `else if`, `else`) para realizar a verificação.
3. **Não** utilize bibliotecas externas.

## 📥 Entrada
* Uma única string representando o código de operação enviado pela equipe.

## 📤 Saída
* Uma única string: `"EC2"`, `"S3"`, `"Lambda"` ou `"Codigo invalido"`, de acordo com a verificação.

## 📝 Exemplos de Teste

A tabela abaixo apresenta os exemplos de entrada e a saída esperada:

| Entrada | Saída |
| :--- | :--- |
| `EC2` | EC2 |
| `S3` | S3 |
| `Lambda` | Lambda |
| `ec2` | Codigo invalido |

---

### 💡 Dica para solução
Lembre-se que em Java, para comparar o conteúdo de **Strings**, não devemos usar o operador `==`, e sim o método `.equals()`. O enunciado sugere que a comparação deve ser exata (Case Sensitive).