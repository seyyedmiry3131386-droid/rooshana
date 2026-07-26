package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.f;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u51 implements dp2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u51(x44 x44Var, qg2 qg2Var, boolean z, f fVar, rr5 rr5Var) {
        this.c = x44Var;
        this.d = qg2Var;
        this.b = z;
        this.e = fVar;
        this.f = rr5Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        Object obj2 = this.f;
        boolean z = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                x44 x44Var = (x44) obj5;
                qg2 qg2Var = (qg2) obj4;
                f fVar = (f) obj3;
                rr5 rr5Var = (rr5) obj2;
                nr5 nr5Var = (nr5) obj;
                if (x44Var.b()) {
                    h18 h18Var = x44Var.c;
                    if (h18Var != null) {
                        ((cj1) h18Var).b();
                    }
                } else {
                    qg2 qg2Var2 = qg2.b;
                    qg2Var.a();
                }
                if (x44Var.b() && z) {
                    if (x44Var.a() == HandleState.b) {
                        fVar.i(nr5Var);
                    } else {
                        si8 si8VarD = x44Var.d();
                        if (si8VarD != null) {
                            long j = nr5Var.a;
                            do3 do3Var = x44Var.d;
                            x51 x51Var = x44Var.v;
                            int iH = rr5Var.h(si8VarD.b(j, true));
                            x51Var.invoke(zh8.a((zh8) do3Var.a, null, uy6.b(iH, iH), 5));
                            if (x44Var.a.a.b.length() > 0) {
                                ((s08) x44Var.k).setValue(HandleState.c);
                            }
                        }
                    }
                }
                break;
            default:
                ei5 ei5Var = (ei5) obj;
                js3.p(ei5Var, "entry");
                ((Ref$BooleanRef) obj5).a = true;
                ((Ref$BooleanRef) obj4).a = true;
                ((ni5) obj3).m(ei5Var, z, (ov) obj2);
                break;
        }
        return tx8Var;
    }

    public /* synthetic */ u51(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, ni5 ni5Var, boolean z, ov ovVar) {
        this.c = ref$BooleanRef;
        this.d = ref$BooleanRef2;
        this.e = ni5Var;
        this.b = z;
        this.f = ovVar;
    }
}
