package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends ai1 implements Comparable {
    public final int e;
    public final int f;

    public sh1(int i, yo8 yo8Var, int i2, vh1 vh1Var, int i3) {
        int i4;
        super(i, yo8Var, i2);
        this.e = bl4.l(i3, vh1Var.t0) ? 1 : 0;
        b bVar = this.d;
        int i5 = bVar.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = bVar.v) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.ai1
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ai1
    public final /* bridge */ /* synthetic */ boolean b(ai1 ai1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((sh1) obj).f);
    }
}
