@tag
Feature: Servico de consulta de cep

  @tag1
  Scenario Outline: Consulta cep valido
  
    Given que o usuario insira o cep valido "<cep>"
    When retornar a consulta
    Then sera exibido as informacoes do cep 

 Examples:
 
 
   |cep     |
   |04863020|
   |04857430|
   |04859000|