#Author: lucass.paula.adv@gmail.com


Feature: Acessar o site Advantage Online Shopping
         Eu como usuário quero realizar login e cadastro

	Background: 
  	Given que eu esteja no site "http://advantageonlineshopping.com/#/"
  
  Scenario: Fazer Login e Cadastro no site
    When Eu vou clicar no USER e fazer login
    Then Validar o nome de usuário "ALREADY HAVE AN ACCOUNT?"
  
  	Scenario: Fazer Login no site
    When Eu vou fazer o cadastro com Login Sucess
    Then Validar o Login Sucess "HEADPHONES"
  	
  	Scenario: Fazer Login no site
    When Eu vou fazer o cadastro com Login inválido
    Then Validar o Login inválido "OR"
    
    Scenario: Fazer Login e Cadastro no site
    When Eu vou fazer o cadastro com Login em Branco 
    Then Validar o Login em Branco "OR"
    
    
    

