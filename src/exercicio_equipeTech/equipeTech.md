## 
### Exercício "EquipeTech"

Você trabalha na TechConsult, uma renomada consultoria em tecnologia que auxilia empresas a organizar seus projetos de software. Seu desafio é criar um sistema para gerenciar equipes de consultores, onde cada equipe pode conter consultores de diferentes especialidades. 
- Cada consultor possui um nome, uma especialidade e um nível de experiência. 
- O gerente da TechConsult deseja um programa orientado a objetos que permita cadastrar equipes, adicionar consultores a elas e, ao receber o nome de uma equipe, listar todos os consultores dessa equipe em ordem alfabética pelo nome. 
- Caso a equipe não exista, o sistema deve informar que ela não foi encontrada. 
- Utilize classes, encapsulamento, herança e polimorfismo para modelar consultores de diferentes especialidades (por exemplo, Backend, Frontend, Dados). Use coleções para armazenar as equipes e seus consultores. 
- Não utilize bibliotecas externas.

**Implemente as classes necessárias para representar equipes e consultores, garantindo que seja possível adicionar consultores de diferentes especialidades a uma equipe. Ao receber o nome de uma equipe como entrada, imprima os nomes, especialidades e níveis de experiência dos consultores dessa equipe, um por linha, em ordem alfabética pelo nome. Se a equipe não existir, imprima "Equipe nao encontrada".**

### Entrada
Uma string contendo o nome da equipe a ser consultada.

### Saída
Para cada consultor da equipe, uma linha no formato "nome especialidade nivel". Se a equipe não existir, imprima "Equipe nao encontrada".

### Exemplos
A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada | Saída |
|--------|-------|
| Alpha | Bruno Backend Senior<br>Lucas Dados Pleno<br>Maria Frontend Junior |
| Beta | Ana Dados Senior<br>Joao Backend Junior |
| Gamma | Equipe nao encontrada |
| Alpha | Bruno Backend Senior<br>Lucas Dados Pleno<br>Maria Frontend Junior |
