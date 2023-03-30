package hello.hellospring.domain;

public class Member {

    // H2 db sql문
//    drop table if exists member CASCADE;
//    create table member
//            (
//                    id bigint generated by default as identity, //id 생성
//                    name varchar(255), // name 생성
//    primary key(id)
//    );

    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
