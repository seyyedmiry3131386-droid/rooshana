package defpackage;

import androidx.media3.common.b;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements cp8 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.cp8
    public final void b(h26 h26Var, int i, int i2) {
        h26Var.K(i);
    }

    @Override // defpackage.cp8
    public final int c(ra1 ra1Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = ra1Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.cp8
    public final void d(int i, h26 h26Var) {
        h26Var.K(i);
    }

    @Override // defpackage.cp8
    public final int e(ra1 ra1Var, int i, boolean z) {
        return c(ra1Var, i, z);
    }

    @Override // defpackage.cp8
    public final void f(b bVar) {
    }

    @Override // defpackage.cp8
    public final void a(long j, int i, int i2, int i3, bp8 bp8Var) {
    }
}
