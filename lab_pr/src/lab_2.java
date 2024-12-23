import processing.core.PApplet;

public class lab_2 extends PApplet {
    private float x;
    private float y;
    private float speedX;
    private float speedY;
    private int rad;
    private int r, g, b;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        x = width / 2f;
        y = height / 2f;

        speedX = 3f;
        speedY = 3f;

        rad = 169;

        r = 255;
        g = 255;
        b = 255;
    }

    @Override
    public void draw() {
        background(0, 0, 0);
        fill(r, g, b);
        circle(x, y, rad);
        x += speedX;
        y += speedY;

        if (x >= width - rad / 2f || x <= rad / 2f) {
            speedX *= -1;
            changeColor();
        }

        if (y >= height - rad / 2f || y <= rad / 2f) {
            speedY *= -1;
            changeColor();
        }
    }

    private void changeColor() {

        r = (int) random(256);
        g = (int) random(256);
        b = (int) random(256);
    }

    public static void main(String[] args) {
        PApplet.main("lab_2");
    }
}