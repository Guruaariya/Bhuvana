class Book
{
String title;
String author;
}
class BookTestDrive
{
public static void main(String[] args)
{
Book mb = new Book[3];

mb[0]=new Book();
mb[1]=new Book();
mb[2]=new Book();

mb[0].title="The grapes of Java";
mb[1].title="The Java Gatsby";
mb[2].title="The Java Cookbook";

mb[0].author="bob";
mb[1].author="sue";
mb[2].author="ian";

while(x<3)
{
System.out.println(mb[x].title);
System.out.println( " by " );
System.out.println(mb[x].author);
x=x+1;
}
}
}
