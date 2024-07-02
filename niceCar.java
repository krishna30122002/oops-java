public class niceCar {
    private Engine engine;
    private cdPlayer player=new cdPlayer();

    public niceCar(){
        engine=new powerEngine();
    }

    public niceCar(Engine engine){
        this.engine = engine; 
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }

    public static void main(String[] args) {
        niceCar nicecar=new niceCar();
        nicecar.start();
        nicecar.startMusic();

        nicecar.upgradeEngine();
        nicecar.start();
    }
}
