// Version: 20201021

import java.io.*;
import java.util.*;
public class ReversePolishCalculator {
    private Stack<Integer> s = new Stack<>();
    
    public void push(int n) {
        s.push(n);
    }

    public void plus() {
        int x = s.pop();
        int y = s.pop();
        push(y+x);
    }

    public void minus() {
        int x = s.pop();
        int y = s.pop();
        push(y-x);
    }

    public void times() {
        int x = s.pop();
        int y = s.pop();
        push(y*x);
    }

    public int read() {
        return s.peek();
    }
}
