package datatype;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.LongAdder;

import org.junit.Test;

public class EventBusBridgeTest {

	@Test
	public void testLongsCount() {
	    LongAdder counter = new LongAdder();
	    Random r = new Random();
	    long size = 0;
	    for (int reps = 0; reps < 10; ++reps) {
	        counter.reset();
	        r.longs(size).forEach(x -> {
	            counter.increment();
	        });
	        System.out.println(counter.sum() +" , "+ size);
	        size += 524959;
	    }
	}
	
}
