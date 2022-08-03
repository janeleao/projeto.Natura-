#language:pt
#Author: janeleaodasilva@hotmail.com


@todos
Funcionalidade: Buscar produto 
  Como usuario
  Quero acessar o site da Natura
  Para validar o campo de busca

Background: Acessar barra de pesquisa da Natura
			 Dado que o usuario acesse o site da Natura

  @positivo
 Cenario: Validar o campo busca com produto valido
    E clicar na barra de pesquisa							
    E informar o produto desejado							
    Quando pressionar enter							
    Entao sistema traz produto pesquisado							

  @negativo
Cenario: Validar busca por produto invalido
    E clicar na barra de pesquisa
    E informe "sapato" na barra de pesquisa
    Quando clicar na lupa pesquisar 
    Entao sistema emite mensagem "Nao foi possível encontrar nenhum produto com este criterio."
    
 