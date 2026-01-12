### Exercício "ROLES"

**Descrição:** 
Você trabalha na TechConsult, uma renomada consultoria em tecnologia que auxilia empresas a organizar suas equipes de projetos. 
- Cada projeto possui uma lista de consultores, podendo ser de diferentes especialidades: Desenvolvedor, Analista ou Gerente. 
- Cada consultor tem um nome e uma especialidade, e cada especialidade possui uma forma diferente de apresentar seu relatório. O cliente solicitou um sistema que, ao receber uma lista de consultores, gere um relatório com a apresentação de cada um, respeitando as regras de polimorfismo: Desenvolvedores apresentam-se com "Dev: [nome]", Analistas com "Analyst: [nome]" e Gerentes com "Manager: [nome]". 
- O sistema deve ser orientado a objetos, utilizando herança e polimorfismo, e armazenar os consultores em uma coleção adequada. Sua tarefa é implementar esse sistema para automatizar a geração dos relatórios personalizados.

Implemente um programa orientado a objetos que leia uma lista de consultores, cada um no formato "[especialidade] [nome]", separados por ponto e vírgula. O programa deve imprimir, para cada consultor, uma linha com sua apresentação conforme as regras acima, na ordem em que aparecem na entrada. Utilize classes, encapsulamento, herança e polimorfismo. Não utilize bibliotecas externas.

### Entrada
Uma única linha contendo uma lista de consultores separados por ponto e vírgula. Cada consultor é descrito por sua especialidade (Developer, Analyst ou Manager) seguida de um espaço e seu nome. Não há espaços antes ou depois dos pontos e vírgulas.

### Saída
Para cada consultor, uma linha com sua apresentação personalizada, na ordem em que aparecem na entrada.

### Exemplos
A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada | Saída |
|--------|-------|
| Developer Alice;Analyst Bob;Manager Carol | Dev: Alice<br>Analyst: Bob<br>Manager: Carol |
| Manager John | Manager: John |
| Analyst Eve;Developer Max | Analyst: Eve<br>Dev: Max |
| Developer Zoe | Dev: Zoe |
