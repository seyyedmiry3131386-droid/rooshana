package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class n59 {
    public final qq4 a;
    public final i59 b;
    public final fg0 c = new fg0();
    public final aj0 d = new aj0(10, (byte) 0);
    public final aj0 e = new aj0(10, (byte) 0);
    public final jg0 f;
    public long g;
    public long h;
    public long i;
    public w59 j;
    public long k;

    public n59(qq4 qq4Var, i59 i59Var) {
        this.a = qq4Var;
        this.b = i59Var;
        jg0 jg0Var = new jg0();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        jg0Var.b = 0;
        jg0Var.c = -1;
        jg0Var.d = 0;
        jg0Var.f = new long[iHighestOneBit];
        jg0Var.e = iHighestOneBit - 1;
        this.f = jg0Var;
        this.g = -9223372036854775807L;
        this.j = w59.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final qq4 qq4Var = this.a;
        ii1 ii1Var = (ii1) qq4Var.b;
        while (true) {
            jg0 jg0Var = this.f;
            int i = jg0Var.d;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j3 = ((long[]) jg0Var.f)[jg0Var.b];
            Long l = (Long) this.e.t(j3);
            i59 i59Var = this.b;
            if (l != null && l.longValue() != this.k) {
                this.k = l.longValue();
                i59Var.f(2);
            }
            long j4 = this.k;
            i59 i59Var2 = this.b;
            fg0 fg0Var = this.c;
            int iA = i59Var2.a(j3, j, j2, j4, false, false, fg0Var);
            if (iA == 0 || iA == 1) {
                this.h = j3;
                boolean z = iA == 0;
                long jD = jg0Var.d();
                w59 w59Var = (w59) this.d.t(jD);
                if (w59Var != null && !w59Var.equals(w59.d) && !w59Var.equals(this.j)) {
                    this.j = w59Var;
                    rj2 rj2Var = new rj2();
                    rj2Var.t = w59Var.a;
                    rj2Var.u = w59Var.b;
                    rj2Var.m = tv4.m("video/raw");
                    qq4Var.a = new b(rj2Var);
                    ii1Var.h.execute(new g7(qq4Var, w59Var, 17));
                }
                long jNanoTime = z ? System.nanoTime() : fg0Var.b;
                boolean z2 = i59Var.e != 3;
                i59Var.e = 3;
                i59Var.l.getClass();
                i59Var.g = j29.V(SystemClock.elapsedRealtime());
                if (z2 && ii1Var.d != null) {
                    final int i2 = 0;
                    ii1Var.h.execute(new Runnable() { // from class: hi1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ((ii1) qq4Var.b).g.g();
                                    break;
                                default:
                                    ((ii1) qq4Var.b).g.i();
                                    break;
                            }
                        }
                    });
                }
                b bVar = (b) qq4Var.a;
                ii1Var.i.c(jD, jNanoTime, bVar == null ? new b(new rj2()) : bVar, null);
                zm4 zm4Var = (zm4) ii1Var.c.remove();
                zm4Var.c.H0(zm4Var.a, zm4Var.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.h = j3;
                jg0Var.d();
                final int i3 = 1;
                ii1Var.h.execute(new Runnable() { // from class: hi1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ((ii1) qq4Var.b).g.g();
                                break;
                            default:
                                ((ii1) qq4Var.b).g.i();
                                break;
                        }
                    }
                });
                zm4 zm4Var2 = (zm4) ii1Var.c.remove();
                zm4Var2.c.L0(zm4Var2.a, zm4Var2.b);
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.h = j3;
            }
        }
    }
}
