import java.util.Stack;
public class InfixToPostfix{
  public static String convert(String infix) {
     Stack<character>stack=new Stack<>();
     String Builderpostfix=new StringBuilder();
     for(char ch:infix.toCharArray()) {
         if(Character.isLetterOrDigit(ch) ){
             Postfix.append(ch);
     }else if(ch=='('){
	     stack.push(ch);
     }else if(ch==')'){
          while (stack.peek()!='('){
              postfix.append(stack.pop());
     }
      stack.pop();
}else {
     while(!stack.isEmpty()&& precedence(stack.peek())>=precedence(ch)){
          postfix.append(stack.pop());
     }
      stack.push(ch);
     }
}
while(!Stack.isEmpty()){
   postfix.append(stack.pop());
  }
  return postfix.toString();
}
private static int precedence(char op) {
     switch(op) {
       case '+':
       case '-':
           return 1;
       case '*':
       case '/':
           return 2;
       default:
           return 0;
       }
}
public static void main(String[] args) {
    String infix="a-b*d/e(b+c)";
System.out.println("postfix:"+ convertinfix);
   }
}