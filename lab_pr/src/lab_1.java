import processing.core.PApplet;

public class lab_1 extends PApplet {

    public static void main(String[] args) {
        PApplet.lab_1("lab_1");
    }

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        textSize(50);
    }

    @Override
    public void draw() {
        background(255);

        fill(0, 0, 255);
        rect(width / 3f, 200, width / 3f, 100);
        fill(255, 0, 0);
        text("Erbol", width / 3f + 100, 250);

        fill(0, 0, 255);
        rect(width / 3f, 300, width / 3f, 100);
        fill(255, 0, 0);
        text("Samat", width / 3f + 100, 350);

        fill(0, 0, 255);
        rect(width / 3f, 400, width / 3f, 100);
        fill(255, 0, 0);
        text("Umar", width / 3f + 100, 450);

        fill(0, 0, 255);
        rect(width / 3f, 500, width / 3f, 100);
        fill(255, 0, 0);
        text("Aitenir", width / 3f + 100, 550);

        if (mouseX >= width / 3f && mouseY >= 200 && mouseY <= 300 && mouseX <= width / 3f * 2) {
            fill(250, 0, 0);
            text("Erbol Chornyi", width / 3f + 100, 800);
            fill(0, 0, 0);
            text("Erbol", width / 3f + 100, 250);
        }

        if (mouseX >= width / 3f && mouseY >= 300 && mouseY <= 400 && mouseX <= width / 3f * 2) {
            fill(250, 0, 0);
            text("Samat kIller", width / 3f + 100, 800);
            fill(0, 0, 0);
            text("Samat", width / 3f + 100, 350);
        }
        if (mouseX >= width / 3f && mouseY >= 400 && mouseY <= 500 && mouseX <= width / 3f * 2) {
            fill(250, 0, 0);
            text("Umar man", width / 3f + 100, 800);
            fill(0, 0, 0);
            text("Umar", width / 3f + 100, 450);
        }
        if (mouseX >= width / 3f && mouseY >= 500 && mouseY <= 600 && mouseX <= width / 3f * 2) {
            fill(250, 0, 0);
            text("Aitenir jiraf", width / 3f + 100, 800);
            fill(0, 0, 0);
            text("Aitenir", width / 3f + 100, 550);
        }

    }
}