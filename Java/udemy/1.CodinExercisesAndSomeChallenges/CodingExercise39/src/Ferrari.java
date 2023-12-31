public class Ferrari extends Car{
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -> brake()";
    }
}

