package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g61 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h61 b;

    public /* synthetic */ g61(h61 h61Var, int i) {
        this.a = i;
        this.b = h61Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        h61 h61Var = this.b;
        switch (i) {
            case 0:
                wb5 wb5Var = h61Var.s.t;
                Boolean bool = Boolean.TRUE;
                ((s08) wb5Var).setValue(bool);
                ((s08) h61Var.s.s).setValue(bool);
                x44 x44Var = h61Var.s;
                CharSequence charSequenceB = ((gg) ((gc2) obj)).b();
                js3.n(charSequenceB, "null cannot be cast to non-null type kotlin.String");
                h61.F0(x44Var, (String) charSequenceB, h61Var.t);
                return bool;
            case 1:
                List list = (List) obj;
                if (h61Var.s.d() != null) {
                    si8 si8VarD = h61Var.s.d();
                    js3.m(si8VarD);
                    list.add(si8VarD.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                h61.F0(h61Var.s, ((ll) obj).b, h61Var.t);
                return Boolean.TRUE;
            default:
                ll llVar = (ll) obj;
                if (h61Var.t) {
                    ji8 ji8Var = h61Var.s.e;
                    if (ji8Var != null) {
                        List listC = br9.C(new rc2(), new xw0(llVar, 1));
                        x44 x44Var2 = h61Var.s;
                        do3 do3Var = x44Var2.d;
                        x51 x51Var = x44Var2.v;
                        zh8 zh8VarL = do3Var.l(listC);
                        ji8Var.a(null, zh8VarL);
                        x51Var.invoke(zh8VarL);
                    } else {
                        zh8 zh8Var = h61Var.r;
                        String str = zh8Var.a.b;
                        long j = zh8Var.b;
                        int i2 = zi8.c;
                        String string = f88.v0(str, (int) (j >> 32), (int) (j & 4294967295L), llVar).toString();
                        int length = llVar.b.length() + ((int) (h61Var.r.b >> 32));
                        h61Var.s.v.invoke(new zh8(string, uy6.b(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ g61(h61 h61Var, nn7 nn7Var) {
        this.a = 3;
        this.b = h61Var;
    }
}
