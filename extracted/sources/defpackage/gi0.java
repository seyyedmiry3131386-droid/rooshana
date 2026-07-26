package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 implements qp2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ wy5 b;
    public final /* synthetic */ a c;

    public gi0(long j, wy5 wy5Var, a aVar) {
        this.a = j;
        this.b = wy5Var;
        this.c = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            yq2.I(this.a, ((zv8) qz0Var.j(bw8.a)).m, s7.X(417635459, new qa0(this.b, this.c, 1), qz0Var), qz0Var, 384);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
