import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class Game extends JPanel {

    Ball ball = new Ball(this);
    Racket racket = new Racket(this);
    Font scoreFont = new Font("SansSerif", Font.PLAIN, 30);
    private int timeLeft;

    public Game() {
        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
                //hej
            }


            public void keyPressed(KeyEvent e) {
                racket.keyPressed(e);
            }


            public void keyReleased(KeyEvent e) {
                racket.keyReleased(e);
            }
        });
        setFocusable(true);
    }

    private void move() {
        racket.move();
        ball.move();
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Spelet kommer nu att avslutas, du fick: " + ball.getScore(), "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public void countDown() {
        try {
            for (timeLeft = 5; timeLeft > 0; timeLeft--) {
                repaint();
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {

        }
    }

    private int width = 100;
    private int height = 100;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Game game = new Game();

        frame.setSize(700, 500); // x, y
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(3);
        frame.add(game);
        frame.setTitle("Ping pong");
        frame.setResizable(false);
        frame.setVisible(true);
        game.countDown();
        while (true) {
            game.move();
            game.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        racket.paint(g2d);
        g2d.setFont(scoreFont);
        g2d.drawString("Score: " +  ball.getScore(), 15, 40);
        g2d.drawString("Spelet startar om: " + timeLeft, 370, 40);
    }
}