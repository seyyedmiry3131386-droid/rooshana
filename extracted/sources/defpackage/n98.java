package defpackage;

import androidx.compose.ui.input.pointer.b;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public final class n98 extends b {
    @Override // androidx.compose.ui.input.pointer.b
    public final void D0(yg6 yg6Var) {
        zg6 zg6Var = (zg6) y97.t(this, l.u);
        if (zg6Var != null) {
            ((df) zg6Var).a = yg6Var;
        }
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final boolean F0(int i) {
        return i == 3 || i == 4;
    }

    @Override // defpackage.fs8
    public final /* bridge */ /* synthetic */ Object l() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
