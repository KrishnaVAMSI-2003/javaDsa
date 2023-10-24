// Function or method Overriding
abstract class Doctor {
    abstract void treatPatient();
}
class Physician extends Doctor{
    void treatPatient() {
        System.out.println("Hi I am Physician\nI Treat patients using medicines.");
    }
}
class Surgeon extends Doctor{
    void treatPatient() {
        System.out.println("Hi I am Surgeon\nI Treat patients by surgery.");
    }
}
class Dentist extends Doctor{
    void treatPatient() {
        System.out.println("Hi I am Dentist\nI Treat patients teeth.");
    }
}
public class DynamicPolymorphism {
    public static void main(String[] args) {
        Doctor doc=null;
        System.out.println("Hi! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you are looking for ?");
        System.out.println("Press 1.Physician\n2. Surgeon\n3.Dentist");
        int n=new java.util.Scanner(System.in).nextInt();
        switch(n) {
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                System.out.println("A oh! Invalid choice");
                break;
        }
        if(n<1||n>3) {
            System.exit(0);
        } else {
            doc.treatPatient();
        }
    }
}
