/**@author eduardo.rodrigues1@snhu.edu
 * 
 */
package test.mobile;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import app.mobile.Appointment;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.NullSource;
//import app.mobile.Appointment;
/**
 * @author eduardo.rodrigues1@snhu.edu
 */
@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AppointmentTest {
		final String character_11_long = "Charmanders";
		final String character_51_long = "One morning, when Gregor Samsa woke from troubled d";
		static Date pasd;
		static Date futd;
		@BeforeAll
		static void setUpBeforeClass() throws Exception {
			Calendar c_pas = Calendar.getInstance();
			c_pas.setTime(new Date()); // Now use today date.
			c_pas.add(Calendar.DATE, -15); //  15 days in past
			pasd = c_pas.getTime();
			
			Calendar c_fut = Calendar.getInstance();
			c_fut.setTime(new Date()); // Now use today date.
			c_fut.add(Calendar.DATE, 15); //  15 days in future
			futd = c_fut.getTime();

		}
		
		/**
		 * Test methods for {@link app.mobile.Appointment#Appointment(java.lang.String, java.Util.Date, java.lang.String)}.
		 *<p>
		 *Tests that null parameters, passed to the constructor,throw an exception.
		 */
		@Nested
		class constructor_parameters_null {	
		//@ParameterizedTest
		//@NullSource
		@DisplayName(value = "Fails if null id doesn't throw")
        void id_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment(null_m, futd, "test");
        	});
        	}
		
		//@ParameterizedTest
		//@NullSource
		@DisplayName(value = "Fails if null Date doesn't throw")
        void name_null_constructor(Date null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment("test", null_m,"test");
        	});
        	}
		
		//@ParameterizedTest
		//@NullSource
		@DisplayName(value = "Fails if null Description doesn't throw")
        void description_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment("test", futd,null_m);
        	});
        	}
		}
		
		/**
		 * Test methods for {@link app.mobile.Appointment#Contact(java.lang.String, java.Util.Date, java.lang.String)}.
		 *<p>
		 *Tests that parameters, whose character lengths are too long, are throwing an exception.
		 */
		@Nested
		class constructor_parameters_too_long {
			
 		@Test
 		@DisplayName(value = "Fails if id > 10 characters long doesn't throw.")
 		void id_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment(character_11_long, futd,"test");
        	});
        	}
 		
 		@Test
 		@DisplayName(value = "Fails if Description > 50 characters long doesn't throw.")
 		void description_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment("test", futd,character_51_long);
        	});
        	}
		}
		
		/**
		 * Test methods for {@link app.mobile.Appointment#Contact(java.lang.String, java.Util.Date, java.lang.String)}.
		 *<p>
		 *Tests that parameters, whose character lengths are too long, are throwing an exception.
		 */
		@Nested
		class constructor_Date_before {
			
 		@Test
 		@DisplayName(value = "Fails if date before")
 		void id_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Appointment("test", pasd,"test");
        	});
        	}
 		
		}
}//EOF contactTest