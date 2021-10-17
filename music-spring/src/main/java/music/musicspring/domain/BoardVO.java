package music.musicspring.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
    private int idx;
    private String id;
    private String name;
    private String pw;
    private String title;
    private String content;
    private String crtDt;
    private String uptDt;
    private int hit;
}
