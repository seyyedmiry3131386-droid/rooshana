package defpackage;

import androidx.media3.common.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qp8 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final yo8 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = j29.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public qp8(yo8 yo8Var, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = yo8Var.a;
        this.a = i2;
        boolean z2 = false;
        vy2.j(i2 == iArr.length && i2 == zArr.length);
        this.b = yo8Var;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final b a(int i2) {
        return this.b.d[i2];
    }

    public final boolean b(int i2) {
        return this.d[i2] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qp8.class == obj.getClass()) {
            qp8 qp8Var = (qp8) obj;
            if (this.c == qp8Var.c && this.b.equals(qp8Var.b) && Arrays.equals(this.d, qp8Var.d) && Arrays.equals(this.e, qp8Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
