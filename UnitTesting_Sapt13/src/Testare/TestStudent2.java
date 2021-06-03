package Testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Testare_modele.Student;
import Testare_modele.Exceptii.ExceptieVarsta;

public class TestStudent2 {

	//test fixture
	static Student student;
	static ArrayList<Integer> noteInitiale=new ArrayList<>();
	static String numeInitial;
	static int varsta;
	static int nrNoteInitiale;
	
	@BeforeClass
	//se executa o singura data
	public static void setUpBeforeClass() throws Exception {
		numeInitial="gigel";
		varsta=Student.MIN_VARSTA +1;
		nrNoteInitiale=3;
	   for(int i=0;i<nrNoteInitiale;i++) {
		   noteInitiale.add(Student.MAX_NOTA-i);
	   }
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	//inainte de fiecare test
	public void setUp() throws Exception {
		student=new Student(numeInitial,varsta,noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
	}

	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinValue() throws ExceptieVarsta{
		int varstaNoua = Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	@Test(expected = ExceptieVarsta.class)
	public void testeSetVarstaRangeValoarePozitivaMare()  throws ExceptieVarsta{
		int varstaNoua = 200;
		student.setVarsta(varstaNoua);
	}

	//boundary il limitam la partea de limite right
	//testam ultimele valori corecte 
	@Test
	public void testSetVarstaBoundaryLimitaInferioara()throws ExceptieVarsta {
		int varstaNoua=Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("test pt varsta minima",varstaNoua,varstaStudent);
	}
	@Test
	public void testSetVarstaBoundaryLimitaSuperioara()throws ExceptieVarsta {
		int varstaNoua=Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("test pt varsta maxima",varstaNoua,varstaStudent);
	}
	
	
}
