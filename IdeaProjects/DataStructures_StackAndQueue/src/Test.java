public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(6);
        stack.push(3);
        stack.push(8);
        stack.push(5);
        System.out.println("Stack size: " + stack.getStackSize());
        System.out.println("Stack elements: ");
        stack.printStack();
        System.out.println("Sorting stack: ");
        stack.sortStack();
        stack.printStack();

        ArrayStack<Integer> stack2 = new ArrayStack<>();
        stack2.push(1);
        stack2.push(0);
        stack2.push(1);
        stack2.push(2);
        stack2.push(1);
        stack2.push(3);

        System.out.println("Stack 2 elements: ");
        stack2.printStack();
        System.out.println("Copying stack to stack2: ");
        stack.copyStack(stack2);
        System.out.println("Stack elements: ");
        stack.printStack();
        System.out.println("Stack 2 elements: ");
        stack2.printStack();

        ArrayStack<Integer> stack3 = new ArrayStack<>();
        stack3.push(1);
        stack3.push(1);
        stack3.push(1);
        stack3.push(1);
        stack3.push(0);
        stack3.push(0);

        ArrayStack<Integer> stack4 = new ArrayStack<>();
        stack4.push(1);
        stack4.push(1);
        stack4.push(1);
        stack4.push(1);
        System.out.println("Printing the number with the biggest value: ");
        ArrayStack.printBiggestBinary(stack3, stack4);

        System.out.println("Move 3rd element to the top: ");
        stack.printStack();
        stack.moveToTheTop(3);
        stack.printStack();

        System.out.print("123 in Hex = ");
        ArrayStack.convertToHex(123);

        ListQueue<Integer> queue = new ListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println();

        System.out.println("Queue elements: ");
        queue.printQueue();
        System.out.println("Reversing queue: ");
        queue.reverseQueue();
        queue.printQueue();




    }
}