package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf5 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf5 b;
    public final /* synthetic */ a c;

    public /* synthetic */ vf5(wf5 wf5Var, a aVar, int i) {
        this.a = 2;
        this.b = wf5Var;
        this.c = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wf5 wf5Var = this.b;
                    aw8.a(wf5Var, s7.X(-1672543925, new vf5(wf5Var, this.c, 1, (byte) 0), qz0Var), qz0Var, 48);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (qz0Var.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mi8.a(this.b.h, this.c, qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                num.getClass();
                aw8.a(this.b, this.c, qz0Var, hs9.W(49));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ vf5(wf5 wf5Var, a aVar, int i, byte b) {
        this.a = i;
        this.b = wf5Var;
        this.c = aVar;
    }
}
