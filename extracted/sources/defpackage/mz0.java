package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mz0 extends xe1 {
    public final boolean e;

    public mz0(yr3 yr3Var, boolean z) {
        super(yr3Var);
        this.e = z;
    }

    @Override // defpackage.xe1
    public final void n(byte b) {
        if (this.e) {
            u(String.valueOf(b & 255));
        } else {
            r(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.xe1
    public final void p(int i) {
        if (this.e) {
            u(Long.toString(4294967295L & ((long) i), 10));
        } else {
            r(Long.toString(4294967295L & ((long) i), 10));
        }
    }

    @Override // defpackage.xe1
    public final void q(long j) {
        int i = 63;
        String str = "0";
        if (this.e) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            u(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        r(str);
    }

    @Override // defpackage.xe1
    public final void s(short s) {
        if (this.e) {
            u(String.valueOf(s & 65535));
        } else {
            r(String.valueOf(s & 65535));
        }
    }
}
