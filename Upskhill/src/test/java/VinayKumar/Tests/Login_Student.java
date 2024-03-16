package VinayKumar.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Login_Ins;
import VinayKumar.Pageobjects.Login_Stu;
import VinayKumar.TestComponents.Base_Test;

public class Login_Student  {
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	
@Test
public void login_Stu() throws InterruptedException {
		
		Login_Stu login_stu = new Login_Stu(driver);
		abs.goTo_User();
		login_stu.loginapp_phone("9964640485", "Vinay76765@");
     	//Assert.assertEquals(" Login Successfull ",login_stu.Login_message());
     	login_stu.loginapp_email("vinaykumar98.vk44@gmail.com", "Vinay76765@");
		//Assert.assertEquals(" Login Successfull ",login_stu.Login_message());
		
}
	

}
