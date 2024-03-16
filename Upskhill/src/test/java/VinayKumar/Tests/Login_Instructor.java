package VinayKumar.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Login_Ins;


import VinayKumar.TestComponents.Base_Test;

public class Login_Instructor {
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	@Test
	public void login_Ins() throws InterruptedException {
		
		Login_Ins loginins = new Login_Ins(driver);
		abs.goTo_User();
		loginins.loginapp_phone("9964640485", "Vinay76765@");
     	//Assert.assertEquals(" Login Successfull ",loginins.Login_message());
		loginins.loginapp_email("vinaykumar98.vk44@gmail.com", "Vinay76765@");
		//Assert.assertEquals(" Login Successfull ",loginins.Login_message());
		
		
	}

}
