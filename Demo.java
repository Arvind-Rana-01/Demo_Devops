// stack

class Stack{
    int[] stack = new int[5];
    int top = 0;
    
    public int push(int data){
        stack[top++] = data;
        return data;
    }
    
    public void display(){
        for(int i = 0; i< stack.length; i++){
            System.out.print(stack[i] +"->");
        }
        System.out.println("END");
    }
    
    
}
public class Demo
{
    
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();
	}
}
