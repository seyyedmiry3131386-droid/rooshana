package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class jp1 extends af8 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp1(Object obj, String str, int i) {
        super(str);
        this.e = i;
        this.f = obj;
    }

    private final long b() {
        yv6 yv6Var;
        lz1 lz1Var = (lz1) this.f;
        long jNanoTime = System.nanoTime();
        long j = (jNanoTime - lz1Var.a) + 1;
        Iterator it = ((ConcurrentLinkedQueue) lz1Var.d).iterator();
        js3.o(it, "iterator(...)");
        long j2 = Long.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        yv6 yv6Var2 = null;
        yv6 yv6Var3 = null;
        while (it.hasNext()) {
            yv6 yv6Var4 = (yv6) it.next();
            js3.m(yv6Var4);
            synchronized (yv6Var4) {
                if (lz1Var.a(yv6Var4, jNanoTime) > 0) {
                    i2++;
                } else {
                    long j3 = j2;
                    long j4 = yv6Var4.q;
                    if (j4 < j) {
                        j = j4;
                        yv6Var2 = yv6Var4;
                    }
                    i++;
                    if (j4 < j3) {
                        j2 = j4;
                        yv6Var3 = yv6Var4;
                    } else {
                        j2 = j3;
                    }
                }
            }
        }
        long j5 = j2;
        if (yv6Var2 != null) {
            yv6Var = yv6Var2;
        } else if (i > 5) {
            yv6Var = yv6Var3;
            j = j5;
        } else {
            j = -1;
            yv6Var = null;
        }
        if (yv6Var == null) {
            if (yv6Var3 != null) {
                return (j5 + lz1Var.a) - jNanoTime;
            }
            if (i2 > 0) {
                return lz1Var.a;
            }
            return -1L;
        }
        synchronized (yv6Var) {
            if (!yv6Var.p.isEmpty()) {
                return 0L;
            }
            if (yv6Var.q != j) {
                return 0L;
            }
            yv6Var.j = true;
            ((ConcurrentLinkedQueue) lz1Var.d).remove(yv6Var);
            ih9.c(yv6Var.e);
            if (((ConcurrentLinkedQueue) lz1Var.d).isEmpty()) {
                ((ff8) lz1Var.b).a();
            }
            return 0L;
        }
    }

    @Override // defpackage.af8
    public final long a() {
        switch (this.e) {
            case 0:
                mp1 mp1Var = (mp1) this.f;
                synchronized (mp1Var) {
                    if (mp1Var.m && !mp1Var.n) {
                        try {
                            mp1Var.R();
                        } catch (IOException unused) {
                            mp1Var.o = true;
                        }
                        try {
                            if (mp1Var.y()) {
                                mp1Var.K();
                                mp1Var.j = 0;
                            }
                        } catch (IOException unused2) {
                            mp1Var.p = true;
                            sv6 sv6Var = mp1Var.h;
                            if (sv6Var != null) {
                                gh9.b(sv6Var);
                            }
                            mp1Var.h = rf0.i(new sc0());
                        }
                    }
                    break;
                }
                return -1L;
            case 1:
                return b();
            default:
                ((bp2) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp1(String str, bp2 bp2Var) {
        super(str);
        this.e = 2;
        this.f = bp2Var;
    }
}
