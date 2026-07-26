package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class cd3 {
    public final gh0 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public ox2[] e = new ox2[8];
    public int f = 7;

    public cd3(gh0 gh0Var) {
        this.a = gh0Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                ox2 ox2Var = this.e[length];
                js3.m(ox2Var);
                i -= ox2Var.c;
                int i4 = this.h;
                ox2 ox2Var2 = this.e[length];
                js3.m(ox2Var2);
                this.h = i4 - ox2Var2.c;
                this.g--;
                i3++;
                length--;
            }
            ox2[] ox2VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(ox2VarArr, i5, ox2VarArr, i5 + i3, this.g);
            ox2[] ox2VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(ox2VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(ox2 ox2Var) {
        int i = ox2Var.c;
        int i2 = this.d;
        if (i > i2) {
            ox2[] ox2VarArr = this.e;
            ew.F0(0, ox2VarArr.length, null, ox2VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        ox2[] ox2VarArr2 = this.e;
        if (i3 > ox2VarArr2.length) {
            ox2[] ox2VarArr3 = new ox2[ox2VarArr2.length * 2];
            System.arraycopy(ox2VarArr2, 0, ox2VarArr3, ox2VarArr2.length, ox2VarArr2.length);
            this.f = this.e.length - 1;
            this.e = ox2VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = ox2Var;
        this.g++;
        this.h += i;
    }

    public final void c(ByteString byteString) throws EOFException {
        js3.p(byteString, "data");
        int[] iArr = we3.a;
        int iE = byteString.e();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iE; i++) {
            byte bJ = byteString.j(i);
            byte[] bArr = gh9.a;
            j2 += (long) we3.b[bJ & 255];
        }
        int i2 = (int) ((j2 + ((long) 7)) >> 3);
        int iE2 = byteString.e();
        gh0 gh0Var = this.a;
        if (i2 >= iE2) {
            e(byteString.e(), 127, 0);
            gh0Var.L0(byteString);
            return;
        }
        gh0 gh0Var2 = new gh0();
        int[] iArr2 = we3.a;
        int iE3 = byteString.e();
        int i3 = 0;
        for (int i4 = 0; i4 < iE3; i4++) {
            byte bJ2 = byteString.j(i4);
            byte[] bArr2 = gh9.a;
            int i5 = bJ2 & 255;
            int i6 = we3.a[i5];
            byte b = we3.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                gh0Var2.R0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            gh0Var2.R0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringV = gh0Var2.v(gh0Var2.b);
        e(byteStringV.e(), 127, 128);
        gh0Var.L0(byteStringV);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        gh0 gh0Var = this.a;
        if (i < i2) {
            gh0Var.R0(i | i3);
            return;
        }
        gh0Var.R0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            gh0Var.R0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        gh0Var.R0(i4);
    }
}
