package pl.dicedev.game.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pl.dicedev.game.dto.TestDto;

import java.util.UUID;

@Entity
@Table(name = "test")
public class TestEntity {
    @Id
    private UUID id;
    private String name;
    private int age;

    public TestEntity() {
    }

    public TestEntity(final UUID id, final String name, final int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestDto testDto = (TestDto) o;

        if (age != testDto.age) return false;
        return name.equals(testDto.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
