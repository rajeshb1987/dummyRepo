package package1;
import org.junit.Test;

//import package1.Class1;

public class Class2 {

	Class1 c=new Class1();
	@Test
	public void m1(){
		System.out.println("calling m1 of Class1 from m1 of Class2");
		c.m1();
	}
}
