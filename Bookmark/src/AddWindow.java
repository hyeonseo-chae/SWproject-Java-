import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddWindow extends JFrame{

	public AddWindow() {
		JButton button1;
		Dimension dim = new Dimension(1000,100);
		JFrame frame = new JFrame("Input New Bookmark");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		String header[]= {"Group","Name","URL","Memo"};
		String[][] contents = new String[0][4];
		JTable table = new JTable(contents,header);

		
		JScrollPane scrollpane = new JScrollPane(table);
		button1 = new JButton("INPUT");
		JPanel rightpanel = new JPanel(new GridLayout(1,1,0,0));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		
		JTextField group = new JTextField(3);
		JTextField name = new JTextField(3);
		JTextField url = new JTextField(3);
		JTextField memo = new JTextField(3);
		
		panel.add(group);
		panel.add(name);
		panel.add(url);
		panel.add(memo);
		
		rightpanel.add(button1);
		frame.add("East",rightpanel);
		frame.add("Center",scrollpane);
		frame.add(panel,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
