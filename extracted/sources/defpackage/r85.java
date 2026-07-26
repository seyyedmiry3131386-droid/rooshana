package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r85 extends hh0 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public r85(int i, long j) {
        super(i);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final r85 f(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r85 r85Var = (r85) arrayList.get(i2);
            if (r85Var.b == i) {
                return r85Var;
            }
        }
        return null;
    }

    public final s85 g(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s85 s85Var = (s85) arrayList.get(i2);
            if (s85Var.b == i) {
                return s85Var;
            }
        }
        return null;
    }

    @Override // defpackage.hh0
    public final String toString() {
        return hh0.c(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
