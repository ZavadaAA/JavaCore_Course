package Lesson_1;

public class Robot implements DreamTeam {
    private String name;
    private int maxRunDistance;
    private float maxHeightJump;
    private boolean onDistance;

    public Robot(String name, int maxRunDistance, float maxHeightJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " successfully runs " + distance + " meters");
        } else {
            System.out.println(name + " fails to run " + distance + " meters");
            onDistance = false;
        }
    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println(name + " jumped over " + height + " meters wall");
        } else {
            System.out.println(name + " fails to jump over " + height + " meters wall");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}