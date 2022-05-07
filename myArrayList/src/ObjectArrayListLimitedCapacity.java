public class ObjectArrayListLimitedCapacity<E extends String> {
		Object[] arr =null;
		int capacity = 0;
		int size = 0;
		
		ObjectArrayListLimitedCapacity(int capacity){
			this.capacity = capacity;
			arr = new Object[capacity];
			size = 0;
		}
		
		ObjectArrayListLimitedCapacity(){
			capacity = 1;
			arr = new Object[capacity];
			size = 0;
		}
		

		public int size() {
			return this.size;
		}
		
		public boolean isEmpty() {
			if(size<=0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public Object get(int index) {
			if(this.isEmpty()==true) {
				return null;
			}
			return (E)arr[index];
		}
		
	
		public void add(int index, Object o) {
			for(int i=size-1; i>=index; i--) {
				arr[i] = arr[i-1];
			}
			arr[index]=(E)o;
			size++;
		}
		
		public Object remove(int index) {
			if(this.isEmpty()==false) {
				Object result = arr[index];
				arr[index] = null;
				size--;
				return result;
			}
			else {
				Object result = null;
				return result;
			}
		}
		

}
