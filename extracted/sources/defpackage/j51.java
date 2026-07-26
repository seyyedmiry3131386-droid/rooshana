package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.material3.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j51 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ j51(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        o87 o87Var = (o87) obj;
        switch (this.a) {
            case 0:
                js3.p(o87Var, "$this$graphicsLayer");
                o87Var.b(((Number) this.b.d()).floatValue());
                break;
            case 1:
                js3.p(o87Var, "$this$graphicsLayer");
                o87Var.h(((Number) this.b.d()).floatValue());
                break;
            default:
                float fFloatValue = ((Number) this.b.d()).floatValue();
                float fD = k.d(o87Var, fFloatValue);
                float fE = k.e(o87Var, fFloatValue);
                o87Var.j(fE == 0.0f ? 1.0f : fD / fE);
                o87Var.n(k.c);
                break;
        }
        return tx8.a;
    }
}
