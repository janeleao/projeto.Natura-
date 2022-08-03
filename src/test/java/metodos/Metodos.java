package metodos;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import conexoes.DriversFactory;


public class Metodos extends DriversFactory {
	

	
		public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

		public void clicar(By elemento) {
			driver.findElement(elemento).click();

		}
		public void submit(By elemento) {
			driver.findElement(elemento).submit();

		}
						
		public void tirarPrint(String nomeEvidencia) {
			TakesScreenshot srcShot = (TakesScreenshot) driver;
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File desFile = new File("./evidencias/" + nomeEvidencia + ".png");
			try {
				FileUtils.copyFile(srcFile, desFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
}
