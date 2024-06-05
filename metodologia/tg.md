# Portfólio das APIs

<center><h2>Jhonny Freitas Dutra</h2></center>


## Sumário

- Introdução
- Sobre mim
- Meus Projetos
- Conclusão


## Introdução

Este portfólio apresenta minha jornada como aluno do 4º semestre do curso de Tecnologia em Banco de Dados na Faculdade de Tecnologia de São José dos Campos. Através de projetos integradores (APIs) desenvolvidos ao longo do curso, demonstro minhas habilidades e conhecimentos adquiridos na área, com foco em soluções práticas e inovadoras.


## Sobre Mim

<p align="center"><img src="https://avatars.githubusercontent.com/u/122806886?v=4" width="320px"></p>

Apaixonado por tecnologia desde os 10 anos de idade, profissionalmente, tenho mais de 5 anos de experiência com desenvolvimento de software, incluindo projetos para clientes nos Estados Unidos. Atualmente, trabalho como TVC no Google através da HCLTech, onde contribuímos para o desenvolvimento de diversas ferramentas internas e integrações com sistemas de LMS.

Minha trajetória na área de TI é marcada por um constante aprendizado e busca por aprimoramento. Acredito que a combinação de conhecimentos técnicos, criatividade e trabalho em equipe é fundamental para o sucesso em projetos desafiadores.

<p align="center"><a href="https://www.linkedin.com/in/dutrajy">LinkedIn</a> | <a href="https://github.com/dutrajy">GitHub</a></p>


## Meu Projetos

Durante meu curso, desenvolvi os seguintes projetos. Estes projetos foram desafiadores e extremamente importantes para minha experiência acadêmica até então, proporcionando um grande crescimento em termos de habilidades técnicas e práticas.


---

### 1º Semestre: Sistema de Avaliação API (FATEC)

#### Desafio:

Desenvolver um sistema de avaliação democratizada baseada na técnica de avaliação 360º. O sistema precisava incluir cadastros de projetos, turmas, professores e alunos, e um sistema de avaliação por formulário. Cada membro seria avaliado por seus pares, com geração de estatísticas como a quantidade de avaliações realizadas e faltantes, média das notas, média por cada conceito avaliado, além da funcionalidade de autoavaliação, e o agrupamento das avaliações por sprint. O perfil de administrador teria a capacidade editar diversos parâmetros.

#### Solução:

Foi desenvolvido um programa que funciona no terminal e que atende a todos os requisitos de cadastro de projetos, turmas, professores e alunos, do fluxo de avaliação de cada membro pelos seus pares, e por fim um dashboard (usando a biblioteca rich) com diversas estatísticas sobre cada projeto cadastrado. Organizamos o código com uma estrutura de pastas coerente, separando funcionalidades e componentes do sistema, como persistência em arquivos JSON, CRUD, interface do terminal e funcionalidades comuns (como definição de entidades, por exemplo, Usuário). Por ser o primeiro semestre do curso, a solução foi desenvolvida de maneira mais procedural e sem interface gráfica, mas conseguimos cobrir todos os requisitos.

#### Tecnologias Utilizadas:
- **Python**: Linguagem de programação
- **Rich**: Biblioteca para formatação e estilização de texto no terminal
- **Visual Studio Code**: Editor de códigos
- **Git**: Controle de versão distribuído
- **Slack**: Comunicação com o cliente (neste caso, a própria FATEC)

#### Minhas Contribuições:

- Fui responsável por definir a estrutura de pastas, organização geral do código e definições de padrões utilizado em todas as funcionalidades.
- Instrui os demais membros do grupo em assuntos relacionados a git, python, virtualenv, rich, execução correta do projeto e operações de CRUD.
- CRUD de Usuários.
- Autenticação.
- CRUD de Times (Grupos) e sua integração com Usuários.
- Menu Principal.
- Permissões de Usuários.
- Implementação de filtros para selecionar Usuários em Times baseado em sua categoria.


---

### 2º Semestre: 2RPonto - Controle de Horas Excedentes (2RPNet)

#### Desafio:

A empresa 2RPNet, especializada em soluções para análise de informações em tempo real, enfrentava dificuldades na gestão de horas excedentes de seus colaboradores. O processo manual e fragmentado em planilhas limitava a disponibilidade, flexibilidade e controle necessários. Resumindo as funcionalidades, era necessário um sistema onde os colaboradores pudessem lançar informações sobre horas excedentes, diferenciando entre horas extras e sobreaviso. Gestores e RH precisavam poder visualizar, aprovar ou rejeitar as horas lançadas, gerenciar contas de usuários e acessar dashboards para monitoramento em tempo real.

#### Solução:

Desenvolvemos uma aplicação centralizada para controle de horas excedentes, distinguindo entre horas extras e sobreavisos. A plataforma oferece recursos de aprovação ou reprovação por gestores e RH, além de painéis de controle para acompanhamento individual e por equipe. A solução foi desenvolvida usando Java com Swing, JDBC com MySQL, e as telas foram desenhadas previamente no Figma, e depois implementadas usando a ferramenta gráfica do NetBeans (GUI Builder).

