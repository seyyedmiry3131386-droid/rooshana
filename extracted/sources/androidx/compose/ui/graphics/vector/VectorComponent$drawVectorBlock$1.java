package androidx.compose.ui.graphics.vector;

import defpackage.dp2;
import defpackage.hv1;
import defpackage.nm5;
import defpackage.o40;
import defpackage.tx8;
import defpackage.wv8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class VectorComponent$drawVectorBlock$1 extends Lambda implements dp2 {
    public final /* synthetic */ c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(c cVar) {
        super(1);
        this.g = cVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        hv1 hv1Var = (hv1) obj;
        c cVar = this.g;
        a aVar = cVar.b;
        float f = cVar.k;
        float f2 = cVar.l;
        wv8 wv8VarX = hv1Var.X();
        long jA = wv8VarX.A();
        wv8VarX.v().e();
        try {
            ((nm5) wv8VarX.b).y(f, f2, 0L);
            aVar.a(hv1Var);
            o40.F(wv8VarX, jA);
            return tx8.a;
        } catch (Throwable th) {
            o40.F(wv8VarX, jA);
            throw th;
        }
    }
}
