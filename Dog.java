public class Dog{
String name;
public static void main(String[] args)
{
Dog d1=new Dog();
d1.bark();
d1.name="Ceaser";

Dog[] myDog =new Dog[3];
myDog[0]=new Dog();
myDog[1]=new Dog();
myDog[2]=d1;

myDog[0].name="Fred";
myDog[1].name="Juliee";

System.out.println("Last dog's name is");
System.out.println(myDog[2].name);

int x=0;
while(x<myDog.length)
{
myDog[x].bark();
x=x+1;
}
}

public void bark()
{
System.out.println(name +"says Ruff");
}
}