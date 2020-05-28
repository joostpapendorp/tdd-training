package nl.papendorp.tdd.exercises.yellowpages;

import java.util.Set;

public interface YellowParser
{
	Set< String > normalizeQuery( String query );
}