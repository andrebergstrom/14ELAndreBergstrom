
import java.awt.*;

public class Ball {

    private static final int D = 50;
    private int x = 0;
    private int y = 0;
    private int moveX = 2;
    private int moveY = 2;
    private int score = 0;
    Color ballColor = new Color(0xE7930F);
    private Game game;

    public Ball(Game game) {
        this.game = game;
    }

    private void moveBall() {
        if (x + moveX <= 0)
            moveX = 2;
        if (x + moveX > game.getWidth() - D)
            moveX = -2;
        if (y + moveY < 0)
            moveY = 2;
        if (y + moveY > game.getHeight() - D)
            game.gameOver();
        if (collision()) {
            moveY = -2;
            y = game.racket.getY() - D;
            setScore(1);
        }

        x += moveX;
        y += moveY;
    }

    private Rectangle getBounds() {
        return new Rectangle(x, y, D, D);
    }

    private boolean collision() {
        return game.racket.getBounds().intersects(getBounds());
    }

    public void move() {
        moveBall();
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(ballColor);
        g2d.fillOval(x, y, D, D);
    }

    private void setScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

}