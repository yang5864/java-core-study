package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class StreamRealExam {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "강태규", "권유현", "김건우", "김기선", "김민철",
                "김수현", "김현태", "송준수", "송태권", "양승환",
                "오진호", "이대주", "이민호", "이아영", "이지민",
                "이지은", "이채연", "장지연", "최규진", "최보윤",
                "홍상우", "황지원"
        );

        Map<String, List<StudentResponse>> groupedByLastnameByFor = new HashMap<>();

        for (String name : students) {
            String lastName = name.substring(0, 1);

            if (!groupedByLastnameByFor.containsKey(lastName)) {
                groupedByLastnameByFor.put(lastName, new ArrayList<>());
            }

            groupedByLastnameByFor.get(lastName).add(new StudentResponse(students.indexOf(name) + 1, name, lastName + "씨"));
        }

        for (Map.Entry<String, List<StudentResponse>> entry : groupedByLastnameByFor.entrySet()) {
            System.out.println(entry.getKey() + "씨 : " + entry.getValue());
        }

        Map<String, List<StudentResponse>> groupedByLastnameByStream = students.stream()
                .collect(Collectors.groupingBy(
                        name -> name.substring(0, 1),
                        Collectors.mapping(
                                name -> new StudentResponse(students.indexOf(name) + 1, name, name.substring(0, 1) + "씨"),
                                Collectors.toList()
                        )
                ));
        groupedByLastnameByStream.forEach((lastName, nameList) ->
                System.out.println(lastName + "씨 : " + nameList));
    }
}
