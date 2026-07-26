package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class qv4 {
    public final SparseArray a;
    public lv8 b;

    public qv4(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(lv8 lv8Var, int i, int i2) {
        int iA = lv8Var.a(i);
        SparseArray sparseArray = this.a;
        qv4 qv4Var = sparseArray == null ? null : (qv4) sparseArray.get(iA);
        if (qv4Var == null) {
            qv4Var = new qv4(1);
            sparseArray.put(lv8Var.a(i), qv4Var);
        }
        if (i2 > i) {
            qv4Var.a(lv8Var, i + 1, i2);
        } else {
            qv4Var.b = lv8Var;
        }
    }
}
