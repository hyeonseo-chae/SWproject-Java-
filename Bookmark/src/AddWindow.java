import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class AddWindow extends JFrame{
	BookmarkListPanel k = new BookmarkListPanel();
	public AddWindow(BookmarkList list) {
		
		JButton button1;
		Dimension dim = new Dimension(1000,100);
		JFrame frame = new JFrame("Input New Bookmark");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		String header[]= {"Group","Name","URL","Memo"};
		String[][] contents = new String[1][4];
		
		
		JTable table = new JTable(contents,header);
		
		JScrollPane scrollpane = new JScrollPane(table);
		button1 = new JButton("INPUT");
		JPanel rightpanel = new JPanel(new GridLayout(1,1,0,0));

		rightpanel.add(button1);
		frame.add("East",rightpanel);
		frame.add("Center",scrollpane);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		button1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			String group = (String) table.getValueAt(0,0);
				String name = (String) table.getValueAt(0,1);
				String url = (String) table.getValueAt(0,2);
				String memo = (String) table.getValueAt(0,3);
				
				
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm");
				String formatedNow = now.format(formatter);
				list.add(group,name,url,formatedNow,memo);
				System.out.println(list.numBookmarks());
				k.BookmarkListPanelre();
				frame.dispose();
			}
			
		});
		
		
		
	}
}
