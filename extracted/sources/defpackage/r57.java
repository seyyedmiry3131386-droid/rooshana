package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r57 implements i21 {
    public final ir9 a;
    public final /* synthetic */ s57 b;

    public r57(s57 s57Var, ir9 ir9Var) {
        this.b = s57Var;
        this.a = ir9Var;
    }

    @Override // defpackage.i21
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                ir9 ir9Var = this.a;
                for (v47 v47Var : i29.e((Set) ir9Var.c)) {
                    if (!v47Var.c() && !v47Var.i()) {
                        v47Var.clear();
                        if (ir9Var.b) {
                            ((HashSet) ir9Var.d).add(v47Var);
                        } else {
                            v47Var.k();
                        }
                    }
                }
            }
        }
    }
}
