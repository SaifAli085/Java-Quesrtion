// import java.awt.*;
// import java.awt.event.*;

// public class PersonalDetail {
//     public static void main(String[] args) {
//         Frame f = new Frame("Personal Details");
//         Label l = new Label("Welcome to my page habibi");
//         Label fn1 = new Label();
//         Label fn2 = new Label();
//         Label fn3 = new Label();
//         Label fn4 = new Label();
//         Label fn5 = new Label();

//         l.setBounds(250, 30, 600, 50);
//         fn1.setBounds(20,120, 600, 30);
//         fn2.setBounds(20,160, 600, 30);
//         fn3.setBounds(20,200, 600, 30);
//         fn4.setBounds(20,240, 600, 30);
//         fn5.setBounds(20,280, 600, 30);

//         Button b = new Button("Click here for my Personal Details");
//         b.setBounds(210, 70, 320, 30);
//         b.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 fn1.setText("Full Name: Saif Ali");
//                 fn2.setText("Father Name: Idris Alam");
//                 fn3.setText("Roll no: 19  College Name: Oxford");
//                 fn4.setText("Address: PSR Boys PG, Sector-4, HSR Layout, bangalore");
//                 fn5.setText("Phone no: 8340596926");
//             }
//         });
//         f.add(b);
//         f.add(l);
//         f.add(fn1);
//         f.add(fn2);
//         f.add(fn3);
//         f.add(fn4);
//         f.add(fn5);
//         f.setSize(400, 400);
//         f.setLayout(null);
//         f.setVisible(true);


//     }
// }

import java.awt.*;
import java.awt.event.*;

class PersonalDetail{
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        Label l = new Label("Welcome to my page");
        Label fn = new Label();
        Label pn = new Label();
        Label cd = new Label();
        Label ad = new Label();
        l.setBounds(20, 20, 500,50);
        fn.setBounds(20, 110, 500,30);
        pn.setBounds(20, 150, 500,30);
        cd.setBounds(20, 150, 500,30);
        ad.setBounds(20, 190, 500,30);
        Button b = new Button("CLICK BUTTON FOR MY PERSONAL DETAILS");
        b.setBounds(20,70, 500, 30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fn.setText("Full Name: Saif Ali");
                pn.setText("Father Name: Idris Alam ");
                cd.setText("Reg.no: U03MS22S0019");
                ad.setText("PSR Boys PG, Sector 4, HSR Layout");
            }

        });
        f.add(l);
        f.add(b);
        f.add(fn);
        f.add(pn);
        f.add(cd);
        f.add(ad);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
