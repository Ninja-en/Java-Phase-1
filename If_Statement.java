import java.util.Scanner;
public class If_Statement {
    public static void main(String[] args) {
        /* 
        //แบบมีเงื่อนไข(Condition) กลุ่มคำสั่งที่ใช้ตัดสินใจในการเลือกเงื่อนไขต่างๆ ภายในโปรแกรมมาทำงาน เช่น if และ Switch..Case
        // if statement เป็นคำสั่งที่ใช้กำหนดเงื่อนไข ตัวอย่าง...
        if(เงื่อนไข){
            คำสั่งเมื่อเงื่อนไขเป็นจริง
        }
        */

        // ตัวอย่างการใช้ if else แบบ 1เงื่อนไข
        /* 
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุข้องคุณ : ");
        int age=kb.nextInt();
        if(age>=15){
            System.out.println("คำนำหน้า นาย/นางสาว");
        }else{
            System.out.println("คำนำหน้า เด็กชาย/เด็กหญิง");
        }
        System.out.println("จบโปรแกรม");
        */
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุข้องคุณ : ");
        int age=kb.nextInt();
        //60
        if(age>=15 && age<=19){
            System.out.println("วัยรุ่น");
        }
        else if(age>=20 && age<=29){
            System.out.println("วัยหนุ่ม/สาว");
        }
        else if(age>=30 && age<= 39){
            System.out.println("วัยทำงาน");
        }
        else if(age>=40 && age<= 59){
            System.out.println("วัยกลางคน");
        }
        else if(age>=60){
            System.out.println("วัยชรา");
        }else{
            System.out.print("ไม่พบช่วงอายุ");
        }
        System.out.print("จบโปรแกรม");
    }
    
}
