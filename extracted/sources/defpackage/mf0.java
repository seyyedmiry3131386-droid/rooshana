package defpackage;

import androidx.compose.material3.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf0 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ mf0(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        o87 o87Var = (o87) obj;
        switch (this.a) {
            case 0:
                n nVar = this.b;
                float fE = nVar.d.e();
                float fC = nVar.d.d().c();
                float f = fE < fC ? fC - fE : 0.0f;
                o87Var.j(f > 0.0f ? (Float.intBitsToFloat((int) (o87Var.n & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & o87Var.n)) : 1.0f);
                o87Var.n(lb7.a(0.5f, 0.0f));
                break;
            default:
                n nVar2 = this.b;
                float fE2 = nVar2.d.e();
                float fC2 = nVar2.d.d().c();
                float f2 = fE2 < fC2 ? fC2 - fE2 : 0.0f;
                o87Var.j(f2 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (o87Var.n & 4294967295L)) + f2) / Float.intBitsToFloat((int) (o87Var.n & 4294967295L))) : 1.0f);
                o87Var.n(lb7.a(0.5f, 0.0f));
                break;
        }
        return tx8.a;
    }
}
