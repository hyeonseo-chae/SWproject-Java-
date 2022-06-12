import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BookmarkListPanel extends JFrame {
	BookmarkList o = new BookmarkList("bookmarknormal.txt");
	public static char[] BookmarkList;
	BookmarkListPanel() { 
		JButton button1, button2, button3, button4, button5;
		
		
		o.mergeByGroup();
		Dimension dim = new Dimension(1000,200);
		JFrame frame = new JFrame("Bookmark Manager");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		
		List<String> setcontents = new ArrayList<String>();
		for (int i=0;i<o.numBookmarks();i++) {
			if(i==0) {
				setcontents.add(o.getBookmark(i).groupname);
			}else if(i>0&&!o.getBookmark(i).groupname.equals(o.getBookmark(i-1).groupname)) {
				setcontents.add(o.getBookmark(i).groupname);
			}
		}
		

		
		String header[]= {" ","Group","Name","URL","Created Time","Memo"};
		String[][] contents = new String[setcontents.size()][6];
		int k = 0;
		for(int i=0;i<o.numBookmarks();i++) {
			if(o.getBookmark(i).groupname=="") {
				contents[k][0]="";
				contents[k][1]=o.getBookmark(i).groupname;
				contents[k][2]=o.getBookmark(i).name;
				contents[k][3]=o.getBookmark(i).url;
				contents[k][4]=o.getBookmark(i).time;
				contents[k][5]=o.getBookmark(i).memo;
				k++;
				
			}else if(o.getBookmark(i).groupname!=""){
				if(i>0) {
					if(!o.getBookmark(i-1).groupname.equals(o.getBookmark(i).groupname)) {
						contents[k][0]=">";
						contents[k][1]=o.getBookmark(i).groupname;
						k++;
					}
				}else if(i==0) {
					contents[k][0]=">";
					contents[k][1]=o.getBookmark(i).groupname;
					k++;
				}
				
			}
			

		}
		
		DefaultTableModel model = new DefaultTableModel(contents,header);
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		button1 = new JButton("ADD");
		button2 = new JButton("DELET");
		button3 = new JButton("UP");
		button4 = new JButton("DOWN");
		button5 = new JButton("SAVE");
		
//		table.getColumnModel().getColumn(0).setWidth(0);
//		table.getColumnModel().getColumn(0).setMinWidth(0);
//		table.getColumnModel().getColumn(0).setMaxWidth(0); 





		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new AddWindow();
			}
		});
		
		
		JPanel rightpanel = new JPanel(new GridLayout(5,5,0,0));
		
		rightpanel.add(button1);
		rightpanel.add(button2);
		rightpanel.add(button3);
		rightpanel.add(button4);
		rightpanel.add(button5);
		frame.add("East",rightpanel);
		frame.add("Center",scrollpane);
		frame.pack();
		frame.setVisible(true);
	
		}
	
	public void BookmarkListPanelre() { 
		System.out.println(o.numBookmarks());
		List<String> setcontents = new ArrayList<String>();
		for (int i=0;i<o.numBookmarks();i++) {
			if(i==0) {
				setcontents.add(o.getBookmark(i).groupname);
			}else if(i>0&&!o.getBookmark(i).groupname.equals(o.getBookmark(i-1).groupname)) {
				setcontents.add(o.getBookmark(i).groupname);
			}
		}

		String header[]= {" ","Group","Name","URL","Created Time","Memo"};
		String[][] contents = new String[setcontents.size()][6];
		int k = 0;
		for(int i=0;i<o.numBookmarks();i++) {
			if(o.getBookmark(i).groupname=="") {
				contents[k][0]="";
				contents[k][1]=o.getBookmark(i).groupname;
				contents[k][2]=o.getBookmark(i).name;
				contents[k][3]=o.getBookmark(i).url;
				contents[k][4]=o.getBookmark(i).time;
				contents[k][5]=o.getBookmark(i).memo;
				k++;
				
			}else if(o.getBookmark(i).groupname!=""){
				if(i>0) {
					if(!o.getBookmark(i-1).groupname.equals(o.getBookmark(i).groupname)) {
						contents[k][0]=">";
						contents[k][1]=o.getBookmark(i).groupname;
						k++;
					}
				}else if(i==0) {
					contents[k][0]=">";
					contents[k][1]=o.getBookmark(i).groupname;
					k++;
				}
				
			}
			

		}
		
		DefaultTableModel model = new DefaultTableModel(contents,header);
		JTable table = new JTable(model);
		table.updateUI();

	
		}


	

	
}
