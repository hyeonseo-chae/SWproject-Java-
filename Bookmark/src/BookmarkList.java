import java.io.File;
import java.util.Scanner;

class BookmarkList {
	
	Bookmark[] BookmarkList = new Bookmark[100];
	Bookmark[] Temp = new Bookmark[100];
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
						BookmarkList[cnt] = new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]);
						break;
					}
					else if(splitline[2].equals("")) {
						System.out.print("MalformedURLException: wrong URL - No URL ; invalid Bookmark info line:");
						BookmarkList[cnt] = new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]);
						break;
					}
					cnt = cnt+1;
					BookmarkList[cnt] = new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]);
					
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
			if(!(BookmarkList[i].groupname).equals("")&&(BookmarkList[i].groupname).equals(BookmarkList[k].groupname)) {
				Temp[0] = BookmarkList[k];
				for (int j = k; j>i+1;j--) {
					BookmarkList[j] = BookmarkList[j-1];
				}
				BookmarkList[i+1] = Temp[0];
				
			}
		}
	}
}

	public Bookmark getBookmark(int i) {
		return BookmarkList[i];
		
		
		
	}
		
	
}
