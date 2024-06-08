package Sting;

public class Panagram3 {
	
	

	public static void main(String[] args) {
		
       String s="abcdefghijklmnopqrstuvwxyz";
       
       if(s.length()<26) {
    	   System.out.println(" is not panagram");
	}
       else {
       s=s.toLowerCase();
       char ch=s.charAt(1);
       
       for(ch='a';ch<='z';ch++)
       {
    	   if(s.indexOf(ch)==-1) {
    		   System.out.println(" not panagram");
    	   
    	   }
    	 
       }
       
       System.out.println( "is panagram");
       }
	}
	
}
