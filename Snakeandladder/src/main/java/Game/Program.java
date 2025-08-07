package Game;

public class Program {
	
	    public static void main(String[] args) {
	    	
	      int  x=121;
	      int p=x;
	        int sum=0;
	     
	        
	        while(x>0){
	         int rem=x%10;
	        
	         sum=sum*10+rem;
	         
	            x=x/10;
	        
	        }
	        
	        
	      if(sum==p) {
	    	  System.out.println("it panderon number");
	      }else {
	    	  System.out.println("it panderon not number");
	      }
	      
	    }
	}


