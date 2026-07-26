package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dx1 implements ho7, ix1 {
    public final ho7 a;
    public final int b;

    public dx1(ho7 ho7Var, int i) {
        js3.p(ho7Var, "sequence");
        this.a = ho7Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.ix1
    public final ho7 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new dx1(this, i) : new dx1(this.a, i2);
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        return new cx1(this);
    }
}
