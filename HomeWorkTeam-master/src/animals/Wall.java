package animals;


public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Tiger tiger) {
        tiger.jump(height);
    }
}