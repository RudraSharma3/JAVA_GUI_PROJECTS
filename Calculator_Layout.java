import java.awt.*;

class Calculator {
    
    public static void main(String[] args) {
        Frame frame = new Frame("CALCULATOR");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        Panel p = new Panel();
        TextArea t = new TextArea("",4,400,TextArea.SCROLLBARS_NONE);
        p.add(t);
        frame.add(p, BorderLayout.NORTH);

        Panel P2 = new Panel(); // this is used to print the numpad
        P2.setLayout(new GridLayout(4, 4));
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button badd = new Button("+");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button bdif = new Button("-");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bmul = new Button("*");
        Button bclr = new Button("C");
        Button b0 = new Button("0");
        Button bdiv = new Button("/");
        Button bequl = new Button("=");

        P2.add(b1);
        P2.add(b2);
        P2.add(b3);
        P2.add(badd);
        P2.add(b4);
        P2.add(b5);
        P2.add(b6);
        P2.add(bdif);
        P2.add(b7);
        P2.add(b8);
        P2.add(b9);
        P2.add(bmul);
        P2.add(bclr);
        P2.add(b0);
        P2.add(bdiv);
        P2.add(bequl);
        frame.add(P2, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
