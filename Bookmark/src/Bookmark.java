

class Bookmark{
	
	String name;
	String time;
	String url;
	String groupname;
	String memo;
	int cnt = 0;
	Bookmark(){
		
	}
	Bookmark(String name, String time, String url, String groupname, String memo){
		this.name = name;
		this.time = time;
		this.url = url;
		this.groupname = groupname;
		this.memo = memo;	
	}
	
	String getName() {
		return name;
	}
	
	void getName(String name) {
		this.name = name;
	}
	
	void getTIme(String time) {
		this.time = time;
	}
	
	String getTime() {
	
		return time;
		
	}
	
	String getUrl() {
		return url;
		
	}
	
	void getUrl(String url) {
		this.url = url;
	}
	String getGroupname() {
		return groupname;
	}
	void getGroupname(String groupname) {
		this.groupname = groupname;
	}
	String getMemo() {
		return memo;
	}
	void getMemo(String memo) {
		this.memo = memo;
	}
	

	


	public void print(){
		System.out.println(getName()+","+getTime()+","+getUrl()+","+getGroupname()+","+getMemo());
		
	}
	
}




