public class ObjectArrayList extends ObjectArrayListLimitedCapacity<String>{
	
	public void add(int index, Object o) {
        if(size>=capacity) {
        	capacity = (capacity * 2);
			Object[] temp = new Object[capacity];
			for(int i=0;i<arr.length;i++) {
				temp[i] = arr[i];
			}
			arr = temp;
        }
		
	super.add(index, o);
	}

}