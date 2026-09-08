class StringMethod{
	public static void main(String[] args) {
    char array[]=s1.toCharArray();
    for(int i=0;i<array.length;i++)
    {
    	System.out.println("toCharArray():"+array[i]);
    }
    String s2="Hello";
    String s3="Hello2";
    System.out.println("The strings are:"+s5.equals(s4));
    System.out.println("The strings are:"+s5.equalsIgnoreCase(s4));
    String s6="There";
    String s7="Thier";
    System.out.println("There compare to Their"+s6.compareTo(s7));
    System.out.println("Their compare to There"+s7.compareTo(s6));
    String s8="Bye";
    if(s8.compareTo(s7)==0)
    {
    	System.out.println("s8 string and s7 string are same");
    	}
    	else if(s8.compareTo(s7)<0)
    	{
    		System.out.println("Str 8 comes before str 7 in dictionary");
    	}
    	else
    	{
    		System.out.println("Str 7 comes before str 8 in dictionary");
    	}
    	}
    }
}