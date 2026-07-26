package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ev implements dv, hv {
    public final float a;
    public final boolean b;
    public final qp2 c;
    public final float d;

    public ev(float f, boolean z, qp2 qp2Var) {
        this.a = f;
        this.b = z;
        this.c = qp2Var;
        this.d = f;
    }

    @Override // defpackage.dv, defpackage.hv
    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return au1.b(this.a, evVar.a) && this.b == evVar.b && this.c.equals(evVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((Float.floatToIntBits(this.a) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    @Override // defpackage.dv
    public final void k(qj1 qj1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iB0 = qj1Var.b0(this.a);
        boolean z = this.b && layoutDirection == LayoutDirection.b;
        fv fvVar = jv.a;
        if (z) {
            i2 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i3 = iArr[length];
                int iMin2 = Math.min(i2, i - i3);
                iArr2[length] = iMin2;
                iMin = Math.min(iB0, (i - iMin2) - i3);
                i2 = iArr2[length] + i3 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i4 = 0;
            i2 = 0;
            iMin = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = iArr[i4];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[i5] = iMin3;
                int iMin4 = Math.min(iB0, (i - iMin3) - i6);
                int i7 = iArr2[i5] + i6 + iMin4;
                i4++;
                iMin = iMin4;
                i2 = i7;
                i5++;
            }
        }
        int i8 = i2 - iMin;
        if (i8 < i) {
            int iIntValue = ((Number) this.c.invoke(Integer.valueOf(i - i8), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }
    }

    @Override // defpackage.hv
    public final void o(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        k(el4Var, i, iArr, LayoutDirection.a, iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) au1.c(this.a));
        sb.append(", ");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
