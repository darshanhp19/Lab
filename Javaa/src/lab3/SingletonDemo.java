package lab3;

 class Payment {
  private static Payment payment=null;
  private Payment() {
	  
  }
  public static Payment getInstance() {
	  if(payment==null)
		  payment=new Payment();
	  return payment;
  }
  
  protected  void UPI( ) {
      System.out.println("upi payment");
   }
  
  protected  void Creditcard( ) {
      System.out.println("credit payment");
   }
  
 }

  public class SingletonDemo{
	  public static void main(String[] args) {
		Payment p=Payment.getInstance();
		p.UPI();
		
	}
  }
  

