
import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void testCPU(){
		Player cpu = new Player ();
		
		/**
		 * These tests check that CPU name is present and that CPU is not human
		 */
		assertNotNull("CPU name is null",cpu.Name);
		assertFalse("CPU isHuman should be false", cpu.IsHuman);
	}
}
