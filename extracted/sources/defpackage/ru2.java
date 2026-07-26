package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 {
    public final float[] a;
    public final int[] b;

    public ru2(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(ru2 ru2Var) {
        int i = 0;
        while (true) {
            int[] iArr = ru2Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = ru2Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final ru2 b(float[] fArr) {
        int iS;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iS = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iS = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iS = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iS = ub1.s((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iS;
        }
        return new ru2(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ru2.class == obj.getClass()) {
            ru2 ru2Var = (ru2) obj;
            if (Arrays.equals(this.a, ru2Var.a) && Arrays.equals(this.b, ru2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
