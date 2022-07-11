package pages;

public class AutomobileInsurance {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void dadosVeiculo(String marca, String motor, String dtaFabricacao, String acentos, String combust,
			String prcTabela, String license, String km) {

		metodos.escrever(el.elementomake, marca);
		metodos.escrever(el.enginePerformance, motor);
		metodos.escrever(el.dateManufacture, dtaFabricacao);
		metodos.escrever(el.numberSeats, acentos);
		metodos.escrever(el.fuelType, combust);
		metodos.escrever(el.listPrice, prcTabela);
		metodos.escrever(el.licenseNumber, license);
		metodos.escrever(el.annualMileage, km);
		metodos.clicar(el.nextInsuranceData);
		metodos.esperar();
	}

	public void dadosSeguro(String pNome, String sNome, String dtNasc, String rua, String pais, String cep,
			String cidade, String ocupacao, String site) throws InterruptedException {

		metodos.esperar();
		metodos.escrever(el.firstName, pNome);
		metodos.escrever(el.lastName, sNome);
		metodos.escrever(el.dateBirth, dtNasc);
		metodos.esperar();
		metodos.clicar(el.gender);
		metodos.escrever(el.street, rua);
		metodos.escrever(el.country, pais);
		metodos.escrever(el.zip, cep);
		metodos.escrever(el.city, cidade);
		metodos.escrever(el.occupation, ocupacao);
		metodos.esperar();
		metodos.clicar(el.hobbie);
		metodos.escrever(el.site, site);
		metodos.clicar(el.nextProductData);
		metodos.scrolUp();

	}

	public void dadosProduto(String dataInicio, String valorSeg, String classificacao, String segDanos,
			String carCortesia) throws InterruptedException {
		metodos.esperar();
		metodos.escrever(el.date, dataInicio);
		metodos.escrever(el.insuranceSum, valorSeg);
		metodos.escrever(el.merit, classificacao);
		metodos.escrever(el.damage, segDanos);
		metodos.esperar();
		metodos.clicar(el.optionalProduct);
		metodos.escrever(el.courtesy, carCortesia);
		metodos.clicar(el.nextSelectPrice);
		metodos.esperar();

	}

	public void dadosPreco() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(el.selectUltimate);
		metodos.esperar();
		metodos.clicar(el.nextSendQuote);
	}

	public void enviarCotacao(String email, String tel, String userName, String senha, String confSenha)
			throws InterruptedException {

		metodos.escrever(el.email, email);
		metodos.escrever(el.phone, tel);
		metodos.escrever(el.userName, userName);
		metodos.escrever(el.password, senha);
		metodos.escrever(el.confirmPass, confSenha);
		metodos.clicar(el.send);
		metodos.esperar();

	}

	public void validarCotacao() throws InterruptedException {
		metodos.esperar();
		metodos.validarTexto();
		metodos.esperarElementoClicavel(el.finalOk, 5);
		metodos.screenShot("evidencia");
		metodos.clicar(el.finalOk);
		metodos.fecharNavegador();
	}

}
