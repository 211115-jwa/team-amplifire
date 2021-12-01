package com.revature.data;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.revature.beans.Person;
import com.revature.data.collections.PersonCollection;

// this imports the static methods from Assertions so that
// we can type "assertEquals" rather than "Assertions.assertEquals"
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

//@TestMethodOrder(Alphanumeric.class)
//@TestMethodOrder(OrderAnnotation.class)

public class PersonDAOTest {
	private PersonDAO personDao = new PersonCollection();
	
	@Test
	public void getAll() {
		Set<Person> expectedOutput = new PersonCollection().getAll();
		Set<Person> givenOutput = personDao.getAll();
		assertEquals(expectedOutput, givenOutput);
	}
	
	@Test
	public void addNewPerson() {
		
		Person newPerson = new Person();
		System.out.print(newPerson);
		
		int generatedId = personDao.create(newPerson);
		
		assertNotEquals(0,generatedId);
		}
	//Test team
	@Test
	public void getByIdWhenIDEqualsOne() {
		
		int idInput = 1;
		Person personOutput = personDao.getById(idInput);
		//assertEquals(1, personOutput.getId());
		assertNull(personOutput);
		
		}
	
public void getByIdWhenIDEqualsZiro() {
		
		int idInput = 0;
		
		Person personOutput = personDao.getById(idInput);
		assertEquals(0, personOutput.getId());
		
		}
	
	
	//@Order(1)
	@Test
	public void getByUsernameWhenUsernameExists() {
		// setup
		String usernameInput = "sierra";
		// call the method we're testing
		Person personOutput = personDao.getByUsername(usernameInput);
		// assert that it did what we expected
		assertEquals("sierra", personOutput.getUsername());
	}
	
	//@Order(2)
	@Test
	public void getByUsernameButUsernameDoesNotExist() {
		String usernameInput = "qwertyuiop";
		Person personOutput = personDao.getByUsername(usernameInput);
		assertNull(personOutput); // assertEquals(null, personOutput)
	}
	
	// JUnit tests will be annotated with @Test
	// they are public, void, and have no parameters
	@Test
	public void basicTest() {
		// setup
		StringBuilder input = new StringBuilder("hello");
		// call the method we're testing
		input.reverse();
		// check for the expected behavior
		Assertions.assertEquals("olleh", input.toString());
	}
	
	@Test
	public void basicTest2() {
		// setup
		StringBuilder input = new StringBuilder("hello");
		// call the method we're testing
		String output = input.substring(0,1);
		// check for the expected behavior
		Assertions.assertEquals("h", output);
	}
	
	@BeforeAll // this method will run ONCE before any of our tests run
	public static void setup() {
		System.out.println("this happens before any tests");
	}
	
	@BeforeEach // this method runs before each test
	public void beforeEachTest() {
		System.out.println("this happens before each test");
	}
	
	@AfterEach // this method runs after each test
	public void afterEachTest() {
		System.out.println("this happens after each test");
	}
	
	@AfterAll // this method will run ONCE after all tests have completed
	public static void tearDown() {
		System.out.println("this happens after all the tests have completed");
	}
}
