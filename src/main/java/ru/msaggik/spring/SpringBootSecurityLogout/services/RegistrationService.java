package ru.msaggik.spring.SpringBootSecurityLogout.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.msaggik.spring.SpringBootSecurityLogout.models.Person;
import ru.msaggik.spring.SpringBootSecurityLogout.repositories.PeopleRepository;

@Service
public class RegistrationService {
    private final PeopleRepository peopleRepository;
    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    // метод регистрации
    @Transactional
    public void register(Person person) {
        peopleRepository.save(person);
    }
}
