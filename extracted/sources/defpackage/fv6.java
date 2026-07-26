package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class fv6 {
    public static final String a;

    static {
        String str = j29.a;
        a = Integer.toString(0, 36);
    }

    public static fv6 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = ly2.d;
            vy2.j(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(ly2.d, false) ? new ly2(bundle.getBoolean(ly2.e, false)) : new ly2();
        }
        if (i == 1) {
            String str3 = w46.c;
            vy2.j(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(w46.c, -1.0f);
            return f == -1.0f ? new w46() : new w46(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(rm7.n(i, "Unknown RatingType: "));
            }
            String str4 = fl8.d;
            vy2.j(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(fl8.d, false) ? new fl8(bundle.getBoolean(fl8.e, false)) : new fl8();
        }
        String str5 = o48.d;
        vy2.j(bundle.getInt(str, -1) == 2);
        int i2 = bundle.getInt(o48.d, 5);
        float f2 = bundle.getFloat(o48.e, -1.0f);
        return f2 == -1.0f ? new o48(i2) : new o48(i2, f2);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
