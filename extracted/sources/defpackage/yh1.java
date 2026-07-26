package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.p1;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 extends ai1 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public yh1(int i, yo8 yo8Var, int i2, vh1 vh1Var, int i3, String str, String str2) {
        int iD;
        super(i, yo8Var, i2);
        int i4 = 0;
        this.f = bl4.l(i3, false);
        int i5 = this.d.e;
        int i6 = vh1Var.y;
        ImmutableList immutableList = vh1Var.v;
        int i7 = i5 & (~i6);
        this.g = (i7 & 1) != 0;
        this.h = (i7 & 2) != 0;
        ImmutableList immutableListS = str2 != null ? ImmutableList.s(str2) : immutableList.isEmpty() ? ImmutableList.s("") : immutableList;
        int i8 = 0;
        while (true) {
            if (i8 >= immutableListS.size()) {
                iD = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iD = ci1.d(this.d, (String) immutableListS.get(i8), vh1Var.z);
                if (iD > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.i = i8;
        this.j = iD;
        int i9 = str2 != null ? 1088 : vh1Var.w;
        int i10 = this.d.f;
        p1 p1Var = ci1.l;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.k = iBitCount;
        this.m = (1088 & this.d.f) != 0;
        int iD2 = ci1.d(this.d, str, ci1.g(str) == null);
        this.l = iD2;
        boolean z = iD > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.g || (this.h && iD2 > 0);
        if (bl4.l(i3, vh1Var.t0) && z) {
            i4 = 1;
        }
        this.e = i4;
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
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yh1 yh1Var) {
        dx0 dx0VarC = dx0.a.d(this.f, yh1Var.f).c(Integer.valueOf(this.i), Integer.valueOf(yh1Var.i), p1.c().h());
        int i = yh1Var.j;
        int i2 = this.j;
        dx0 dx0VarA = dx0VarC.a(i2, i);
        int i3 = yh1Var.k;
        int i4 = this.k;
        dx0 dx0VarA2 = dx0VarA.a(i4, i3).d(this.g, yh1Var.g).c(Boolean.valueOf(this.h), Boolean.valueOf(yh1Var.h), i2 == 0 ? p1.c() : p1.c().h()).a(this.l, yh1Var.l);
        if (i4 == 0) {
            dx0VarA2 = dx0VarA2.e(this.m, yh1Var.m);
        }
        return dx0VarA2.f();
    }
}
