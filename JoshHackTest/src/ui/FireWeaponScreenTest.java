package ui;

import java.awt.Color;
import game.Tile;
import game.Creature;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FireWeaponScreenTest</code> contains tests for the class <code>{@link FireWeaponScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/18 8:08 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class FireWeaponScreenTest {
	/**
	 * Run the FireWeaponScreen(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testFireWeaponScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int sx = 1;
		int sy = 1;

		FireWeaponScreen result = new FireWeaponScreen(player, sx, sy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_2()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.z = 1;
		creature.x = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_3()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.z = 1;
		creature.x = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testIsAcceptable_4()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.z = 1;
		creature.x = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 8:08 PM
	 */
	@Test
	public void testSelectWorldCoordinate_2()
		throws Exception {
		FireWeaponScreen fixture = new FireWeaponScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		fixture.player = creature;
		fixture.caption = "";
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

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
		new org.junit.runner.JUnitCore().run(FireWeaponScreenTest.class);
	}
}