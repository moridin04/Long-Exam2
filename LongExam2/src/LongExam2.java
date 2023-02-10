
import javax.swing.*;

public class LongExam2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Long Exam 2");
		JMenu file, edit, delete;
		JMenuItem m1, m2, e1;
		JTextField textfield1;

		// Menu Bar
		JMenuBar mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		delete = new JMenu("Delete");

		m1 = new JMenuItem("Menu 1");
		m2 = new JMenuItem("Menu 2");
		e1 = new JMenuItem("Edit 1");
		
		// Name
		JLabel label1 = new JLabel("Name: ");
		label1.setBounds(25, 25, 100, 30);
		textfield1 = new JTextField();
		textfield1.setBounds(95, 25, 100, 30);

		// Gender
		JLabel label2 = new JLabel("Gender: ");
		label2.setBounds(25, 60, 100, 30);
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female");
		r1.setBounds(95, 60, 100, 30);
		r2.setBounds(95, 85, 100, 30);
		
		// Programming Language
		JLabel label3 = new JLabel("Prog. lang. ");
		label3.setBounds(25, 145, 100, 30);
		String languages[] = {"c++", "c#", "Java", "Python"};
        	final JComboBox cb = new JComboBox(languages);
        	cb.setBounds(95, 150, 90, 20);
        
       	 	// Submit
        	JButton button = new JButton("Submit");
        	button.setBounds(95, 190, 90, 20);
        	button.setOpaque(false);
        	button.setBackground(null);
        	button.setFocusPainted(false);

		file.add(m1);
		file.add(m2);
		edit.add(e1);

		mb.add(file);
		mb.add(edit);
		mb.add(delete);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		f.add(r1);
		f.add(r2);
		f.add(textfield1);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(cb);
		f.add(button);

		f.setJMenuBar(mb);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
