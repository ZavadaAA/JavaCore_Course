package Lesson_1;

public class Road implements Obstacles {
    private int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public void passTheObstacle(DreamTeam participants) {
        participants.run(distance);
    }
}