package guru.springframework.services;


import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - this is the primary greeting service";
    }
}
