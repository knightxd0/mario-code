public class Fireflower extends Item {
    public Fireflower() {

    }

    public void setAppear(boolean appear) {
        setAppear("FireFlower", appear);
    }

    public void run(int x, int y) {
        location = new int[2];
        location[0] += x;
        location[1] += y;

        int[] changlocation = { location[0], location[1] };

        setLocation(changlocation);
        run("FireFlower");
    }

    public void show() {
        show("FireFlower");
    }
}