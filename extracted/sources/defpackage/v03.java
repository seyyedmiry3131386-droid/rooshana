package defpackage;

import androidx.media3.common.b;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v03 implements cp8 {
    public static final b f;
    public static final b g;
    public final cp8 a;
    public final b b;
    public b c;
    public byte[] d;
    public int e;

    static {
        rj2 rj2Var = new rj2();
        rj2Var.m = tv4.m("application/id3");
        f = new b(rj2Var);
        rj2 rj2Var2 = new rj2();
        rj2Var2.m = tv4.m("application/x-emsg");
        g = new b(rj2Var2);
    }

    public v03(cp8 cp8Var, int i) {
        this.a = cp8Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(rm7.n(i, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.cp8
    public final void a(long j, int i, int i2, int i3, bp8 bp8Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        h26 h26Var = new h26(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        b bVar = this.b;
        String str2 = bVar.n;
        String str3 = bVar.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                wn5.k0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            h42 h42VarO = lq.o(h26Var);
            b bVarA = h42VarO.a();
            if (bVarA == null || !Objects.equals(str3, bVarA.n)) {
                wn5.k0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + h42VarO.a());
                return;
            }
            byte[] bArrC = h42VarO.c();
            bArrC.getClass();
            h26Var = new h26(bArrC);
        }
        int iA = h26Var.a();
        cp8 cp8Var = this.a;
        cp8Var.d(iA, h26Var);
        cp8Var.a(j, i, iA, 0, bp8Var);
    }

    @Override // defpackage.cp8
    public final void b(h26 h26Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        h26Var.h(this.d, this.e, i);
        this.e += i;
    }

    @Override // defpackage.cp8
    public final int c(ra1 ra1Var, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = ra1Var.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.cp8
    public final void d(int i, h26 h26Var) {
        b(h26Var, i, 0);
    }

    @Override // defpackage.cp8
    public final int e(ra1 ra1Var, int i, boolean z) {
        return c(ra1Var, i, z);
    }

    @Override // defpackage.cp8
    public final void f(b bVar) {
        this.c = bVar;
        this.a.f(this.b);
    }
}
