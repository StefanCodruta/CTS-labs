package Testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.graalvm.compiler.nodes.java.AbstractNewArrayNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import Testare_modele.Student;
import Testare_modele.Exceptii.ExceptieNume;
import Testare_modele.Exceptii.ExceptieVarsta;

public class TestStudent {

	//test fixture
	//setul de date de care avem nevoie la nivelul unui testcase
	
	static Student student;
	static ArrayList<Integer> note;
	static int varstaInitiala = 21;
	static String numeInitial = "gigel";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		 note = new ArrayList<>();
		note.add(9);
		note.add(7);
		note.add(5);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note=null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student("gigel", 21, note);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVarsta_conformanceRight_valoriCorecte() throws ExceptieVarsta {

		// ce inseamna testarea unui setter --- in cond de right --
		// aleg o noua varsta si ma asigur ca e corecta

		int varstaNoua = 23;
		student.setVarsta(varstaNoua);
		assertEquals("test cu valori corect", varstaNoua, student.getVarsta());

	}

	@Test
	public void testSetNumeRight() {
		String numeNou = "Ana";
		try {
			student.setNume(numeNou);
			assertEquals("test cu valori corecte",numeNou,student.getNume());
		} catch (ExceptieNume e) {	
			fail("genereaza exceptie pentru valori corecte");
		}
	}
	
	@Test
	public void testSetVarstaErrorCondition()  {
		int varstaNoua= Student.MIN_VARSTA*-1;
		try {
			student.setVarsta(varstaNoua);
			fail("nu genereaza exceptie pentru varst in afara limitelor ");
		} catch (ExceptieVarsta e) {
			
			assertTrue(true);
		}
	}
	@Test(expected=ExceptieNume.class)
	public void testSetErrorCondition() throws ExceptieNume {
		
		String numeNou="eu";
		student.setNume(numeNou);
	}

}
