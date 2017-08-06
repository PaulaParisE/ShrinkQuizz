package cl.paula.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paula_000 on 03-08-2017.
 */

public class LuckyInput {

    private boolean userCheck;
    private boolean luckyDay;

    public LuckyInput(boolean userCheck) {
        this.userCheck = userCheck;
        luckyDay =new LuckyDate().getDate();

    }

    public boolean isUserCheck() {
        return userCheck;
    }

    public boolean LuckyDay() {
        return luckyDay;
    }

    private class LuckyDate{
        private boolean getDate(){
            Date date= new Date();
            SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));

            if (day %2==0){
                return true;
            }else {
                return false;


            }

        }
    }




}

