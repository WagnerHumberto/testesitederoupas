#language: pt
#enconding: UTF 8
#author: Wagner Humberto
#date: 31/01/2023
#version: 1.0

Funcionalidade: Filtro de produtos
    Com essa funcionalidade iremos ter uma lista de opções para filtros de produtos

    Como um usuário
    Eu desejo ter a possibilidade de filtrar produtos
    Para visualizar somente produtos que desejo


    @smoke_test @opcoes_filtro
    Cenário: Validar as opções de filtro
    Dado estiver na tela home
    E selecionar o submenu "Women"
    Quando clicar no filtro de roupas
    Então deve visualizar as opções de filtro
        | Price: Lowest first      |
        | Price: Highest first     |
        | Product Name: A to Z     |
        | Product Name: Z to A     |
        | In stock                 |
        | Reference: Lowest first  |
        | Reference: Highest first |