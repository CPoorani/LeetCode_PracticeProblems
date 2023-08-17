package jiraapi;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIssue extends BaseClass {

	@Test(dependsOnMethods = {"jiraapi.CreateIssue.createBug" , "jiraapi.UpdateIssue.updateAnIssue"})
	public void getCreatedIssue() {
		Response response = RestAssured.given().contentType("application/json").when().get("/issue/" + issueID);
		response.then().statusCode(200);
		response.prettyPrint();
		
		response.then().assertThat().body("id",Matchers.equalTo(issueID));

	}

}
