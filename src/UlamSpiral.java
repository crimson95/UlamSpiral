import javax.swing.*;
import java.awt.*;

public class UlamSpiral extends JPanel {

    int x, y;
    int step = 1;
    int stepSize = 5;
    int numSteps = 1;
    int state = 0;
    int turnCounter = 0;
    int stepsTaken = 0;
    int totalSteps;

    public UlamSpiral() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);

        int cols = 500 / stepSize;
        int rows = 500 / stepSize;
        totalSteps = cols * rows;

        x = 250;
        y = 250;
    }

    boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);

        int stepsInCurrentDirection = 0;

        while (step <= totalSteps) {

            if (isPrime(step)) {
                g2.fillOval(x, y, stepSize / 2, stepSize / 2);
            }

            // move
            switch (state) {
                case 0 -> x += stepSize; // right
                case 1 -> y -= stepSize; // up
                case 2 -> x -= stepSize; // left
                case 3 -> y += stepSize; // down
            }

            stepsInCurrentDirection++;
            step++;

            if (stepsInCurrentDirection == numSteps) {
                stepsInCurrentDirection = 0;
                state = (state + 1) % 4;
                turnCounter++;

                if (turnCounter % 2 == 0) {
                    numSteps++;
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ulam Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new UlamSpiral());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}