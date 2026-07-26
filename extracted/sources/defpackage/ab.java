package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ab {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final jp4[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final long i;
    public final boolean j;
    public final boolean k;

    static {
        String str = j29.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(3, 36);
        p = Integer.toString(4, 36);
        q = Integer.toString(5, 36);
        r = Integer.toString(6, 36);
        s = Integer.toString(7, 36);
        t = Integer.toString(8, 36);
        u = Integer.toString(9, 36);
        v = Integer.toString(10, 36);
    }

    public ab(long j, int i, int i2, int[] iArr, jp4[] jp4VarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        vy2.j(iArr.length == jp4VarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = jp4VarArr;
        this.g = jArr;
        this.i = j2;
        this.j = z;
        this.d = new Uri[jp4VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.k = z2;
                return;
            }
            jp4 jp4Var = jp4VarArr[i3];
            if (jp4Var == null) {
                uri = null;
            } else {
                fp4 fp4Var = jp4Var.b;
                fp4Var.getClass();
                uri = fp4Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.j || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ab.class == obj.getClass()) {
            ab abVar = (ab) obj;
            if (this.a == abVar.a && this.b == abVar.b && this.c == abVar.c && Arrays.equals(this.e, abVar.e) && Arrays.equals(this.f, abVar.f) && Arrays.equals(this.g, abVar.g) && this.i == abVar.i && this.j == abVar.j && Arrays.equals(this.h, abVar.h) && this.k == abVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.i;
        return ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.j ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (this.k ? 1 : 0);
    }
}
