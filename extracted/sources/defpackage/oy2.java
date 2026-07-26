package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class oy2 extends f31 {
    public f31[] u0 = new f31[4];
    public int v0 = 0;

    public final void S(f31 f31Var) {
        if (f31Var == this || f31Var == null) {
            return;
        }
        int i = this.v0 + 1;
        f31[] f31VarArr = this.u0;
        if (i > f31VarArr.length) {
            this.u0 = (f31[]) Arrays.copyOf(f31VarArr, f31VarArr.length * 2);
        }
        f31[] f31VarArr2 = this.u0;
        int i2 = this.v0;
        f31VarArr2[i2] = f31Var;
        this.v0 = i2 + 1;
    }

    public final void T(int i, zd9 zd9Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            f31 f31Var = this.u0[i2];
            ArrayList arrayList2 = zd9Var.a;
            if (!arrayList2.contains(f31Var)) {
                arrayList2.add(f31Var);
            }
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            dy3.t(this.u0[i3], i, arrayList, zd9Var);
        }
    }

    @Override // defpackage.f31
    public void g(f31 f31Var, HashMap map) {
        super.g(f31Var, map);
        oy2 oy2Var = (oy2) f31Var;
        this.v0 = 0;
        int i = oy2Var.v0;
        for (int i2 = 0; i2 < i; i2++) {
            S((f31) map.get(oy2Var.u0[i2]));
        }
    }

    public void U() {
    }
}
