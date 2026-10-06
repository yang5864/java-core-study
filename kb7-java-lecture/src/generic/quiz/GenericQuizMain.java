package generic.quiz;

import java.io.*;
import java.util.*;

public class GenericQuizMain {
    public static void main(String[] args) {
        GenericQuiz<String> quiz = new GenericQuiz<>();
        String type = quiz.<Integer>quizMethod(10).getClass().getName();
        System.out.println(type);
    }
}
