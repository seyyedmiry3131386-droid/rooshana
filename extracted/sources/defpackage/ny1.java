package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny1 {
    public static final Map a;
    public static final Map b;

    static {
        ky1 ky1Var = new ky1();
        ly1 ly1Var = new ly1();
        HashMap map = new HashMap();
        map.put("fcnt", ky1Var);
        map.put("google", ky1Var);
        map.put("hmd global", ky1Var);
        map.put("infinix", ky1Var);
        map.put("infinix mobility limited", ky1Var);
        map.put("itel", ky1Var);
        map.put("kyocera", ky1Var);
        map.put("lenovo", ky1Var);
        map.put("lge", ky1Var);
        map.put("meizu", ky1Var);
        map.put("motorola", ky1Var);
        map.put("nothing", ky1Var);
        map.put("oneplus", ky1Var);
        map.put("oppo", ky1Var);
        map.put("realme", ky1Var);
        map.put("robolectric", ky1Var);
        map.put("samsung", ly1Var);
        map.put("sharp", ky1Var);
        map.put("shift", ky1Var);
        map.put("sony", ky1Var);
        map.put("tcl", ky1Var);
        map.put("tecno", ky1Var);
        map.put("tecno mobile limited", ky1Var);
        map.put("vivo", ky1Var);
        map.put("wingtech", ky1Var);
        map.put("xiaomi", ky1Var);
        a = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", ky1Var);
        map2.put("jio", ky1Var);
        b = DesugarCollections.unmodifiableMap(map2);
    }
}
