package Lesson_1;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void passTheObstacle(DreamTeam participants) {
        participants.heightJump(height);
    }
}