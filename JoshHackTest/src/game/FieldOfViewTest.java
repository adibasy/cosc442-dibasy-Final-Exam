package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FieldOfViewTest</code> contains tests for the class <code>{@link FieldOfView}</code>.
 *
 * @generatedBy CodePro at 5/18/18 7:44 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class FieldOfViewTest {
	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testFieldOfView_1()
		throws Exception {
		World world = new World(new Tile[][][] {});

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_3()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = -1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_4()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = -1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_5()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_6()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testIsVisible_7()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/18 7:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FieldOfViewTest.class);
	}
}