public class RecordStack {
	private Record[] data;
	private int top;
	
	public RecordStack(){
		data = new Record[100];
		top = -1;
	}
	public void push(Record r){
		if (top < data.length-1){
		data[top+1]=r;
		top++;
		}
		else System.out.println("Inventory is full!");
		
	}
	public void pop(){
		if (!isEmpty())
		top--;
		
	}
	public boolean isEmpty(){
		return false;
		
	}
	public int size(){
		return top;
		
	}
	public String toString(){
		return null;
		
	}
	

}
