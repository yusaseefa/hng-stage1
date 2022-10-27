package ng.hng.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HngStage1 {

    private final String slackUsername;
    private final boolean backend;
    private final int age;
    private final String bio;

    public HngStage1() {
        this.slackUsername = "volunux";
        this.backend = true;
        this.age = 25;
        this.bio = "I am a Java Developer and I specialize in backend programming";
    }

}
