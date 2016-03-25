interface IntStack {
	void push(int item); 
	void pop(); 
	void display();
}

class Stack implements IntStack {
	private int a[];
	private int top;
	// allocate and initialize stack
	Stack(int size) {
		a = new int[size];
		top = -1;
	}
	// Push an item onto the stack
	public void push(int item) {
	// if stack is full, allocate a larger stack
		if(top==a.length-1) {
		int temp[] = new int[a.length * 2]; // double size
		for(int i=0; i<a.length; i++) temp[i] = a[i];
		a = temp;
		a[++top] = item;
		}
		else
		a[++top] = item;
	}
	// Pop an item from the stack
	public void pop() {
	if(top < 0) {
	System.out.println("Stack underflow.");
	}
	else
	System.out.println(a[top--]);
	}
	public void display(){
		if(top<0)
			System.out.println("Stack is Empty");
		else
		{
			System.out.println("the elements in stack are");
			for(int i=0;i<top;i++)
				System.out.println(a[i]);
		}
	}
}

