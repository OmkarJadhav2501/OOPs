import java.util.*;
public class Const_overload{
int roll=29;
String name="Amogh";
char div='A';
public Const_overload(){
System.out.println("Name:"+name+"----------"+"Division:"+div+"-----------"+"Roll No:"+roll);
}
public Const_overload(String n,char d,int r){
name=n;
div=d;
roll=r;
System.out.println("Name:"+name+"----------"+"Division:"+div+"-----------"+"Roll No:"+roll);
}
public Const_overload(String n,int r){
name=n;
roll=r;
System.out.println("Name:"+name+"-----------"+"Roll No:"+roll);
}
public static void main(String args[]){
Const_overload e=new Const_overload();
Const_overload e1=new Const_overload("Rushabh",'A',39);
Const_overload e2=new Const_overload("Mahesh",32);
}
}