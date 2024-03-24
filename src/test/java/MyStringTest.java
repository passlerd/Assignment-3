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

    @Test
    public void tests1Empty(){
        String s1 = "";
        String s2 = "string";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void tests2Empty(){
        String s1 = "string";
        String s2 = "";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void tests2NotIns1(){
        String s1 = "strcaing";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void tests2Ins1igreaterThanPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(3, i);
    }
    @Test
    public void tests2Ins1ilessThanPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 4;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }
    @Test
    public void tests2Ins1iEqualsPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 3;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(3, i);
    }
    @Test
    public void testPartials2InS1BeforeActuals2(){
        String s1 = "strcaincatting";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(7, i);
    }
}