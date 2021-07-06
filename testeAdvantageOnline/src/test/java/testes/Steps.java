package testes;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {

		metodos.abrirNavegador(site);

	}

	@When("Eu vou clicar no USER e fazer login")
	public void eu_vou_clicar_no_user_e_fazer_login() {

		metodos.aguardarElemento(el.getAguardar());
		metodos.click(el.getBotaoLogin());
		metodos.pausa(3000);
		metodos.click(el.getNewAccount());
		metodos.aguardarElemento(el.getCreatAccount());
		metodos.click(el.getNome());
		metodos.escrever("Junior", el.getNome());
		metodos.click(el.getEmail());
		metodos.escrever("junior@gmail.com", el.getEmail());
		metodos.click(el.getPasswordLgm());
		metodos.escrever("123Dasilva4", el.getPasswordLgm());
		metodos.click(el.getConfirmPass());
		metodos.escrever("123Dasilva4", el.getConfirmPass());
		metodos.pausa(5000);
		metodos.click(el.getAgree());
		metodos.pausa(3000);
		metodos.click(el.getBotaoRegister());

	}
	
	@Then("Validar o nome de usuário {string}")
	public void validar_o_nome_de_usuário(String textoEsperado) throws IOException {
		
		metodos.validarTexto(textoEsperado, el.getValidarExist());
		metodos.screnShot("Validar Cadastro");
		metodos.fecharNavegador();

	}

	@When("Eu vou fazer o cadastro com Login Sucess")
	public void eu_vou_fazer_o_cadastro_com_login_sucess() {

		metodos.aguardarElemento(el.getAguardar());
		metodos.click(el.getBotaoLogin());
		metodos.pausa(3000);
		metodos.click(el.getUsername());
		metodos.escrever("Junior", el.getUsername());
		metodos.click(el.getPassword());
		metodos.escrever("123Dasilva4", el.getPassword());
		metodos.pausa(3000);
		metodos.click(el.getSignIn());

	}
	
	@Then("Validar o Login Sucess {string}")
	public void validar_o_login_sucess(String textoEsperado) throws IOException {
		
		metodos.validarTexto(textoEsperado, el.getValidarTxt());
		metodos.pausa(9000);
		metodos.screnShot("Validar Login Sucess");
		metodos.fecharNavegador();
	   
	}

	@When("Eu vou fazer o cadastro com Login inválido")
	public void eu_vou_fazer_o_cadastro_com_login_inválido() {

		metodos.aguardarElemento(el.getAguardar());
		metodos.click(el.getBotaoLogin());
		metodos.pausa(3000);
		metodos.click(el.getUsername());
		metodos.escrever("LLL", el.getUsername());
		metodos.click(el.getPassword());
		metodos.escrever("123Dasilva4", el.getPassword());
		metodos.pausa(3000);
		metodos.click(el.getSignIn());

	}

	@Then("Validar o Login inválido {string}")
	public void validar_o_login_inválido(String textoEsperado) throws IOException {
		
		metodos.validarTexto(textoEsperado, el.getValidarInc());
		metodos.screnShot("Validar Login inválido");
		metodos.fecharNavegador();
	   
	}

	@When("Eu vou fazer o cadastro com Login em Branco")
	public void eu_vou_fazer_o_cadastro_com_login_em_branco() {

		metodos.aguardarElemento(el.getAguardar());
		metodos.click(el.getBotaoLogin());
		metodos.pausa(3000);
		metodos.click(el.getUsername());
		metodos.escrever("", el.getUsername());
		metodos.click(el.getPassword());
		metodos.escrever("", el.getPassword());
		metodos.pausa(3000);
		metodos.click(el.getSignIn());

	}

	@Then("Validar o Login em Branco {string}")
	public void validar_o_login_em_branco(String textoEsperado) throws IOException {
		
		metodos.validarTexto(textoEsperado, el.getValidarBranco());
		metodos.screnShot("Validar Login em Branco");
		metodos.fecharNavegador();
	    
	}
	
	
}
