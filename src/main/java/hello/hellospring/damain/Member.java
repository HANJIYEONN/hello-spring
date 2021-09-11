package hello.hellospring.damain;

public class Member {

    private Long id; //데이터를 구분하기 위한 시스템 id 값 (시퀀스 넘버 같은것.)
    private String name; // 실제로 사용되는  id

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
