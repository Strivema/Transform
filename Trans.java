package Ray;

import java.util.Scanner;

public class Trans {
	public static void main(String []args){
		while(true){
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			
			String s = transInt(n);
			System.out.println(s);
			
			double d = input.nextDouble();
			String s2 =transDouble(d);
			System.out.println("0."+s2);
		}
	}
	    public static String transInt(int num){
	        String asw = "";
	        while(num!=0){
	            asw = (num%2)+asw;
	            num = num/2;
	        }
	        return asw;
	    }
	 
	    public static String transDouble(double num){
	        if(num>1){
	            return "false";
	        }
	        String asw = "";
	        for(int i=0;i<10;i++){
	            num*=2;
	            if(num>=1){
	                asw+="1";
	                num = num-1;
	            }else{
	                asw+="0";
	            }
	            if(num==0){
	            	break;
	            }
	        }
	        return asw;
	    }
}
