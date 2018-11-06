package it.unical.asde2018.slot_machine.model;

public class Player {

	private String fullName;
	private Credential credentials;
	private int availableCoins;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String fullName, Credential credentials, int availableCoins) {
		super();
		this.fullName = fullName;
		this.credentials = credentials;
		this.availableCoins = availableCoins;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Credential getCredentials() {
		return credentials;
	}

	public void setCredentials(Credential credentials) {
		this.credentials = credentials;
	}

	public int getAvailableCoins() {
		return availableCoins;
	}

	public void setAvailableCoins(int availableCoins) {
		this.availableCoins = availableCoins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((credentials == null) ? 0 : credentials.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (credentials == null) {
			if (other.credentials != null)
				return false;
		} else if (!credentials.equals(other.credentials))
			return false;
		return true;
	}

}
