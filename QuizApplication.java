import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication {
    private static int questionIndex = 0;
    private static String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "Which gas do plants absorb from the atmosphere?",
        "Who wrote the play 'Romeo and Juliet'?",
        "Which element has the chemical symbol 'H'?"
    };

    private static String[][] options = {
        {"Berlin", "London", "Paris", "Madrid"},
        {"Venus", "Mars", "Jupiter", "Saturn"},
        {"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"},
        {"William Shakespeare", "Jane Austen", "Charles Dickens", "Leo Tolstoy"},
        {"Helium", "Hydrogen", "Oxygen", "Nitrogen"}
    };

    private static int[] correctAnswers = {2, 1, 2, 0, 1}; // Index of correct answers for each question

    private static int score = 0;
    private static int timeLeft = 30; // Initial time for each question in seconds
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MCQ Quiz Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel questionLabel = new JLabel();
        JButton[] answerButtons = new JButton[4];
        JLabel scoreLabel = new JLabel("Score: " + score);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));

        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton();
            optionsPanel.add(answerButtons[i]);
        }

        frame.setLayout(new BorderLayout());
        frame.add(questionLabel, BorderLayout.NORTH);
        frame.add(optionsPanel, BorderLayout.CENTER);
        frame.add(scoreLabel, BorderLayout.SOUTH);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                if (timeLeft >= 0) {
                    questionLabel.setText(questions[questionIndex] + " (Time Left: " + timeLeft + "s)");
                } else {
                    questionIndex++;
                    if (questionIndex < questions.length) {
                        displayQuestion(questionLabel, answerButtons);
                        timeLeft = 30; // Reset the timer for the next question
                    } else {
                        // Quiz ends here
                        questionLabel.setText("Quiz Over! Your Score: " + score);
                        disableAnswerButtons(answerButtons);
                        timer.stop();
                    }
                }
            }
        });

        for (int i = 0; i < 4; i++) {
            final int optionIndex = i;
            answerButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (optionIndex == correctAnswers[questionIndex]) {
                        score++;
                        scoreLabel.setText("Score: " + score);
                    }
                    questionIndex++;
                    if (questionIndex < questions.length) {
                        displayQuestion(questionLabel, answerButtons);
                        timeLeft = 30; // Reset the timer for the next question
                    } else {
                        // Quiz ends here
                        questionLabel.setText("Quiz Over! Your Score: " + score);
                        disableAnswerButtons(answerButtons);
                        timer.stop();
                    }
                }
            });
        }

        frame.setVisible(true);
        displayQuestion(questionLabel, answerButtons);
        timer.start();
    }

    private static void displayQuestion(JLabel questionLabel, JButton[] answerButtons) {
        questionLabel.setText(questions[questionIndex]);
        for (int i = 0; i < 4; i++) {
            answerButtons[i].setText(options[questionIndex][i]);
        }
    }

    private static void disableAnswerButtons(JButton[] answerButtons) {
        for (JButton button : answerButtons) {
            button.setEnabled(false);
        }
    }
}
