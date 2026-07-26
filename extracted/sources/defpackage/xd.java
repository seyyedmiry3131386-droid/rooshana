package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xd implements v72 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final uo1 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public x72 j;
    public cp8 k;
    public cp8 l;
    public kl7 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = j29.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public xd() {
        uo1 uo1Var = new uo1();
        this.b = uo1Var;
        this.l = uo1Var;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final int c(w72 w72Var) throws ParserException {
        boolean z;
        w72Var.m();
        byte[] bArr = this.a;
        w72Var.q(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 w72) = (r4v0 w72), (r4v5 w72) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r18, defpackage.sd2 r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd.d(w72, sd2):int");
    }

    public final boolean e(w72 w72Var) {
        w72Var.m();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        w72Var.q(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            w72Var.n(bArr.length);
            return true;
        }
        w72Var.m();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        w72Var.q(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        w72Var.n(bArr3.length);
        return true;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        return e(w72Var);
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        kl7 kl7Var = this.m;
        if (!(kl7Var instanceof nm3)) {
            if (j == 0 || !(kl7Var instanceof s21)) {
                this.i = 0L;
                return;
            } else {
                s21 s21Var = (s21) kl7Var;
                this.i = (Math.max(0L, j - s21Var.b) * 8000000) / ((long) s21Var.e);
                return;
            }
        }
        nm3 nm3Var = (nm3) kl7Var;
        ce4 ce4Var = nm3Var.b;
        long jD = ce4Var.b == 0 ? -9223372036854775807L : ce4Var.d(j29.b(nm3Var.a, j));
        this.i = jD;
        if (Math.abs(this.o - jD) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.j = x72Var;
        cp8 cp8VarO = x72Var.o(0, 1);
        this.k = cp8VarO;
        this.l = cp8VarO;
        x72Var.l();
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
