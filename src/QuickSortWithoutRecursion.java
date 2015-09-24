import java.util.Stack;

public class QuickSortWithoutRecursion {

    public void sort(int[] array, int lower, int upper) {
    	
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(lower);
        stack.push(upper);
        int start, end, x, i, j, tmp;
        while (!stack.empty()) {
        	end = stack.pop();
        	start = stack.pop();
        	x = array[end];
        	i = start -1;
        	for(j = start; j<end; j++) {
        		if(array[j]<x) {
        			i++;
        			tmp = array[i];
        			array[i] = array[j];
        			array[j] = tmp;
        		}
        	}
			tmp = array[i+1];
			array[i+1] = array[end];
			array[j] = tmp;
			if(start<i) {
				stack.push(start);
				stack.push(i);
			}
			if(i+2<end) {
				stack.push(i+2);
				stack.push(end);
			}
        }
        
    }
	
}
