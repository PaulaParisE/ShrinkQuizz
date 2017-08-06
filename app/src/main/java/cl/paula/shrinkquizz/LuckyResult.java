package cl.paula.shrinkquizz;

/**
 * Created by paula_000 on 05-08-2017.
 */

public class LuckyResult extends LuckyInput {
    public LuckyResult(boolean userCheck) {
        super(userCheck);
    }

    public String luckyResult(){
        return answer1()+ " "+answerDate();
    }

  private String answer1() {
      boolean answerUser = isUserCheck();
      if (answerUser) {
          return "Esa es la actitud!";
      } else {
          return "Anímate";
      }

  }

      private String answerDate(){
        boolean Dateanswer =LuckyDay();
        if (Dateanswer){
            return "y es tu día de suerte!";
        }else {
            return "vendrán mejores tiempos :)";

        }

    }


  }


