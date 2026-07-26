package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements kk {
    public final b49 a;
    public final mt8 b;
    public final Object c;
    public final dl d;
    public final dl e;
    public final dl f;
    public final Object g;
    public final long h;

    public vb1(wb1 wb1Var, mt8 mt8Var, Object obj, dl dlVar) {
        b49 b49Var = new b49(wb1Var.a);
        this.a = b49Var;
        this.b = mt8Var;
        this.c = obj;
        dl dlVar2 = (dl) mt8Var.b().invoke(obj);
        this.d = dlVar2;
        this.e = tv8.k(dlVar);
        dp2 dp2VarA = mt8Var.a();
        if (b49Var.d == null) {
            b49Var.d = dlVar2.c();
        }
        dl dlVar3 = b49Var.d;
        if (dlVar3 == null) {
            js3.V("targetVector");
            throw null;
        }
        int iB = dlVar3.b();
        int i = 0;
        while (true) {
            c35 c35Var = b49Var.a;
            if (i >= iB) {
                dl dlVar4 = b49Var.d;
                if (dlVar4 == null) {
                    js3.V("targetVector");
                    throw null;
                }
                this.g = dp2VarA.invoke(dlVar4);
                if (b49Var.c == null) {
                    b49Var.c = dlVar2.c();
                }
                dl dlVar5 = b49Var.c;
                if (dlVar5 == null) {
                    js3.V("velocityVector");
                    throw null;
                }
                int iB2 = dlVar5.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    dlVar2.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((yi) c35Var.b).b(dlVar.a(i2)) / (((double) zd2.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                dl dlVarK = tv8.k(this.a.a(jMax, this.d, dlVar));
                this.f = dlVarK;
                int iB3 = dlVarK.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    dl dlVar6 = this.f;
                    float fA = dlVar6.a(i3);
                    float f = this.a.e;
                    dlVar6.e(i3, ok4.s(fA, -f, f));
                }
                return;
            }
            dl dlVar7 = b49Var.d;
            if (dlVar7 == null) {
                js3.V("targetVector");
                throw null;
            }
            float fA2 = dlVar2.a(i);
            float fA3 = dlVar.a(i);
            yi yiVar = (yi) c35Var.b;
            double dB = yiVar.b(fA3);
            double d = zd2.a;
            int i4 = i;
            dlVar7.e(i4, (Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (yiVar.a * yiVar.b))))) + fA2);
            i = i4 + 1;
        }
    }

    @Override // defpackage.kk
    public final boolean a() {
        return false;
    }

    @Override // defpackage.kk
    public final long b() {
        return this.h;
    }

    @Override // defpackage.kk
    public final mt8 c() {
        return this.b;
    }

    @Override // defpackage.kk
    public final dl d(long j) {
        if (t61.a(this, j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }

    @Override // defpackage.kk
    public final /* synthetic */ boolean e(long j) {
        return t61.a(this, j);
    }

    @Override // defpackage.kk
    public final Object f(long j) {
        if (t61.a(this, j)) {
            return this.g;
        }
        dp2 dp2VarA = this.b.a();
        b49 b49Var = this.a;
        dl dlVar = b49Var.b;
        dl dlVar2 = this.d;
        if (dlVar == null) {
            b49Var.b = dlVar2.c();
        }
        dl dlVar3 = b49Var.b;
        if (dlVar3 == null) {
            js3.V("valueVector");
            throw null;
        }
        int iB = dlVar3.b();
        for (int i = 0; i < iB; i++) {
            dl dlVar4 = b49Var.b;
            if (dlVar4 == null) {
                js3.V("valueVector");
                throw null;
            }
            c35 c35Var = b49Var.a;
            float fA = dlVar2.a(i);
            long j2 = j / 1000000;
            yd2 yd2VarA = ((yi) c35Var.b).a(this.e.a(i));
            long j3 = yd2VarA.c;
            dlVar4.e(i, (Math.signum(yd2VarA.a) * yd2VarA.b * ig.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA);
        }
        dl dlVar5 = b49Var.b;
        if (dlVar5 != null) {
            return dp2VarA.invoke(dlVar5);
        }
        js3.V("valueVector");
        throw null;
    }

    @Override // defpackage.kk
    public final Object g() {
        return this.g;
    }
}
