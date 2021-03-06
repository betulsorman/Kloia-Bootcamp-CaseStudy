package casestudy.step_def;

import casestudy.pages.*;
import casestudy.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {

    HomePage homePage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SignInPage signInPage = new SignInPage();
    MenuPage menuPage = new MenuPage();
    FilterPage filterPage = new FilterPage();


    @Given("homepage is open")
    public void homepageIsOpen() {
        homePage.chooseUS();
    }

    @And("I close the pop up")
    public void iCloseThePopUp() {
        homePage.closePopup();
    }

    @And("I verify page title")
    public void iVerifyPageTitle() {
        homePage.verifyTitle();
    }

    @When("I search for {string}")
    public void iSearchFor(String searchKey) {
        homePage.searchFor(searchKey);
    }

    @Then("verify search results are listed")
    public void verifySuccessfulListed() {
        searchResultPage.verifySearchResult();
    }

    @And("I open {string} dropdown menu")
    public void iOpenDropdownMenu(String dropdown) {homePage.openDropdown(dropdown);}

    @When("I choose {string} submenu")
    public void iChooseSubmenu(String submenu) {homePage.openSubmenu(submenu);}

    @Then("sign in page should open")
    public void signInPageShouldOpen() {signInPage.verifyTitle();}

    @When("fill login form for email {string}")
    public void fillLoginFormForEmail(String emailAddress) {signInPage.emailInput(emailAddress); }

    @When("fill login form for password {string}")
    public void fillLoginFormForPassword(String password) {signInPage.passwordInput(password); }

    @Then("sign in button clicked")
    public void signInButtonClicked() {signInPage.setSignInButton();}

    @Then("verify successful login")
    public void verifySuccessfulLogin() {signInPage.verifySignIn();}

    @When("sign in with Google")
    public void signInWithGoogle() {signInPage.setSignInButtonWithGoogle();}

    @Then("Google sign in page should open")
    public void googleSignInPageShouldOpen() {signInPage.verifyGoogleSignInTitle();}

    @When("sign in with Google for email {string}")
    public void signInWithGoogleForEmail(String gmail) {signInPage.gmailInput(gmail);}

    @When("click mail next button")
    public void clickNext1Button() {signInPage.setNext1Button();}

    @When("sign in with Google for password {string}")
    public void signInWithGoogleForPassword(String gmailPassword) {signInPage.gmailPasswordInput(gmailPassword);}

    @When("click password next button")
    public void clickNext2Button() {signInPage.setNext2Button();}

    @And("click menu")
    public void clickMenuButton() {menuPage.setMenuButton();}

    @When("I choose submenu for Audio")
    public void iChooseSubmenuForAudio() {menuPage.setAudioButton();}

    @When("I choose submenu for Headphones")
    public void iChooseSubmenuForHeadphones(){menuPage.setHeadphonesButton();}

    @When("I choose submenu for Wireless Headphones")
    public void iChooseSubmenuForWirelessHeadphones() {menuPage.setWirelessHeadphonesButton();}

    @Then("verify successful wireless headphone page")
    public void verifySuccessfulWirelessHeadphonePage() {menuPage.verifyWirelessHeadphonesText();}

    @When("clickable filter input")
    public void clickableFilterInput() {filterPage.setClickableInput();}

    @When("write filter brands by {string}")
    public void filterBrandsBy(String filterKey) {filterPage.setFilterBrand(filterKey); }

    @Then("verify filter results are listed")
    public void verifyFilterResultsAreListed() {filterPage.setVerifyResults();}

    @When("click second product")
    public void clickSecondProduct() {filterPage.setSecondProduct();}
}
