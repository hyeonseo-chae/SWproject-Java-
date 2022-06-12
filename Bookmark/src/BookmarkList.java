import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


class BookmarkList {
	
	public static ArrayList<Bookmark> BookmarkList = new ArrayList<>();
	ArrayList<Bookmark> Temp = new ArrayList<>();
	static String[] splitline;
	int cnt = -1;

	BookmarkList(String bookmarkFileName){
		File file = new File(bookmarkFileName); 
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String nospacingline = line.replaceAll("\\s+",""); 
				splitline = nospacingline.split("\\;|,",-1);
				if(nospacingline.charAt(0)!='/'&&nospacingline.charAt(1)!='/') { 
					if(splitline[1].charAt(2)=='-') {
						System.out.print("Date Format Error -> No Created Time invalid Bookmark info line:");
						BookmarkList.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
						break;
					}
					else if(splitline[2].equals("")) {
						System.out.print("MalformedURLException: wrong URL - No URL ; invalid Bookmark info line:");
						BookmarkList.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
						break;
					}
					cnt = cnt+1;
					BookmarkList.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
					
				} 
				}
			input.close();
			
		}catch(Exception ex) {
			System.out.print("Unknwon BookmarkList data File\n");
			
		}
	}
	
public int numBookmarks() {
		return cnt+1; 
	}
	

public void mergeByGroup() {
	

	for(int i = 0; i<cnt; i++) {
		for(int k = i+1;k<cnt+1;k++) {
			if(!(BookmarkList.get(i).groupname).equals("")&&(BookmarkList.get(i).groupname).equals(BookmarkList.get(k).groupname)) {
				Temp.add(BookmarkList.get(k));
				for (int j = k; j>i+1;j--) {
					BookmarkList.set(j, BookmarkList.get(j-1));
				}
				BookmarkList.set(i+1, Temp.get(Temp.size() - 1));
				
			}
		}
	}
}

	public Bookmark getBookmark(int i) {
		return BookmarkList.get(i);
		
		
		
	}
		
	
}
