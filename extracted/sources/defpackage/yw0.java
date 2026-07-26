package defpackage;

import androidx.compose.foundation.text.selection.f;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ yw0(f fVar, a aVar, int i, int i2) {
        this.a = i2;
        this.b = fVar;
        this.c = aVar;
        this.d = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xq2.d(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            default:
                yh0.b(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
        }
        return tx8.a;
    }
}
