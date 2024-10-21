public class Names{
	public static void main (String args[]) {
	System.out.println(args);
	for (int index=0;index<args.length;index++)
	{
		System.out.println(args[index]);
	}


//reverse
	for(int index=args.length-1;index>=0;index--)
	{
		System.out.println(args[index]);
	}
	}

}