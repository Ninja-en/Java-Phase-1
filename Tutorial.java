class Tutorial{
    public static void main(String[] args) {
        System.out.println("Hello World");
            /*
                แสดงผลข้อความทาจอภาพ
                แบบขึ้นบรรทัดใหม่ และไม่ขึ้นบรรทัดใหม่
            */
        System.out.print("Welcome to");
        System.out.println("Ninja");

        String a ="100",b="200";

        //String => Double
        double c=Double.parseDouble(a);
        c=c+3.55;
        System.out.println(c);

        //Integer => String
        int num1=100;
        String age = String.valueOf(num1);
        System.out.println(age);
    }
}