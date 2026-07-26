package defpackage;

import androidx.media3.common.b;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i76 implements iv4 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public i76(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static i76 d(h26 h26Var) {
        int iJ = h26Var.j();
        String strM = tv4.m(h26Var.v(h26Var.j(), StandardCharsets.US_ASCII));
        String strV = h26Var.v(h26Var.j(), StandardCharsets.UTF_8);
        int iJ2 = h26Var.j();
        int iJ3 = h26Var.j();
        int iJ4 = h26Var.j();
        int iJ5 = h26Var.j();
        int iJ6 = h26Var.j();
        byte[] bArr = new byte[iJ6];
        h26Var.h(bArr, 0, iJ6);
        return new i76(iJ, strM, strV, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    @Override // defpackage.iv4
    public final void b(pp4 pp4Var) {
        pp4Var.a(this.a, this.h);
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i76.class == obj.getClass()) {
            i76 i76Var = (i76) obj;
            if (this.a == i76Var.a && this.b.equals(i76Var.b) && this.c.equals(i76Var.c) && this.d == i76Var.d && this.e == i76Var.e && this.f == i76Var.f && this.g == i76Var.g && Arrays.equals(this.h, i76Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((rm7.k(this.c, rm7.k(this.b, (527 + this.a) * 31, 31), 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
