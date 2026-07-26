package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class t00 {
    public long A;
    public boolean B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public td8 G;
    public final r79 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public r00 e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public t00(r79 r79Var) {
        this.a = r79Var;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = td8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t00.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = r12.x
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.d()
            long r2 = r12.A
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            td8 r0 = r12.G
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.s
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7f
            android.media.AudioTrack r4 = r12.c
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L36
            goto L7d
        L36:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 > r8) goto L61
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5f
            long r10 = r12.t
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L7d
            r12.y = r0
            goto L7d
        L5f:
            r12.y = r2
        L61:
            long r2 = r12.t
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7b
            boolean r4 = r12.E
            if (r4 == 0) goto L74
            long r4 = r12.F
            long r4 = r4 + r2
            r12.F = r4
            r2 = 0
            r12.E = r2
            goto L7b
        L74:
            long r2 = r12.u
            r4 = 1
            long r2 = r2 + r4
            r12.u = r2
        L7b:
            r12.t = r6
        L7d:
            r12.s = r0
        L7f:
            long r0 = r12.t
            long r2 = r12.F
            long r0 = r0 + r2
            long r2 = r12.u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t00.b():long");
    }

    public final long c(long j) {
        long jC;
        if (this.w != 0) {
            jC = j29.C(this.h, j + this.l);
        } else if (this.x != -9223372036854775807L) {
            jC = j29.b0(this.f, d());
        } else {
            jC = j29.b0(this.f, b());
        }
        long jMax = Math.max(0L, jC - this.o);
        if (this.x == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(j29.b0(this.f, this.A), jMax);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.z;
        }
        this.G.getClass();
        return this.z + j29.d0(j29.C(this.h, j29.V(SystemClock.elapsedRealtime()) - this.x), this.f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j) {
        n00 n00Var;
        Handler handler;
        if (this.B) {
            long j2 = this.j;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jF = j29.F(this.h, j - j2);
            this.G.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - j29.k0(jF);
            this.j = -9223372036854775807L;
            qm5 qm5Var = ((rd1) this.a.b).s;
            if (qm5Var == null || (handler = (n00Var = ((qm4) qm5Var.b).f1).b) == null) {
                return;
            }
            handler.post(new j00(0, jCurrentTimeMillis, n00Var));
        }
    }

    public final void f() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.i = false;
    }
}
