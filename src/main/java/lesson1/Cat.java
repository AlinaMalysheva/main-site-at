package lesson1;

public class Cat implements Competitors {
    private String name;
    private int runDist;
    private int jumpDist;

    public Cat(){
        this.name = "Какой-то человек";
        this.runDist = 100;
        this.jumpDist = 1;
    }

    public Cat(String _name, int _runDist, int _jumpDist){
        this.name = _name;
        this.runDist = _runDist;
        this.jumpDist = _jumpDist;
    }

    @Override
    public void run(int _competDist) {
        System.out.printf("Участник %s начал забег. Пробежит ли он расстояние в %d метр/а/ов? ", this.name, _competDist);
    }

    @Override
    public void jump(int _competDist) {
        System.out.printf("Участник %s начал прыжок. Перепрыгнет ли он стену в %d метр/а/ов? ", this.name, _competDist);
    }

    @Override
    public String getName() {
        return name;
    }

    public int getRunDist() {
        return runDist;
    }

    public int getJumpDist() {
        return jumpDist;
    }

}