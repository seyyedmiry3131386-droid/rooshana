package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mi2 implements ki2 {
    public final float[] a;
    public final float[] b;

    public mi2(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.ki2
    public final float a(float f) {
        return fv.n(f, this.b, this.a);
    }

    @Override // defpackage.ki2
    public final float b(float f) {
        return fv.n(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mi2)) {
            return false;
        }
        mi2 mi2Var = (mi2) obj;
        return Arrays.equals(this.a, mi2Var.a) && Arrays.equals(this.b, mi2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        js3.o(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        js3.o(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
