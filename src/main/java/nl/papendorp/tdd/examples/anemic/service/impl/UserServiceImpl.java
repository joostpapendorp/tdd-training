package nl.papendorp.tdd.examples.anemic.service.impl;

import nl.papendorp.tdd.examples.anemic.domain.User;
import nl.papendorp.tdd.examples.anemic.service.UserRepository;
import nl.papendorp.tdd.examples.anemic.service.UserService;

/**
 * this unit clearly violates the law of Demeter, as well as the SOLID principles. Refactor all the classes of this
 * unit such that it conforms to both
 */
public class UserServiceImpl implements UserService
{
	private final UserRepository userRepository;

	public UserServiceImpl( UserRepository userRepository )
	{
		this.userRepository = userRepository;
	}

	@Override
	public boolean login( String alias, String password )
	{
		User user = userRepository.findByAlias( alias );

		if( user != null )
		{
			if( user.getLogin().getPassword().equals( password ) )
			{
				System.out.println( String.format( "Welcome, %s %s!", user.getUserName().getFirst(), user.getUserName().getLast() ) );
				return true;
			}
			else
			{
				System.out.println( "Invalid user name or password for " + user.getLogin().getUserName() );
				return false;
			}
		}
		else
		{
			System.out.println( "Invalid user name or password for " + alias );
			return false;
		}
	}
}
