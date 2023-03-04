package com.test.mobile;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;


@Listeners(Listener.class)
public class TestngClass {

	AndroidDriver driver;
//	LibDemo lib;
	LibDemo Lib = new LibDemo();
	
	
	
	
	
	@BeforeClass
	public void beforeMethod() {
		LibDemo Lib = new LibDemo();
		
		URL URL;
		try {
			
			URL = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "13");
			caps.setCapability("appPackage", "in.swiggy.android");
			caps.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");
			
			

//			AndroidDriver driver = new AndroidDriver(URL, caps);
			driver = new AndroidDriver(URL, caps);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			System.out.println(driver.getSessionId());
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();	
			
			driver.findElement(By.id("in.swiggy.android:id/full_width_button_label")).click();
			driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
			driver.findElement(By.id("in.swiggy.android:id/tv_phone_umber")).sendKeys("8209413752");
			driver.findElement(By.id("in.swiggy.android:id/full_width_button_label")).click();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.id("in.swiggy.android:id/full_width_button_label")).click();
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
			
//			driver.findElement(By.id("in.swiggy.android:id/search_loc_button")).click();
//			driver.findElement(By.id("in.swiggy.android:id/search_query_edittext")).sendKeys("cessna business park");
//			driver.findElement(By.id("in.swiggy.android:id/layout_search_query")).click();
			
//			driver.findElement(By.id("in.swiggy.android:id/tv_area_name")).click();
			
			
			driver.findElement(By.id("in.swiggy.android:id/placeholder_description_tv")).click();
			driver.findElement(By.id("in.swiggy.android:id/et_search_query_v2")).sendKeys("biryani");
			
			
//			List<WebElement> LOE = driver.findElements(By.xpath("//android.widget.TextView"));
//			System.out.println(LOE.size());
//			
//			
//			
//			
//			
//			
//			
//			
//			for (WebElement x : LOE) {
////				String attribute = x.getAttribute("text");
//				System.out.println(x.getAttribute("text"));
//				System.out.println(x.getText());
//				
//					
//				
//				
//			}
//			
//			driver.hideKeyboard();
//			
//			for (WebElement x : LOE) {
//				
//				if (x.getAttribute("text").equals("Meghana Special Biryani")) {
//					x.click();
//					break;
//					
//				}
//				
//			}
			
//			List<String> lst1 =Arrays.asList("Anandha Biryani House","Meghana Foods","Bombay Kulfi","Kritunga Restaurant","Dindigul Thalappakatti","EatFit");

//			String[] lst1 = {"Anandha Biryani House","Meghana Foods","Bombay Kulfi","Kritunga Restaurant","Dindigul Thalappakatti","EatFit"};  
//			String[] lst1 = {"Shanmukha Restaurant","Punjabi Zaica","Anandha Biryani House","UDTA PUNJABI SWADt","Bombay Kulfi","SAHOO RESTAURANT"};  
//			
//			
//			String text = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text);
//            if (lst1[0].equals(text)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//
//            Lib.scrollUp(driver);
//            String text1 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text1);
//            if (lst1[1].equals(text1)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//
//
//            Lib.scrollUp(driver);
//            String text2 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text2);
//            if (lst1[2].equals(text2)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//
//            
//            Lib.scrollUp(driver);
//            String text3 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text3);
//            if (lst1[3].equals(text3)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//
//            
//            
//            Lib.scrollUp(driver);
//            String text4 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text4);
//            if (lst1[4].equals(text4)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//
//            
//            Lib.scrollUp(driver);
//            String text5 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//            System.out.println(text5);
//            if (lst1[5].equals(text5)) {
//            	System.out.println("Restaurant  name matches");
//				
//			}else {
//				System.out.println("Restaurant  name doesn't matches");
//			}
//            
//            Lib.scrollDown(driver);
//            Lib.scrollDown(driver);
//            Lib.scrollDown(driver);
//            Lib.scrollDown(driver);
//            Lib.scrollDown(driver);
//            
//
//            
//            
            
            
//            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Kerala Special Fish Curry']"));
//            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Shahi Subz Biryani (500gm)']"));
//            WebElement element = driver.findElement(By.xpath("Mutton Biryani']"));
//            WebElement element = driver.findElement(By.xpath("Prawns Biryani']"));
//            
//            
//            int x = element.getLocation().getX();
//            int y = element.getLocation().getY();
//            
//            System.out.println("printing startsX" + x);
//    		System.out.println("printing startsY" + y);
//    		int width = element.getSize().getWidth();
//    		System.out.println("printing width " + width); 
//    		int px = (int) (0.2*width);
//    		
//    		TouchAction touchAction = new TouchAction(driver);
//    		// TODO Auto-generated method stub
//    		touchAction
//    		
//    		.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(x, y)))
//    		.moveTo(PointOption.point(px, y))
//    		.release()
//    		.perform();
    		
            
            
           
            
			
			
			
			
			
			
			
			
//			driver.findElement(By.id("in.swiggy.android:id/quantity_text_1")).click();
//			try {
//				driver.findElement(By.xpath("//android.widget.Button[@text='Add Item to Cart']")).click();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			driver.findElement(By.id("in.swiggy.android:id/checkoutText")).click();
			
			

			
		
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	



