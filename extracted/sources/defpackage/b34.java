package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class b34 implements u48 {
    public final int a;
    public final int b;
    public final wb5 c;
    public int d;

    public b34(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = g.g(ok4.Z(Math.max(i4 - i3, 0), i4 + i2 + i3), th0.t);
        this.d = i;
    }

    public final void a(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            ((s08) this.c).setValue(ok4.Z(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return (uq3) ((s08) this.c).getValue();
    }
}
