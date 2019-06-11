import java.util.*;
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 

public class Demo{
public static void main(String args[]){
 List<Integer> number = new ArrayList<Integer>();
number.add(5);
number.add(4);
number.add(3); 
 //Set<Integer> square = number.stream().map(x -> x*x).filter(x->x>9).collect(Collectors.toSet());
  Set<Integer>square=   number.stream().map(x -> x*x).filter(x->x>9).forEach(return y->y*5).collect(Collectors.toSet());                        
   System.out.println(square); 
}
}
