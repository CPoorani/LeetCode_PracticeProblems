package jiraapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateIssue extends BaseClass {
	
	@Test(dependsOnMethods = "jiraapi.CreateIssue.createBug")
	public void updateAnIssue()
	{
		Response response = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Updating Bug via Script\"\r\n"
				+ "    }\r\n"
				+ "}").put("/issue/"+issueID);
	}

}
