
public class stack {
	private int [] arr ;
	private int top ;
	
	public stack()
	{
		arr = new int [5];
		top = -1;
	}
	public stack(int size)
	{
		arr = new int[size];
		top=-1;
	}
	
	public void push(int value)
	{
		if(top+1 < arr.length)
		{
			++top;
			arr[top]= value;
		}
		else 
		{
			System.out.println("Stack Overflow !!");
		}
	}
	
	public int pop() 
	{
		if(top > -1)
		{
			int value = arr[top];
			--top;
			return value ;
		}
		else {
			System.out.println("Stack Underflow!!");
			return -1;
		}
	}
	
	public String toString()
	{
		String str = "";
		for(int i = top; i>=0; --i)
		{
			str = str+ arr[i]+ ", ";
		}
		return str;
	}
	
	
	
    public static void main(String[] args) {
        // Create a stack with a default size of 5
        stack myStack = new stack();

        // Push some values onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Print the stack
        System.out.println("Stack: " + myStack);

        // Pop values from the stack
        int poppedValue1 = myStack.pop();
        int poppedValue2 = myStack.pop();

        // Print the popped values
        System.out.println("Popped values: " + poppedValue1 + ", " + poppedValue2);

        // Print the updated stack
        System.out.println("Updated Stack: " + myStack);
    }

}


