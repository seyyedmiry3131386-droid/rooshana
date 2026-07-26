package androidx.compose.ui.graphics.layer;

import defpackage.dp2;
import defpackage.hv1;
import defpackage.nm5;
import defpackage.o40;
import defpackage.tx8;
import defpackage.u26;
import defpackage.wv8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements dp2 {
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(a aVar) {
        super(1);
        this.g = aVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        hv1 hv1Var = (hv1) obj;
        a aVar = this.g;
        u26 u26Var = aVar.l;
        if (aVar.n && aVar.w && u26Var != null) {
            wv8 wv8VarX = hv1Var.X();
            long jA = wv8VarX.A();
            wv8VarX.v().e();
            try {
                ((wv8) ((nm5) wv8VarX.b).b).v().i(u26Var);
                aVar.c(hv1Var);
            } finally {
                o40.F(wv8VarX, jA);
            }
        } else {
            aVar.c(hv1Var);
        }
        return tx8.a;
    }
}
