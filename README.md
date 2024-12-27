# HelpDesk - Backend

### Sobre o Projeto
Este projeto foi desenvolvido como parte do meu aprendizado pessoal e consiste em um sistema para gerenciamento de chamados, simulando um simples **Help Desk**. Ele foi implementado utilizando **Angular 12** no frontend e **Spring Boot 2** no backend. O **MySQL** foi escolhido como banco de dados, e o deploy foi realizado nas seguintes plataformas:

- **Backend:** Deploy na [Railway](https://railway.app/).
- **Frontend:** Deploy no [GitHub Pages](https://pages.github.com/).

Além disso, foram aplicados conceitos de **Autenticação e Autorização** utilizando Tokens **JWT**.

---

### Recursos do Projeto
- **Gerenciamento de Chamados:** Cadastro, edição e exclusão de chamados.
- **Autenticação Segura:** Implementação de login com **Tokens JWT**.
- **API Restful:** Backend com rotas organizadas e conexão com banco de dados MySQL.

---

### Como Rodar o Projeto com Docker
Na branch `main`, você pode rodar o projeto utilizando **Docker**. Siga os passos abaixo:

---

### Instalação
<a href="https://www.docker.com/">Docker</a> - Instale o docker

---

### 1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/Felipe-Tomazoti/HelpDesk.git
   cd helpdesk
  ```
### 2. Certifique-se de que o Docker está rodando.

### 3. **Suba os containers do Backend e do Banco de Dados:**
   ```bash
   docker-compose up --build
  ```
![image](https://github.com/Felipe-Tomazoti/HelpDesk-Front/blob/main/src/assets/img/imgDocker.png?raw=true)

### 4. **Agora você já pode testar as rotas da API, faça o donwload das [Rotas](https://github.com/Felipe-Tomazoti/HelpDesk/blob/main/Help%20Desk.postman_collection.json):**
No Postman click em importar:

![image](https://private-user-images.githubusercontent.com/111258213/371807082-1070ed3c-e98d-4df5-8a89-4ba268ca3c67.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzUzMTY2OTgsIm5iZiI6MTczNTMxNjM5OCwicGF0aCI6Ii8xMTEyNTgyMTMvMzcxODA3MDgyLTEwNzBlZDNjLWU5OGQtNGRmNS04YTg5LTRiYTI2OGNhM2M2Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjI3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIyN1QxNjE5NThaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kNWQxYWI2YjAzMWMwNzc2ODA1OWZkZjUyYTlmYzJhMGJkMDNmNTUyYmRmMzFlMDVkMGI5ODk2OGVkOTUzMzVkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.jSzE5CLZjD49nhpALp-dbRD84zmMhKO8TE9YGAfb7iQ)

### 5. Divirta-se.

---

Caso queira conferir o FrontEnd: https://github.com/Felipe-Tomazoti/HelpDesk-Front

