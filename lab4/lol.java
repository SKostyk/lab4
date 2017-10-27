import java.util.Scanner;

public class lol {
public static void main(String[] args){
Scanner scan = new Scanner(System.in); 

       String reader = scan.nextLine();
        
       String[] tokens = reader.split(" ");
	   int n = reader.length();
	   int a=1;
	   
	   for(int i=0; i<n; i++){
		   char Symvol = reader.charAt(i);
		   
		   if(Symvol==' '){
				a++;
			  
		  }
		  }
			System.out.println("kilkist sliv -"+a);
        for (int i=0; i<tokens.length; i++) {
           if (tokens[i].length()>0) {
             String Letter  = tokens[i].substring(0,1).toUpperCase();
               tokens[i] = Letter+tokens[i].substring(1).toUpperCase();
           }
           System.out.print(tokens[i] + " ");
         
       }
        
     
}
}