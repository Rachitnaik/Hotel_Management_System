import java.util.Scanner;
//2037 Rachit Naik Gaunkar
public class AddBooking{

	LinkedList list = new LinkedList();

	public AddBooking(LinkedList list2) {
		
		Scanner sc = new Scanner(System.in);
		
		list = list2;
		
		System.out.println("Enter customer name: ");
		String names = sc.next();
		String c_mobile;
		//flag to check for valid mobile number
		int valid_flag;
		//code to validate mobile number
		do{
			valid_flag = 0;
			System.out.println("Enter customer mobile: ");
			c_mobile = sc.next();
			if(c_mobile.matches("[a-zA-Z]+")) // to see that only digits are entered
				System.out.println("Given mobile number is not valid");
			else {
				//Regular expression to accept valid phone number
				String regex = "\\d{10}";
				//Matching the given phone number with regular expression
				boolean result = c_mobile.matches(regex);
				if(result) {
					System.out.println("Given mobile number is valid");
					valid_flag = 1;
				}
				else
					System.out.println("Mobile number must be 10 digits");
			}
		}while(valid_flag == 0);

		System.out.println("Enter customer room no: ");
		int room_no = sc.nextInt();
		System.out.println("Enter room type: ");
		String room_type = sc.next();
		System.out.println("Enter booking time: ");
		String time = sc.next();
		int indexOf=time.indexOf(":");
		String part1=time.substring(0,indexOf);
		String part2=time.substring(indexOf+1);
		int h=Integer.parseInt(part1); // h is hours
		int m=Integer.parseInt(part2);   // m is mins
 		
		list.insert(names, c_mobile, h, m, room_no, room_type);
	}	
}