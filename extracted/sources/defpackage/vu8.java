package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class vu8 {
    public static final lu8 A;
    public static final v22 B;
    public static final lu8 a;
    public static final lu8 b;
    public static final pu8 c;
    public static final nu8 d;
    public static final nu8 e;
    public static final nu8 f;
    public static final nu8 g;
    public static final lu8 h;
    public static final lu8 i;
    public static final lu8 j;
    public static final tt8 k;
    public static final nu8 l;
    public static final yt8 m;
    public static final zt8 n;
    public static final au8 o;
    public static final lu8 p;
    public static final lu8 q;
    public static final lu8 r;
    public static final lu8 s;
    public static final lu8 t;
    public static final lu8 u;
    public static final lu8 v;
    public static final lu8 w;
    public static final fq5 x;
    public static final lu8 y;
    public static final pv3 z;

    static {
        int i2 = 0;
        a = new lu8(Class.class, new cu8().a(), i2);
        b = new lu8(BitSet.class, new mu8().a(), i2);
        ou8 ou8Var = new ou8();
        c = new pu8();
        d = new nu8(Boolean.TYPE, Boolean.class, ou8Var);
        e = new nu8(Byte.TYPE, Byte.class, new qu8());
        f = new nu8(Short.TYPE, Short.class, new ru8());
        g = new nu8(Integer.TYPE, Integer.class, new su8());
        int i3 = 0;
        h = new lu8(AtomicInteger.class, new tu8().a(), i3);
        i = new lu8(AtomicBoolean.class, new uu8().a(), i3);
        j = new lu8(AtomicIntegerArray.class, new st8().a(), i3);
        k = new tt8();
        new ut8();
        new vt8();
        l = new nu8(Character.TYPE, Character.class, new wt8());
        xt8 xt8Var = new xt8();
        m = new yt8();
        n = new zt8();
        o = new au8();
        int i4 = 0;
        p = new lu8(String.class, xt8Var, i4);
        q = new lu8(StringBuilder.class, new bu8(), i4);
        r = new lu8(StringBuffer.class, new du8(), i4);
        s = new lu8(URL.class, new eu8(), i4);
        t = new lu8(URI.class, new fu8(), i4);
        u = new lu8(InetAddress.class, new gu8(), 1);
        int i5 = 0;
        v = new lu8(UUID.class, new hu8(), i5);
        w = new lu8(Currency.class, new iu8().a(), i5);
        x = new fq5(2, new ju8());
        y = new lu8(Locale.class, new ku8(), 0);
        pv3 pv3Var = pv3.a;
        z = pv3Var;
        A = new lu8(lv3.class, pv3Var, 1);
        B = w22.d;
    }
}
