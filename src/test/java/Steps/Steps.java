package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	
	
	
	@Given("que o usuario insira o cep valido {string}")
	public void que_o_usuario_insira_o_cep_valido(String string) {
	   m.GetCepvalido(string);
	}
	
	@When("retornar a consulta")
	public void retornar_a_consulta() {
	 m.ConsultaCep("");   
	}

	@Then("sera exibido as informacoes do cep")
	public void sera_exibido_as_informacoes_do_cep() {
		
		
		
	    
	}

}
