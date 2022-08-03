package elementos;

import org.openqa.selenium.By;

import metodos.Metodos;

public class Elementos {
	Metodos metodos = new Metodos();
	
	public By barraPesquisa = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root natds15']//span//i");
	public By produto = By.xpath("//input[@name='search']");
	public By btnEnter = By.xpath("//input[@name='search']");
	public By prodInvalido = By.xpath("//input[@name='search']");

	
	
	
}

