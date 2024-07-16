package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
    public static void main(String[] args) {
        // Sp�cifiez le chemin vers chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\souih\\Downloads\\seleniumm\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Cr�ez une instance de ChromeOptions pour sp�cifier le chemin vers Chrome
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // Remplacez par le chemin correct vers votre ex�cutable Chrome

        // Cr�ez une instance de ChromeDriver avec les options sp�cifi�es
        WebDriver driver = new ChromeDriver(options);

        // Naviguez vers Amazon
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        
        // Trouvez l'�l�ment de recherche par ID et fermez le navigateur
        
        driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("souihi.islem2019@gmail.com");
        driver.findElement(By.id("Form_submitForm_action_request")).click();
        driver.findElement(By.className("nav-link-hed")).click();
        driver.findElement(By.className("People Management")).click();
        driver.findElement(By.name("HR Administration")).click();
        
        
       // driver.close();
    }
}
