package hello0603;

public class stack {
    public static final int DEFAULT_STACK_SIZE = 10;
    public static final int ERROR_STACK_FULL = 0;
    public static final int SUCCESS_STACK_INSERT = 1;
    public static final int ERROR_STACK_EMPTY = Integer.MIN_VALUE;
    public static final int ERROR_INVALID_VALUE = Integer.MAX_VALUE;

    private int[]   frame;      //Stack Memory
    private int     size;       //Stack Memory size
    private int     pointer;    //Stack Sequnce Numbers
    private int     count;      //Number of data in to the Stack

    public stack(){
        this(stack.DEFAULT_STACK_SIZE);
    }

    public stack(int _size){
        size = _size;
        frame = new int[size];
        pointer = 0;
        count = 0;
    }


    //get the size
    public int getSize(){
        return size;
    }

    //get the number of data in to stack
    public int getCount(){
        return count;
    }
    
    private boolean isFull(){
        if(size == getCount())
            return true;

        return false;
    }

    private boolean isEmpty(){
        if(0 == getCount())
            return true; 
            
        return false;
    }

    //push the date in to stack
    public int push(int _data){
        if(isFull())
            return ERROR_STACK_FULL;
        
        if(_data == ERROR_STACK_EMPTY || _data == ERROR_INVALID_VALUE)
            return ERROR_INVALID_VALUE;

        frame[pointer] = _data;
        pointer++;
        count++;
        return SUCCESS_STACK_INSERT;
    }

    public int pop(){
        int result = 0;

        if(isEmpty())
            return ERROR_STACK_EMPTY;
            
        pointer--;
        count--;
        result =frame[pointer];

        return result;
    }
}
