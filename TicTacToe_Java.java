//import packages
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

//declare class
public class TicTacToe extends WsuWindow implements ActionListener {

//declaring fields
private WsuWindow win;
private JButton[] buttons;
private JLabel turnLabel;
private boolean XTurn;

//constructor
public TicTacToe() {
	super();

//creating base class object
	setSize(235, 280);
	setLocation(10, 10);
	setTitle("Tic-Tac-Toe");

//creating button array with for loop
buttons = new JButton[9];
int[][] locations = {
	{30, 30}, {85, 30}, {140, 30},
	{30, 85}, {85, 85}, {140, 85},
	{30, 140}, {85, 140}, {140, 140}
};
for (int i = 0; i < 9; i++) {
	buttons[i] = new JButton();
	buttons[i].setSize(50,50);
	buttons[i].setLocation(locations[i][0], locations[i][1]);
	add(buttons[i]);
	buttons[i].addActionListener(this);
}

//label for tracking who's turn it is
turnLabel = new JLabel("X's turn", JLabel.CENTER);
turnLabel.setSize(160, 20);
turnLabel.setLocation(30, 200);
add(turnLabel);

	XTurn = true;
	repaint();
}

//override to compile class
@Override
public void actionPerformed(ActionEvent e) {
	JButton nextButton = (JButton)e.getSource();

//setting who's turn it is on the button
if (XTurn) {
	nextButton.setText("X");
	turnLabel.setText("O's turn");
	} else {
	nextButton.setText("O");
	turnLabel.setText("X's turn");
}
//changing turns
if (XTurn) {
	XTurn = false;
	} else {
	XTurn = true;
}
}

//main method to run
public static void main(String[] args) {
new TicTacToe();
}
}