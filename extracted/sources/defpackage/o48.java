package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o48 extends fv6 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = j29.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public o48(int i) {
        vy2.i("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    @Override // defpackage.fv6
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.fv6
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fv6.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o48)) {
            return false;
        }
        o48 o48Var = (o48) obj;
        return this.b == o48Var.b && this.c == o48Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public o48(int i, float f) {
        boolean z = false;
        vy2.i("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        vy2.i("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
