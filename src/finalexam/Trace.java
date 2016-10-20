package finalexam;


public class Trace {
	
	public static void main(String[] args) {
		
		
	int a=1,b=10,c=3;
	
	
	while (b >0 && a<=5)
	{b=b-2;
	c=c+a;
	System.out.println("a="+a+"b="+b+"c="+c);
	
	if (c<b)
		b++;
	else c++;
	
	a=a+2;
	}
	
}
}


