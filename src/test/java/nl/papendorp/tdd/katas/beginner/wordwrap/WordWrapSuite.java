package nl.papendorp.tdd.katas.beginner.wordwrap;

import org.junit.jupiter.api.DisplayName;

@DisplayName( "Word wrap" )
class WordWrapSuite
{
	/*
	 * Develop a simple algorithm to split a text to fit the page margins.
	 *
	 * If the length of a text exceeds the page margin width, it should be broken up into a list of sentences using the
	 * following rules:
	 *
	 * - if the text contains whitespace then the text should be spit at the last occurrence below or at the margin width.
	 * The whitespace at which location the text is split should not be present in the output
	 * E.g.:
	 *  split( "foo bar baz", 4 ) --> "foo", "bar", "baz"
	 *  split( "foo bar baz", 7 ) --> "foo bar", "baz"
	 *
	 * - otherwise the text is split at the margin.
	 * E.g. split( "foobarbaz", 3 ) --> "foo", "bar", "baz"
	 *
	 * For this exercise "whitespace" is defined as either tabs or spaces.
	 * Assume input strings do not already contain line endings
	 */
}

