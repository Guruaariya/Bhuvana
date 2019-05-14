public class For5
{
public static void main(String[] args)
{
int x=0;
int y= 30;

for(int out=0;out<3;out++)
{
for(int in=4;in>1;in--)
{
x=x+2;
y=y-2;

if(x==6)
{
break;
}
x=x+3;
}
y=y-2;
}
System.out.println(x+" "+y);
}
}