package Homework4;


import java.util.ArrayList;


import java.util.Stack;

public class Task4 {
    public static void main(String[] args){
        String a = "(8+10-16)";
        
        char[] inp = a.toCharArray();
        System.out.println(inp);

        ArrayList<String> outputs = new ArrayList<>();
        Stack<String> operation = new Stack<>();

        for (int i = 0; i < inp.length; i++) {
            if (Character.isDigit(inp[i])){
                String out = String.valueOf(inp[i]);
                outputs.add(out);
            }
            else {
                String outSymb = String.valueOf(inp[i]);
                if (outSymb.equals("/")){
                    operation.add(outSymb);}
                if (outSymb.equals(")")){
                    operation.add(outSymb);}
                if (outSymb.equals("+")){
                    operation.add(outSymb);}    
                if (outSymb.equals("-")){
                        outputs.add(operation.pop());
                        operation.add(outSymb);
                    }
                if (outSymb.equals(")")){
                    while (!operation.isEmpty()){
                        if (!operation.pop().equals("(")){
                            outputs.add(operation.pop());
                        }
                    }
                    }
                
            }
        }
        System.out.println(outputs);
        System.out.println(operation);
        
        
        
        }
    }

