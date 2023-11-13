package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

public class nopcommercePage {
	
	Webdriver driver = null;
	
	public  nopcommercePage(Webdriver driver)
	{
		this.driver = driver;
	}
	
	

    public static  void Get_Home_Page ()
    {
    	 driver.get("https://demo.nopcommerce.com/");
    	   	
    }
    

    public static  void Register_new_account ()
    {
    	driver.find_element(By.XPATH, "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a").click();//click on register
    	Thread.sleep(2000);    	
    	driver.find_element(By.XPATH, "//*[@id=\"gender-male\"]").click();//select male    	
    	driver.find_element(By.XPATH, "//*[@id=\"FirstName\"]t").sendkeys("Mohamed");//first name    
    	driver.find_element(By.XPATH, "//*[@id=\"LastName\"]").sendkeys("Helal");//last name      	
    	Select select10 = new Select(driver.findElement(By.XPATH("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")));
    	select10.selectByVisibleText("1");  //day of birth
    	Select select10 = new Select(driver.findElement(By.XPATH("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")));
    	Select10.selectByVisibleText("12");  //month of birth
    	Select select10 = new Select(driver.findElement(By.XPATH("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")));
    	Select10.selectByVisibleText("1990");  //YEAR of birth    	
    	driver.find_element(By.XPATH, "//*[@id=\"Email\"]").sendkeys("Mohamedhelal90@gmail.com");//EMAIL    	
    	driver.find_element(By.XPATH, "//*[@id=\"Company\"]").sendkeys("Ejada");//company name
    	driver.find_element(By.XPATH, "//*[@id=\"Password\"]").sendkeys("01121990");//password
    	driver.find_element(By.XPATH, "//*[@id=\"ConfirmPassword\"]").sendkeys("01121990");//confirmpassword    	
    	driver.find_element(By.XPATH, "//*[@id=\"register-button\"]").click();//continu
    	
    	   	   	
    }
    
    
    public static void Login()
    {
    	
    	driver.find_element(By.XPATH, "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a").click(); //click login    	Thread.sleep(2000); 
    	driver.find_element(By.XPATH, "//*[@id=\"Email\"]").sendkeys("Mohamedhelal90@gmail.com");//email
    	driver.find_element(By.XPATH, "//*[@id=\"Password\"]").sendkeys("01121990");//password
    	driver.find_element(By.XPATH, "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button").click(); // click login
    	  	
    	
    }
    
    
    
    public static void Go_to_books()
    {
    	
    	driver.find_element(By.XPATH, "/html/body/div[6]/div[2]/ul[1]/li[5]/a").click(); //click books
    	Thread.sleep(2000);    	   	  	
    	
    }
    
    
    public static void Sort_books()
    {
    	
    	Select select10 = new Select(driver.findElement(By.XPATH("//*[@id=\"products-orderby\"]")));
    	select10.selectByVisibleText("Price: Low to High");  //sort books   	   	  	
    	
    }
    
    
    
    public static void Add_Second_item()
    {
    	
    	driver.find_element(By.XPATH, "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]").click(); //adding second item
    	Thread.sleep(2000);   	   	  	
    	
    }
    
    
    
    public static void go_to_card()
    {
    	
    	driver.find_element(By.XPATH, "//*[@id=\"topcartlink\"]/a/span[1]").click(); //go to card
    	Thread.sleep(2000);   	   	  	
    	
    }
    
    
    
    public static void checkout()
    {
    	
    	driver.find_element(By.XPATH, "//*[@id=\"termsofservice\"]").click(); //agree with terms    	
    	driver.find_element(By.XPATH, "//*[@id=\"checkout\"]").click(); //click checkout
    	
    }
    
    
    
    
    
    
    }
}
