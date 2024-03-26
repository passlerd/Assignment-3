import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StringUtilTest {
    MyString ms = new MyString();
    StringUtil su = new StringUtil(ms);
    @Test
    public void replacesNull(){
        String s = null;
        String s1 = "s";
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces1Null(){
        String s = "string";
        String s1 = null;
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces2Null(){
        String s = "string";
        String s1 = "s";
        String s2 = null;
        String actual = su.replace(s,s1,s2);
        Assert.assertNull(actual);
    }

    @Test
    public void replaces1Empty(){
        String s = "string";
        String s1 = "";
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertEquals("string", actual);
    }

    @Test
    public void replacesContainsS1Once(){
        String s = "string";
        String s1 = "t";
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertEquals("scatring", actual);
    }

    @Test
    public void replaces1NotInS(){
        String s = "string";
        String s1 = "dog";
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertEquals("string", actual);
    }

    @Test
    public void replacesContainsS1MultipleTimes(){
        String s = "strtintg";
        String s1 = "t";
        String s2 = "cat";
        String actual = su.replace(s,s1,s2);
        Assert.assertEquals("scatrcatincatg", actual);
    }

    @Test
    public void replacesContainsS1WithMocking(){
        String s = "string";
        String s1 = "t";
        String s2 = "cat";
        MyString indexOfStringMock = mock(MyString.class);
        when(indexOfStringMock.indexOfString("string", "t",0)).thenReturn(1);
        when(indexOfStringMock.indexOfString("string", "t",2)).thenReturn(-1);
        StringUtil stringUtil = new StringUtil(indexOfStringMock);
        String actual = stringUtil.replace(s,s1,s2);
        Assert.assertEquals("scatring", actual);
    }
}
