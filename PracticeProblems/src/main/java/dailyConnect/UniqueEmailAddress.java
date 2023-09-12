package dailyConnect;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class UniqueEmailAddress {
	
	/*
	 * case 1 : alice@leetcode.com -- > alice@leetcode.com
	 * case 2 : alice.z@leetcode.com --> alicez@leetcode.com
	 * case 3 : m.y+name@email.com --> my@email.com
	 * Input : String[], Output : String
	 * Create a set 
	 * 	Iterate through each email
	 * 		Split based on "@"
	 * 		'0' index will be local name
	 * 		'1' will be domain name
	 * First replace all the '.'
	 * Find the index of plus, if it has then get the substring 0, to index of plus
	 * changed = local + @ + domain
	 * Add the changed email
	 * Return the size of set
	 */
	@Test
	public void test()
	{
		String[] actual = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		Assert.assertEquals(2, numUniqueEmails(actual));
	}

	public int numUniqueEmails(String[] emails) {
    Set<String> set = new HashSet<>(); 
        
    	int count = 0;
    	for (String str : emails) {
    		String[] eachEmail = str.split("@");
    		if(eachEmail.length == 2)
    		{
    			String local = eachEmail[0];           
                local = local.replace(".", "");
                int plus = local.indexOf("+");
                if (plus != -1) {
                    local = local.substring(0, plus);
                }
                
                String changed = local + "@" + eachEmail[1];
                set.add(changed);
                
    		}
		}

		return set.size();
    }
}



