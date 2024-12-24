package browsingHistory;

import java.util.Stack;

public class BrowsingHistory {
    Stack<String> past = new Stack<>();
    Stack<String> future = new Stack<>();
    String current;
    public BrowsingHistory(String homePage){
        current =homePage;
    }

    void visit(String url){
        past.push(current);
        current=url;
        future = new Stack<>();
    }

    void backward(int steps){
        while (steps>0 && !past.isEmpty()){
            future.push(current);
            current = past.pop();
            steps--;
        }
    }
    void forward(int steps){
        while (steps>0 && !future.isEmpty()){
            past.push(current);
            current = future.pop();
            steps--;
        }
    }

}
