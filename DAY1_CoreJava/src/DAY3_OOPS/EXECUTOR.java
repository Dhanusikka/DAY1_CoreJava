package DAY3_OOPS;

public class EXECUTOR {
	public static void main(String [] args) {
		CUSTOMER c1=new CUSTOMER();
		c1.setCid(22);
		c1.setCname("Dhanu");
		c1.setAddress("Puducherry");
		System.out.println("Customer id:"+c1.getCid()+"Customer name:"+c1.getCname()+" Customer address:"+c1.getAddress());
	}
}
