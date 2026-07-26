package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tc7 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj1 b;
    public final /* synthetic */ wb5 c;

    public /* synthetic */ tc7(qj1 qj1Var, wb5 wb5Var, int i) {
        this.a = i;
        this.b = qj1Var;
        this.c = wb5Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.c.setValue(new au1(this.b.J((int) (((zq3) obj).a >> 32))));
                break;
            case 1:
                tu1 tu1Var = new tu1(5, (bp2) obj);
                tc7 tc7Var = new tc7(this.b, this.c, 2);
                if (qg4.a()) {
                    return qg4.a() ? new og4(tu1Var, tc7Var, Build.VERSION.SDK_INT == 28 ? u96.b : u96.c) : ex4.b;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                eu1 eu1Var = (eu1) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eu1Var.a >> 32));
                qj1 qj1Var = this.b;
                this.c.setValue(new zq3((((long) qj1Var.b0(fIntBitsToFloat)) << 32) | (((long) qj1Var.b0(Float.intBitsToFloat((int) (eu1Var.a & 4294967295L)))) & 4294967295L)));
                break;
        }
        return tx8.a;
    }
}
