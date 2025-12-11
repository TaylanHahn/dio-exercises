## Desafio
Você foi contratado como consultor júnior em uma empresa de TI que está migrando seus sistemas para a nuvem usando Java e AWS. Seu primeiro desafio é ajudar a equipe a identificar rapidamente qual serviço AWS deve ser utilizado para cada tipo de demanda recebida pelo suporte. Para isso, você deve criar um programa que, ao receber uma solicitação em texto simples, indique qual serviço AWS é o mais adequado: "EC2" para demandas de servidores virtuais, "S3" para armazenamento de arquivos, "RDS" para bancos de dados relacionais e "Lambda" para execuções de código sob demanda. Caso a solicitação não se encaixe em nenhuma dessas categorias, o programa deve responder "Servico desconhecido". Sua solução será usada como base para automatizar o atendimento inicial do suporte, tornando o processo mais ágil e eficiente.

Implemente um programa que leia uma string representando a solicitação do cliente e imprima o nome do serviço AWS correspondente, conforme as regras acima. Utilize apenas estruturas básicas de controle e sintaxe simples. Não utilize bibliotecas externas.

## Entrada
Uma única string representando a solicitação do cliente.

## Saída
Uma única string indicando o serviço AWS correspondente: "EC2", "S3", "RDS", "Lambda" ou "Servico desconhecido".
