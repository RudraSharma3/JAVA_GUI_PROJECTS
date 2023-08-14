import java.awt.*;

class MCQ {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 300);
        f.setLayout(new BorderLayout());
        Panel p1 = new Panel();
        Button B1 = new Button("< Prev");
        Button B2 = new Button("Next >");
        p1.add(B1);
        p1.add(B2);
        f.add(p1, BorderLayout.SOUTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(5, 0));
        Label l1 = new Label("Q");
        Label l2 = new Label("A");
        Label l3 = new Label("B");
        Label l4 = new Label("C");
        Label l5 = new Label("D");
        p2.add(l1);
        p2.add(l2);
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        f.add(p2, BorderLayout.WEST);
        Panel p3 = new Panel();
        p3.setLayout(new GridLayout(5, 0));
        Label l6 = new Label("Capital of Rajasthan ?");
        p3.add(l6);
        Checkbox A = new Checkbox("  Ajmer");
        p3.add(A);
        Checkbox B = new Checkbox("  Jaipur");
        p3.add(B);
        Checkbox C = new Checkbox("  Delhi");
        p3.add(C);
        Checkbox D = new Checkbox("  Jodhpur");
        p3.add(D);
        f.add(p3, BorderLayout.CENTER);
        f.setVisible(true);
    }
}