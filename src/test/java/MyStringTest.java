import org.junit.Assert;
import org.junit.Test;


public class MyStringTest {
    MyString ms = new MyString();

    @Test
    public void tests1Null(){
        String s1 = null;
        String s2 = "string";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void tests2Null(){
        String s1 = "string";
        String s2 = null;
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

}