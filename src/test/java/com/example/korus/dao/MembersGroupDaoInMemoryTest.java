package com.example.korus.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MembersGroupDaoInMemoryTest {

    @Test
    public void testGetAllNameOfMembersYoungerPathVariableAge() {
        Set<String> testNames = new HashSet<>();
        testNames.add("Petya");
        testNames.add("Mike");
        testNames.add("Andrey");
        testNames.add("John");
        testNames.add("Katy");
        testNames.add("Vasya");


        MembersGroupDaoInMemory membersGroupDaoInMemory = new MembersGroupDaoInMemory();
        Set<String> getNames = membersGroupDaoInMemory.getAllNameOfMembersYoungerPathVariableAge(35);

        if(!testNames.equals(getNames)) {
            fail("Ha-ha! Test for age 35 is failed");
        }
    }

}