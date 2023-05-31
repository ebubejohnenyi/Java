//package StackTest;
//
//import Stack.Mystack;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MystackTest {
//        Mystack stack = new Mystack(5);
//    @Test public void stackExist(){
//        assertNotNull(stack);
//    }
//    @Test public void myNew_Stack_isEmpty(){
//        Mystack stack = new Mystack(5);
//        assertTrue(stack.isEmpty());
//    }
//    @Test public void pushX_stackShould_beEmpty(){
//        stack.push("E-String");
//        assertFalse(stack.i   sEmpty());
//    }
//    @Test public void pushX_popX_stackShould_beEmpty(){
//        stack.push("E-String");
//        stack.pop();
//        assertTrue(stack.isEmpty());
//    }
//    @Test public void pushXAndY_popY_stackShouldNotBeEmpty() {
//        stack.push("G-String");
//        stack.push("E-String");
//        stack.pop();
//        assertFalse(stack.isEmpty());
//    }
//    @Test public void pushX_shouldReturnX_whenPopped(){
//        stack.push("G-String");
//        String popItem = stack.pop();
//        assertEquals("G-String",popItem);
//    }
//}
