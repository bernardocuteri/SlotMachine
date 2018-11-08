package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.model.Credential;

@Service
public class LoginService {

	private Map<String,Credential> credentials;
	
	@PostConstruct
	public void init()
	{
		Credential credentialExample=new Credential("ciccio", "ciccio");
		
		credentials=new HashMap<>();
		
		credentials.put(credentialExample.getUsername(),credentialExample);
	}
	
	public boolean checkCredential(String username,String password)
	{
		return credentials.get(username).checkCredential(username, password);
		
			
		
	}
	
}
