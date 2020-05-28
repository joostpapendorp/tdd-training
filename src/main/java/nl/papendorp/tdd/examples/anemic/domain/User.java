package nl.papendorp.tdd.examples.anemic.domain;

public class User
{
	private Name userName;
	private Login login;


	public Name getUserName()
	{
		return userName;
	}

	public void setUserName( Name userName )
	{
		this.userName = userName;
	}

	public Login getLogin()
	{
		return login;
	}

	public void setLogin( Login login )
	{
		this.login = login;
	}
}
