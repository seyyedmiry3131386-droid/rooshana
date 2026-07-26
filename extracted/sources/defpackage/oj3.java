package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oj3 extends z0 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final List d;

    public oj3(w1 w1Var, int i, int i2) {
        this.d = w1Var;
        this.b = i;
        dy3.k(i, i2, w1Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.o
    public final int a() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return ((ArrayList) this.d).size() + this.b + this.c;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                dy3.i(i, this.c);
                return ((w1) this.d).get(this.b + i);
            default:
                ArrayList arrayList = (ArrayList) this.d;
                int i2 = this.b;
                if (i < 0 || i >= i2) {
                    if (i < arrayList.size() + i2 && i2 <= i) {
                        return arrayList.get(i - i2);
                    }
                    int size = arrayList.size() + i2;
                    if (i >= a() || size > i) {
                        StringBuilder sbR = rm7.r(i, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
                        sbR.append(a());
                        throw new IndexOutOfBoundsException(sbR.toString());
                    }
                }
                return null;
        }
    }

    @Override // defpackage.z0, java.util.List
    public List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                dy3.k(i, i2, this.c);
                w1 w1Var = (w1) this.d;
                int i3 = this.b;
                return new oj3(w1Var, i + i3, i3 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public oj3(ArrayList arrayList, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }
}
