package com.example.korus.dao;



import com.example.korus.entyties.Members;
import com.example.korus.entyties.MembersGroup;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MembersGroupDaoInMemory {
    List<MembersGroup> groups;
    List<Members> listMembersGroup1;
    List<Members> listMembersGroup2;

    private static int MEMBER_ID;
    private static int GROUP_ID;

    {
        // Список первой группы
        listMembersGroup1 = new ArrayList<>();

        listMembersGroup1.add(new Members(++MEMBER_ID, "Andrey", 10));
        listMembersGroup1.add(new Members(++MEMBER_ID, "Vasya", 20));
        listMembersGroup1.add(new Members(++MEMBER_ID, "Petya",30));
        listMembersGroup1.add(new Members(++MEMBER_ID, "Jeka", 40));
        listMembersGroup1.add(new Members(++MEMBER_ID, "Fedor", 50));

        // Список второй группы
        listMembersGroup2 = new ArrayList<>();

        listMembersGroup2.add(new Members(++MEMBER_ID, "Mike", 10));
        listMembersGroup2.add(new Members(++MEMBER_ID, "John", 20));
        listMembersGroup2.add(new Members(++MEMBER_ID, "Katy",30));
        listMembersGroup2.add(new Members(++MEMBER_ID, "Barbara", 40));
        listMembersGroup2.add(new Members(++MEMBER_ID, "David", 50));



        groups = new ArrayList<>();

        groups.add(new MembersGroup(++GROUP_ID, "Group 1", listMembersGroup1 ));
        groups.add(new MembersGroup(++GROUP_ID, "Group 2", listMembersGroup2 ));
    }

    public List<MembersGroup> getGroups() {
        return groups;
    }

    public Set<String> getAllNameOfMembersYoungerPathVariableAge(int age) {
        Set<String> listNames = new HashSet<>();
        groups.stream().flatMap(p -> p.getMembers().stream()).filter(p ->  p.getAge()<age ).forEach(p -> listNames.add(p.getName()));
        return listNames;
    }
}
