package com.mycompany.cs1102;

import static com.mycompany.cs1102.MultipleChoiceQuestion.showresult;

/**
 *
 * @author ezekiel
 */
public class Quiz {
    public static void main(String [] args) {
    MultipleChoiceQuestion question, Question,plants,sports,family ; 
    question = new MultipleChoiceQuestion ("which is not a country","tuvalu",
    "mongolia","austra","finland","virginia","e");
    Question =new MultipleChoiceQuestion (
        "How many Planets is in our solar system",
        "we have 20 planet in our solar system",
        "we have 10 planets in our solar system",
        " we have 9 planets in our solar system",
        "we have 8 planets in our solar system ",
        "none of the above",
         "d"                );
    plants = new MultipleChoiceQuestion (
            "which one of these is not a flower",
            "potato ",
            " queen of the night",
            " hibiscus ",
            " sunflower ",
            " none of the above",
            "a"
                            );
    sports = new MultipleChoiceQuestion (
        "which of these is played with a rack",
        " football",
        " handball",
        " volley ball",
        " basketball ",
        " none of the above", 
        "c"
                 );
    family = new MultipleChoiceQuestion(
        "which of these does not belong to the extended family ",
        " parents",
        " uncles",
        " all is included ",
        " grandparents ",
        " none of the above", 
        "c" 
    );
        
        question.Check();
        Question.Check();
        plants.Check();
        sports.Check();
        family.Check();
        showresult();
           }
    }
