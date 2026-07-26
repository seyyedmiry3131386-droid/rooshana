package defpackage;

import defpackage.q38;
import defpackage.r38;

/* JADX INFO: loaded from: classes.dex */
public abstract class u38 {
    public static final boolean a;
    public static final q38.a b;
    public static final r38.a c;
    public static final s38 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = q38.b;
            c = r38.b;
            d = t38.b;
        } else {
            b = null;
            c = null;
            d = null;
        }
    }
}
