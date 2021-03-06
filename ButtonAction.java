import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonAction extends Frame {
    static int mul, subt, addi, divi, modul;
    public static int ans1;
    static int m = 0;
    static int num1;

    ButtonAction() {
        setBackground(Color.darkGray);
        setSize(270, 400);
        setLayout(null);
        setVisible(true);
        final TextField tx = new TextField();
        Button bt1, bt, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, ans, add, sub, div, modulo, mult, back, ce;
        bt = new Button("0");
        bt1 = new Button("1");
        bt2 = new Button("2");
        bt3 = new Button("3");
        bt4 = new Button("4");
        bt5 = new Button("5");
        bt6 = new Button("6");
        bt7 = new Button("7");
        bt8 = new Button("8");
        bt9 = new Button("9");
        ans = new Button("Ans");
        add = new Button("+");
        sub = new Button("-");
        div = new Button("/");
        modulo = new Button("%");
        mult = new Button("*");
        back = new Button("<-");
        ce = new Button("CE");
        ans.setBounds(50, 100, 30, 30);
        add.setBounds(100, 100, 30, 30);
        sub.setBounds(150, 100, 30, 30);
        modulo.setBounds(50, 150, 30, 30);
        div.setBounds(100, 150, 30, 30);
        mult.setBounds(150, 150, 30, 30);
        bt1.setBounds(50, 200, 30, 30);
        bt2.setBounds(100, 200, 30, 30);
        bt3.setBounds(150, 200, 30, 30);
        bt4.setBounds(50, 250, 30, 30);
        bt5.setBounds(100, 250, 30, 30);
        bt6.setBounds(150, 250, 30, 30);
        bt7.setBounds(50, 300, 30, 30);
        bt8.setBounds(100, 300, 30, 30);
        bt9.setBounds(150, 300, 30, 30);
        back.setBounds(50, 350, 30, 30);
        bt.setBounds(100, 350, 30, 30);
        ce.setBounds(150, 350, 30, 30);
        tx.setBounds(30, 50, 195, 40);
        add(bt);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(tx);
        add(mult);
        add(div);
        add(ans);
        add(sub);
        add(modulo);
        add(add);
        add(ce);
        add(back);

        StringBuilder sb = new StringBuilder("");
        ce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sb.delete(0, sb.length());
                String text = sb.toString();
                tx.setText(text);
            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sb.delete(sb.length() - 1, sb.length());
                String text = sb.toString();
                tx.setText(text);
            }
        });
        bt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("0");
                String text = sb.toString();
                tx.setText(text);
            }

        });

        bt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("1");
                String text = sb.toString();

                tx.setText(text);

            }

        });

        bt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("2");

                String text = sb.toString();
                tx.setText(text);

            }

        });

        bt3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("3");
                String text = sb.toString();
                tx.setText(text);
            }

        });

        bt4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("4");
                String text = sb.toString();
                tx.setText(text);

            }

        });

        bt5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("5");
                String text = sb.toString();
                tx.setText(text);
            }

        });

        bt6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("6");
                String text = sb.toString();
                tx.setText(text);

            }

        });

        bt7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("7");
                String text = sb.toString();
                tx.setText(text);

            }

        });

        bt8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("8");
                String text = sb.toString();
                tx.setText(text);
            }

        });
        bt9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sb.append("9");
                String text = sb.toString();
                tx.setText(text);
            }

        });

        ans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < sb.length(); i++) {
                    String mkg;

                    if (sb.charAt(i) == '+' || sb.charAt(i) == '-' || sb.charAt(i) == '/' || sb.charAt(i) == '%'
                            || sb.charAt(i) == '*') {
                        mkg = sb.substring(i + 1, sb.length());
                        char abc[] = mkg.toCharArray();
                        for (int j = 0; j < abc.length; j++) {
                            int digit = (int) abc[j] - (int) '0';
                            if (digit < 0 || digit > 9)
                                throw new NumberFormatException();
                            num1 *= 10;
                            num1 += digit;
                        }
                        System.out.println(num1);
                        if (sb.charAt(i) == '+') {
                            ans1 = num1 + addi;

                            String text = Integer.toString(ans1);
                            tx.setText(text);
                        } else if (sb.charAt(i) == '-') {
                            ans1 = subt - num1;
                            String text = Integer.toString(ans1);
                            tx.setText(text);
                            sb.delete(0, sb.length());
                        } else if (sb.charAt(i) == '*') {
                            ans1 = mul * num1;
                            String text = Integer.toString(ans1);
                            tx.setText(text);
                            sb.delete(0, sb.length());

                        } else if (sb.charAt(i) == '%') {
                            ans1 = modul % num1;
                            String text = Integer.toString(ans1);
                            tx.setText(text);
                            sb.delete(0, sb.length());

                        } else if (sb.charAt(i) == '/') {
                            ans1 = divi / num1;
                            String text = Integer.toString(ans1);
                            tx.setText(text);
                            sb.delete(0, sb.length());

                        }
                    }

                }

            }
        });

        mult.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String txt = sb.toString();
                try {
                    mul = Integer.parseInt(txt);
                } catch (NumberFormatException ex) {
                }
                sb.append("*");
                String text = sb.toString();
                tx.setText(text);
            }

        });
        add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String txt = sb.toString();
                try {
                    addi = Integer.parseInt(txt);
                } catch (NumberFormatException ex) {
                }
                sb.append("+");
                String text = sb.toString();
                tx.setText(text);
            }

        });
        sub.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String text = sb.toString();
                try {

                    subt = Integer.parseInt(text);
                } catch (NumberFormatException ex) {
                }
                sb.append("-");
                String txt = sb.toString();
                tx.setText(txt);
            }

        });
        div.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String txt = sb.toString();
                try {

                    divi = Integer.parseInt(txt);
                } catch (NumberFormatException ex) {
                }
                sb.append("/");
                String text = sb.toString();
                tx.setText(text);
            }

        });
        modulo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String txt = sb.toString();
                try {

                    modul = Integer.parseInt(txt);
                } catch (NumberFormatException ex) {
                }
                sb.append("%");
                String text = sb.toString();
                tx.setText(text);
            }

        });

    }

    public static void main(String[] args) {
        new ButtonAction();
    }
}
