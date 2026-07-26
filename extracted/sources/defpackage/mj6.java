package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.m;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class mj6 implements f34 {
    public final int a;
    public final pa2 b;
    public final dp2 c;
    public h31 d;
    public v98 e;
    public u98 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public wd2 l;
    public boolean m;
    public long n;
    public long o;
    public long p = rx4.a();
    public boolean q;
    public final /* synthetic */ ry r;

    public mj6(ry ryVar, int i, pa2 pa2Var, dp2 dp2Var) {
        this.r = ryVar;
        this.a = i;
        this.b = pa2Var;
        this.c = dp2Var;
    }

    @Override // defpackage.f34
    public final void a() {
        this.m = true;
    }

    public final void b() {
        u98 u98Var = this.f;
        if (u98Var != null) {
            u98Var.cancel();
        }
        this.f = null;
        v98 v98Var = this.e;
        if (v98Var != null) {
            v98Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(bb8 bb8Var) {
        boolean zD;
        if (!this.r.b) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(bb8Var);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(bb8Var);
        }
        te.Y(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // defpackage.f34
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c3  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.bb8 r22) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj6.d(bb8):boolean");
    }

    public final boolean e() {
        u98 u98Var;
        return this.i || ((u98Var = this.f) != null && u98Var.c());
    }

    public final void f(long j) {
        if (this.h) {
            un3.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.g) {
            un3.a("Request was already measured!");
        }
        this.g = true;
        v98 v98Var = this.e;
        if (v98Var == null) {
            un3.b("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }
        int iB = v98Var.b();
        for (int i = 0; i < iB; i++) {
            v98Var.c(i, j);
        }
    }

    public final void g(Object obj, Object obj2, v30 v30Var) {
        u98 hh2Var;
        u98 u98Var = this.f;
        if (u98Var == null) {
            ry ryVar = this.r;
            qp2 qp2VarA = ((x24) ryVar.c).a(this.a, obj, obj2);
            g gVarA = ((m) ryVar.d).a();
            if (gVarA.a.U()) {
                gVarA.k(obj, qp2VarA, true);
                hh2Var = new hh2(gVarA, obj, 9);
            } else {
                hh2Var = new nc2(gVarA, obj, 12);
            }
            u98Var = hh2Var;
            this.f = u98Var;
            this.j = obj;
        }
        this.q = false;
        while (!u98Var.c() && !this.q) {
            u98Var.f(new ur4(this, v30Var, 11));
        }
        j();
        if (this.q) {
            v30Var.b = v30.a(this.o, v30Var.b);
        } else {
            v30Var.a = v30.a(this.o, v30Var.a);
        }
    }

    public final wd2 h() {
        v98 v98Var = this.e;
        if (v98Var == null) {
            un3.b("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        v98Var.d(new lj6(ref$ObjectRef, 0));
        List list = (List) ref$ObjectRef.a;
        if (list != null) {
            return new wd2(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void j() {
        long jA = rx4.a();
        long jB = sl8.b(jA, this.p);
        long j = jB >> 1;
        int i = qx1.d;
        if ((((int) jB) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * ((long) 1000000);
        }
        this.o = j;
        long j2 = this.n - j;
        this.n = j2;
        this.p = jA;
        te.Y(j2, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return t61.l(sb, this.h, " }");
    }
}
