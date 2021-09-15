import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Lab1 extends JFrame
{
    int milan=0;
    int madrid=0;

    JButton Milan = new JButton("AC Milan");
    JButton Madrid = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result" + 0 + " X " + 0);
    JLabel Winner = new JLabel("Winner : DRAW");
    JLabel LastScore = new JLabel("Last score: N/A");

    public Lab1()
    {
        super("Milun vs Madrid");
        setLayout(null);
        Milan.setBounds(100,350,150,40); // added at 150,300 width = 100,
        Madrid.setBounds(300,350, 150,40); // added at 0,0 width = 80, height=400
        Result.setBounds(250,50, 150, 40);
        Winner.setBounds(250,150, 150, 40);
        LastScore.setBounds(250,250, 150, 40);

        add(Milan);
        add(Madrid);
        add(Result);
        add(Winner);
        add(LastScore);

        setSize(500,500);

        Milan.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                milan++;
                reLab(milan);
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });

        Madrid.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                madrid++;
                reLab(madrid);
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });

        public void reLab(){
            Result.setText(("Result" + 0 + " X " + 0));
        }
    }
    public static void main(String[]args)
    {
        new Lab1().setVisible(true);
    }
}