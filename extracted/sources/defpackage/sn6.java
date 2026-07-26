package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn6 {
    public final /* synthetic */ int a;
    public final hm8 b;
    public final h26 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public sn6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new hm8(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new h26();
                break;
            default:
                this.b = new hm8(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new h26();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(h26 h26Var) {
        int i = h26Var.b;
        if (h26Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        h26Var.h(bArr, 0, 9);
        h26Var.J(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(w72 w72Var) {
        switch (this.a) {
            case 0:
                byte[] bArr = j29.b;
                h26 h26Var = this.c;
                h26Var.getClass();
                h26Var.H(bArr.length, bArr);
                this.d = true;
                w72Var.m();
                break;
            default:
                byte[] bArr2 = j29.b;
                h26 h26Var2 = this.c;
                h26Var2.getClass();
                h26Var2.H(bArr2.length, bArr2);
                this.d = true;
                w72Var.m();
                break;
        }
    }
}
