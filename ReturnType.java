public class ReturnType{                               


    public static void main(String[] args)
     {
        char charReturn = getCharValue();
        System.out.println("The char value is: " + charReturn);
                                   
                                            
        int intReturn = getIntValue();
        System.out.println("The int value is: " + intReturn);


        byte byteReturn = getByteValue();
        System.out.println("The byte value is: " + byteReturn);

        float floatReturn = getFloatValue();
        System.out.println("The float value is: " + floatReturn);


        double doubleReturn = getDoubleValue();
        System.out.println("The double value is: " + doubleReturn);

        long longReturn = getLongValue();
        System.out.println("The long value is: " + longReturn);

        String stringReturn = getStringValue();
        System.out.println("The string value is : "+  stringReturn);      


     }                                                                                  
    public static char getCharValue()
    {
        System.out.println("Declaring a char value");
        char value = 'A'; 
        System.out.println("Returning a char value");
        return value;
    }
     public static int getIntValue()
    {
        System.out.println("Declaring an int value");                                      
        int value = 100; 
        System.out.println("Returning an int value");
        return value; 
    }
    public static byte getByteValue()
    {
             System.out.println("Declaring a byte value");
             byte value = 10;
             System.out.println("Returning a byte value");                               
                          return value;
    }
    public static float getFloatValue() 
    {
    System.out.println("Declaring a float value");
    float value = 10.5f;                                                                
    System.out.println("Returning a float value");
    return value; 
    }
    public static double getDoubleValue() 
    {
    System.out.println("Declaring a double value");
    double value = 20.99; 
    System.out.println("Returning a double value");
    return value; 
    }
    public static long getLongValue() 
    {
    System.out.println("Declaring a long value");
    long value = 1000L; 
    System.out.println("Returning a long value");
    return value; 
    }


    public static String getStringValue() 
    {
    System.out.println("Declaring a String value");
    String value = "hallo "; 
    System.out.println("Returning a String value");
    return value; 
    }

    public static void getVoidValue() 
    {
        System.out.println("Declaring a String value");
        String value = "hallo "; 
        System.out.println("Returning a String value");
    
    }

}













