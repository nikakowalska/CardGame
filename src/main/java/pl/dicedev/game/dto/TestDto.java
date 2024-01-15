package pl.dicedev.game.dto;

public class TestDto {
    //data transfer object, obiekt wysylany porZez kontroller
    //stworz nowy dto i przygotuj czesc rzeczy z aplikacji - menu, do przekazania na frontend, czyli meny contoller
    //zeby wyswietlac dane z controllera

    public String name;
    public int age;

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
