package nl.papendorp.tdd.exercises.yellowpages;

import java.util.SortedSet;

public interface YellowSearch
{
	SortedSet< Professional > findProfessionals( String profession, String location );
}
