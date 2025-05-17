import javax.naming.spi.DirStateFactory.Result;

public class ReplaceAllSpacesinStringwithSymbol {

    public String modifySpacesFromString(String Input) {

        String modifiedString = Input.replace(" ", "%");
        return modifiedString;

    }

    public static void main(String[] args) {

        ReplaceAllSpacesinStringwithSymbol rr = new ReplaceAllSpacesinStringwithSymbol();
        String result = rr.modifySpacesFromString("Hello, I am Nayan");
        System.out.println(result);

    }

}
