package janelasinternas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor extends org.jdesktop.beansbinding.Converter<Date, String> {

    private SimpleDateFormat df;
    public Conversor(){
        df = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    @Override
    public String convertForward(Date s) {
        return df.format(s);   
    }

    @Override
    public Date convertReverse(String t) {
        try{
        return df.parse(t);
        }catch(ParseException e){
            return null;
        }
    }
    
}
