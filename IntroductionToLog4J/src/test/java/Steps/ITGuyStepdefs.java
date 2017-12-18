package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class ITGuyStepdefs {

    @When("^I went to office$")
    public void iWentToOffice() throws Throwable {
        System.out.println("@When");

    }


    @Given("^I am a \"([^\"]*)\" tester$")
    public void iAmATester(String Testertype) throws Throwable {
        System.out.println("Type of the tester:" + Testertype);
    }

    @And("^I \"([^\"]*)\" with work$")
    public void iWithWork(String Worktype) throws Throwable {
        System.out.println("Type of the work:" + Worktype);
    }

    @Then("^Boss \"([^\"]*)\" me$")
    public void bossMe(String Bossreaction) throws Throwable {
        System.out.println("Type of the boss:" + Bossreaction);
    }

    @But("^Developer \"([^\"]*)\" me$")
    public void developerMe(String Devreaction) throws Throwable {
        System.out.println("Type of the dev:" + Devreaction);
    }
}
