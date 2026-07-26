package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ta6 {
    public static final ks4 u = new ks4(new Object());
    public final bm8 a;
    public final ks4 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final zo8 h;
    public final jp8 i;
    public final List j;
    public final ks4 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final ua6 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public ta6(bm8 bm8Var, ks4 ks4Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, zo8 zo8Var, jp8 jp8Var, List list, ks4 ks4Var2, boolean z2, int i2, int i3, ua6 ua6Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = bm8Var;
        this.b = ks4Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = zo8Var;
        this.i = jp8Var;
        this.j = list;
        this.k = ks4Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = ua6Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static ta6 k(jp8 jp8Var) {
        xl8 xl8Var = bm8.a;
        zo8 zo8Var = zo8.d;
        ImmutableList immutableListQ = ImmutableList.q();
        ua6 ua6Var = ua6.d;
        ks4 ks4Var = u;
        return new ta6(xl8Var, ks4Var, -9223372036854775807L, 0L, 1, null, false, zo8Var, jp8Var, immutableListQ, ks4Var, false, 1, 0, ua6Var, 0L, 0L, 0L, 0L, false);
    }

    public final ta6 a() {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final ta6 b(boolean z) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 c(ks4 ks4Var) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ks4Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 d(ks4 ks4Var, long j, long j2, long j3, long j4, zo8 zo8Var, jp8 jp8Var, List list) {
        return new ta6(this.a, ks4Var, j2, j3, this.e, this.f, this.g, zo8Var, jp8Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final ta6 e(int i, int i2, boolean z) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 f(ExoPlaybackException exoPlaybackException) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 g(ua6 ua6Var) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, ua6Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 h(int i) {
        return new ta6(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ta6 i(boolean z) {
        return new ta6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final ta6 j(bm8 bm8Var) {
        return new ta6(bm8Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return j29.V(j29.k0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
