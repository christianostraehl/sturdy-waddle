package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
    public void testFiveAndFiveGivesExam()
    {
        String expected = "Em Exame";
		String actual = Medias.calcular(5.0, 5.0);
		assertEquals(expected, actual);
    }
	
	@Test
    public void testSevenAndSevenGivesAproved()
    {
        String expected = "Aprovado";
		String actual = Medias.calcular(7.0, 7.0);
		assertEquals(expected, actual);
    }
	
	@Test
    public void testThreeAndThreeGivesRep()
    {
        String expected = "Reprovado";
		String actual = Medias.calcular(3.99, 3.99);
		assertEquals(expected, actual);
    }
	
	@Test
    public void testThree99AndFour01GivesAproved()
    {
        String expected = "Em Exame";
		String actual = Medias.calcular(3.99, 4.01);
		assertEquals(expected, actual);
    }
}
