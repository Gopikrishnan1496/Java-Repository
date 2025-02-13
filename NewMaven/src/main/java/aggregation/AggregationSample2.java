package aggregation;

public class AggregationSample2
{  
	String bookname;
	int bookcost;
	AggregationSample1 ref;              //re- reference variable   (Aggregation )
	public AggregationSample2(String bookname, int bookcost, AggregationSample1 ref)
	{
		this.bookname=bookname;
		this.bookcost=bookcost;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(ref.authorname +" "+ ref.authorid);
		System.out.println(bookname+" "+bookcost);
	}

	public static void main(String[] args) 
	{
	  
		AggregationSample1 obj1=new AggregationSample1("Gopikrishnan",112 );
		AggregationSample2 obj2=new AggregationSample2("Java Book", 1250, obj1);
		obj2.display();
		

	}

}
