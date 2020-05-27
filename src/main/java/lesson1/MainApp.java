package lesson1;

public class MainApp {
    /*
    * Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
    * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
————————————————————————
Создайте два класса: беговая дорожка и стена, при прохождении через которые,
* участники должны выполнять соответствующие действия (бежать или прыгать),
* результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
————————————————————————
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
* Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.*/

    public static void main(String[] args) {
        Human anya = new Human("Аня", 21000, 2);
        Human svets = new Human("Света", 5000, 1);
        Cat barsik = new Cat("Барсик", 5000, 2);
        Cat murzik = new Cat("Мурзик", 100, 3);
        Robot c3po = new Robot("C-3PO", 48000, 0);
        Robot r2d2 = new Robot("R2D2", 48000,1000);

        Competitors[] competitors = {anya,svets,barsik,murzik,c3po,r2d2};

        Obstacle wall1 = new Obstacle(ObstacleType.wall);
        Obstacle wall2 = new Obstacle(ObstacleType.wall, 2);
        Obstacle thrm1 = new Obstacle(ObstacleType.threadmill, 1000);
        Obstacle thrm2 = new Obstacle(ObstacleType.threadmill, 20000);

        Obstacle[] obstacles = {wall1,thrm1,wall2,thrm2};

        for (Competitors competitor : competitors) {
            System.out.println();
            for (Obstacle obstacle: obstacles){
                if(obstacle.type == ObstacleType.wall){
                    competitor.jump(obstacle.getSize());
                    if(!obstacle.competionResult(competitor.getJumpDist())){
                        break;
                    }
                } else {
                    competitor.run(obstacle.getSize());
                    if (!obstacle.competionResult(competitor.getRunDist())) {
                        break;
                    }
                }

            }
        }
    }
}