package defpackage;

import android.view.View;
import androidx.compose.ui.platform.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc4 {
    public static final s01 a = new s01(new ob4(7));

    public static x79 a(qz0 qz0Var) {
        x79 x79VarG = (x79) qz0Var.j(a);
        if (x79VarG == null) {
            qz0Var.a0(1260197608);
            x79VarG = z27.g((View) qz0Var.j(e.f));
        } else {
            qz0Var.a0(1260196492);
        }
        qz0Var.q(false);
        return x79VarG;
    }
}
