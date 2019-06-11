import java.util.*;
interface Test{
Methodreference getMessage(String z); // you can also use void as type but type must be there either void or class name for constructor reference
}
public class Methodreference{
Methodreference(String s){
System.out.println("hello my name is prashant"+s);
}
public static int print(){
//System.out.println("hello my name is prashant");
int a=5,b=5;
return a*b;
}
public static void main(String args[]){
//Test t=Methodreference::print;
//int c=t.print();
//System.out.println("multiplication is:"+c);
Test t=Methodreference::new;
t.getMessage("i am from surat");
}
}
