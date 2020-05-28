package nl.papendorp.tdd.examples.anemic.service;

import nl.papendorp.tdd.examples.anemic.domain.User;

public interface UserRepository
{
	User findByAlias( String alias );
}
