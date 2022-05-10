package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
 System.out.print("1-- filterDuplicates:{7,3,3,8,5,9,8} = "  );
		  int[] test1= new int[] {7,3,3,8,5,9,8}; 
		  for(int t1 :filterDuplicates(test1)) System.out.print(t1 );
		  
 System.out.println(/* -----------  */);  
 System.out.print("2-- maxProfit(profit):{-1,9,0,8,-5,6,-24} = "  ); 
		    int[] profit= new int[] {-1,9,0,8,-5,6,-24}; 
		     
	    for(int t2 :maxProfit(profit))
	    		System.out.print(t2);
		 	
 System.out.println(/* -----------  */);
 String[] strings= {"fo","o","b","a","r"};
 System.out.print(
		 "3-- {'fo','o','b','a','r'}= "+  concat(strings)  
	          +" a(i,j): a(-3,4)= "+ a(-3,4) 
	          +" a(2,3)="+ a(2,3)
	          +" a(1,5)= "+a(1,5) ); 
    
  System.out.println(/* -----------  */);  
  System.out.print("4--  FindSumPair(numbers,k):{1,5,8,1,2} ="  ); 
		 	 int[] numbers= new int[] {1,5,8,1,2}; 
		 	 int k=13;  
		  
		 	 for(int t4 :FindSumPair(numbers,k))
		    		System.out.print(t4);
		 	 
 System.out.println(/* -----------  */);  		 	 
 		System.out.println("5-- "+ Echo("java Echo Hello you !")); 
 
 
 System.out.println(/* -----------  */);  
	 String  strd=" aze r tyi sdfg";
	 int nd=2;
	 System.out.println("6-- reshape(strd, nd) ||reshapeString(strd,nd) :'aze r tyi sdfg ' =");
	 System.out.println( reshapeString( strd, nd)  ); 
	 
System.out.println(/* -----------  */);  
	 String  identif="39847";
	 System.out.println("7-- computeCheckDigit(nd): '39847' =" +computeCheckDigit(identif) );  
	 
  
System.out.println(/* -----------  */);  	 
	 String a ="Lookout";
	 String b ="outlook";
	      System.out.println("8-- 'Lookout' & 'outlook' jumeaux(a, b)=" 
	           +jumeaux(a, b) +"// isTwin(a,b) ="+isTwin(a,b));	
	      
	      
	      
System.out.println(/* -----------  */);  	      
	    
			 String[] words= {"the","dog","got","the","bone"}; 
			 System.out.println("9--  countFrequencies:{'the','dog','got','the','bone'} =" 
						+countFrequencies(words) );  
	         for(int dd:countFrequencies(words)) 
						System.out.print(dd +" ");
	         System.out.println(/* -----------  */); 
	         for(int dd:countFrequencies2(words)) 
					System.out.print(dd +" ");
	 
 System.out.println(/* -----------  */);  	 
	    	 int num2=2020;
	    	 int num3=-2021;
	    	      System.out.println("10-- isDuoDigit(numbers): 2020= ," 
	    	           +isDuoDigit(num2) +"// -2021 ="+isDuoDigit(num3));		         
	         
     
}
	
//	**************************************************************************************** 
//	**************************************************************************************** 	

	/* ----------------filterDuplicates  // filterInteger-------------------------   */
	static  int[]  filterDuplicates(int[]  data) { 
		LinkedHashSet<Integer> set   = new LinkedHashSet<Integer>(); 
			/*   Set <Integer> set   = new  HashSet<Integer>();
			 *   It does not provide a mechanism to maintain the insertion order.  
			 */

		// adding elements to LinkedHashSet
		for (int i = 0; i < data.length; i++)
		    set.add(data[i]); 
		 int[] Result=new int[set.size()];
		 int k =0;
		  for (int i:set ) {  
			  Result[k]=i ;
			  k++;
		  }
	    return Result;
	 }
	
	/* ----------------maxProfit-------------------------   */
	 static int[] maxProfit(int[]  data) { 
 
		  int[] pos =new int[2]; 
		  int max=data[0]; 
		  for(int i=0; i < data.length; i++) {
			  int sumProf=0; 
			  for(int j=i; j< data.length; j++) {
				  sumProf+=data[j];
				  if(sumProf>max) { 
					  max=sumProf;
					  pos[0]=i;
					  pos[1]=j;
				  } 
			  } 
		  }
	 
	    return pos;
}
 /* ----------------a(i,j) || concat(strings) -------------------------   */
	 
	 static boolean a(int i, int j) {
 			return (i == 1 || j == 1 || (i+j) == 1);
	 }
	 static String concat(String[] strings) { 
			StringBuffer s=new StringBuffer(); 
			for(String ss:strings) {
				s.append(ss);
			}
			System.out.println(s.toString());
			return s.toString();
		}
