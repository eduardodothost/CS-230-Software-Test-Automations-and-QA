/**@author eduardo.rodrigues1@snhu.edu
 * 
 */
package test.mobile;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import app.mobile.Task;


@SuppressWarnings("unused")
@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TaskTest {
	
		final String character_21_long = "The quick, brown fox.";
		final String character_51_long = "One morning, when Gregor Samsa woke from troubled d";
		static Task test = new Task("test","test","test");
		
		/**
		 * Test methods for {@link app.mobile.Task#Contact(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
		 *<p>
		 *Tests that null parameters, passed to the constructor,throw an exception.
		 */
		@Nested
		class constructor_parameters_null {
			
		
		@DisplayName(value = "Fails if null id doesn't throw")
        void id_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task(null_m, "test","test");
        	});
        	}
		
		@DisplayName(value = "Fails if null firstName doesn't throw")
        void name_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task("test", null_m,"test");
        	});
        	}
		

		@DisplayName(value = "Fails if null address doesn't throw")
        void description_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task("test", "test",null_m);
        	});
        	}
		}
		
		/**
		 * Test methods for {@link app.mobile.Task#Contact(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
		 *<p>
		 *Tests that parameters, whose character lengths are too long, are throwing an exception.
		 */
		@Nested
		class constructor_parameters_too_long {
			
 		@Test
 		@DisplayName(value = "Fails if id > 10 characters long doesn't throw.")
 		void id_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task(character_21_long, "test","test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if firstName > 10 characters long doesn't throw.")
 		void name_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task("test", character_21_long,"test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if address > 30 characters long doesn't throw.")
 		void description_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Task("test", "test",character_51_long);
        	});
        	}
		}
		
		/**
		 * Test methods for :
		 * {@link app.mobile.Task#setname(String)}
		 * {@link app.mobile.Task#setlastName(String)}
		 * {@link app.mobile.Task#setphone(String)}
		 * {@link app.mobile.Task#setdescription(String)}
		 *<p>
		 *Tests for thrown exceptions due to null or erroneously long parameters.
		 */
		@Nested
		class setter_parameters_null {

			@DisplayName(value = "Fails if null mod passed to setfirstName doesn't throw.")
	        void mod_null_setname(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setname(null_m);
	        	});
			}

			@DisplayName(value = "Fails if null mod passed to setaddress doesn't throw.")
	        void mod_null_description(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setdescription(null_m);
	        		
	        	});
			}
	 	}
		
		
		
		@Nested
		class setter_parameters_too_long{
			
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setfirstName.")
	 		void mod_len_name() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setname(character_21_long);
	        	});
	        }
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setaddress.")
	 		void mod_len_description() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setdescription(character_51_long);
	        	});
	        }
		}
}//EOF contactTest