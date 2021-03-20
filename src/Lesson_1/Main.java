package Lesson_1;

public class Main {
    public static void main(String[] args) {
        DreamTeam[] participants = {
                new Cat("Tomas", 1800, 2),
                new Human("Dobrynya", 5000, 20),
                new Robot("C-3PO", 55000, 1),
        };

        Obstacles[] obstacles = {
                new Road(2500),
                new Wall(1)
        };

        for (DreamTeam participant : participants) {
            for (Obstacles obstacle : obstacles) {
                obstacle.passTheObstacle(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }
}