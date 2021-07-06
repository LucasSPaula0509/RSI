package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By botaoLogin = By.cssSelector("#menuUserSVGPath");
	private By aguardar = By.cssSelector("#headphonesTxt");
	private By username = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(1) > div > input");
	private By password = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(2) > div > input");
	private By signIn = By.cssSelector("#sign_in_btnundefined");
	private By NewAccount = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope");
	private By creatAccount = By.cssSelector("#registerPage > article > h3");
	private By nome = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(1) > div > input");
	private By email = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By passwordLgm = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(1) > div > input");
	private By confirmPass = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(2) > div > input");
	private By agree = By.cssSelector("#formCover > sec-view > div > input");
	private By botaoRegister = By.cssSelector("#register_btnundefined");
	private By validarExist = By.cssSelector("#registerPage > article > sec-form > div.center > label.ALREADY_HAVE_AN_ACCOUNT.roboto-medium > a");
	private By validarTxt = By.cssSelector("#headphonesTxt");
	private By validarInc = By.cssSelector("#signInResultMessage");
	private By validarBranco = By.cssSelector("#signInResultMessage");
			
	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getPasswordLgm() {
		return passwordLgm;
	}

	public By getConfirmPass() {
		return confirmPass;
	}

	public By getAgree() {
		return agree;
	}


	public By getBotaoLogin() {
		return botaoLogin;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getSignIn() {
		return signIn;
	}

	public By getAguardar() {
		return aguardar;
	}

	public By getNewAccount() {
		return NewAccount;
	}

	public By getCreatAccount() {
		return creatAccount;
	}

	public By getBotaoRegister() {
		return botaoRegister;
	}

	public By getValidarTxt() {
		return validarTxt;
	}

	public By getValidarInc() {
		return validarInc;
	}

	public By getValidarBranco() {
		return validarBranco;
	}

	public By getValidarExist() {
		return validarExist;
	}


	

}
