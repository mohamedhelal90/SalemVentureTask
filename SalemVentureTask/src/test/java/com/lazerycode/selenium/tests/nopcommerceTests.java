package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GoogleHomePage;
import com.lazerycode.selenium.page_objects.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GoogleExampleIT extends DriverBase {



    public static void main (String[] args)
    {
    	 public static void nopcommerceTests ()   	 
    	 
    	 {
    		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  
    		 WebDriver driver = new ChromeDriver(); 
    		 
    		 nopcommercePage  nopcommerce = new nopcommercePage(driver);
    		 
    		 nopcommerce.Get_Home_Page();
    		 nopcommerce.Register_new_account();
    		 nopcommerce.Login();
    		 nopcommerce.Go_to_books();
    		 nopcommerce.Add_Second_item();
    		 nopcommerce.Sort_books();
    		 nopcommerce.go_to_card();
    		 nopcommerce.checkout();
    		 driver.close();
    		 
    	 }
    	
    }
    
    
    
    
    }

    
}
