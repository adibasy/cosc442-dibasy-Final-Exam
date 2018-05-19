package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/18/18 7:43 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(Tile[][][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		Tile[][][] tiles = new Tile[][][] {};

		World result = new World(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature pet = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.add(pet);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@389148dd
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.x = 1;
		creature.z = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@16d7758d
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.x = 1;
		creature.z = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4cac91ea
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.x = 1;
		creature.z = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@37830e6e
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4fd70b96
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6096dad
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptyLocation_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@57a00db
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@619dcab1
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59a5bdf0
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3c1acd26
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1fa6d18b
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c8d89d3
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5cf66738
		assertTrue(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@68010a1b
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testColor_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2a3747d9
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testColor_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@346d7360
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.depth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@786bdf31
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53ff2413
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3cbd824a
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGlyph_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4bcad398
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGlyph_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@65634ef9
		assertEquals(' ', result);
	}

	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.height();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		Item result = fixture.item(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@e521c63
		assertNotNull(result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.remove(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@252093a5
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@19ec7de
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e8fbef5
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@305fd7cb
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@37a7c3e2
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2e923db5
	}

	/**
	 * Run the void remove(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.remove(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@10253008
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
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
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@28a8fb9
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b5efcb0
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.add(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		int result = fixture.width();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
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
	 * @generatedBy CodePro at 5/18/18 7:43 PM
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
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}