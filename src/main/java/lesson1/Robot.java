package lesson1;

public class Robot implements Competitors {
    private String name;
    private int runDist;
    private int jumpDist;

    public Robot(){
        this.name = "Какой-то робот";
        this.runDist = 1;
        this.jumpDist = 1;
    }

    public Robot(String _name, int _runDist, int _jumpDist){
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