public class Starman extends Item {
    public Starman() {

    }

    public void setAppear(boolean appear) {
        setAppear("Starman", appear);
    }

    public void run(int x, int y) {
        location = new int[2];
        location[0] += x;
        location[1] += y;

        int[] changlocation = { location[0], location[1] };

        setLocation(changlocation);
        run("Starman");
    }

    public void show() {
        show("Starman");
    }
}
