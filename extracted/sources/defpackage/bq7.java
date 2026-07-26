package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class bq7 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final yp7 d;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public bq7(int i) {
        this(i, Bundle.EMPTY);
    }

    public static bq7 a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        yp7 yp7VarA = bundle3 != null ? yp7.a(bundle3) : i != 0 ? new yp7(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new bq7(i, bundle2, j, yp7VarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        yp7 yp7Var = this.d;
        if (yp7Var != null) {
            bundle.putBundle(h, yp7Var.b());
        }
        return bundle;
    }

    public bq7(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public bq7(int i, Bundle bundle, long j, yp7 yp7Var) {
        vy2.j(yp7Var == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (yp7Var == null && i < 0) {
            yp7Var = new yp7(i);
        }
        this.d = yp7Var;
    }
}
