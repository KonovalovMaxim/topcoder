import org.junit.Test;

import static org.junit.Assert.*;

public class TagalogDictionaryTest {

    @Test(timeout = 2000)
    public void test0() {
        String[] words = new String[]{"abakada", "alpabet", "tagalog", "ako"};
        assertArrayEquals(new String[]{"abakada", "ako", "alpabet", "tagalog"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] words = new String[]{"ang", "ano", "anim", "alak", "alam", "alab"};
        assertArrayEquals(new String[]{"alab", "alak", "alam", "anim", "ano", "ang"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] words = new String[]{"siya", "niya", "kaniya", "ikaw", "ito", "iyon"};
        assertArrayEquals(new String[]{"kaniya", "ikaw", "ito", "iyon", "niya", "siya"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test3() {
        String[] words = new String[]{"kaba", "baka", "naba", "ngipin", "nipin"};
        assertArrayEquals(new String[]{"baka", "kaba", "naba", "nipin", "ngipin"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test4() {
        String[] words = new String[]{"knilngiggnngginggn", "ingkigningg", "kingkong", "dingdong", "dindong", "dingdont", "ingkblot"};
        assertArrayEquals(new String[]{"kingkong", "knilngiggnngginggn", "dindong", "dingdont", "dingdong", "ingkblot", "ingkigningg"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test5() {
        String[] words = new String[]{"silangang", "baka", "bada", "silang"};
        assertArrayEquals(new String[]{"baka", "bada", "silang", "silangang"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test6() {
        String[] words = new String[]{"sariwa", "imperyal", "irigasyon", "maibigan", "pandarambong", "huwaran", "pagtatama", "ilipat", "pagyari", "gawaing", "habla", "panunukso", "papatayin"};
        assertArrayEquals(new String[]{"gawaing", "habla", "huwaran", "ilipat", "imperyal", "irigasyon", "maibigan", "pagtatama", "pagyari", "pandarambong", "panunukso", "papatayin", "sariwa"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test7() {
        String[] words = new String[]{"pagkamakasarili", "luwalhati", "gumaganap", "sinaktan", "pagtutuli", "plebisito", "baybayin", "tumutungo", "nagpabago", "hahatulan", "lansangang", "binatang", "taning", "pagputok", "magdamag", "matutong", "piloto", "bagang", "pinakamabuting", "pagkakabit", "manlilikha", "tner", "ubusin"};
        assertArrayEquals(new String[]{"bagang", "baybayin", "binatang", "gumaganap", "hahatulan", "lansangang", "luwalhati", "magdamag", "manlilikha", "matutong", "nagpabago", "pagkakabit", "pagkamakasarili", "pagputok", "pagtutuli", "piloto", "pinakamabuting", "plebisito", "sinaktan", "taning", "tner", "tumutungo", "ubusin"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test8() {
        String[] words = new String[]{"k", "ng", "h", "t", "a", "g", "y", "b", "o", "i", "d", "s", "w", "e", "r", "l", "n", "p", "m", "u"};
        assertArrayEquals(new String[]{"a", "b", "k", "d", "e", "g", "h", "i", "l", "m", "n", "ng", "o", "p", "r", "s", "t", "u", "w", "y"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test9() {
        String[] words = new String[]{"kulit", "mapuspos", "guluhin", "kasapatan", "makilos", "ko", "aanihin", "bubuhaying", "ligaya", "tersiyaryong", "direktoryo", "hinugasan", "libreta", "burador", "parangal", "pinaniniwalaang", "panay", "bundok", "paririto", "nabilanggo", "britaniko", "tagalunsod", "martsa", "nasisiyahan", "naparoon", "minimithi", "pagpapaubayang", "rebisyonismo", "uno", "kilusang", "pinatutunayan", "bilihan", "pagbitay", "binalangkas", "daanan", "porsyento", "usapan", "nagtipon", "sekondaryang", "gulod", "sandatang", "aktor", "kaharian", "takdang", "kasal", "mabubuo", "tumaggap"};
        assertArrayEquals(new String[]{"aanihin", "aktor", "bilihan", "binalangkas", "britaniko", "bubuhaying", "bundok", "burador", "kaharian", "kasal", "kasapatan", "kilusang", "ko", "kulit", "daanan", "direktoryo", "gulod", "guluhin", "hinugasan", "libreta", "ligaya", "mabubuo", "makilos", "mapuspos", "martsa", "minimithi", "nabilanggo", "nagtipon", "naparoon", "nasisiyahan", "pagbitay", "pagpapaubayang", "panay", "parangal", "paririto", "pinaniniwalaang", "pinatutunayan", "porsyento", "rebisyonismo", "sandatang", "sekondaryang", "takdang", "tagalunsod", "tersiyaryong", "tumaggap", "uno", "usapan"}, new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test10() {
        String[] words = new String[]
                {"kulit", "mapuspos", "guluhin", "kasapatan", "makilos", "ko", "aanihin", "bubuhaying", "ligaya", "tersiyaryong", "direktoryo", "hinugasan", "libreta", "burador", "parangal", "pinaniniwalaang", "panay", "bundok", "paririto", "nabilanggo", "britaniko", "tagalunsod", "martsa", "nasisiyahan", "naparoon", "minimithi", "pagpapaubayang", "rebisyonismo", "uno", "kilusang", "pinatutunayan", "bilihan", "pagbitay", "binalangkas", "daanan", "porsyento", "usapan", "nagtipon", "sekondaryang", "gulod", "sandatang", "aktor", "kaharian", "takdang", "kasal", "mabubuo", "tumaggap"};
        assertArrayEquals(new String[]
                        {"aanihin", "aktor", "bilihan", "binalangkas", "britaniko", "bubuhaying", "bundok", "burador", "kaharian", "kasal", "kasapatan", "kilusang", "ko", "kulit", "daanan", "direktoryo", "gulod", "guluhin", "hinugasan", "libreta", "ligaya", "mabubuo", "makilos", "mapuspos", "martsa", "minimithi", "nabilanggo", "nagtipon", "naparoon", "nasisiyahan", "pagbitay", "pagpapaubayang", "panay", "parangal", "paririto", "pinaniniwalaang", "pinatutunayan", "porsyento", "rebisyonismo", "sandatang", "sekondaryang", "takdang", "tagalunsod", "tersiyaryong", "tumaggap", "uno", "usapan"}
                , new TagalogDictionary().sortWords(words));
    }

    @Test(timeout = 2000)
    public void test11() {
        String[] words = new String[]{"ng", "ang", "nga", "ngaaaaa", "nag", "ngaaaaaaaaa"};
        assertArrayEquals(new String[]{"ang", "nag", "ng", "nga", "ngaaaaa", "ngaaaaaaaaa"}, new TagalogDictionary().sortWords(words));
    }

}
