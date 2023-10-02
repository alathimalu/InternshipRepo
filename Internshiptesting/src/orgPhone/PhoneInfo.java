package orgPhone;

public class PhoneInfo {
	private void phoneName() {

     System.out.println("Samsung A52s");
	}
	private void phoneIMEINum() {

     System.out.println("*#6*");
    
	}
	private void phoneCamera() {

       System.out.println("64MP(F2.2)");
	}
	private void phoneStorge() {

      System.out.println("8GB Ram 128GB");
	}
    private void phoneOSName() {

    System.out.println("Android11.0");
	}
    public static void main(String[] args) {
		PhoneInfo p =new PhoneInfo();
		p.phoneName();
		p.phoneIMEINum();
		p.phoneCamera();
		p.phoneStorge();
		p.phoneOSName();
	}

}
