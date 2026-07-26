package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class va5 {
    public float[] a;
    public int b;

    public va5(int i) {
        this.a = i == 0 ? ke2.a : new float[i];
    }

    public static String c(va5 va5Var, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        va5Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = va5Var.a;
        int i2 = va5Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) str2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i3++;
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            js3.o(fArrCopyOf, "copyOf(...)");
            this.a = fArrCopyOf;
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        lb7.k("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof va5) {
            va5 va5Var = (va5) obj;
            int i = va5Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = va5Var.a;
                uq3 uq3VarZ = ok4.Z(0, i2);
                int i3 = uq3VarZ.a;
                int i4 = uq3VarZ.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iFloatToIntBits = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i2]) * 31;
        }
        return iFloatToIntBits;
    }

    public final String toString() {
        return c(this, 25);
    }
}
