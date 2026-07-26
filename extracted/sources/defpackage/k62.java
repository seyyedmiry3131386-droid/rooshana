package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k62 {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public Object e;

    public k62(int i) {
        this.a = i;
        byte[] bArr = new byte[131];
        this.e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.d;
            if (length < i4 + i3) {
                this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.d, i3);
            this.d += i3;
        }
    }

    public boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.d -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public void c(int i) {
        this.b |= i > 0;
        this.a += i;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int i) {
        vy2.s(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.d = 3;
            this.c = false;
        }
    }

    public k62(ta6 ta6Var) {
        this.e = ta6Var;
    }
}
