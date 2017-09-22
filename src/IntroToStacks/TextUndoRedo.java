package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> chars = new Stack<Character>();


	public void frame () {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		TextUndoRedo textUndoRedo= new TextUndoRedo();
		textUndoRedo.frame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String string1 = Character.toString(e.getKeyChar());
		label.setText(label.getText() + string1);
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String string2 = label.getText();
			char last = string2.charAt(string2.length()-1);
			string2 = string2.substring(0, string2.length()-2);
			System.out.println("" + string2);
			label.setText(string2);
			chars.push(last);
			
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			String string3 = label.getText() + chars.pop();
			label.setText(string3);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