/* ---------------- FindSumPair(int[] numbers, int k) -------------------------   */	 
	 
	 public static int[] FindSumPair(int[] numbers, int k) {
			 
			 int[] paires = new int [2] ; 
			 for (int i=0; i< numbers.length-1 ; i++ ) {  
					 for(int j=i+1; j<numbers.length; j++){
						 if (numbers[i] +numbers[j] ==k){
							 paires [0]= i;
							 paires [1] =j;
						 }
					 }
			 }
			   return paires;
 
      }
 /* ----------------  Echo(String str)   ------------------------- */	
	 
	 public static String  Echo(String str) {
	 
			// char[] c = str.toCharArray();
			 String[] c = str.split(" "); 
			 StringBuilder sb = new StringBuilder();
		
		     for (int i = 0; i < c.length; i++) {
 		         sb.append("\r").append(c[i]);
		      }
		       return sb.toString();
		}
/* ----------------  Echo(String str)   ------------------------- */	
 
	public static String reshapeString(String  str, int n) { 
		StringBuilder sb = new StringBuilder();
	
	    char[] c = str.replaceAll(" " , "").toCharArray();
	    
	        int count =0;
	        for (int i = 0; i < c.length; i++) {
	            if(count != n){
	                sb.append(c[i]);
	                count++;
	             }else {
	                count = 1;
	                sb.append("\n").append(c[i]);
	            }
	        }
	        	 
	    return sb.toString();
}
 /* ----------------  computeCheckDigit(identif)   ------------------------- */	
	 
	public static Long computeCheckDigit(String identif) { 
 		long countPaire=0;
		long countImpaire=0;
		
		long sum=0;
	        for (int i = 0; i < identif.length(); i++) {
	            if(i%2 ==0){ 
	                countPaire+=Long.parseLong( (identif.substring(i, i+1)));
	             }else {
	                 countImpaire+=Long.parseLong( (identif.substring(i, i+1))); 
	            }
	        } 
	        sum =10-(((countPaire*3 )+ countImpaire )%10); 
	    return sum ;
}
 /* ----------------  jumeaux(String a,String b)  || isTwin(a,b)  ------------------------- */		
	static boolean jumeaux(String a,String b) {	 
		String aLower=a.toLowerCase();
		String bLower=b.toLowerCase();
		
		if(a.length()==b.length()) { 
			Set<String> setA =new HashSet<>();
			Set<String> setB =new HashSet<>();
 
		for( int i=0; i <a.length();i++) {
			setA.add((String) aLower.subSequence(i,i+1));
 
		}
		for( int i=0; i <b.length();i++) {
 		 
			setB.add((String) bLower.subSequence(i,i+1));
		}
		setA.stream().sorted();
		setB.stream().sorted();
		StringBuilder a1=new StringBuilder() ;
		StringBuilder a2=new StringBuilder() ;
		setA.forEach(i-> a1.append(i)) ;
		setB.forEach(i-> a2.append(i)) ;
	  
			if(a1.toString().equals(a2.toString()))  {
				return true;	
			}
		}
		return false;
	}
	
	static boolean isTwin(String a,String b) {	
		 
		byte[] aa =a.toLowerCase().getBytes();
		byte[] bb =b.toLowerCase().getBytes();
		Arrays.sort(aa);
		Arrays.sort(bb);
		return (new String(aa).equals(new String(bb))) ;
		
	}
	
/* ----------------  countFrequencies(String[]  words)  ------------------------- */		
	static  int[]  countFrequencies(String[]  words) { 
		List<Integer> filteredList = new ArrayList<>();
		Arrays.sort(words); 
		 boolean visited[] = new boolean[words.length]; 
		    Arrays.fill(visited, false);
 
		    for (int i = 0; i < words.length ; i++) { 
		        if (visited[i] == true)
		            continue;
		   
		        int count = 1;
		        for (int j = i + 1; j <  words.length; j++) {
		            if (words[i] == words[j]) {
		                visited[j] = true;
		                count++;
		            }
		        }
		        filteredList.add(count)  ; 
		    }
			int[] wordsCount=new int[filteredList.size()];
			for (int i = 0; i < filteredList.size() ; i++) {  
				wordsCount[i]=filteredList.get(i) ;
			  }
		return wordsCount;
	}
//	******************************************* 	
	static  int[]  countFrequencies2(String[]  words) { 
		Arrays.sort(words); 
		Map<String, Integer> counterMap = new LinkedHashMap<>();
		for (String word : words) { 
		    counterMap.compute(word, (k, v) -> v == null ? 1 : v + 1); 
		}
		 System.out.println("dddddd "+counterMap);
		 int i=0;
		 int[] wordsCount=new int[counterMap.size()];
		 for (Map.Entry<String, Integer> pair : counterMap.entrySet()) {  
			  wordsCount[i]= pair.getValue() ;
			  i++;
		  }
  		
		return wordsCount;
	}
	
	
 /* ----------------  isDuoDigit(num2)  ------------------------- */	
	 
		public static String isDuoDigit(int num2) { 
	 		 Set set =new HashSet<>();
	 		 String s=String.valueOf(num2);
		        for (int i = 0; i < s.length(); i++) {
		        	set.add(s.substring(i,i+1));
		        } 
		        if(set.size()>2){ 
		        	  return "n" ;
	             }else {
	            	  return "y" ;
	            }
		    
	} 
 }
