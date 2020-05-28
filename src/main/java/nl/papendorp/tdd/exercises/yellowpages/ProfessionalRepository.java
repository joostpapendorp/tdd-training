package nl.papendorp.tdd.exercises.yellowpages;

public interface ProfessionalRepository
{
	Iterable< Professional > findBy( String keyword );

	void saveNewUser( String username, Iterable< String > profile );
}
