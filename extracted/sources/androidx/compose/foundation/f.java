package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.material3.m;
import defpackage.ab5;
import defpackage.bp2;
import defpackage.dy3;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.qm3;
import defpackage.tx3;
import defpackage.v97;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static hx4 a(hx4 hx4Var, ab5 ab5Var, m mVar, boolean z, v97 v97Var, bp2 bp2Var, int i) {
        hx4 hx4VarD;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            v97Var = null;
        }
        v97 v97Var2 = v97Var;
        if (mVar != null) {
            hx4VarD = new ClickableElement(ab5Var, mVar, false, z2, null, v97Var2, bp2Var);
        } else if (mVar == null) {
            hx4VarD = new ClickableElement(ab5Var, null, false, z2, null, v97Var2, bp2Var);
        } else {
            ex4 ex4Var = ex4.b;
            hx4VarD = ab5Var != null ? qm3.a(ex4Var, ab5Var, mVar).d(new ClickableElement(ab5Var, null, false, z2, null, v97Var2, bp2Var)) : androidx.compose.ui.b.a(ex4Var, new e(mVar, z2, v97Var2, bp2Var));
        }
        return hx4Var.d(hx4VarD);
    }

    public static hx4 b(hx4 hx4Var, boolean z, String str, v97 v97Var, bp2 bp2Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return hx4Var.d(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : v97Var, bp2Var));
    }

    public static final boolean c(KeyEvent keyEvent) {
        long jW = dy3.w(keyEvent);
        int i = tx3.F;
        return tx3.a(jW, tx3.h) || tx3.a(jW, tx3.r) || tx3.a(jW, tx3.E) || tx3.a(jW, tx3.q);
    }
}
