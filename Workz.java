public class Workz {
    public static void main(String[] args) 
    {
        int[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        char [] charArray={'A','B','C','D','E','F','I','O','U','X'};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f};
        double[] doubleArray = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70.7, 80.8, 90.9, 100.0};
        long[] longArray = {10L,20L,30L,40L,50L,60L,70L,80L,1000L,2000L};
        short[] shortArray ={1,3,5,6,9,200,130,80,60,30};
        byte[] byteArray={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


 //int     
        System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(intArray[i]);
        }

       
        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(intArray[i]);
        }

        
        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(intArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(intArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(intArray[i]);
        }
//char
        System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(charArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(charArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(charArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(charArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(charArray[i]);

        }


    //float
        System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(floatArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(floatArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(floatArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(floatArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(floatArray[i]);

        }
//double
      System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(doubleArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(doubleArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(doubleArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(doubleArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(doubleArray[i]);

        }
//long


System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(longArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(longArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(longArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(longArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(longArray[i]);

        }

//short
        System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(shortArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(shortArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(shortArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(shortArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(shortArray[i]);

        }

//byte

        System.out.println("Left to right:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(byteArray[i]);
        }

        System.out.println("Right to left:");
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(byteArray[i]);
        }

        System.out.println("Middle to right:");
        for (int i = 5; i < 10; i++) 
        {
            System.out.println(byteArray[i]);
        }

        
        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.println(byteArray[i]);
        }

        System.out.println("Skipping 1 index:");
        for (int i = 0; i < 10; i = i + 2) 
        {
            System.out.println(byteArray[i]);

        }



    }
}
