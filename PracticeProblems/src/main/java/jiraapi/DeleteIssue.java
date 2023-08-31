package jiraapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIssue extends BaseClass {
	
	@Test(dependsOnMethods = "jiraapi.UpdateIssue.updateAnIssue")
	public void deletingAnIssue()
	{
		Response response = RestAssured.delete("/issue/"+issueID);
		System.out.println(response.getStatusCode());
	}
	

}
