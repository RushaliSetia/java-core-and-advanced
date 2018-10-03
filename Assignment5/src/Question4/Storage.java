package Question4;

public class Storage implements Runnable {
	
	int arr[]=new int[10];
	static int counter=0;
	public Storage() {
		
	}
	
	public Storage(int i) {
		this.arr[counter++]=i;
	}

	public int[] getArr() {
		return arr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}//end class
