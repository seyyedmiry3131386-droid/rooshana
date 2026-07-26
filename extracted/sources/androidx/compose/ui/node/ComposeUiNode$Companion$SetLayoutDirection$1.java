package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.gx4;
import defpackage.hz0;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements qp2 {
    static {
        new ComposeUiNode$Companion$SetLayoutDirection$1();
    }

    public ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        LayoutDirection layoutDirection = (LayoutDirection) obj2;
        h hVar = (h) ((hz0) obj);
        if (hVar.B != layoutDirection) {
            hVar.B = layoutDirection;
            hVar.Q();
            h hVarF = hVar.F();
            if (hVarF != null) {
                hVarF.O();
            }
            hVar.P();
            for (gx4 gx4Var = (gx4) hVar.H.g; gx4Var != null; gx4Var = gx4Var.f) {
                gx4Var.v0();
            }
        }
        return tx8.a;
    }
}
