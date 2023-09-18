package finalproject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.pageobjects.HomePage;
import com.amdocs.pageobjects.SignInPage;
import com.amdocs.pageobjects.cart;
import com.amdocs.pageobjects.indexpage;
import finalproject.base;
public class indexpagetest extends base {

	private indexpage indexPage;
	
	
	 @BeforeMethod
	    public void setup() {
		 loadConfiguration();
			launchApp();
	      
	        this.indexPage = new indexpage();
	    }
	  
	 @Test
	    public void loginTest() throws Throwable {
	        SignInPage signin= indexPage.clickSignInBtn();
	        HomePage home= signin.login(getUsername());
	        Thread.sleep(2000);
	        home.SearchProduct("shoes");
	        Thread.sleep(2000);
	        cart item=home.SelectProduct();
	        item.proceedToBuy();
	        
	        
	        
	 }

}
