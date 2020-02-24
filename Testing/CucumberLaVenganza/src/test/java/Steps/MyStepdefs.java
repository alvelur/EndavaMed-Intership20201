package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefs  extends BaseUtil {

    private BaseUtil base;

    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        System.out.println("I should see user form page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

    }
    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("username is" + username + " and the pass is "+ password);
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        LoginPage page = new LoginPage(base.Driver);
        page.clickLogin();
//        base.Driver.findElement(By.name("Login")).submit();
//        System.out.println("Enter username and pass");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

        Assert.assertEquals("It is not displayed ",base.Driver.findElement(By.id("Initial")).isDisplayed(),true);




        //System.out.println("the driver is " + base.StepInfo);
        System.out.println("I should see th-e userform pag");
    }


    @And("^I enter following for login$")
    public void iEnterFollowingForLogin(DataTable table) {
        List<List<String>> data = table.raw();
//        System.out.println(data.get(0).get(0).toString());
//        System.out.println(data.get(0).get(1).toString());
       List<User> users = new ArrayList<User>();
       //Store all users
        users = table.asList(User.class);
        LoginPage page = new LoginPage(base.Driver);


        for (User user: users){
            page.Login(user.username,user.password);

//            System.out.println("The user name is "+user.username );
//            System.out.println("The password is "+user.password );
//            base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
//            base.Driver.findElement(By.name("Password")).sendKeys(user.password);
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println("Username is "+username);
        System.out.println("Password is "+password);

    }

    @And("^I enter the users email address as Email:([^\"]*)")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) {
        System.out.println("The email address is "+ email);

    }

    public class User{
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
