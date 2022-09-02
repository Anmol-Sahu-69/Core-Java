public class DemoMethod1 {
    
    int x = 10;// instance variable memory in object
    static int y = 20;// static variable memory in class

    void m1() {
        System.out.println("===instance method===");
        System.out.println("value of x=" + x);
        System.out.println("value of y=" + y);
    }

    static void m2() {
        System.out.println("===static method===");
        // System.out.println("value of x="+x);
        System.out.println("value of y=" + y);
    }

    public class DemoVar {
        static int z = 20;
        int w = 40;

        void m3() {
            System.out.println("the value of Z=" + z);
            System.out.println("the value of w=" + w);
        }

        static void m4() {
            System.out.println("the value of z=" + z);
        }
    }
    public static void main(String[] args) {
        DemoMethod1 ob=new DemoMethod1();
        ob.m1();
        DemoMethod1.m2();
        DemoVar obj=ob.new DemoVar();
        obj.m3();
        DemoVar.m4();

    }
}
