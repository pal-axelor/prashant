import java.util.*;
interface Lambda{
int add(int a,int b);
}
public class Prashant{
public static void main(String args[]){
Lambda b=(c,d)->c+d;
System.out.println("addition is"+b.add(5,5));
}
}
