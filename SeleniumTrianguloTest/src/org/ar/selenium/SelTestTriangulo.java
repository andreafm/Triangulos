package org.ar.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

/* 
 * Resultados: ISOSCELES - EQUILATERAL - SCALENE - DEGENERATE - INVALID
 * 
 *  a < (b+c) OR a > (b-c)
 * 
 */

public abstract class SelTestTriangulo {

	public static void main(String[] args) throws InterruptedException {

		    // abre navegador
		    WebDriver driver = new FirefoxDriver();
				
	        // maximiza navegador
	        driver.manage().window().maximize();
				
	        // abre la pagina solicitada
	        driver.get("http://practice.agilistry.com/triangle");

	        // ingresa valor numerico en textBox1
			WebElement textBox1;
			textBox1 = driver.findElement(By.id("triangle_side1"));
			textBox1.sendKeys(String.valueOf(20.5));
		
			// ingresa valor numerico en textBox2
			WebElement textBox2;
			textBox2 = driver.findElement(By.id("triangle_side2"));
			textBox2.sendKeys(String.valueOf(20.5));
		
			// ingresa valor numerico en textBox3
			WebElement textBox3;
			textBox3 = driver.findElement(By.id("triangle_side3"));
			textBox3.sendKeys(String.valueOf(25));
			
			 WebElement xpath;
			 xpath = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[1]/form/div[2]/div[5]"));
			 xpath.sendKeys(Keys.RETURN);
				 
			 			
			if (driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[1]/form/div[2]/div[5] ")).getText().equals("Isosceles")) {
			       System.out.println("Test Passed!");
			     } else {
			       System.out.println("Test Failed");
			     }
						
					
			// espera
			Thread.sleep(5000);
			
			// refresca el navegador
			driver.navigate().refresh();
			
			// cierra el navegador
			// driver.quit();
		}
	}

	
