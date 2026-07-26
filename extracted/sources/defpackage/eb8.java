package defpackage;

import androidx.media3.common.b;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class eb8 implements cp8 {
    public final cp8 a;
    public final ab8 b;
    public cb8 g;
    public b h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = j29.b;
    public final h26 c = new h26();

    public eb8(cp8 cp8Var, ab8 ab8Var) {
        this.a = cp8Var;
        this.b = ab8Var;
    }

    @Override // defpackage.cp8
    public final void a(long j, int i, int i2, int i3, bp8 bp8Var) {
        if (this.g == null) {
            this.a.a(j, i, i2, i3, bp8Var);
            return;
        }
        vy2.i("DRM on subtitles is not supported", bp8Var == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.m(this.f, i4, i2, bb8.c, new zc1(this, j, i));
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            wn5.l0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.cp8
    public final void b(h26 h26Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(h26Var, i, i2);
            return;
        }
        g(i);
        h26Var.h(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.cp8
    public final int c(ra1 ra1Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(ra1Var, i, z);
        }
        g(i);
        int i2 = ra1Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
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
        bVar.n.getClass();
        String str = bVar.n;
        vy2.j(tv4.h(str) == 3);
        boolean zEquals = bVar.equals(this.h);
        ab8 ab8Var = this.b;
        if (!zEquals) {
            this.h = bVar;
            this.g = ab8Var.r(bVar) ? ab8Var.p(bVar) : null;
        }
        cb8 cb8Var = this.g;
        cp8 cp8Var = this.a;
        if (cb8Var == null) {
            cp8Var.f(bVar);
            return;
        }
        rj2 rj2VarA = bVar.a();
        rj2VarA.m = tv4.m("application/x-media3-cues");
        rj2VarA.j = str;
        rj2VarA.r = Long.MAX_VALUE;
        rj2VarA.K = ab8Var.h(bVar);
        rm7.w(rj2VarA, cp8Var);
    }

    public final void g(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
