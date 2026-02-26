# RELATÓRIO DE IMPLEMENTAÇÃO DE SERVIÇOS AWS

Data: 26 de Fevereiro de 2026
Empresa: Abstergo Industries
Responsável: Taylan Hahn

## Introdução
Este relatório apresenta o processo de implementação de ferramentas na empresa Abstergo Industries, realizado por Taylan Hahn. O objetivo do projeto foi elencar 3 serviços AWS, com a finalidade de realizar diminuição de custos imediatos.

## Descrição do Projeto
O projeto de implementação de ferramentas foi dividido em 3 etapas, cada uma com seus objetivos específicos. A seguir, serão descritas as etapas do projeto:

Etapa 1:
- **Nome da Ferramenta:** Amazon EC2 Auto Scaling
- **Foco da ferramenta:** Prover um data center na nuvem, sem a necessidade de implementação física, o que reduzirá custos com equipamentos. Ela também proporciona um ajuste na capacidade usada, de acordo com a necessidade, resultando em um melhor gerenciamento de recursos. Sendo implementado em pelo menos duas Zonas de Disponibilidade (AZ's).
- **Caso de Uso:** A depende do fluxo e da demanda varíavel ao longo de uma semana, a empresa poderá ajustar a capacidade de acesso e resposta, em dias movimentados como segunda-feira e sexta-feira e reduzir o uso de recursos, em dias mais calmos, como quarta-feira. 

Etapa 2:
- **Nome da Ferramenta:** Amazon VPC
- **Foco da ferramenta:** Para realizar a conectividade do sistema, usar a Amazon VPC é a forma mais adequada para construir e configurar redes virtuais isoladas e seguras na AWS, garantindo controle sobre o ambiente de rede.
- **Caso de Uso:** Isolar a infraestrutura interna da rede de farmácias para garantir a segurança dos dados. É possível criar sub-redes privadas para os bancos de dados de controle de estoque e histórico de receitas médicas (inacessíveis pela internet pública).

Etapa 3:
- **Nome da Ferramenta:** Amazon Elastic File System
- **Foco da ferramenta:** Fornecer um sistema de arquivos elástico, simples e totalmente gerenciado que permite o compartilhamento de dados. Ele cresce e diminui automaticamente conforme os arquivos são adicionados ou removidos, sem a necessidade de provisionar capacidade de armazenamento previamente e permite que múltiplas instâncias EC2 acessem os mesmos dados simultaneamente.
- **Caso de Uso:** Armazenamento centralizado de documentos compartilhados por todas as filiais da farmácia em tempo real.



## Conclusão
A implementação de serviços AWS na empresa Abstergo Industries tem como esperado a redução imediata de custos com infraestrutura física, o aumento da alta disponibilidade dos sistemas e a garantia da segurança no tráfego de dados sensíveis, o que aumentará a eficiência e a produtividade da rede de farmácias. Recomenda-se a continuidade da utilização das ferramentas implementadas e a busca por novas tecnologias nativas em nuvem que possam melhorar ainda mais os processos da empresa.

## Anexos

*Não houve necessidade.*

Assinatura do responsável pelo Projeto: 

Taylan Hahn
