public class main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        // mushroom
        Mushroom m1 = new Mushroom();
        m1.setAppear(true);
        m1.run(5, 0);
        m1.show();
        System.out.println("----------------------------------------");

        // fireflower
        Fireflower f1 = new Fireflower();
        f1.setAppear(true);
        f1.run(5, 0);
        f1.show();
        System.out.println("----------------------------------------");

        // starman
        Starman s1 = new Starman();
        s1.setAppear(true);
        s1.run(5, 0);
        s1.show();
        System.out.println("----------------------------------------");

    }
}
