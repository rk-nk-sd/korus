package com.example.korus.entyties;

import lombok.*;

import java.lang.reflect.Member;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class MembersGroup {

    private int id;
    private String groupName;
    private List<Members> members;

}
