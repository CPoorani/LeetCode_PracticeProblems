package mandatoryHomeWork.foundation;

import java.util.*;

import org.junit.Test;

import java.io.*;

public class JavaMap {

	/*
	 * Input : Integer (n - entries), String (Name with contact) Output : String
	 * Create an empty map Get the input as Iterate through the input and fetch the
	 * contacts and name Put it as key with the contact Iterate through the contacts
	 * and check if the number is present (contains) in the map Return the contact
	 * if present else Print Not found
	 */
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
		}
		while(in.hasNext())
		{
			String getRecord=in.nextLine();
            if(phoneBook.containsKey(getRecord))
            {
                System.out.println(getRecord + "=" +phoneBook.get(getRecord));
            }
            else{
                System.out.println("Not Found");
            }
		}
	}
}
