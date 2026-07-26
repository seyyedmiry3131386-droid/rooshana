package defpackage;

import androidx.compose.foundation.gestures.n;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah7 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ ah7(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.n);
            default:
                d dVar = this.b.P;
                if (!dVar.a.n) {
                    return null;
                }
                FocusStateImpl focusStateImplH0 = dVar.H0();
                if (!focusStateImplH0.a()) {
                    return null;
                }
                if (focusStateImplH0.b()) {
                    return dVar.F0(null);
                }
                d dVarF = ((c) y40.I(dVar).getFocusOwner()).f();
                if (dVarF != null) {
                    return dVarF.F0(y40.G(dVar));
                }
                return null;
        }
    }
}
