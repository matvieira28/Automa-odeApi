package Metodos;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class Metodos {
	
	
	
	private Response response;
	
	
	public void setUrl(String url) {
		
	}
	public void GetCepvalido(String cep) {
		
		response = RestAssured.request(Method.GET,"https://viacep.com.br/ws/"+cep+"/json/");
		System.out.println(response.getBody().asString());
	}

	public void ConsultaCep(String cep) {
		RestAssured.given().when().get("https://viacep.com.br/ws/"+cep+"/json/");	
		System.out.println("retorno do status code : "+ response.statusCode()+ response.getBody().asString());
		
	}
	
	
	
	
}
