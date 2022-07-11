#Author: Itamar Paulo
@regressivos 
Feature: Enviar cotacao
  Como usuario quero fazer uma cotacao para avaliar o preco
  
  Background: Acessar o site
  Given que o usuario acesse o site de cotacao "http://sampleapp.tricentis.com/101/index.php"

 @automobile @positivo
 Scenario: Enviar uma nova cotacao
    And clicar no na opcao desejada
    When preencher os dados do veiculo "Volvo","2000", "10/02/2021", "9", "Diesel", "60000", "523265","45000",
    And preencher os dados do seguro "Silas", "Santos", "12/12/2000", "avenida 10 de julho, 5300", "Brazil", "01406200", "Sao Paulo", "Employee", "www.silas.com.br"
    And preencher os dados do produto  "12/12/2022", "3.000.000,00", "Super Bonus", "Full Coverage", "Yes"
    And preencher o preco 
    And enviar cotacao "itapaulo27@gmail.com", "11985652575", "silas123", "Silas123", "Silas123"
    Then validamos cotacao