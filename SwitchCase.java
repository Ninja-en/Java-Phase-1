import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนเลขเดือน = ");
        int month = kb.nextInt();
        String name;
        if(month == 1){
            name =("มกราคม");
        }else if(month ==2){
            name =("กุมภาพันธ์");
        }else if(month ==3){
            name =("มีนาคม");
        }else{
            name =("เดือนอื่นๆ");
        }
        System.out.println(name);
    }
}
