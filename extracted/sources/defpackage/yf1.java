package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yf1 {
    public final qc1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public yf1(qc1 qc1Var, int i, int i2, int i3, int i4, boolean z, int i5, boolean z2) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(i5, 0, "backBufferDurationMs", "0");
        this.a = qc1Var;
        this.b = j29.V(i);
        this.c = j29.V(i2);
        this.d = j29.V(i3);
        this.e = j29.V(i4);
        this.f = -1;
        this.g = z;
        this.h = j29.V(i5);
        this.i = z2;
        this.j = new HashMap();
        this.k = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        vy2.i(str + " cannot be less than " + str2, i >= i2);
    }

    public final int b() {
        Iterator it = this.j.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((xf1) it.next()).b;
        }
        return i;
    }

    public final boolean c(aa4 aa4Var) {
        int i;
        long j = this.c;
        xf1 xf1Var = (xf1) this.j.get(aa4Var.a);
        xf1Var.getClass();
        qc1 qc1Var = this.a;
        synchronized (qc1Var) {
            i = qc1Var.d * qc1Var.b;
        }
        boolean z = true;
        boolean z2 = i >= b();
        long jMin = this.b;
        float f = aa4Var.c;
        if (f > 1.0f) {
            jMin = Math.min(j29.C(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = aa4Var.b;
        if (j2 < jMax) {
            if (!this.g && z2) {
                z = false;
            }
            xf1Var.a = z;
            if (!z && j2 < 500000) {
                wn5.k0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            xf1Var.a = false;
        }
        return xf1Var.a;
    }

    public final void d() {
        if (!this.j.isEmpty()) {
            this.a.a(b());
            return;
        }
        qc1 qc1Var = this.a;
        synchronized (qc1Var) {
            if (qc1Var.a) {
                qc1Var.a(0);
            }
        }
    }
}
