package ui;

import java.awt.Color;
import game.Tile;
import game.Creature;
import game.Item;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EquipScreenTest</code> contains tests for the class <code>{@link EquipScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/18 8:08 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class EquipScreenTest {
	/**
	 * Run the EquipScreen(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testEquipScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		EquipScreen result = new EquipScreen(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		EquipScreen fixture = new EquipScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		String result = fixture.getVerb();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		EquipScreen fixture = new EquipScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_2()
		throws Exception {
		EquipScreen fixture = new EquipScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_3()
		throws Exception {
		EquipScreen fixture = new EquipScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		EquipScreen fixture = new EquipScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
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
	 * @generatedBy CodePro at 5/18/18 8:08 PM
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
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EquipScreenTest.class);
	}
}