#### Tecnologias Utilizadas:

- **Figma**: Design de interface do usuário
- **Swing**: Framework de desenvolvimento Java
- **NetBeans GUI Builder**: Ferramenta gráfica para desenvolvimento de interfaces
- **Git**: Controle de versão distribuído
- **Slack**: Comunicação com o cliente
- **MySQL**: Banco de dados relacional para armazenamento de dados

#### Minhas Contribuições:

- CRUD de Apontamentos.
- Arquitetura do sistema, organização das pastas e do código e configuração do Maven.
- Diferenciação entre Hora Extra e Sobreaviso
- Estilização das telas de acordo com o design no Figma
- CRUD Clientes
- Aprovação/Reprovação de Apontamentos por Gestor do Projeto e RH incluindo justificativa.
- Dashboard com total de horas e outras estatísticas
- Geração de relatórios discriminando horas em verbas salariais baseadas na legislação atual (CLT)
- Parametrização das Verbas Salariais
- Funcionalidade de alteração de senha.


---

### 3º Semestre: 2RPonto - Controle de Horas Excedentes (2RPNet)

#### Desafio:

Desenvolver uma REST API e um frontend web para substituir a aplicação desktop do semestre anterior, mantendo os mesmos requisitos. O sistema deveria proporcionar uma experiência de usuário mais moderna e responsiva, além de permitir melhor integração entre diferentes sistemas.

#### Solução:

Criamos uma REST API robusta utilizando Spring Boot, que serviu de backend para um frontend desenvolvido com HTML, CSS e JavaScript puro, sem frameworks. Esta solução permitiu uma melhor integração e uma interface de usuário mais moderna e responsiva. O sistema foi projetado para ser escalável e fácil de manter, com endpoints claros e bem documentados, e uma interface intuitiva para os usuários finais.

#### Tecnologias Utilizadas:

- **Spring Boot**: Framework para criação de APIs em Java
- **HTML/CSS/JavaScript**: Desenvolvimento de frontend sem frameworks
- **Git**: Controle de versão distribuído
- **Slack**: Comunicação com o cliente
- **MySQL**: Banco de dados relacional

#### Minhas Contribuições:

- Arquitetura do sistema, organização das pastas e do código e configuração do Maven.
- Autenticação no back-end e no front-end.
- Listagem de Apontamentos no front-end.
- Aprovação/Reprovação de Apontamentos por Gestor do Projeto e RH incluindo justificativa.
- Fluxo completo do colaborador no front-end.
- Dashboard com diversas estatísticas, incluindo quantidade de horas aprovadas, reprovadas e pendentes.
- Parametrização de verbas salariais
- Adaptação do algorítimo usado pra quebrar apontamentos em verbas salariais do semestre anterior.


---

### 4º Semestre: Cadastro e Gerência de Parceiros (Oracle)

#### Desafio:

Desenvolver um sistema para cadastrar novos parceiros e gerenciar informações dos parceiros existentes. O sistema deve ser capaz de gerenciar eficientemente uma lista variável de parceiros, permitindo a inclusão, edição, visualização e exclusão de registros de forma intuitiva e segura.

#### Solução:

Estamos desenvolvendo um sistema completo de cadastro e gerenciamento de parceiros, utilizando Spring Boot para o backend e Vue para o frontend, garantindo uma interface de usuário intuitiva e uma robusta integração com o banco de dados. O sistema também inclui funcionalidades de busca e filtragem, permitindo aos usuários localizar rapidamente os registros de parceiros específicos.

#### Tecnologias Utilizadas:

- **Spring Boot**: Framework para desenvolvimento de backend em Java
- **Vue**: Framework JavaScript para desenvolvimento de frontend
- **Git**: Controle de versão distribuído
- **Slack**: Comunicação com o cliente
- **MySQL**: Banco de dados relacional

#### Minhas Contribuições:

- Avaliações de Parceiros.
- Métricas/Estatísticas das Avaliações de uma Empresa incluindo um gráfico na dashboard no front-end.
- Estatísticas de parceiros por estado do Brasil incluindo um gráfico em formato de mapa na dashboard no front-end.


---

## Conclusão

Este portfólio representa minha trajetória acadêmica na Faculdade de Tecnologia de São José dos Campos, onde estou cursando Tecnologia em Banco de Dados. Apesar de já possuir experiência anterior no desenvolvimento de software, os projetos desenvolvidos ao longo do curso foram fundamentais para aprimorar ainda mais minhas habilidades.

Cada projeto apresentado aqui não apenas destaca minhas competências técnicas, mas também o quanto evoluí em áreas essenciais para um profissional de TI. Através desses projetos, melhorei significativamente minhas habilidades de trabalho em equipe, interação com clientes, gerenciamento de projetos e documentação.

Estes projetos me proporcionaram a oportunidade de enfrentar desafios reais, permitindo-me aplicar conhecimentos teóricos na prática e desenvolver soluções eficazes e inovadoras. Estou sempre em busca de novos desafios que me permitam continuar aprendendo e crescendo como profissional, e acredito que a experiência adquirida durante meu curso será a base sólida para minha carreira futura.
