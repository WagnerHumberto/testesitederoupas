#language: pt
#enconding: UTF 8
#author: Wagner Humberto
#date: 06/04/2023
#version: 1.0

Funcionalidade: Forma de pagamento
  Com essa Funcionalidade teremos duas formas de pagamento
  para realizar o pagamento dos produtos

  Como um usuário já cadastrado na aplicação
  Eu quero ter a possiblidade de escolher uma forma de pagamento
  Para finalizar a compra

  Contexto:
    Dado estiver na tela de login
    E inserir os dados do usuário
      | email             | senha    |
      | wjr2605@gmail.com | AeJqOurL |

  @smoke_test @formas_pagamento
  Esquema do Cenário: Validar a compra utilizando a forma de pagamento
    Quando realizar a compra de um produto da seção "Women" com a forma de pagamento <forma_pagamento>
    Então deve visualizar a compra realizada com sucesso utilizando a forma de pagamento <pagamento>


    Exemplos:
      | forma_pagamento    | pagamento          |
      | "Pay by bank wire" | "Bank wire"        |
      | "Pay by check."    | "Payment by check" |