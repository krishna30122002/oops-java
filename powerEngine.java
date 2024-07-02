public class powerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate");
    }
}
