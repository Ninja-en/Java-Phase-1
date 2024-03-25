public class Prepost {
    public static void main(String[] args) {
        /*
         ++(Prefix) ++a คือ เพิ่มค่าให้ a ก่อน 1 ค่าแล้วนำไปใช้
         ++(Postfix) a++ นำค่าปัจจุบันใน a ไปใช้ก่อนแล้วค่อยเพิ่มค่า
         --(Prefix) --b คือ ลดค่าให้ a ก่อน 1 ค่าแล้วนำไปใช้
         --(Postfix) b-- นำค่าปัจจุบันใน b ไปใช้ก่อนแล้วค่อยลดค่า
         */

        int a = 5;
        // pre หน้า | post หลัง
        System.out.println(a);//5
        System.out.println(++a);//6
        System.out.println(a);//6

        a=5;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println("--------------------------------------------------------");

        int b=5;
        System.out.println(b); //5 
        System.out.println(--b); //4
        System.out.println(b); //4 
    }
    
}
