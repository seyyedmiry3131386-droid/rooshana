package defpackage;

import android.os.Build;
import androidx.compose.ui.input.pointer.b;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public final class xg6 extends b {
    @Override // androidx.compose.ui.input.pointer.b
    public final void D0(yg6 yg6Var) {
        zg6 zg6Var = (zg6) y97.t(this, l.u);
        if (zg6Var != null) {
            df dfVar = (df) zg6Var;
            if (yg6Var == null) {
                yg6.a.getClass();
                yg6Var = bt2.j;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                nf.a.a(dfVar.b, yg6Var);
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final boolean F0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    @Override // defpackage.fs8
    public final /* bridge */ /* synthetic */ Object l() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
