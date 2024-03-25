public class Variable {
    public static void main(String[] args) {
        /* 
        //นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int num1 = 10; //ค่าเริ่มต้น = 10
        int num2 = 20; //ค่าเริ่มต้น = 20
        num1=50;
        num2=100;
        System.out.println(num1);
        System.out.println("ค่าตัวเลขที่ 1 = "+num1);
        System.out.println("ค่าตัวเลขที่ 2 = "+num2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(Long.MAX_VALUE);
        System.out.println("-------------------------------------------------------------------");
        */

        // เช็คชนิดข้อมูล
        int a=10;
        double b;
        String c = "Hello World";
        boolean d;
        char e;
        float f;


        // เป็น (true)หรือ ไม่เป็น (fales)
        boolean result = c instanceof String;
        System.out.println(result);
    }
}