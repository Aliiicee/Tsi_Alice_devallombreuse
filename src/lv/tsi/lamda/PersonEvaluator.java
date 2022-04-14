package lv.tsi.lamda;

import java.util.ArrayList;



public class PersonEvaluator {

        ArrayList<Person> persons = new ArrayList<>();

        public PersonEvaluator(ArrayList<Person> persons) {
            this.persons = persons;
        }
    void findAndPrint(){
        System.out.println("\n names starting from “P”:");
        Person.stream()
                .filter(person -> person.name.startsWith("P"));

    }

    void groupAndPrint(){
        System.out.println("\n names of people older than 18 years:");
        Person.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    void getAverageAge(){
        System.out.println("\n names of people with the same age:");
            Person.stream()
        //don't know how to many group of persons

    }
}
