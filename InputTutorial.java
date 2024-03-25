import java.util.Scanner;
class InputTutorial{    
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลแบบไหน ? ตัวเลข integer , float , long , double , ข้อความ string
        // ข้อความทำอะไร
        // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

        // ประกาศใช้งาน Class | new
        Scanner sc=new Scanner(System.in);
        System.out.println("ป้อนชื่อของคุณ = ");
        String name =sc.nextLine();

        System.out.print("ป้อนชื่อปีเกิด พ.ศ. = ");
        int year=sc.nextInt();// รับค่า integer จากแป้นพิพ์ =>year

        int age= 2566 - year; //คำนวณอายุ

        System.out.print("ชื่อของคุณ คือ = "+name);
        System.out.print("ปีเกิด = "+year);
        System.out.println("อายุ = "+age);
    }
}

