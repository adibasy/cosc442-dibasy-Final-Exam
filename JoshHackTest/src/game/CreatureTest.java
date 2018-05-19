package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 5/18/18 7:43 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class CreatureTest {
	/**
	 * Run the Creature(World,char,Color,String,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World world = new World(new Tile[][][] {});
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		int maxHp = 1;
		int attack = 1;
		int defense = 1;

		Creature result = new Creature(world, glyph, color, name, maxHp, attack, defense);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2d42b66e
		assertNotNull(result);
	}

	/**
	 * Run the Item armor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		Item result = fixture.armor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@64a7edc9
		assertNotNull(result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testAttackValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanEnter_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b0b69dd
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanEnter_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4dc0b08e
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanEnter_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@672d9ad4
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2a8fcb2e
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@516a1b0f
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@72bac4e3
		assertTrue(result);
	}

	/**
	 * Run the String causeOfDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testCauseOfDeath_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		String result = fixture.causeOfDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6d22177c
		assertNotNull(result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		Color result = fixture.color();

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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53ba15ca
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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3b19995e
		assertNotNull(result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDefenseValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		String result = fixture.details();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5671239a
		assertNotNull(result);
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@315ed89a
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@60192783
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7580b2cd
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 0, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2d3c131c
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4683c6b5
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@474a81
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDoAction_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@58946ef8
	}

	/**
	 * Run the void drop(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testDrop_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");

		fixture.drop(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f91657c
	}

	/**
	 * Run the List<Effect> effects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testEffects_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		List<Effect> result = fixture.effects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2843ee66
		assertNotNull(result);
	}

	/**
	 * Run the int food() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.food();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@64f261ac
		assertEquals(0, result);
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGainXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1f4d20f8
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGainXp_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@30472ca6
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		char result = fixture.glyph();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(' ', result);
	}

	/**
	 * Run the int hp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.hp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Inventory inventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		Inventory result = fixture.inventory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testIsPlayer_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@171dc494
		assertTrue(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testIsPlayer_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@13f3a08d
		assertTrue(result);
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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@173724ec
		assertNotNull(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5e262e1e
		assertNotNull(result);
	}

	/**
	 * Run the int level() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testLevel_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.level();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5dcf589d
		assertEquals(0, result);
	}

	/**
	 * Run the int mana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.mana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@17a168e5
		assertEquals(0, result);
	}

	/**
	 * Run the int maxFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMaxFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.maxFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59e5886e
		assertEquals(0, result);
	}

	/**
	 * Run the int maxHp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.maxHp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int maxMana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.maxMana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6cd9b34e
		assertEquals(0, result);
	}

	/**
	 * Run the void meleeAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMeleeAttack_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.meleeAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@699ab156
	}

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyAttackValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyDefenseValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDetectCreatures(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyDetectCreatures_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyDetectCreatures(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@65fbb25e
	}

	/**
	 * Run the void modifyFood(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyFood(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b77269e
	}

	/**
	 * Run the void modifyMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3c259318
	}

	/**
	 * Run the void modifyMaxHp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMaxHp(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyMaxMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyMaxMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@24dfb3f6
	}

	/**
	 * Run the void modifyRegenHpPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyRegenHpPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyRegenHpPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e4e2efc
	}

	/**
	 * Run the void modifyRegenManaPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyRegenManaPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int amount = 1;

		fixture.modifyRegenManaPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5982ab38
	}

	/**
	 * Run the void modifyVisionRadius(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testModifyVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int value = 1;

		fixture.modifyVisionRadius(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMoveBy_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int mx = 0;
		int my = 0;
		int mz = 1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5fe10c56
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMoveBy_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int mx = 1;
		int my = 1;
		int mz = 2;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@65dae1f3
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testMoveBy_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int mx = 0;
		int my = 1;
		int mz = -1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4309194e
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String nameOf(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testNameOf_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.nameOf(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b13088
		assertNotNull(result);
	}

	/**
	 * Run the void notify(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testNotify_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		String message = "";

		fixture.notify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@656972ce
	}

	/**
	 * Run the Tile realTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testRealTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.realTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@15a32ac7
		assertNotNull(result);
	}

	/**
	 * Run the void setCreatureAi(CreatureAi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testSetCreatureAi_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		CreatureAi ai = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.setCreatureAi(ai);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void summon(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testSummon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.summon(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25f51167
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@189b31c6
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7aac7b2c
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@73e528c2
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4d8c728a
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f41c89e
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2ce89dd6
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7eb8992
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_8()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1e166a11
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_9()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@754ca44
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_10()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3162a06d
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_11()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f0fe146
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testThrowItem_12()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@24133527
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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7829199c
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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@64020957
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
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1208df0f
	}

	/**
	 * Run the int visionRadius() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.visionRadius();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item weapon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		Item result = fixture.weapon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@649d3876
		assertNotNull(result);
	}

	/**
	 * Run the int xp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 7:43 PM
	 */
	@Test
	public void testXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.modifyHp(1, "");
		fixture.z = 1;
		fixture.y = 1;
		fixture.x = 1;

		int result = fixture.xp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7727be8c
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
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}