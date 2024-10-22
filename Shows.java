/*concat*/

public class Shows{
	public static void main(String [] args)
	{
		String series = "stranger";
		String merged=series.concat("  things");
		System.out.println(merged);
	

/*UPPERCASE*/
    
     String comedian="chandler bing";
     String comedy=comedian.toUpperCase();
     System.out.println(comedy);
    

/*lowerCASE*/
    
     String title="JOEY DOESN'T SHARE FOOD";
     String lower = title.toLowerCase();
     System.out.println(lower);
    

/*trim*/  
    
    String name = "         Monica geller                  ";
    String whitespace=name.trim();
    System.out.println(whitespace);




/*is empty*/ 
    String place="";
    Boolean checkplace=place.isEmpty();
    System.out.println(checkplace);


/*length*/ 

String favorite = "f r i e n d s";
int totlen= favorite.length();
System.out.println(totlen);



/*split*/

String fullname = "yn lekha";
String [] username=fullname.split(" ");
System.out.println(username[0]);
System.out.println(username[1]);

/*starts with,ends with*/

String mobile="vivo";
Boolean mob=mobile.startsWith("v");
System.out.println(mob);

String laptop="victus";
Boolean lap=laptop.endsWith("s");
System.out.println(lap);


/*charAt*/

String hometown="Mangaluru";
char home=hometown.charAt(3);
System.out.println(home);

/*palindrome*/

String palindrome = "level";     //string name
char[] palindromeChar=palindrome.toCharArray();   //we are converting the string to char array
String reversedValue="";     //to store the reverse values

for(int i=palindromeChar.length-1;i>=0;i-- )      // for loop for reversing
{
	reversedValue=reversedValue+palindromeChar[i];     
}

if(reversedValue.equals(palindrome)) //to compare 
{
System.out.println("string is palindrome");    //print
}
else 
{
System.out.println("string is not a palindrome");   //print 
}



	}

	}


