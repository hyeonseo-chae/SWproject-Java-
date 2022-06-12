import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


class BookmarkList {
	
	ArrayList<Bookmark> BookmarkLists = new ArrayList<>();
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
						BookmarkLists.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
						break;
					}
					else if(splitline[2].equals("")) {
						System.out.print("MalformedURLException: wrong URL - No URL ; invalid Bookmark info line:");
						BookmarkLists.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
						break;
					}
					cnt = cnt+1;
					BookmarkLists.add(new Bookmark(splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]));
					
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
			if(!(BookmarkLists.get(i).groupname).equals("")&&(BookmarkLists.get(i).groupname).equals(BookmarkLists.get(k).groupname)) {
				Temp.add(BookmarkLists.get(k));
				for (int j = k; j>i+1;j--) {
					BookmarkLists.set(j, BookmarkLists.get(j-1));
				}
				BookmarkLists.set(i+1, Temp.get(Temp.size() - 1));
				
			}
		}
	}
}

	public Bookmark getBookmark(int i) {
		return BookmarkLists.get(i);
		
		
		
	}

	

	public void add(String group, String name, String url, String formatedNow, String memo) {
		BookmarkLists.add(new Bookmark(group,name,url,formatedNow,memo));
		System.out.println(numBookmarks());
		
	}
		
	
}
