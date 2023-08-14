import java.awt.*;

class Scroll {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 300);
        f.setLayout(new BorderLayout());

        Panel P = new Panel();
        P.setLayout(new GridLayout(0, 3));
        Scrollbar A = new Scrollbar();
        Scrollbar B = new Scrollbar();
        Scrollbar C = new Scrollbar();
        P.add(A);
        P.add(B);
        P.add(C);
        f.add(P, BorderLayout.EAST);
        f.setVisible(true);

    }
}
