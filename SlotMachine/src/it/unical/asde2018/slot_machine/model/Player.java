package it.unical.asde2018.slot_machine.model;

public class Player
{
	private int saldo = 200;
	private String nome;

	public Player(int saldo, String nome)
	{
		super();
		this.saldo = saldo;
		this.nome = nome;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

}
