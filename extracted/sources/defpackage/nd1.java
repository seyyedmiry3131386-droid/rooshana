package defpackage;

import android.os.SystemClock;
import androidx.compose.animation.core.RepeatMode;
import io.sentry.android.core.anr.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nd1 implements x39 {
    public long a;
    public long b;
    public Object c;

    public nd1(List list) {
        this.c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                ((ArrayList) this.c).add(fVar);
            }
        }
        Collections.sort((ArrayList) this.c);
        if (((ArrayList) this.c).isEmpty()) {
            this.a = 0L;
            this.b = 0L;
        } else {
            this.a = ((f) ((ArrayList) this.c).get(0)).b;
            this.b = ((f) o40.u(1, (ArrayList) this.c)).b + 10000;
        }
    }

    @Override // defpackage.x39
    public boolean a() {
        return true;
    }

    public synchronized Object b(Object obj) {
        kg4 kg4Var;
        kg4Var = (kg4) ((LinkedHashMap) this.c).get(obj);
        return kg4Var != null ? kg4Var.a : null;
    }

    public int c(Object obj) {
        return 1;
    }

    public synchronized Object e(Object obj, Object obj2) {
        int iC = c(obj2);
        long j = iC;
        if (j >= this.a) {
            d(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        kg4 kg4Var = (kg4) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new kg4(iC, obj2));
        if (kg4Var != null) {
            this.b -= (long) kg4Var.b;
            if (!kg4Var.a.equals(obj2)) {
                d(obj, kg4Var.a);
            }
        }
        j(this.a);
        return kg4Var != null ? kg4Var.a : null;
    }

    public long f(long j) {
        long j2 = j + this.b;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.a;
        RepeatMode repeatMode = RepeatMode.a;
        return j2 - ((j2 / j3) * j3);
    }

    public dl g(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((z39) this.c).h(j4 - j2, dlVar, dlVar3, dlVar2) : dlVar2;
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((z39) this.c).h(f(j), dlVar, dlVar2, g(j, dlVar, dlVar3, dlVar2));
    }

    public void i(Exception exc) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            synchronized (rd1.n0) {
                z = rd1.p0 > 0;
            }
            if (!z) {
                this.a = 200 + jElapsedRealtime;
            }
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void j(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            kg4 kg4Var = (kg4) entry.getValue();
            this.b -= (long) kg4Var.b;
            Object key = entry.getKey();
            it.remove();
            d(key, kg4Var.a);
        }
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((z39) this.c).q(f(j), dlVar, dlVar2, g(j, dlVar, dlVar3, dlVar2));
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return h(Long.MAX_VALUE, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return Long.MAX_VALUE;
    }

    public nd1(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public nd1() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public void d(Object obj, Object obj2) {
    }
}
