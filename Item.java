public class Item { // class Item
    // attibute
    protected String name;
    protected boolean appear;
    protected int[] location;

    public Item() {

    }

    // method
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAppear() {
        return this.appear;
    }

    public void setAppear(String name, boolean appear) {
        this.appear = appear;
        this.name = name;
        if (getAppear() == true) {
            System.out.printf("Set item %s to appear!\n", getName());
        } else {
            System.out.printf("Set item %s to disappear!\n", getName());
        }
    }

    public int[] getLocation() {

        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;

    }

    public void run(String name) {
        this.name = name;
        if (getName() == "Mushroom") {
            if (getAppear() == true) {
                System.out.printf("%s is moving.\n", getName());
                System.out.printf("%s is at %d,%d\n", getName(), this.location[0], location[1]);
            } else {
                System.out.printf("%s is not appearing.\n", getName());
            }
        } else if (getName() == "FireFlower") {
            if (getAppear() == true) {
                System.out.printf("%s is not moving.\n", getName());
                System.out.printf("%s is at %d,%d\n", getName(), this.location[0], location[1]);
            } else {
                System.out.printf("%s is not appearing.\n", getName());
            }
        } else if (getName() == "Starman") {
            if (getAppear() == true) {
                System.out.printf("%s is jumping.\n", getName());
                System.out.printf("%s is at %d,%d\n", getName(), this.location[0], location[1]);
            } else {
                System.out.printf("%s is not appearing.\n", getName());
            }
        }

    }

    public void show(String name) {
        this.name = name;
        System.out.printf("Block is cracked, %s is appearing.\n", getName());
    }

}