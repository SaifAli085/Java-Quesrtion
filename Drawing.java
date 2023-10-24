// import java.awt.*;

// public class Drawing extends Canvas{
//     public void paint (Graphics g){
//         g.drawRect(50, 75, 100, 50);
//         g.fillRect(50, 70, 50, 50);
//         g.drawRoundRect(50, 150, 100, 50, 15, 15);
//         g.fillRoundRect(175, 150, 100, 50, 15, 15);
//         g.drawOval(50, 275, 100, 50);
//         g.fillOval(175, 275, 100, 50);
//         g.drawArc(20, 350, 100, 50, 25, 75);
//         g.fillArc(175, 350, 100, 50, 25, 75);
//     }
//     public static void main(String[] args) {
//         Drawing m = new Drawing();
//         Frame f = new Frame("shapes");
//         f.add(m);
//         f.setSize(300,450);
//         f.setVisible(true);
//     }
// }

import java.awt.*;

class Drawings extends Canvas{
    public void paint(Graphics g){
        g.drawRect(50,50,100,50);
        g.fillRect(250, 50, 200, 50);
        g.drawRoundRect(50, 100, 100, 50, 15, 15);
        g.fillRoundRect(150, 100, 100, 50, 15, 15);
        g.drawOval(50, 150, 50, 75);
        g.fillOval(150, 150, 50, 75);
        g.drawArc(50, 200, 75, 50, 25, 75);
        g.fillArc(150, 200, 75, 50, 25, 75);

    }
    public static void main(String[] args) {
        Drawings d = new Drawings();
        Frame f = new Frame("Shapes");
        f.add(d);
        f.setSize(1000, 500);
        f.setVisible(true);
    }
}