import java.util.Scanner;
public class Assignment4 {
    // โปรแกรมแปลง พ.ศ เป็น ค.ศ
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขจำนวนเต็ม = ");
        int number=kb.nextInt();
        
        //ประมวลผล
        // 2563 - 543 => ค.ศ
        // ค.ศ. + 543 = พ.ศ

        int result = number+543;
        System.out.print(number + " เปลี่ยนแปลง พ.ศ = "+result);
    }
    
}
