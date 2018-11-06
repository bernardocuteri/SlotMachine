package it.unical.asde2018.slot_machine.components.services;

import it.unical.asde2018.slot_machine.components.models.Bet;
import it.unical.asde2018.slot_machine.components.models.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    final static User user1 = new User("user1", "user1", 200);
    final static User user2 = new User("user2", "user2", 200);

    final static List<User> USERS = Arrays.asList(user1, user2);

    public User authenticate(HttpSession session, User user) {
        for (User u : USERS) {
            if (user.getUsername().equals(u.getUsername()) &&
            user.getPassword().equals(u.getPassword())) {
                this.setupAuthenticatedUser(session, u);

                return u;
            }
        }

        return null;
    }

    public User getAuthenticatedUser(HttpSession session) {
        String authenticatedUsername = this.getAuthenticatedUsername(session);

        for (User u : USERS) {
            if (u.getUsername().equals(authenticatedUsername)) {
                this.setupAuthenticatedUser(session, u);

                return u;
            }
        }

        return null;
    }

    public boolean isAuthenticated(HttpSession session) {
        return this.getAuthenticatedUsername(session) != null;
    }

    private String getAuthenticatedUsername(HttpSession session) {
        return session.getAttribute("username").toString();
    }

    private String getUserCoinsKey(User user) {
        return user.getUsername() + ".coins";
    }

    private String getUserWinCountKey(User user) {
        return user.getUsername() + ".winCount";
    }

    private String getUserLoseCountKey(User user) {
        return user.getUsername() + ".loseCount";
    }

    private void setupAuthenticatedUser(HttpSession session, User user) {
        session.setAttribute("username", user.getUsername());

        String coinsKey = this.getUserCoinsKey(user);

        if (session.getAttribute(coinsKey) == null) {
            session.setAttribute(coinsKey, user.getCoins());
        }

        String winCountKey = this.getUserWinCountKey(user);

        Object winCount = session.getAttribute(winCountKey);

        if (winCount == null) {
            session.setAttribute(winCountKey, 0);
        } else {
            user.setWinCount(Integer.valueOf(winCount.toString()));
        }

        String loseCountKey = this.getUserLoseCountKey(user);
        Object loseCount = session.getAttribute(loseCountKey);

        if (loseCount == null) {
            session.setAttribute(loseCountKey, 0);
        } else {
            user.setLoseCount(Integer.valueOf(loseCount.toString()));
        }
    }

    public void updateUserAchievement(HttpSession session, User user, Bet bet, boolean isUserWon) {
        if (isUserWon) {
            user.setWinCount(user.getWinCount() + 1);
            user.setCoins(user.getCoins() + bet.getCoins() * 8);
        } else {
            user.setLoseCount(user.getLoseCount() + 1);
            user.setCoins(user.getCoins() - bet.getCoins());
        }

        session.setAttribute(this.getUserWinCountKey(user), user.getWinCount());
        session.setAttribute(this.getUserLoseCountKey(user), user.getLoseCount());
    }
}
