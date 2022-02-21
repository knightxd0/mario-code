public class Mushroom extends Item {
    protected String color;

    public Mushroom() {

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAppear(boolean appear) {
        setAppear("Mushroom", appear);
    }

    public void run(int x, int y) {
        location = new int[2];
        location[0] += x;
        location[1] += y;

        int[] changlocation = { location[0], location[1] };

        setLocation(changlocation);
        run("Mushroom");
    }

    public void show() {
        show("Mushroom");
    }

}
