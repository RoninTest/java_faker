package org.example;

import com.github.javafaker.Faker;

public class Faker_Data {

    Faker faker = new Faker();

    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String username = faker.name().username();
    String password =".Tools123";

}
