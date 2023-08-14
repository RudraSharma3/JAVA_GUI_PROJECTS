import java.awt.*;

class Puzzulll {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 300);
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(2, 1));
        Label l1 = new Label("1");
        Label l2 = new Label("2");
        p1.add(l1);
        p1.add(l2);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(1, 3));
        Label l3 = new Label("3");
        Label l4 = new Label("4");
        Label l5 = new Label("5");
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);

        Panel P1 = new Panel();
        P1.setLayout(new GridLayout(1, 2));
        P1.add(p1);
        P1.add(p2);

        Panel p3 = new Panel();
        p3.setLayout(new GridLayout(2, 1));
        Label l6 = new Label("6");
        Label l7 = new Label("7");
        p3.add(l6);
        p3.add(l7);

        Panel p4 = new Panel();
        p4.setLayout(new GridLayout(3, 1));
        Label l8 = new Label("8");
        Label l9 = new Label("9");
        Label l10 = new Label("10");
        p4.add(l8);
        p4.add(l9);
        p4.add(l10);

        Panel P2 = new Panel();
        P2.setLayout(new GridLayout(1, 2));
        P2.add(p3);
        P2.add(p4);

        Panel p5 = new Panel();
        p5.setLayout(new GridLayout(1, 2));
        Label l01 = new Label("11");
        Label l02 = new Label("12");
        p5.add(l01);
        p5.add(l02);

        Panel p6 = new Panel();
        p6.setLayout(new GridLayout(1, 3));
        Label l03 = new Label("13");
        Label l04 = new Label("14");
        Label l05 = new Label("15");
        p6.add(l03);
        p6.add(l04);
        p6.add(l05);

        Panel P3 = new Panel();
        P3.setLayout(new GridLayout(2, 1));
        P3.add(p5);
        P3.add(p6);

        Panel P4 = new Panel();
        P4.setLayout(new GridLayout(1, 2));
        P4.add(P2);
        P4.add(P3);

        Panel P = new Panel();
        P.setLayout(new GridLayout(2, 1));
        P.add(P1);
        P.add(P4);

        f.add(P);
        f.setVisible(true);
    }
}
