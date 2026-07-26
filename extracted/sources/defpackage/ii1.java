package defpackage;

import android.view.Surface;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements v59 {
    public final i59 a;
    public final n59 b;
    public final ArrayDeque c;
    public Surface d;
    public b e;
    public long f;
    public u59 g;
    public Executor h;
    public f59 i;

    public ii1(i59 i59Var, td8 td8Var) {
        this.a = i59Var;
        i59Var.l = td8Var;
        qq4 qq4Var = new qq4();
        qq4Var.b = this;
        this.b = new n59(qq4Var, i59Var);
        this.c = new ArrayDeque();
        this.e = new b(new rj2());
        this.f = -9223372036854775807L;
        this.g = u59.o0;
        this.h = new qa(2);
        this.i = new gi1();
    }

    @Override // defpackage.v59
    public final Surface b() {
        Surface surface = this.d;
        vy2.t(surface);
        return surface;
    }

    @Override // defpackage.v59
    public final boolean c() {
        n59 n59Var = this.b;
        long j = n59Var.i;
        return j != -9223372036854775807L && n59Var.h == j;
    }

    @Override // defpackage.v59
    public final void d() {
        this.a.e();
    }

    @Override // defpackage.v59
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.v59
    public final void f(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v59
    public final void g() {
        n59 n59Var = this.b;
        if (n59Var.g == -9223372036854775807L) {
            n59Var.g = Long.MIN_VALUE;
            n59Var.h = Long.MIN_VALUE;
        }
        n59Var.i = n59Var.g;
    }

    @Override // defpackage.v59
    public final void h(int i) {
        m59 m59Var = this.a.b;
        if (m59Var.j == i) {
            return;
        }
        m59Var.j = i;
        m59Var.d(true);
    }

    @Override // defpackage.v59
    public final void i(float f) {
        this.a.i(f);
    }

    @Override // defpackage.v59
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.v59
    public final void j() {
        this.d = null;
        this.a.h(null);
    }

    @Override // defpackage.v59
    public final boolean k(long j, zm4 zm4Var) {
        this.c.add(zm4Var);
        n59 n59Var = this.b;
        jg0 jg0Var = n59Var.f;
        int i = jg0Var.d;
        long[] jArr = (long[]) jg0Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = jg0Var.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) jg0Var.f, 0, jArr2, i3, i2);
            jg0Var.b = 0;
            jg0Var.c = jg0Var.d - 1;
            jg0Var.f = jArr2;
            jg0Var.e = length - 1;
        }
        int i4 = (jg0Var.c + 1) & jg0Var.e;
        jg0Var.c = i4;
        ((long[]) jg0Var.f)[i4] = j;
        jg0Var.d++;
        n59Var.g = j;
        n59Var.i = -9223372036854775807L;
        this.h.execute(new b7(20, this));
        return true;
    }

    @Override // defpackage.v59
    public final void l(b bVar, long j, int i, List list) {
        vy2.s(list.isEmpty());
        int i2 = bVar.u;
        int i3 = bVar.v;
        b bVar2 = this.e;
        int i4 = bVar2.u;
        n59 n59Var = this.b;
        if (i2 != i4 || i3 != bVar2.v) {
            aj0 aj0Var = n59Var.d;
            long j2 = n59Var.g;
            aj0Var.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new w59(i2, i3));
        }
        float f = bVar.y;
        if (f != this.e.y) {
            this.a.g(f);
        }
        this.e = bVar;
        if (j != this.f) {
            if (n59Var.f.d == 0) {
                n59Var.b.f(i);
                n59Var.k = j;
            } else {
                aj0 aj0Var2 = n59Var.e;
                long j3 = n59Var.g;
                aj0Var2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.f = j;
        }
    }

    @Override // defpackage.v59
    public final void m(boolean z) {
        if (z) {
            i59 i59Var = this.a;
            m59 m59Var = i59Var.b;
            m59Var.m = 0L;
            m59Var.p = -1L;
            m59Var.n = -1L;
            i59Var.h = -9223372036854775807L;
            i59Var.f = -9223372036854775807L;
            i59Var.e = Math.min(i59Var.e, 1);
            i59Var.i = -9223372036854775807L;
        }
        n59 n59Var = this.b;
        aj0 aj0Var = n59Var.d;
        jg0 jg0Var = n59Var.f;
        jg0Var.b = 0;
        jg0Var.c = -1;
        jg0Var.d = 0;
        n59Var.g = -9223372036854775807L;
        n59Var.h = -9223372036854775807L;
        n59Var.i = -9223372036854775807L;
        aj0 aj0Var2 = n59Var.e;
        if (aj0Var2.y() > 0) {
            vy2.j(aj0Var2.y() > 0);
            while (aj0Var2.y() > 1) {
                aj0Var2.s();
            }
            Object objS = aj0Var2.s();
            objS.getClass();
            n59Var.k = ((Long) objS).longValue();
        }
        if (aj0Var.y() > 0) {
            vy2.j(aj0Var.y() > 0);
            while (aj0Var.y() > 1) {
                aj0Var.s();
            }
            Object objS2 = aj0Var.s();
            objS2.getClass();
            aj0Var.a(0L, (w59) objS2);
        }
        this.c.clear();
    }

    @Override // defpackage.v59
    public final void n(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v59
    public final void o(pj9 pj9Var, Executor executor) {
        this.g = pj9Var;
        this.h = executor;
    }

    @Override // defpackage.v59
    public final void p(long j, long j2) {
        try {
            this.b.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.e);
        }
    }

    @Override // defpackage.v59
    public final void q(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.v59
    public final boolean r(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.v59
    public final void s(f59 f59Var) {
        this.i = f59Var;
    }

    @Override // defpackage.v59
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v59
    public final void u(Surface surface, cy7 cy7Var) {
        this.d = surface;
        this.a.h(surface);
    }

    @Override // defpackage.v59
    public final boolean v(b bVar) {
        return true;
    }

    @Override // defpackage.v59
    public final void w() {
        i59 i59Var = this.a;
        if (i59Var.e == 0) {
            i59Var.e = 1;
        }
    }

    @Override // defpackage.v59
    public final void a() {
    }
}
