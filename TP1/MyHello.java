public class MyHello{ 
String maChaine="Bienvenu dans le monde de java !";

void Hello(){
System.out.println(maChaine);
}

public static void main(String args[]) { 
MyHello m;
m=new MyHello();
m.maChaine="Bienvenu";
m.Hello();
} 
} 