package defpackage;

import androidx.compose.foundation.gestures.q;
import androidx.compose.ui.node.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag implements dp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ag(float f, og ogVar, tc0 tc0Var) {
        this.b = f;
        this.c = ogVar;
        this.d = tc0Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.b;
                og ogVar = (og) this.c;
                tc0 tc0Var = (tc0) this.d;
                i iVar = (i) obj;
                iVar.a();
                vm0 vm0Var = iVar.a;
                wv8 wv8Var = vm0Var.b;
                long jA = wv8Var.A();
                wv8Var.v().e();
                try {
                    nm5 nm5Var = (nm5) wv8Var.b;
                    nm5Var.z(f, 0.0f);
                    nm5Var.x(45.0f, 0L);
                    vm0Var.c(ogVar, tc0Var);
                    o40.F(wv8Var, jA);
                    return tx8.a;
                } catch (Throwable th) {
                    o40.F(wv8Var, jA);
                    throw th;
                }
            case 1:
                n08 n08Var = (n08) this.c;
                qj1 qj1Var = (qj1) this.d;
                js3.p((qj1) obj, "$this$offset");
                return new rq3((((long) 0) << 32) | (((long) ((-(n08Var.h() - ((int) qj1Var.S(this.b)))) / 2)) & 4294967295L));
            default:
                q qVar = (q) this.c;
                dp2 dp2Var = (dp2) this.d;
                long jLongValue = ((Long) obj).longValue();
                if (qVar.b == Long.MIN_VALUE) {
                    qVar.b = jLongValue;
                }
                float f2 = qVar.e;
                zk zkVar = new zk(f2);
                float f3 = this.b;
                zk zkVar2 = q.f;
                long jS = f3 == 0.0f ? qVar.a.s(new zk(f2), zkVar2, qVar.c) : ok4.W((jLongValue - qVar.b) / f3);
                float f4 = ((zk) qVar.a.q(jS, zkVar, zkVar2, qVar.c)).a;
                qVar.c = (zk) qVar.a.h(jS, zkVar, zkVar2, qVar.c);
                qVar.b = jLongValue;
                float f5 = qVar.e - f4;
                qVar.e = f4;
                dp2Var.invoke(Float.valueOf(f5));
                return tx8.a;
        }
    }

    public /* synthetic */ ag(n08 n08Var, qj1 qj1Var, float f) {
        this.c = n08Var;
        this.d = qj1Var;
        this.b = f;
    }

    public /* synthetic */ ag(q qVar, float f, dp2 dp2Var) {
        this.c = qVar;
        this.b = f;
        this.d = dp2Var;
    }
}
