public class Program2 {
    void add(int n1,int n2) { System.out.println(n1+n2); }
    void add(int n1,int n2,int n3) { System.out.println(n1+n2+n3); }
    void add(float f1,float f2) { System.out.println(f1+f2); }
    void add(int n1,float f1) { System.out.println(n1+f1); }
    void add(float f1,int n1) { System.out.println(f1+n1); }

    public static void main(String[] args) {
        Program2 p = new Program2();
        p.add(20.0f,12);
    }

}
