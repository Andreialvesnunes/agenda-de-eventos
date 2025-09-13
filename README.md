# Sistema de Gerenciamento de Arquivos

## 📌 Sobre
Este projeto está sendo desenvolvido para a disciplina da faculdade, com o objetivo de criar um **sistema de gerenciamento de arquivos**.  
O sistema foi estruturado no padrão **MVC (Model-View-Controller)**, aplicando conceitos práticos de organização e boas práticas de desenvolvimento.

As principais entidades do projeto são:
- **Usuário**
- **Evento**

Cada entidade possui seus respectivos controladores para gerenciar o fluxo de dados e as operações relacionadas.

---

## 🚀 Funcionalidades

### Usuário
- Cadastro de usuário com:
  - Nome (`String`)
  - Idade (`int`)
  - Endereço (`String`)
- Alteração de informações do usuário
- Gerenciamento de eventos:
  - Lista de interesse (`Map<Enum, String>`)
  - Lista de eventos confirmados (`Map<Enum, String>`)
- Validação de entradas de texto:
  - Impede campos vazios
  - Limita o número máximo de caracteres permitidos

### Evento
- Cadastro de evento com:
  - Nome (`String`)
  - Endereço (`String`)
  - Data (`Date`)
  - Horário (`Date`)
  - Categoria (`CategoriaEvento`)
    - Valores possíveis: EVENTOS_SOCIAIS, EVENTOS_CULTURAIS, EVENTOS_RELIGIOSOS, EVENTOS_CORPORATIVOS, EVENTOS_POLITICOS
  - Descrição (`String`)
- Alteração de informações do evento
- Cancelamento de evento
- Confirmação de presença em evento
- Inserção do evento na lista de interesse

---

## 🛠️ Tecnologias Utilizadas
- **Java** (JDK 21)
- Estrutura em **MVC**
- **Scanner** para entrada de dados
- Boas práticas de **validação centralizada**
- Enum para categorias de evento

---

## 📂 Estrutura do Projeto
