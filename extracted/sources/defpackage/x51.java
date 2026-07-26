package defpackage;

import androidx.compose.foundation.text.HandleState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x51 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x44 b;

    public /* synthetic */ x51(x44 x44Var, int i) {
        this.a = i;
        this.b = x44Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                v04 v04Var = (v04) obj;
                si8 si8VarD = this.b.d();
                if (si8VarD != null) {
                    si8VarD.c = v04Var;
                }
                return tx8.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((s08) this.b.q).setValue(bool);
                return tx8.a;
            case 2:
                x44 x44Var = this.b;
                wb5 wb5Var = x44Var.t;
                zh8 zh8Var = (zh8) obj;
                String str = zh8Var.a.b;
                ll llVar = x44Var.j;
                if (!js3.i(str, llVar != null ? llVar.b : null)) {
                    ((s08) x44Var.k).setValue(HandleState.a);
                    if (((Boolean) ((s08) wb5Var).getValue()).booleanValue()) {
                        ((s08) wb5Var).setValue(Boolean.FALSE);
                    } else {
                        ((s08) x44Var.s).setValue(Boolean.FALSE);
                    }
                }
                long j = zi8.b;
                x44Var.f(j);
                x44Var.e(j);
                x44Var.u.invoke(zh8Var);
                my6 my6Var = x44Var.b;
                ny6 ny6Var = my6Var.a;
                if (ny6Var != null) {
                    ny6Var.c(my6Var, null);
                }
                return tx8.a;
            case 3:
                this.b.r.x(((bj3) obj).a);
                return tx8.a;
            default:
                return Boolean.valueOf(this.b.r.x(((bj3) obj).a));
        }
    }
}
