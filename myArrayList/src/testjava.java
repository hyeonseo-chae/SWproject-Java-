
public class testjava {
	public static void main(String[] args) {
		ObjectArrayList arr1 = new ObjectArrayList();
		arr1.add(0, "test0");
		System.out.println(arr1.get(0));
		arr1.add(1, "test0");
		System.out.println(arr1.get(1));
		arr1.add(2, "test00");
		System.out.println(arr1.get(2));
		arr1.add(3, "test0s0");
		System.out.println(arr1.get(3));
		arr1.remove(2);
		System.out.println(arr1.get(2));
	}
}
