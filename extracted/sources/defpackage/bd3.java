package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class bd3 {
    public final tv6 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public ox2[] d = new ox2[8];
    public int e = 7;

    public bd3(ce3 ce3Var) {
        this.c = rf0.j(ce3Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                ox2 ox2Var = this.d[length];
                js3.m(ox2Var);
                int i4 = ox2Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            ox2[] ox2VarArr = this.d;
            System.arraycopy(ox2VarArr, i2 + 1, ox2VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final ByteString b(int i) throws IOException {
        if (i >= 0) {
            ox2[] ox2VarArr = dd3.a;
            if (i <= ox2VarArr.length - 1) {
                return ox2VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - dd3.a.length);
        if (length >= 0) {
            ox2[] ox2VarArr2 = this.d;
            if (length < ox2VarArr2.length) {
                ox2 ox2Var = ox2VarArr2[length];
                js3.m(ox2Var);
                return ox2Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(ox2 ox2Var) {
        this.b.add(ox2Var);
        int i = ox2Var.c;
        int i2 = this.a;
        if (i > i2) {
            ox2[] ox2VarArr = this.d;
            ew.F0(0, ox2VarArr.length, null, ox2VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        ox2[] ox2VarArr2 = this.d;
        if (i3 > ox2VarArr2.length) {
            ox2[] ox2VarArr3 = new ox2[ox2VarArr2.length * 2];
            System.arraycopy(ox2VarArr2, 0, ox2VarArr3, ox2VarArr2.length, ox2VarArr2.length);
            this.e = this.d.length - 1;
            this.d = ox2VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = ox2Var;
        this.f++;
        this.g += i;
    }

    public final ByteString d() {
        tv6 tv6Var = this.c;
        byte b = tv6Var.readByte();
        byte[] bArr = gh9.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return tv6Var.v(jE);
        }
        gh0 gh0Var = new gh0();
        int[] iArr = we3.a;
        js3.p(tv6Var, "source");
        xr5 xr5Var = we3.c;
        xr5 xr5Var2 = xr5Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = tv6Var.readByte();
            byte[] bArr2 = gh9.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                xr5[] xr5VarArr = (xr5[]) xr5Var2.c;
                js3.m(xr5VarArr);
                xr5Var2 = xr5VarArr[(i2 >>> (i3 - 8)) & 255];
                js3.m(xr5Var2);
                if (((xr5[]) xr5Var2.c) == null) {
                    gh0Var.R0(xr5Var2.a);
                    i3 -= xr5Var2.b;
                    xr5Var2 = xr5Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            xr5[] xr5VarArr2 = (xr5[]) xr5Var2.c;
            js3.m(xr5VarArr2);
            xr5 xr5Var3 = xr5VarArr2[(i2 << (8 - i3)) & 255];
            js3.m(xr5Var3);
            int i4 = xr5Var3.b;
            if (((xr5[]) xr5Var3.c) != null || i4 > i3) {
                break;
            }
            gh0Var.R0(xr5Var3.a);
            i3 -= i4;
            xr5Var2 = xr5Var;
        }
        return gh0Var.v(gh0Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = gh9.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
