//import java.awt.*;
//import javax.swing.*;
//
//public class Main extends JFrame {
//    private static final long serialVersionUID = 1L;
//    GameBoardPanel board = new GameBoardPanel();
//    JButton btnRestart = new JButton("Restart");
//
//    public Main() {
//        Container cp = getContentPane();
//        cp.setLayout(new BorderLayout());
//
//        JOptionPane.showMessageDialog(this, "Click 'Ok' to start Sudoku!");
//
//        cp.add(board, BorderLayout.CENTER);
//
//        JPanel restartPanel = new JPanel();
//        restartPanel.add(btnRestart);
//        cp.add(restartPanel, BorderLayout.SOUTH);
//
//        btnRestart.addActionListener(e -> {
//            board.restartGame();
//        });
//
//        pack();
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Sudoku");
//        setVisible(true);
//
//        board.newGame();
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//    }
//}
