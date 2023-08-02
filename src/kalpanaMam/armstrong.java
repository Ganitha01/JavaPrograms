package kalpanaMam;

public class armstrong
{
public static void main(String args[])
{ 
int num=153,remender,armstrong=0;int copy=num;
int remender1=1;
String s=String.valueOf(num);
int count1=s.length();
while(num>0)
{
count1=s.length();
	remender=num%10;
	num=num/10;
	while(count1>0)
	{
	 remender1=remender1*remender;
	 count1--;
	}
	armstrong=armstrong+remender1;
}
if (copy==armstrong)
System.out.println(armstrong+" is armstrong number");
else
System.out.println(armstrong+" is not a armstrong number");

}
}