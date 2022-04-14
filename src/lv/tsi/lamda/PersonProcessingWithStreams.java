package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;


public class PersonProcessingWithStreams {
        public static void main(String[] args) {
            List<PersonProcessingWithStreams> person = new ArrayList<>();
            person.add(new Person("Max",28));
            person.add(new Person("Peter",22));
            person.add(new Person("Anna",28));
            person.add(new Person("Lilianna",16));
            person.add(new Person("Pamela",13));
            person.add(new Person("David",22));

            PersonEvaluator personEvaluator = new Person(person);

            personEvaluator.findAndPrint();
            System.out.println("\n" + "names starting from “P”: ");

            personEvaluator.groupAndPrint();
            System.out.println("\n" + "names of people older than 18 years: ");

            personEvaluator.getAverageAge();
            System.out.println("\n" + "group of age: ");



        }
}
