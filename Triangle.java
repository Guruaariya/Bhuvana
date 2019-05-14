public class Triangle{
double area;
int height;
int length;

public static void main(String[] args)
{
int x=0;
Triangle[] t1 = new Triangle[4];
while(x<4)
{
t1[x]=new Triangle();
t1[x].height=(x+1)*2;
t1[x].length=x+4;
t1[x].setArea();

System.out.print("Triangle"+ x +" ,area");
System.out.println(" = " + t1[x].area);
x=x+1;
}
int y=x;
x=27;
Triangle t3 = t1[2];
t1[2].area=343;
System.out.print("y=" +y);
System.out.println(",t3 area="+t3.area);
}
void setArea()
{
area= (height*length)/2;
}
}