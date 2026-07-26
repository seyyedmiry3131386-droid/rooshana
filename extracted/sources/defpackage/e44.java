package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e44 implements dl4 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final z34 d;
    public final boolean e;
    public final ol3 f;
    public final pj9 g;
    public final tj1 h;
    public final List i;
    public final e51 j;

    public e44(int[] iArr, int[] iArr2, float f, z34 z34Var, boolean z, ol3 ol3Var, pj9 pj9Var, tj1 tj1Var, List list, e51 e51Var) {
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = z34Var;
        this.e = z;
        this.f = ol3Var;
        this.g = pj9Var;
        this.h = tj1Var;
        this.i = list;
        this.j = e51Var;
        Orientation orientation = Orientation.a;
    }

    @Override // defpackage.dl4
    public final int a() {
        return 0;
    }

    @Override // defpackage.dl4
    public final int b() {
        return 0;
    }

    @Override // defpackage.dl4
    public final Map c() {
        return this.d.b;
    }

    @Override // defpackage.dl4
    public final dp2 e() {
        return null;
    }

    public final e44 f(int i) {
        List list = this.i;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.b;
        if (iArr2.length == 0) {
            return null;
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr3[i2] = iArr2[i2] - i;
        }
        return new e44(iArr, iArr3, i, this.d, this.e || i > 0, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.dl4
    public final void d() {
    }
}
