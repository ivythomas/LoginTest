import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMethods {
	public static boolean ResultValue;
	
	//Username and password are checked for incorrect values in the login page
	public static boolean UsernamePasswordCheck(String username, String password, WebDriver driver) {
		try {	
				if(username == "" && password != "") {
					driver.findElement(By.xpath("//div[contains(text(),'Username is required')]"));
					ResultValue = true;
				}
				else if(username != "" && password == "") {
					driver.findElement(By.xpath("//div[contains(text(),'Password is required')]"));
					ResultValue = true;
				}
				else if(username == "" && password == "") {
					driver.findElement(By.xpath("//div[contains(text(),'Password is required')]"));
					driver.findElement(By.xpath("//div[contains(text(),'Username is required')]"));
					ResultValue = true;
				}
				else {
					driver.findElement(By.xpath("//div[contains(text(),'Username or password is incorrect')]"));
					ResultValue = true;
				}
				
			}
		catch(Exception e) {
			ResultValue = false;
		}
		return ResultValue;
	};
	
	//Login is being done by entering username and password
	public static void EnterUsernameAndPassword(WebDriver driver, String username, String password) {
		WebElement username_input = driver.findElement(By.xpath("//input[@name='username']"));
		username_input.sendKeys(username);
		WebElement password_input = driver.findElement(By.xpath("//input[@name='password']"));
		password_input.sendKeys(password);
		driver.findElement(By.xpath("//button[\'Login\']")).click();
	};

	//Registration details are filled in the registratiom form
	public static void EnterRegisterDetails(WebDriver driver, String firstname, String lastname, String username, String password) {
		WebElement firstname_input = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname_input.sendKeys(firstname);
		WebElement lastname_input = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname_input.sendKeys(lastname);
		WebElement username_input = driver.findElement(By.xpath("//input[@name='username']"));
		username_input.sendKeys(username);
		WebElement password_input = driver.findElement(By.xpath("//input[@name='password']"));
		password_input.sendKeys(password);
		driver.findElement(By.xpath("//button['Register']")).click();
	};
	
	
	//Entered registration details are checked for invalid entries
	public static boolean RegisterCheck(String firstname, String lastname, String username, String password, WebDriver driver) {
		try {	
				if(firstname == "") {
					driver.findElement(By.xpath("//div[contains(text(),'First Name is required')]"));
					ResultValue = true;
				}
				else if(lastname == "") {
					driver.findElement(By.xpath("//div[contains(text(),'Last Name is required')]"));
					ResultValue = true;
				}
				else if(username == "") {
					driver.findElement(By.xpath("//div[contains(text(),'Username is required')]"));
					ResultValue = true;
				}
				
				else if(password == "") {
					driver.findElement(By.xpath("//div[contains(text(),'Password is required')]"));
					ResultValue = true;
				}
				
				else {

				}
				
			}
		catch(Exception e) {
			ResultValue = false;
		}
		return ResultValue;
};
	
}
	
