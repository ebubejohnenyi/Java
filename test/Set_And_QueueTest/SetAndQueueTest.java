package Set_And_QueueTest;

import Set_And_Queue.SetAndQueue;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetAndQueueTest {
    SetAndQueue setAndQueue = new SetAndQueue();
    @Test public void testI_canQueue_IsEnmpty(){
        assertEquals(true, setAndQueue.isEmpty());
    }
    @Test public void testI_CanSet_InQueue(){
        setAndQueue.isEmpty();
        setAndQueue.set(0,"Ebube");
        assertEquals("[Ebube, null, null, null, null]", setAndQueue.getSet());
    }
    @Test public void testI_CanRemove_FromQueue(){
        setAndQueue.isEmpty();
        setAndQueue.set(0,"Ebube");
        setAndQueue.set(1,"John");
        setAndQueue.set(2,"Paul");
        setAndQueue.set(3,"Peter");
        setAndQueue.set(4,"Rachael");
        setAndQueue.remove(1);
        assertEquals("[Ebube, null, Paul, Peter, Rachael]", setAndQueue.getSet());
    }
    @Test public void test_iCanQueue(){
        setAndQueue.isEmpty();
        setAndQueue.set(0,"Ebube");
        setAndQueue.set(1,"John");
        setAndQueue.set(2,"Paul");
        setAndQueue.set(3,"Peter");
        setAndQueue.set(4,"Rachael");
        setAndQueue.queue(0);
        assertEquals("[John, Paul, Peter, Rachael, null]", setAndQueue.getSet());
    }
}
