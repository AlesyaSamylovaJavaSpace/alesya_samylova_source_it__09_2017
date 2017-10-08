package task1.src;

import task1.util.ReviewMark;
import task1.util.DBException;

public class Task1InterfaceImpl implements Task1Interface {
    @Override
    public String getHelloMessage(String name) {
        StringBuilder helloMessage = new StringBuilder("Hell ");
        if (name != null) {
            helloMessage.append(name);
            helloMessage.append("! How do you do?!");

        } else {
            try {
                throw new DBException();
            } catch (DBException e){
                throw new RuntimeException("DBException was thrown: Incorrect name");
            }
        }

        return helloMessage.toString();
    }

    @Override
    public Integer getScoreFromReviewComment(ReviewMark reviewMark) {
        Integer score = 0;

        if ( reviewMark == null) {
            throw new RuntimeException("Runtime Exception: Incorrect reviewMark");
        }

        switch(reviewMark){
            case TERRIBLE:
                score = 1;
                break;
            case BAD:
                score = 2;
                break;
            case SO_SO:
                score = 3;
                break;
            case GOOD:
                score = 4;
                break;
            case EXCELLENT:
                score = 5;
                break;
        }

        return score;
    }
}
