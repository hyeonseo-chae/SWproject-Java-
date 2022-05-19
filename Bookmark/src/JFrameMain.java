import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.GridLayout;

public class JFrameMain extends JFrame {

	JFrameMain() { 
		JButton button1, button2, button3, button4, button5;
		
		BookmarkList o = new BookmarkList("bookmarknormal.txt");
		
		Dimension dim = new Dimension(1000,200);
		JFrame frame = new JFrame("Bookmark Manager");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		String header[]= {" ","Group","Name","URL","Created Time","Memo"};
		String contents[][]= new String[o.numBookmarks()][6];
		for(int i=0;i<o.numBookmarks();i++) {
			if(o.getBookmark(i).groupname=="") {
				contents[i][0]="";
			}
			else {
				contents[i][0]=">";
			}
			
			contents[i][1]=o.getBookmark(i).groupname;
			contents[i][2]=o.getBookmark(i).name;
			contents[i][3]=o.getBookmark(i).url;
			contents[i][4]=o.getBookmark(i).time;
			contents[i][5]=o.getBookmark(i).memo;
		}
		
		JTable table = new JTable(contents,header);
		JScrollPane scrollpane = new JScrollPane(table);
		button1 = new JButton("ADD");
		button2 = new JButton("DELET");
		button3 = new JButton("UP");
		button4 = new JButton("DOWN");
		button5 = new JButton("SAVE");
		
		JPanel rightpanel = new JPanel(new GridLayout(10,10,0,0));
		
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
	
	public static void main(String[] args) 
	{ 
		new JFrameMain(); 
		
		
		
	}

	
}
