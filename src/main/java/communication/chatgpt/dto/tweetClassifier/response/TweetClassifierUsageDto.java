package communication.chatgpt.dto.tweetClassifier.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TweetClassifierUsageDto {

    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;
}
