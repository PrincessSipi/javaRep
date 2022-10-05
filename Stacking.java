class Stacking{
	private int arr[];
	private int top;
	private int capacity;

	// creating a stack
	Stacking(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// add elements into stack
	public void push(int x){
		if(isFull()){
			System.out.println("Overflow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Inserting "+ x);
		arr[++top] = x;
	}

	// remove element from stack
	public int pop(){
		if(isEmpty()){
			System.out.println("STACK IS EMPTY");
			System.exit(1);
		}
		return arr[top--];	
	}
	
	// utility function to return the size of the stack
	public int size(){
		return top + 1;
	}
	
	// check if stack is empty
	public Boolean isEmpty(){
		return top == -1;
	}

	// check if stack is full
	public Boolean isFull(){
		return top == capacity - 1;
	}

	public void printStack(){
		for(int i = 0; i <= top; i++){
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args){

		Stacking stack = new Stacking(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.pop();
		System.out.println("\n After popping out");
		stack.printStack();
	}
}