package defpackage;

import androidx.compose.material3.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class r97 {
    public static final s01 a = new s01(new js5(12));
    public static final m b;
    public static final m c;

    static {
        long j = zu0.h;
        b = new m(true, Float.NaN, j);
        c = new m(false, Float.NaN, j);
    }

    public static m a(float f, int i, long j) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = zu0.h;
        }
        return (au1.b(f, Float.NaN) && zu0.c(j, zu0.h)) ? z ? b : c : new m(z, f, j);
    }
}