    @Test
	public void TestRestaurant() {
    	this.driver=driver;
    	
		System.out.println("Test");
		
		
		List<WebElement> LOE = driver.findElements(By.xpath("//android.widget.TextView"));
		System.out.println(LOE.size());
		
		
		
		
		
		
		
		
		for (WebElement x : LOE) {
//			String attribute = x.getAttribute("text");
			System.out.println(x.getAttribute("text"));
			System.out.println(x.getText());
			
				
			
			
		}
		
		driver.hideKeyboard();
		
		for (WebElement x : LOE) {
			
			if (x.getAttribute("text").equals("Meghana Special Biryani")) {
				x.click();
				break;
				
			}
			
		}
		
		
		
		
		
		
		
		
String[] lst1 = {"Anandha Biryani House","Meghana Foods","Hyderabad Biryaani House","The Bengal Club","Kritunga Restaurant"};  
		

		int c1=0;
		int c2=0;
		
		
		String text = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text);
        if (lst1[0].equals(text)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			System.out.println("Restaurant  name doesn't matches");
			c1+=1;
			
		}

        Lib.scrollUp(driver);
        String text1 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text1);
        if (lst1[1].equals(text1)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}


        Lib.scrollUp(driver);
        String text2 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text2);
        if (lst1[2].equals(text2)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}

        
        Lib.scrollUp(driver);
        String text3 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text3);
        if (lst1[3].equals(text3)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			
			System.out.println("Restaurant  name doesn't matches");
		}

        
        
        Lib.scrollUp(driver);
        String text4 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text4);
        if (lst1[4].equals(text4)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}

        
        Lib.scrollUp(driver);
//        String text5 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
//        System.out.println(text5);
//        if (lst1[5].equals(text5)) {
//        	c1+=1;
//        	c2+=1;
//        	System.out.println("Restaurant  name matches");
//			
//		}else {
//			c1+=1;
//			System.out.println("Restaurant  name doesn't matches");
//		}
        
        Lib.scrollDown(driver);
        Lib.scrollDown(driver);
        Lib.scrollDown(driver);
        Lib.scrollDown(driver);
        Lib.scrollDown(driver);
        
        
        
        
        
        
        
//        WebElement element = driver.findElement(By.xpath("Prawns Biryani']"));
        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabadi Chicken Biryani']"));
        
        
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        
        System.out.println("printing startsX" + x);
		System.out.println("printing startsY" + y);
		int width = element.getSize().getWidth();
		System.out.println("printing width " + width); 
		int px = (int) (0.2*width);
		
		TouchAction touchAction = new TouchAction(driver);
		// TODO Auto-generated method stub
		touchAction
		
		.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(x, y)))
		.moveTo(PointOption.point(px, y))
		.release()
		.perform();
		
		
		
		
		
		
		
		
		String PricebeforeAddToCart = driver.findElement(By.id("in.swiggy.android:id/horizontal_item_price")).getAttribute("text");
		System.out.println(PricebeforeAddToCart);
		
		driver.findElement(By.id("in.swiggy.android:id/quantity_text_1")).click();
		try {
			driver.findElement(By.xpath("//android.widget.Button[@text='Add Item to Cart']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("in.swiggy.android:id/increment_button_touch_target")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Repeat']")).click();
		
		
		driver.findElement(By.id("in.swiggy.android:id/increment_button_touch_target")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Repeat']")).click();
		
		
		driver.findElement(By.id("in.swiggy.android:id/decrement_button")).click();
		driver.findElement(By.id("in.swiggy.android:id/decrement_button")).click();
		
		
		
		String PriceafterAddToCart = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"price ₹320 rupees\"])[1]")).getAttribute("text");
		System.out.println(PriceafterAddToCart);
		
		
		
		if (PricebeforeAddToCart.equals(PriceafterAddToCart)) {
			System.out.println("Price is validated");
			
		}else {
			System.out.println("Price doesn't validated");
		}
		
		
		
		driver.findElement(By.id("in.swiggy.android:id/checkoutText")).click();
		
//		driver.findElement(By.xpath("//android.widget.Button[@text='Select Address']")).click();
//		
//		driver.findElement(By.xpath("//android.widget.Button[@index='2']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Make payment, tap to go to payment']")).click();
		
		
		
		
		
		System.out.println("Value of C1 "+c1 + "  value of C2  " + c2);
		assertEquals(c1, c2);
		
	}
          
	
	

	
	

          
    


	
	@AfterClass
	public void afterMethod() {
	}

}
