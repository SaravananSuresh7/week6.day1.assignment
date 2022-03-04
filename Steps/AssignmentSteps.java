package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import week5.day1.practice.BaseClass;

public class AssignmentSteps extends BaseClass {
	
	@Given("Go to Lead button")
	public void go_to_lead_button() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@Given("Click create lead")
	public void click_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter Company Name as {string}")
	public void enter_company_name_as(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@Given("Enter First Name as {string}")
	public void enter_first_name_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("Enter Last Name as {string}")
	public void enter_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@Given("Enter mobile number as {string}")
	public void enter_mobile_number_as(String mnum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(mnum);
	}
	@When("Click Create Lead button")
	public void click_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Exit browser")
	public void exit_browser() {
	    driver.close();
	}
	@Given("click contacts button")
	public void click_contacts_button() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	@Given("Click create contacts")
	public void click_create_contacts() {
		driver.findElement(By.partialLinkText("Create Contact")).click();
	}
	@Given("Enter FirstName as {string}")
	public void enterFirstName(String fsname) {
		driver.findElement(By.id("firstNameField")).sendKeys(fsname);
	}
	@Given("Enter LastName as {string}")
	public void enterLastName(String lsname) {
		driver.findElement(By.id("lastNameField")).sendKeys(lsname);
	}
	@Given("Enter Description")
	public void enter_description() {
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my sample program");
	}
	@Given("Email address")
	public void email_address() {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ABC@gmail.com");
	}
	@When("Click Create conact button")
	public void click_create_conact_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Given("Click Find lead")
	public void click_find_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Click on Phone")
	public void click_on_phone() {
		driver.findElement(By.linkText("Phone")).click();
	}
	@Given("Enter PhoneNumber as {string}")
	public void enter_phone_number_as(String mnum) {
		driver.findElement(By.name("phoneNumber")).sendKeys(mnum);
	}
	@When("Click Find Lead button")
	public void click_find_lead_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
	}
	@When("click on the first resulting lead")
	public void click_on_the_first_resulting_lead() {
		WebElement FirstName = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
		String capturedName = FirstName.getText();
		System.out.println(capturedName);
		FirstName.click();
	}
	@When("click delete")
	public void click_delete() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}
	@Given("Enter first Name as {string}")
	public void enter_firstname_as(String Fname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Fname);
	}
	@Given("Enter last Name as {string}")
	public void enter_lastname_as(String Lname) {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(Lname);
	}
	@When("click edit")
	public void click_edit() {
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	}
	@When("Enter new Company name as {string}")
	public void enter_new_company_name_as(String Cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(Cname);
	}
	@When("click update button")
	public void click_update_button() {
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
	}

}
