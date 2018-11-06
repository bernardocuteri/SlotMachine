package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import it.unical.asde2018.slot_machine.model.Credentials;

@Service
public class LoginService{
    public Set<Credentials> usersCredentials = new HashSet<>();

    public boolean checkLogin(String inputName,String inputPassword){
        for (Credentials credentials : usersCredentials) {
            if (credentials.getUsername().equals(inputName) && credentials.getPassword().equals(inputPassword))
                return true;
        }
        return false;
    }

    @PostConstruct
    public void init(){
        usersCredentials.add(new Credentials("giovanni", "brunetti"));
        usersCredentials.add(new Credentials("bernardo", "cuteri"));
        usersCredentials.add(new Credentials("andrea", "baffa"));
        usersCredentials.add(new Credentials("vic", "straface"));
        usersCredentials.add(new Credentials("pasquale", "arieta"));
    }
}
