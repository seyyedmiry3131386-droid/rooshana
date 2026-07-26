package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends z0 implements RandomAccess {
    public final z0 a;
    public final int b;
    public final int c;

    public y0(z0 z0Var, int i, int i2) {
        this.a = z0Var;
        this.b = i;
        is3.l(i, i2, z0Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.o
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        is3.l(i, i2, this.c);
        int i3 = this.b;
        return new y0(this.a, i + i3, i3 + i2);
    }
}
