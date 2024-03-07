package DAY3_OOPS;
import DAY3_OOPS.Customer1;
public class Executor1 {
		 public static void main(String[] args) {
			 Customer1 c1=new Customer1();
			 c1.setCid(22);
			 c1.setCname("Dhanu");
			 c1.setAddress("Puducherry");
			 System.out.println("Customer id:"+c1.getCid()+" Customer name:"+c1.getCname()+"Customer address:"+c1.getAddress());
			 Customer1 c2=new Customer1();
			 c2.setCid(223);
			 c2.setCname("Kavz");
			 c2.setAddress("Chennai");
			 System.out.println(c2);
			 Customer1 c3=new Customer1();
			 System.out.println(c3);
			 Customer1 c4=new Customer1(224,"Virg","France");
			 System.out.println(c4);		 }
}