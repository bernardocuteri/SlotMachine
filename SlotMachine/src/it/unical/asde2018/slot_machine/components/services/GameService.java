package it.unical.asde2018.slot_machine.components.services;

import it.unical.asde2018.slot_machine.components.models.Bet;
import it.unical.asde2018.slot_machine.components.models.Quiz;
import it.unical.asde2018.slot_machine.components.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Service
public class GameService {

    public Quiz generateQuiz() {
        int firstNumber = this.getRandomNumberInRange(0, 2);
        int secondNumber = this.getRandomNumberInRange(0, 2);
        int thirdNumber = this.getRandomNumberInRange(0, 2);


        return new Quiz(firstNumber, secondNumber, thirdNumber);
    }

    public boolean solveQuiz(Quiz quiz) {
        return quiz.getFirstNumber() == quiz.getSecondNumber() && quiz.getFirstNumber() == quiz.getThirdNumber();
    }

    private int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
