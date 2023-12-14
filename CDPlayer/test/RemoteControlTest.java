/** Generated by itemis CREATE code generator. */

package test;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import .CDPlayer.CD;
import org.junit.*;
import static org.junit.Assert.*;
import CDPlayer;
import CDPlayer.State;
import com.yakindu.core.VirtualTimer;
import com.yakindu.core.VirtualTimer.VirtualTimeTask;
import com.yakindu.core.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for CDPlayer
 */
@SuppressWarnings("all")
public class RemoteControlTest {
	CD.OperationCallback cDMock;
	
	private CDPlayer statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void remoteControlTest_setUp() {
		statemachine = new CDPlayer();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		statemachine.setTimerService(timer);
		cDMock = mock(CD.OperationCallback.class);
		statemachine.cD().setOperationCallback(cDMock);
		
		
	}

	@After
	public void remoteControlTest_tearDown() {
		statemachine.cD().setOperationCallback(null);
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void testInitialStateConfiguration() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_OFF));
	}
	
	@Test
	public void testOnOff() {
		statemachine.enter();
		statemachine.raiseOnOff();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_ON));
		statemachine.raiseOnOff();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_OFF));
	}
	
	@Test
	public void testPlayPause() {
		statemachine.enter();
		statemachine.raiseOnOff();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_ON));
		statemachine.raisePlayPause();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_ON));
		statemachine.raiseStop();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(CDPlayer.State.REMOTECONTROL_ON));
	}
}
