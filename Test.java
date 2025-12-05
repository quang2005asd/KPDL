import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.println("tổng của i khi i = 5 là: " + sum);
        tinhtoan();
    }

    public static void tinhtoan(){
        Scanner tt = new Scanner(System.in); 
        System.out.println("nhập số a: ");
        double a = tt.nextDouble();
        System.out.println("nhập số b: ");
        double b = tt.nextDouble();

        System.out.println("Chọn phép toán mà bạn muốn thực hiện(+,-,*,/): ");
        char pheptoan = tt.next().charAt(0);
        if(pheptoan == '+'){
            System.out.println("kết quả của phép cộng là: " + (a + b));
        } else if(pheptoan == '-'){
            System.out.println("kết quả của phép trừ là: " + (a - b));
        } else if(pheptoan == '*'){
            System.out.println("kết quả của phép nhân là: " + (a * b));
        } else if(pheptoan == '/'){
            if(b != 0){
                System.out.println("kết quả của phép chia là: " + (a / b));
            } else {
                System.out.println("Lỗi: Không thể chia cho 0.");
            }
        } else {
            System.out.println("Phép toán không hợp lệ.");
        }
        tt.close();
}
}


