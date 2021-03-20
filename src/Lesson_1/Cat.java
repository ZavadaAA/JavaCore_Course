package Lesson_1;

public class Cat implements DreamTeam {
    private String name;
    private int maxRunDistance;
    private int maxHeightJump;
    private boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxHeightJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " successfully runs " + distance + " metres");
        } else {
            System.out.println(name + " fails to run " + distance + " metres");
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