package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutomobileInsurance;
import pages.Browser;
import pages.HomePage;
public class EnviarFormulario {
	
	

		Browser browser = new Browser();
		HomePage home = new HomePage();
		AutomobileInsurance auto = new AutomobileInsurance();
		
		
		
		@Given("que o usuario acesse o site de cotacao {string}")
		public void que_o_usuario_acesse_o_site_de_cotacao( String site) {
			
			browser.abrirNavegador("chrome", site);
		}
		
		@Given("clicar no na opcao desejada")
		public void clicar_no_na_opcao_desejada() {
		    
			home.escolherMenu("automobile");
		}

		@When("preencher os dados do veiculo {string},{string}, {string}, {string}, {string}, {string}, {string},{string},")
		public void preencher_os_dados_do_veiculo(String marca, String motor, String dtaFabricacao, String acentos, String combust, String prcTabela, String license, String km) {
		 
		auto.dadosVeiculo(marca, motor, dtaFabricacao, acentos, combust, prcTabela, license, km);
			
		}

		@When("preencher os dados do seguro")
		@When("preencher os dados do seguro {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
		public void preencher_os_dados_do_seguro(String pNome, String sNome, String dtNasc, String rua, String pais, String cep, String cidade, String ocupacao, String site)throws InterruptedException {
		    
			auto.dadosSeguro(pNome, sNome, dtNasc, rua, pais, cep, cidade, ocupacao, site);
			
		
		}

		@When("preencher os dados do produto  {string}, {string}, {string}, {string}, {string}")
		public void preencher_os_dados_do_produto(String dataInicio, String valorSeg, String classificacao, String segDanos, String carCortesia) throws InterruptedException {
		    
			auto.dadosProduto(dataInicio, valorSeg, classificacao, segDanos, carCortesia);
			
		}

		@When("preencher o preco")
		public void preencher_o_preco() throws InterruptedException {
		    
			auto.dadosPreco();
		}

		@When("enviar cotacao {string}, {string}, {string}, {string}, {string}")
		public void enviar_cotacao(String email, String tel, String userName, String senha, String confSenha) throws InterruptedException {
		   
			auto.enviarCotacao(email, tel, userName, senha, confSenha);
		}

		@Then("validamos cotacao")
		public void validamos_cotacao() throws InterruptedException {
		    auto.validarCotacao();
		}
		
}

