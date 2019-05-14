class DogTestDrive{
public static void maion(String[] args)
{
Dog one = new Dog();
one.size=70;
Dog two = new Dog();
two.size=8;

one.bark();
two.bark();
}
}

class Dog{
int size;
String name;

void bark()
{
if(size>60)
{
System.out.println("Woof! Woof!");
}
else if(size>14)
{
System.out.println('Ruff! ruff!");
}
else{
System.out.println("Yip! yip!");
}
}
}