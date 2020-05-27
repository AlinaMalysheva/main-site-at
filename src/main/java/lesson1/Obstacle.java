package lesson1;

public class Obstacle {
    protected int size;
    protected Enum type;


    public int getSize() {
        return size;
    }

    public Obstacle(Enum _type){
        this.size = 1;
        this.type = _type;
    }

    public Obstacle(Enum _type,int _size){
        this.size= _size;
        this.type = _type;
    }

    private boolean getObstacle(int _compAbility){
         return (this.size<=_compAbility);
    }

    public boolean competionResult(int _compAbility){

        if (!this.getObstacle(_compAbility)){
            if (this.type == ObstacleType.wall){
                System.out.printf("\n Участник смог прыгнуть только на %d м. и выбывает из сореванования =(\n", _compAbility);

            } else {
                System.out.printf("\n Участник смог пробежать только %d м. и выбывает из сореванования =(\n", _compAbility);
            }
            return false;
        } else {
            System.out.println("Препятствие пройдено!");
            return true;
        }
    }
}
