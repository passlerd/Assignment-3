import org.junit.Assert;
import org.junit.Test;


public class MyStringTest {
    MyString ms = new MyString();

    @Test
    public void indexOfStrings1Null(){
        String s1 = null;
        String s2 = "string";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void indexOfStrings2Null(){
        String s1 = "string";
        String s2 = null;
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void indexOfStrings1Empty(){
        String s1 = "";
        String s2 = "string";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void indexOfStrings2Empty(){
        String s1 = "string";
        String s2 = "";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void indexOfStrings2NotIns1(){
        String s1 = "strcaing";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void indexOfStrings2Ins1igreaterThanPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(3, i);
    }
    @Test
    public void indexOfStrings2Ins1ilessThanPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 4;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(-1, i);
    }
    @Test
    public void indexOfStrings2Ins1iEqualsPos(){
        String s1 = "strcating";
        String s2 = "cat";
        int pos = 3;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(3, i);
    }
    @Test
    public void indexOfStringPartials2InS1BeforeActuals2(){
        String s1 = "strcaincatting";
        String s2 = "cat";
        int pos = 1;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(7, i);
    }
    @Test
    public void indexOfStringPartials2InS1BeforeActuals2PosAfterPartialS2(){
        String s1 = "strcaincatting";
        String s2 = "cat";
        int pos = 4;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(7, i);
    }
    @Test
    public void indexOfStrings2InS1TwicePosAfterIndexOfFirstS2(){
        String s1 = "strcatincatting";
        String s2 = "cat";
        int pos = 7;
        int i = ms.indexOfString(s1,s2,pos);
        Assert.assertEquals(8, i);
    }

    @Test
    public void replacesNull(){
        String s = null;
        String s1 = "s";
        String s2 = "cat";
        String actual = ms.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces1Null(){
        String s = "string";
        String s1 = null;
        String s2 = "cat";
        String actual = ms.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces2Null(){
        String s = "string";
        String s1 = "s";
        String s2 = null;
        String actual = ms.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces1Empty(){
        String s = "string";
        String s1 = "";
        String s2 = "cat";
        String actual = ms.replace(s,s1,s2);
        Assert.assertEquals("string", actual);
    }

    @Test
    public void replacesContainsS1Once(){
        String s = "string";
        String s1 = "t";
        String s2 = "cat";
        String actual = ms.replace(s,s1,s2);
        Assert.assertEquals("scatring", actual);
    }
}