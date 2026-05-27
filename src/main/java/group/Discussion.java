package main.java.group;

import main.java.type.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Discussion {
    private List<Person> participants;

    public Discussion() {
        this.participants = new ArrayList<>();
    }

    public Discussion(List<Person> participants) {
        this.participants = participants;
    }

    public void addPerson(Person person) {
        participants.add(person);
    }

    public void broadCast() {
        Random random = new Random();
        Person speaker = participants.get(random.nextInt(participants.size()));
        for (Person participant : participants) {
            if (participant != speaker) {
                speaker.chatWith(participant, "Java");
            }
        }
    }
}
