
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Click https://github.com/SachithaAthukorala/Calculator-Java-AWT/blob/main/Calculator.java for sourcecode
 */
/**
 *
 * @author Sachitha Athukorala
 */
class close extends WindowAdapter {

    public void windowClosing(WindowEvent c) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bAdd, bSubs, bMulti, bDivi, bPerc, bSqu, bClr, bPlMi, bEql;
    TextField tf;
    Color color, tColor, btColor, funBtColor, btnColor, btnForeColor, ligColor, ligBtn;
    Font calTxt, btnFont;
    MenuItem mi1, mi2, mi3, mi4, mi5;
    Panel txtMainP, txtMainPNo, ri, le, btnArea, dow;
    String firstValue = "", secondValue = "", operation = "";
    double firstdv, seconddv, tot, temp;
    boolean darkMode = true;

    cal() {
//Frame
        Frame calFrame = new Frame();
        calFrame.setBounds(700, 200, 450, 650);
        calFrame.setTitle("Calculator");
        calFrame.addWindowListener(new close());
//Frame

//Menu Bar
//----------------------------------------------
        MenuBar mBar = new MenuBar();
//----------------------------------------------
        mi1 = new MenuItem("New Window");
        mi2 = new MenuItem("Standerd");
        mi3 = new MenuItem("Scientific");
        mi4 = new MenuItem("Dark Mode");
        mi5 = new MenuItem("Light Mode");
//----------------------------------------------
        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        Menu m2 = new Menu("Edit");
        m2.add(mi4);
        m2.add(mi5);
//----------------------------------------------
        mBar.add(m1);
        mBar.add(m2);
//----------------------------------------------
        calFrame.setMenuBar(mBar);
//----------------------------------------------
        mi1.addActionListener(this);
//        mi2.addActionListener(this);
//        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
//----------------------------------------------
//Menu Bar

//Fonts
        calTxt = new Font("Digital-7", Font.PLAIN, 40);
        btnFont = new Font("Digital-7", Font.BOLD, 25);
//Fonts

//Cursors
        Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
//Cursors

//Colors
        color = new Color(26, 27, 40, 255);
        tColor = new Color(255, 255, 255, 255);
        btColor = new Color(26, 27, 40, 255);
        funBtColor = new Color(82, 201, 220, 255);
        btnColor = new Color(30, 36, 53, 255);
        btnForeColor = new Color(255, 255, 255, 255);

        ligColor = new Color(213, 215, 237);
        ligBtn = new Color(242, 248, 252, 255);

//Colors
//TextField
        tf = new TextField(20);
        tf.setFont(calTxt);
        tf.setEditable(false);
        tf.setForeground(tColor);
        tf.setBackground(btColor);
//TextField

//Buttons -----------------------------------------------------
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        bDot = new Button(".");
        bAdd = new Button("+");
        bSubs = new Button("-");
        bMulti = new Button("*");
        bDivi = new Button("/");
        bPerc = new Button("%");
        bSqu = new Button("√x");
        bClr = new Button("C");
        bPlMi = new Button("±");
        bEql = new Button("=");

//Cursor
        b0.setCursor(cursor1);
        b1.setCursor(cursor1);
        b2.setCursor(cursor1);
        b3.setCursor(cursor1);
        b4.setCursor(cursor1);
        b5.setCursor(cursor1);
        b6.setCursor(cursor1);
        b7.setCursor(cursor1);
        b8.setCursor(cursor1);
        b9.setCursor(cursor1);

        bDot.setCursor(cursor1);
        bAdd.setCursor(cursor1);
        bSubs.setCursor(cursor1);
        bMulti.setCursor(cursor1);
        bDivi.setCursor(cursor1);
        bPerc.setCursor(cursor1);
        bSqu.setCursor(cursor1);
        bClr.setCursor(cursor1);
        bPlMi.setCursor(cursor1);
        bEql.setCursor(cursor1);
//Cursor

//Font
        b0.setFont(btnFont);
        b1.setFont(btnFont);
        b2.setFont(btnFont);
        b3.setFont(btnFont);
        b4.setFont(btnFont);
        b5.setFont(btnFont);
        b6.setFont(btnFont);
        b7.setFont(btnFont);
        b8.setFont(btnFont);
        b9.setFont(btnFont);

        bDot.setFont(btnFont);
        bAdd.setFont(btnFont);
        bSubs.setFont(btnFont);
        bMulti.setFont(btnFont);
        bDivi.setFont(btnFont);
        bPerc.setFont(btnFont);
        bSqu.setFont(btnFont);
        bClr.setFont(btnFont);
        bPlMi.setFont(btnFont);
        bEql.setFont(btnFont);
//Font

//Foreground color
        b0.setForeground(btnForeColor);
        b1.setForeground(btnForeColor);
        b2.setForeground(btnForeColor);
        b3.setForeground(btnForeColor);
        b4.setForeground(btnForeColor);
        b5.setForeground(btnForeColor);
        b6.setForeground(btnForeColor);
        b7.setForeground(btnForeColor);
        b8.setForeground(btnForeColor);
        b9.setForeground(btnForeColor);

        bDot.setForeground(btnColor);
        bAdd.setForeground(btnColor);
        bSubs.setForeground(btnColor);
        bMulti.setForeground(btnColor);
        bDivi.setForeground(btnColor);
        bPerc.setForeground(btnColor);
        bSqu.setForeground(btnColor);
        bClr.setForeground(btnColor);
        bPlMi.setForeground(btnColor);
        bEql.setForeground(btnColor);
//Foreground color

//Background color
        b0.setBackground(btnColor);
        b1.setBackground(btnColor);
        b2.setBackground(btnColor);
        b3.setBackground(btnColor);
        b4.setBackground(btnColor);
        b5.setBackground(btnColor);
        b6.setBackground(btnColor);
        b7.setBackground(btnColor);
        b8.setBackground(btnColor);
        b9.setBackground(btnColor);

        bDot.setBackground(funBtColor);
        bAdd.setBackground(funBtColor);
        bSubs.setBackground(funBtColor);
        bMulti.setBackground(funBtColor);
        bDivi.setBackground(funBtColor);
        bPerc.setBackground(funBtColor);
        bSqu.setBackground(funBtColor);
        bClr.setBackground(funBtColor);
        bPlMi.setBackground(funBtColor);
        bEql.setBackground(funBtColor);
//Background color

//ActionListener
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        bDot.addActionListener(this);
        bAdd.addActionListener(this);
        bSubs.addActionListener(this);
        bMulti.addActionListener(this);
        bDivi.addActionListener(this);
        bPerc.addActionListener(this);
        bSqu.addActionListener(this);
        bClr.addActionListener(this);
        bPlMi.addActionListener(this);
        bEql.addActionListener(this);
//ActionListener

//Buttons -----------------------------------------------------
//Panels
        txtMainP = new Panel();
        txtMainP.setPreferredSize(new Dimension(400, 150));

        txtMainPNo = new Panel();
        CardLayout clNo = new CardLayout();
        txtMainPNo.setLayout(clNo);
        txtMainPNo.setPreferredSize(new Dimension(400, 15));

        Panel txtP = new Panel();
        CardLayout cl = new CardLayout();
        txtP.setLayout(cl);
        txtP.setPreferredSize(new Dimension(400, 80));

        ri = new Panel();
        CardLayout clri = new CardLayout();
        ri.setLayout(clri);
        ri.setPreferredSize(new Dimension(15, 650));

        le = new Panel();
        CardLayout clle = new CardLayout();
        le.setLayout(clle);
        le.setPreferredSize(new Dimension(15, 650));

        dow = new Panel();
        CardLayout cldow = new CardLayout();
        dow.setLayout(cldow);
        dow.setPreferredSize(new Dimension(450, 15));

        btnArea = new Panel();
        GridLayout gr = new GridLayout(5, 4, 10, 10);

        txtP.add(tf);
        btnArea.setLayout(gr);

        btnArea.add(bClr);
        btnArea.add(bPlMi);
        btnArea.add(bPerc);
        btnArea.add(bDivi);
        btnArea.add(b7);
        btnArea.add(b8);
        btnArea.add(b9);
        btnArea.add(bMulti);
        btnArea.add(b4);
        btnArea.add(b5);
        btnArea.add(b6);
        btnArea.add(bSubs);
        btnArea.add(b1);
        btnArea.add(b2);
        btnArea.add(b3);
        btnArea.add(bAdd);
        btnArea.add(bDot);
        btnArea.add(b0);
        btnArea.add(bSqu);
        btnArea.add(bEql);

        txtMainP.setBackground(color);
        ri.setBackground(color);
        le.setBackground(color);
        dow.setBackground(color);
        btnArea.setBackground(color);
        txtMainPNo.setBackground(color);

        txtMainP.add(txtMainPNo, BorderLayout.NORTH);
        txtMainP.add(txtP, BorderLayout.CENTER);

        calFrame.add(txtMainP, BorderLayout.NORTH);
        calFrame.add(btnArea, BorderLayout.CENTER);
        calFrame.add(ri, BorderLayout.WEST);
        calFrame.add(le, BorderLayout.EAST);
        calFrame.add(dow, BorderLayout.SOUTH);
//Panels
        calFrame.setVisible(true);
    }

//Action Listner of keys
    @Override
    public void actionPerformed(ActionEvent bt) {

        String s = bt.getActionCommand();
        Object o = bt.getSource();

        if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals(".")) {
            if (operation.equals("")) {
                if (s.equals(".") && firstValue.contains(".")) {
                    return;
                }
                firstValue += s;
                tf.setText(firstValue);
            } else {
                if (s.equals(".") && secondValue.contains(".")) {
                    return;
                }
                secondValue += s;
                tf.setText(secondValue);
            }
        } else if (s.equals("+")) {
            operation = "+";
            tf.setText("");
        } else if (s.equals("-")) {
            operation = "-";
            tf.setText("");
        } else if (s.equals("*")) {
            operation = "*";
            tf.setText("");
        } else if (s.equals("/")) {
            operation = "/";
            tf.setText("");
        } else if (s.equals("%")) {
            firstdv = Double.parseDouble(firstValue);
            temp = firstdv / 100;
            tf.setText(String.valueOf(temp));
            firstValue = String.valueOf(temp);
        } else if (s.equals("√x")) {
            firstdv = Double.parseDouble(firstValue);
            temp = Math.sqrt(firstdv);
            tf.setText(String.valueOf(temp));
            firstValue = String.valueOf(temp);
        } else if (s.equals("C")) {
            firstValue = "";
            secondValue = "";
            operation = "";
            tf.setText("");
        } else if (s.equals("±")) {
            firstdv = Double.parseDouble(firstValue);
            firstdv *= -1;
            firstValue = String.valueOf(firstdv);
            tf.setText(firstValue);
        } else if (s.equals("=")) {

            firstdv = Double.parseDouble(firstValue);
            seconddv = Double.parseDouble(secondValue);

            if (operation.equals("+")) {
                tot = firstdv + seconddv;
                firstValue = String.valueOf(tot);
                secondValue = "";
                tf.setText(String.valueOf(tot));
            } else if (operation.equals("-")) {
                tot = firstdv - seconddv;
                firstValue = String.valueOf(tot);
                secondValue = "";
                tf.setText(String.valueOf(tot));
            } else if (operation.equals("*")) {
                tot = firstdv * seconddv;
                firstValue = String.valueOf(tot);
                secondValue = "";
                tf.setText(String.valueOf(tot));
            } else if (operation.equals("/")) {
                tot = firstdv / seconddv;
                firstValue = String.valueOf(tot);
                secondValue = "";
                tf.setText(String.valueOf(tot));
            }

        }
        if (o.equals(mi1)) {
            new cal();
        } else if (o.equals(mi4)) {

            txtMainP.setBackground(color);
            ri.setBackground(color);
            le.setBackground(color);
            dow.setBackground(color);
            btnArea.setBackground(color);
            txtMainPNo.setBackground(color);

            b0.setBackground(btnColor);
            b1.setBackground(btnColor);
            b2.setBackground(btnColor);
            b3.setBackground(btnColor);
            b4.setBackground(btnColor);
            b5.setBackground(btnColor);
            b6.setBackground(btnColor);
            b7.setBackground(btnColor);
            b8.setBackground(btnColor);
            b9.setBackground(btnColor);

            b0.setForeground(btnForeColor);
            b1.setForeground(btnForeColor);
            b2.setForeground(btnForeColor);
            b3.setForeground(btnForeColor);
            b4.setForeground(btnForeColor);
            b5.setForeground(btnForeColor);
            b6.setForeground(btnForeColor);
            b7.setForeground(btnForeColor);
            b8.setForeground(btnForeColor);
            b9.setForeground(btnForeColor);

            darkMode = true;

        } else if (o.equals(mi5)) {
            txtMainP.setBackground(ligColor);
            ri.setBackground(ligColor);
            le.setBackground(ligColor);
            dow.setBackground(ligColor);
            btnArea.setBackground(ligColor);
            txtMainPNo.setBackground(ligColor);

            b0.setBackground(ligBtn);
            b1.setBackground(ligBtn);
            b2.setBackground(ligBtn);
            b3.setBackground(ligBtn);
            b4.setBackground(ligBtn);
            b5.setBackground(ligBtn);
            b6.setBackground(ligBtn);
            b7.setBackground(ligBtn);
            b8.setBackground(ligBtn);
            b9.setBackground(ligBtn);

            b0.setForeground(btColor);
            b1.setForeground(btColor);
            b2.setForeground(btColor);
            b3.setForeground(btColor);
            b4.setForeground(btColor);
            b5.setForeground(btColor);
            b6.setForeground(btColor);
            b7.setForeground(btColor);
            b8.setForeground(btColor);
            b9.setForeground(btColor);

            darkMode = false;
        }
// throw new UnsupportedOperationException("Not supported yet."); 
// To change body of generated methods, choose Tools | Templates.
    }
}

//Action Listner of keys
public class Calculator {

    public static void main(String[] args) {
        new cal();
    }
}

//Copy Rights Own By Sachitha Athukorala
