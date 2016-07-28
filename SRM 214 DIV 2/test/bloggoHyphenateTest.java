import org.junit.Test;

import static org.junit.Assert.*;

public class bloggoHyphenateTest {

    @Test(timeout = 2000)
    public void test0() {
        String[] dictionary = new String[]{"syl la ble", "dic tion a ry", "mole"};
        String[] candidates = new String[]{"mo-le", "syl-lable"};
        assertArrayEquals(new String[]{"mole", "correct"}, new bloggoHyphenate().correct(dictionary, candidates));
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] dictionary = new String[]{"syl la ble", "dic tion a ry", "mole"};
        String[] candidates = new String[]{"dictio-nary", "syll-able"};
        assertArrayEquals(new String[]{"diction-ary", "syl-lable"}, new bloggoHyphenate().correct(dictionary, candidates));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] dictionary = new String[]{"syl la ble", "dic tion a ry", "mole"};
        String[] candidates = new String[]{"dictionary-", "-syllable"};
        assertArrayEquals(new String[]{"dictiona-ry", "syl-lable"}, new bloggoHyphenate().correct(dictionary, candidates));
    }

    @Test(timeout = 2000)
    public void test3() {
        String[] dictionary = new String[]{"zsx kd ds jply rf", "auca wb ill", "kvqm kpd p kqi xpbk j",
                "cqf ccr ewq", "srl vu m u d b", "h qae qzge", "jdn qqjf y",
                "zpa hbr", "d uft ctsm qjg", "l hgcp ik twuy bsi nlmu iyx",
                "cjjz jn td zg", "h bd q hi", "obsr kci hjdm h yar zsq q xyr hxb",
                "izq iibd yuh tgx nkq", "cjgd wfns", "ohc bn duc",
                "pydv a geki s bo avdi wd", "zygp gqt p", "xq pqqb ufoe",
                "cvm yamq moqj vl zoig w", "ahz b lf ixjv d", "qpg ven d",
                "m cbxz yf tv djf", "kti wacd uvgb kmr ew r", "ng tfb unw ndl",
                "qruv ctw a", "d hk v pcxh zoxy", "etbo wabk", "x hxiu n",
                "wp qq u dvpi tclh ac l", "f am brs lk uss uyb pg",
                "dtfx h ict if koe jhj", "nl shp yeji b rw vrg", "bz qfnc u",
                "t ceoy eb ss myoe zaaj z jey", "j d uju mb irvu",
                "anmo emjs syam ta bfiy kk", "gl ej egla tha jbug",
                "zk u sz raij d", "kw lbya atdb pd", "no id hqum u wny qcy",
                "phv nv l f oq m", "b xup tnq fziw yth sn", "pvc hnr oky lzj",
                "ew wtwt gyty s uu pfe kif my", "t cw fsau",
                "esk gqtd o yh jbx wed fl z", "vvr hqw wo gxwm",
                "lei akz nzz bumb", "bc hlmw"};
        String[] candidates = new String[]{"-duftctsmqjg", "-leiakznzzbumb", "-xhxiun", "-zpahbr",
                "ahzbl-fixjvd", "anmo-emjssyamtabfiykk", "aucawb-ill",
                "bchlmw-", "bxuptnqfziwyth-sn", "bzq-fncu", "c-vmyamqmoqjvlzoigw",
                "cjg-dwfns", "cjjzjn-tdzg", "cqfccre-wq", "dhkvpcxhzox-y",
                "dtfx-hictifkoejhj", "eskgqtdoyhjbx-wedflz", "etbowab-k",
                "ewwtwtgytysuupfe-kifmy", "fambrslkuss-uybpg", "glejegl-athajbug",
                "hbdqhi-", "hq-aeqzge", "izqiibd-yuhtgxnkq", "jd-nqqjfy",
                "jdujumb-irvu", "ktiwacduvgbkmr-ewr", "kv-qmkpdpkqixpbkj",
                "kwlbya-atdbpd", "lhgcpiktwuybsi-nlmuiyx", "mcbx-zyftvdjf",
                "ngtf-bunwndl", "nlshpyejibrwvrg-", "no-idhqumuwnyqcy", "o-hcbnduc",
                "obsr-kcihjdmhyarzsqqxyrhxb", "ph-vnvlfoqm", "pvchnrok-ylzj",
                "pydvageki-sboavdiwd", "qpgv-end", "qruvctw-a", "srlvumu-db",
                "tceoyebssmyo-ezaajzjey", "tcwfsau-", "vvrhqwwo-gxwm",
                "wpqqudvpit-clhacl", "xqpq-qbufoe", "zku-szraijd",
                "zsxkddsjp-lyrf", "zygpgqt-p"};
        String[] result = new bloggoHyphenate().correct(dictionary, candidates);
        assertArrayEquals(new String[]{"d-uftctsmqjg", "lei-akznzzbumb", "x-hxiun", "zpa-hbr", "ahzb-lfixjvd", "correct", "correct", "bc-hlmw", "correct", "bz-qfncu", "cvm-yamqmoqjvlzoigw", "cjgd-wfns", "correct", "cqfccr-ewq", "dhkvpcxh-zoxy", "correct", "correct", "etbo-wabk", "correct", "correct", "glejegla-thajbug", "hbdq-hi", "h-qaeqzge", "correct", "jdn-qqjfy", "correct", "correct", "kvqm-kpdpkqixpbkj", "correct", "correct", "mcbxz-yftvdjf", "ngtfb-unwndl", "nlshpyejibrw-vrg", "correct", "ohc-bnduc", "correct", "phv-nvlfoqm", "pvchnroky-lzj", "correct", "qpg-vend", "correct", "correct", "tceoyebssmyoe-zaajzjey", "tcw-fsau", "correct", "wpqqudvpi-tclhacl", "xq-pqqbufoe", "correct", "zsxkdds-jplyrf", "correct"},
                result);
    }
}
