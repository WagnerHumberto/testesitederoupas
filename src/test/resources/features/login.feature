#language: pt
#enconding: UTF 8
#author: Wagner Humberto
#date: 31/01/2023
#version: 1.0


@login
Funcionalidade: Login
  Com essa funcionalidade iremos conseguir realizar o login na aplicação
  com usuário já cadastrado.

  Com usuário já cadastrado na aplicação
  Eu quero inserir os meus dados cadastrais
  Para conseguir realizar o login na aplicação


  Contexto: Entrar na tela de login
    Dado estiver na tela de login

  @smoke_test @loginAplicacao
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuário
      | email             | senha    |
      | wjr2605@gmail.com | AeJqOurL |
    Então devo visualizar o nome "wagner Humberto"


  @loginIncorreto
  Esquema do Cenário: Validar a mensagem de erro ao inserir dados incorretos
    Quando inserir os dados do usuário
      | email           | senha   |
      | <dados_usuarios> | <senha> |
    Então deve visualizar a mensagem de erro "Authentication failed."


    Exemplos:
      | dados_usuarios       | senha    |
      | wjr2605@gmail.com.br | AeJqOurL |
      | wjr2605@gmail.com    | aeJqOurL |