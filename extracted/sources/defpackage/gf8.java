package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class gf8 {
    public static final Logger k;
    public static final gf8 l;
    public final hl5 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final fp7 j;

    static {
        Logger logger = Logger.getLogger(gf8.class.getName());
        js3.o(logger, "getLogger(...)");
        k = logger;
        String str = ih9.b + " TaskRunner";
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        l = new gf8(new hl5(new hh9(str, true)));
    }

    public gf8(hl5 hl5Var) {
        Logger logger = k;
        js3.p(logger, "logger");
        this.a = hl5Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new fp7(3, this);
    }

    public static final void a(gf8 gf8Var, af8 af8Var, long j, boolean z) {
        TimeZone timeZone = ih9.a;
        ff8 ff8Var = af8Var.c;
        js3.m(ff8Var);
        if (ff8Var.d != af8Var) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = ff8Var.f;
        ff8Var.f = false;
        ff8Var.d = null;
        gf8Var.h.remove(ff8Var);
        if (j != -1 && !z2 && !ff8Var.c) {
            ff8Var.f(af8Var, j, true);
        }
        if (ff8Var.e.isEmpty()) {
            return;
        }
        gf8Var.i.add(ff8Var);
        if (z) {
            return;
        }
        gf8Var.e();
    }

    public final af8 b() {
        boolean z;
        TimeZone timeZone = ih9.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            af8 af8Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                af8 af8Var2 = (af8) ((ff8) it.next()).e.get(0);
                long jMax = Math.max(0L, af8Var2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (af8Var != null) {
                        z = true;
                        break;
                    }
                    af8Var = af8Var2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (af8Var != null) {
                TimeZone timeZone2 = ih9.a;
                af8Var.d = -1L;
                ff8 ff8Var = af8Var.c;
                js3.m(ff8Var);
                ff8Var.e.remove(af8Var);
                arrayList.remove(ff8Var);
                ff8Var.d = af8Var;
                arrayList2.add(ff8Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return af8Var;
            }
            if (!this.d) {
                this.d = true;
                this.e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = ih9.a;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            Long.signum(j);
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = ih9.a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((ff8) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            ff8 ff8Var2 = (ff8) arrayList.get(size2);
                            ff8Var2.b();
                            if (ff8Var2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (jMin < this.e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(ff8 ff8Var) {
        js3.p(ff8Var, "taskQueue");
        TimeZone timeZone = ih9.a;
        if (ff8Var.d == null) {
            boolean zIsEmpty = ff8Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(ff8Var);
            } else {
                byte[] bArr = gh9.a;
                js3.p(arrayList, "<this>");
                if (!arrayList.contains(ff8Var)) {
                    arrayList.add(ff8Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final ff8 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new ff8(this, rm7.n(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = ih9.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        fp7 fp7Var = this.j;
        js3.p(fp7Var, "runnable");
        ((ThreadPoolExecutor) this.a.b).execute(fp7Var);
    }
}
