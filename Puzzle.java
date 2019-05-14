class Puuzle4b{
int var;
public int doStuff(int factor)
{
if(var>100)
{
return var*factor;
}
else
{
return ivar*(5-factor);
}
}
public ckass Puzzle{
public static void main(String[] args)
{
Puzzle[] p = new Puzzle[6];
int y=1;
int x=0;
int result=0;

while(x<6)
{
p[x] = new Puzzle4b();
p[x].var=y;
y=y*10;
x=x+1;
}
x=6;
while(x>0)
{
x=x-1;
result=result+p[x].doStuff(x);
}
System.out.println("result "+result);
}
}