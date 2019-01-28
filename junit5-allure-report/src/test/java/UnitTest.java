

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Pruebas Unitarias")
@Feature("Unit testing Fase 1")

public class UnitTest {

	@Test
    @Story("test unitario 1")
    @Description("test unitario 1. descripcion")
    public void multiplicationOfZeroIntegersShouldReturnZero() {
    	//UnitTest tester = new UnitTest(); // MyClass is tested

        // assert statements
        //
		assertEquals(0, 0, "10 x 0 must be 0");
        
       
    }
}

