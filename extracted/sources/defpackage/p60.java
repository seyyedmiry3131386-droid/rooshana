package defpackage;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p60 implements xa1 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public db1 d;

    public p60(boolean z) {
        this.a = z;
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(fq8Var)) {
            return;
        }
        arrayList.add(fq8Var);
        this.c++;
    }

    @Override // defpackage.xa1
    public Map k() {
        return Collections.EMPTY_MAP;
    }

    public final void l(int i) {
        db1 db1Var = this.d;
        String str = j29.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            fq8 fq8Var = (fq8) this.b.get(i2);
            boolean z = this.a;
            td1 td1Var = (td1) fq8Var;
            synchronized (td1Var) {
                ImmutableList immutableList = td1.p;
                if (z && (db1Var.i & 8) != 8) {
                    td1Var.i += (long) i;
                }
            }
        }
    }

    public final void o() {
        db1 db1Var = this.d;
        String str = j29.a;
        for (int i = 0; i < this.c; i++) {
            fq8 fq8Var = (fq8) this.b.get(i);
            boolean z = this.a;
            td1 td1Var = (td1) fq8Var;
            synchronized (td1Var) {
                try {
                    ImmutableList immutableList = td1.p;
                    if (z && (db1Var.i & 8) != 8) {
                        vy2.s(td1Var.g > 0);
                        td1Var.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (jElapsedRealtime - td1Var.h);
                        td1Var.j += (long) i2;
                        long j = td1Var.k;
                        long j2 = td1Var.i;
                        td1Var.k = j + j2;
                        if (i2 > 0) {
                            td1Var.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                            if (td1Var.j >= 2000 || td1Var.k >= 524288) {
                                td1Var.l = (long) td1Var.f.b();
                            }
                            td1Var.b(td1Var.i, i2, td1Var.l);
                            td1Var.h = jElapsedRealtime;
                            td1Var.i = 0L;
                        }
                        td1Var.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void r() {
        for (int i = 0; i < this.c; i++) {
            ((fq8) this.b.get(i)).getClass();
        }
    }

    public final void s(db1 db1Var) {
        this.d = db1Var;
        for (int i = 0; i < this.c; i++) {
            fq8 fq8Var = (fq8) this.b.get(i);
            boolean z = this.a;
            td1 td1Var = (td1) fq8Var;
            synchronized (td1Var) {
                try {
                    ImmutableList immutableList = td1.p;
                    if (z && (db1Var.i & 8) != 8) {
                        if (td1Var.g == 0) {
                            td1Var.d.getClass();
                            td1Var.h = SystemClock.elapsedRealtime();
                        }
                        td1Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
