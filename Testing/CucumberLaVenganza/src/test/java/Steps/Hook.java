package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){


        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        base.Driver = new ChromeDriver();
        //System.out.println("Opening Browser :  Mock");
        //  base.StepInfo = "Driver";

    }
    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            // Tomar un screen?
            System.out.println(scenario.getName());
        }
        System.out.println("Closing Browser :  Mock");
    }

}
