package defpackage;

import androidx.compose.material3.internal.d;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ie implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ ie(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                wb5 wb5Var = dVar.k;
                wb5 wb5Var2 = dVar.g;
                Object value = ((s08) wb5Var).getValue();
                if (value != null) {
                    return value;
                }
                float fE = dVar.e();
                return !Float.isNaN(fE) ? dVar.c(fE, 0.0f, ((s08) wb5Var2).getValue()) : ((s08) wb5Var2).getValue();
            case 1:
                d dVar2 = this.b;
                wb5 wb5Var3 = dVar2.k;
                wb5 wb5Var4 = dVar2.g;
                Object value2 = ((s08) wb5Var3).getValue();
                if (value2 != null) {
                    return value2;
                }
                float fE2 = dVar2.e();
                if (Float.isNaN(fE2)) {
                    return ((s08) wb5Var4).getValue();
                }
                Object value3 = ((s08) wb5Var4).getValue();
                dh4 dh4VarD = dVar2.d();
                float fD = dh4VarD.d(value3);
                if (fD != fE2 && !Float.isNaN(fD)) {
                    if (fD < fE2) {
                        Object objB = dh4VarD.b(fE2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = dh4VarD.b(fE2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                return this.b.d();
            default:
                d dVar3 = this.b;
                return new Pair(dVar3.d(), dVar3.h.getValue());
        }
    }
}
