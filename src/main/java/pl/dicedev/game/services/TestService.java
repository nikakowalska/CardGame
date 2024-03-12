package pl.dicedev.game.services;

import org.springframework.stereotype.Service;
import pl.dicedev.game.clients.UUIDClient;
import pl.dicedev.game.repository.TestEntity;
import pl.dicedev.game.repository.TestRepository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.UUID;

@Service
public class TestService {
    private TestRepository testRepository;
    private UUIDClient uuidClient;

    public TestService(final TestRepository testRepository, final UUIDClient uuidClient) {
        this.testRepository = testRepository;
        this.uuidClient = uuidClient;
    }

    public String getString() {
        return "test1";
    }

    public String getHeaderRequest(final String language, final String myHeader) {
        return language + myHeader;
    }

    public String getUUID() {
        return uuidClient.getUUID();
    }

    public void saveTestEntity() {
        TestEntity testEntity = new TestEntity(UUID.randomUUID(),"ala",18);
        testRepository.save(testEntity);
    }
    public void readTestEntity(){
        final List<TestEntity> testEntities = testRepository.findAll();
        System.out.println(testEntities);

    }
}
