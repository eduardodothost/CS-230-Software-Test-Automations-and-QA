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
import app.mobile.Contact;


@SuppressWarnings("unused")
@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ContactTest {
	
		final String character_11_long = "Fletchinder";
		final String character_31_long = "Far far away, behind the wor...";
		final String character_10_long = "Charmander";
		final String character_9_long = "Magikarp";
		final String character_30_long = "Vokalia and Consonantia, there";
		static Contact test = new Contact("test","test","test","test","test");
		
		/**
		 * Test methods for {@link app.mobile.Contact#Contact(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
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
        		new Contact(null_m, "test","test","test","test");
        	});
        	}
		
		// @ParameterizedTest
		// @NullSource
		@DisplayName(value = "Fails if null firstName doesn't throw")
        void firstName_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", null_m,"test","test","test");
        	});
        	}
		
		// @ParameterizedTest
		// @NullSource
		@DisplayName(value = "Fails if null lastName doesn't throw")
        void lastName_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test",null_m,"test","test");
        	});
        	}
		
		// @ParameterizedTest
		// @NullSource
		@DisplayName(value = "Fails if null phone doesn't throw")
        void phone_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test","test",null_m,"test");
        	});
        	}
		
		// @ParameterizedTest
		// @NullSource
		@DisplayName(value = "Fails if null address doesn't throw")
        void address_null_constructor(String null_m) {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test","test","test",null_m);
        	});
        	}
		}
		
		/**
		 * Test methods for {@link app.mobile.Contact#Contact(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
		 *<p>
		 *Tests that parameters, whose character lengths are too long, are throwing an exception.
		 */
		@Nested
		class constructor_parameters_too_long {
			
 		@Test
 		@DisplayName(value = "Fails if id > 10 characters long doesn't throw.")
 		void id_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact(character_11_long, "test","test","test","test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if firstName > 10 characters long doesn't throw.")
 		void firstName_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", character_11_long,"test","test","test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if lastName > 10 characters long doesn't throw.")
 		void lastName_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test",character_11_long,"test","test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if phone > 10 characters long doesn't throw.")
 		void phone_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test","test",character_11_long,"test");
        	});
        	}
 		@Test
 		@DisplayName(value = "Fails if address > 30 characters long doesn't throw.")
 		void address_len_constructor() {
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
        		new Contact("test", "test","test","test",character_31_long);
        	});
        	}
		}
		
		@Nested
		class constructor_parameters_too_short{
			@Test
	 		@DisplayName(value = "Fails if phone < 10 characters long doesn't throw.")
	 		void phone_len_constructor() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		Contact shortPhone = new Contact("test", "test","test",character_9_long,"test");
	        		shortPhone.postContact(shortPhone.getphone());
	        	});
	        	
	        	}
		}
		
		/**
		 * Test methods for :
		 * {@link app.mobile.Contact#setfirstName(String)}
		 * {@link app.mobile.Contact#setlastName(String)}
		 * {@link app.mobile.Contact#setphone(String)}
		 * {@link app.mobile.Contact#setaddress(String)}
		 *<p>
		 *Tests for thrown exceptions due to null or erroneously long parameters.
		 */
		@Nested
		class setter_parameters_null {
			// @ParameterizedTest
			// @NullSource
			@DisplayName(value = "Fails if null mod passed to setfirstName doesn't throw.")
	        void mod_null_setfirstName(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setfirstName(null_m);
	        	});
			}
			// @ParameterizedTest
			// @NullSource
			@DisplayName(value = "Fails if null mod passed to setlastName doesn't throw.")
	        void mod_null_setlastName(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setlastName(null_m);  		
	        	});
			}
			// @ParameterizedTest
			// @NullSource
			@DisplayName(value = "Fails if null mod passed to setphone doesn't throw.")
	        void mod_null_setphone(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setphone(null_m);		
	        	});
			}
			// @ParameterizedTest
			// @NullSource
			@DisplayName(value = "Fails if null mod passed to setaddress doesn't throw.")
	        void mod_null_address(String null_m) {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setaddress(null_m);
	        		
	        	});
			}
	 	}
		
		
		
		@Nested
		class setter_parameters_too_long{
			
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setfirstName.")
	 		void mod_len_firstName() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setfirstName(character_11_long);
	        	});
	        }
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setlastName.")
	 		void mod_len_lastName() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setlastName(character_11_long);
	        	});
	        }
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setphone.")
	 		void mod_len_phone() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setphone(character_11_long);
	        	});
	        }
			
			@Test
	 		@DisplayName(value = "Fails if long mod passed to setaddress.")
	 		void mod_len_address() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setaddress(character_31_long);
	        	});
	        }
		}
		
		@Nested
		class setter_parameters_too_short{
			
			@Test
	 		@DisplayName(value = "Fails if short mod passed to setphone.")
	 		void mod_len_phone() {
	        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        		test.setphone(character_9_long);
	        	});
	        }
		
		}
		// tests id field for access control
		@Nested
		class access_to_id{
			@Test
	 		@DisplayName(value = "Id is private")
	 		void phone_len_constructor() {
				Assertions.assertThrows(IllegalAccessException.class, () -> {
					Field privateField = Contact.class.getDeclaredField("id");
					String idString = (String)privateField.get(test);
	        	});
	        	
	        	
			}
		}
}//EOF contactTest