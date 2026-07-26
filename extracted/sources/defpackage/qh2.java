package defpackage;

import androidx.compose.ui.text.font.a;

/* JADX INFO: loaded from: classes.dex */
public final class qh2 implements oh2 {
    public final a a;
    public final kg b;
    public final rn6 c;
    public final uh2 d;
    public final ck4 e;
    public final m22 f;

    public qh2(a aVar, kg kgVar) {
        rn6 rn6Var = rh2.a;
        uh2 uh2Var = new uh2(rh2.b);
        ck4 ck4Var = new ck4(10);
        this.a = aVar;
        this.b = kgVar;
        this.c = rn6Var;
        this.d = uh2Var;
        this.e = ck4Var;
        this.f = new m22(3, this);
    }

    public final qv8 a(final nv8 nv8Var) {
        rn6 rn6Var = this.c;
        dp2 dp2Var = new dp2() { // from class: androidx.compose.ui.text.font.d
            /* JADX WARN: Removed duplicated region for block: B:174:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0326 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:190:0x0327  */
            /* JADX WARN: Removed duplicated region for block: B:192:0x032f A[RETURN] */
            @Override // defpackage.dp2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r18) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 816
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.d.invoke(java.lang.Object):java.lang.Object");
            }
        };
        synchronized (((rl3) rn6Var.b)) {
            qv8 qv8Var = (qv8) ((lg4) rn6Var.c).get(nv8Var);
            if (qv8Var != null) {
                if (qv8Var.b()) {
                    return qv8Var;
                }
            }
            try {
                qv8 qv8Var2 = (qv8) dp2Var.invoke(new nr8(rn6Var, nv8Var, 3));
                synchronized (((rl3) rn6Var.b)) {
                    if (((lg4) rn6Var.c).get(nv8Var) == null && qv8Var2.b()) {
                        ((lg4) rn6Var.c).put(nv8Var, qv8Var2);
                    }
                }
                return qv8Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final qv8 b(ph2 ph2Var, fj2 fj2Var, int i, int i2) {
        kg kgVar = this.b;
        kgVar.getClass();
        int i3 = kgVar.a;
        fj2 fj2Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? fj2Var : new fj2(ok4.t(fj2Var.a + i3, 1, 1000));
        this.a.getClass();
        return a(new nv8(ph2Var, fj2Var2, i, i2, null));
    }
}
