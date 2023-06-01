package Day13;
import java.util.*;  
public class map {  
public static void main(String[] args) {  
    Map m=new HashMap();  
    m.put(1,"Saleem");  
    m.put(2,"Malik");  
    m.put(3,"Younus");  
    m.put(4,"Zammer");  
    Set set=m.entrySet();  
    Iterator i=set.iterator();  
    while(i.hasNext()){    
 
    	
    	
    	
    	Map.Entry entry=(Map.Entry)i.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  