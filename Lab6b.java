import java.util.*;
public class Lab6b{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<Integer>();
        st.push(23);
        st.push(11);
        st.push(65);
        st.push(77);
        st.push(43);
        st.push(93);
        st.push(99);
        st.push(67);
        st.push(81);
        st.push(31);
        System.out.println("The elements are: ");
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("After remove");
        System.out.println(st);
    }
}