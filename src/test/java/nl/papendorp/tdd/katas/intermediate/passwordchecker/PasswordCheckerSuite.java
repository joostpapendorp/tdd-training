package nl.papendorp.tdd.katas.intermediate.passwordchecker;

import org.junit.jupiter.api.DisplayName;

@DisplayName( "The password checker" )
public class PasswordCheckerSuite
{
	/*
	 * Write a checker that validates input Strings to be either valid or invalid to use as a password.
	 * A valid password should be of sufficient strength, thus it should:
	 * - be at least 8 characters long
	 * - contain at least one of the characters from 0 up to including 9
	 * - contain at least one uppercase character
	 * - contain at least one lowercase character
	 * - contain at least one character from the list !@#$%^&*()_+-;:[]{}
	 * - be safe to persist, so no escape characters may be present "'\/~`
	 * - not contain whitespace (\n \t and spaces)
	 * Example of a valid password
	 * abAB12!@
	 */
}
