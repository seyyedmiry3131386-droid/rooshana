package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ho8 implements fi6 {
    public final int a;

    public ho8(int i) {
        this.a = i;
    }

    @Override // defpackage.fi6
    public final long a(vq3 vq3Var, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int iC = ((vq3Var.c() - i) / 2) + vq3Var.a;
        if (iC < 0) {
            iC = vq3Var.a;
        } else if (iC + i > ((int) (j >> 32))) {
            iC = vq3Var.c - i;
        }
        int i2 = vq3Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = vq3Var.d + i3;
        }
        return (((long) i4) & 4294967295L) | (((long) iC) << 32);
    }
}
