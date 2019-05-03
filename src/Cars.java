public class Cars {
    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    boolean engine;
    int cylinder;
    int wheel;

    Cars(int cylinder){
        this.engine = true;
        this.cylinder = cylinder;
        this.wheel = 4;
    }

    public void startEngine(){
        System.out.println("Starting engine");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void brake(){
        System.out.println("Applying brake");
    }
}

class Innova extends Cars{

    public Innova(int cylinder) {
        super(cylinder);
    }

    public void startEngine(){
        System.out.println("Innova engine starting");
    }

    public void accelerate(){
        System.out.println("Innova accelerating");
    }
    public void brake(){
        System.out.println("Innova applying brake");
    }
}

class Ertiga extends Cars{

    public Ertiga(int cylinder) {
        super(cylinder);
    }

    public void startEngine(){
        System.out.println("Ertiga engine starting");
    }

    public void accelerate(){
        System.out.println("Ertiga accelerating");
    }
    public void brake(){
        System.out.println("Ertiga applying brake");
    }
}

class Zen extends Cars{

    public Zen(int cylinder) {
        super(cylinder);
    }

    public void startEngine(){
        System.out.println("Zen engine starting");
    }

    public void accelerate(){
        System.out.println("Zen accelerating");
    }

    public void brake(){
        System.out.println("Zen applying brake");
    }
}

class main{
    public static void main(String[] args) {
        Cars car = new Zen(2);

        car.startEngine();
        car.accelerate();
        car.brake();


        Cars car1 = new Innova(2);

        car1.startEngine();
        car1.accelerate();
        car1.brake();


        Cars car2 = new Ertiga(2);

        car2.startEngine();
        car2.accelerate();
        car2.brake();
    }
}


