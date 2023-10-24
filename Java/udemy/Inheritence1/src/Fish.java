public class Fish extends Animal{

    private  int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins){
        super("Fish",1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() is called");
    }

    private void moveBackFIn() {
        System.out.println("Fish.moveBackFin() is called");
    }

    public void swim() {
        moveBackFIn();
        moveMuscles();
        super.move(3);
    }
}
