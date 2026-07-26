package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nu3 implements v72 {
    public x72 b;
    public int c;
    public int d;
    public int e;
    public yy4 g;
    public w72 h;
    public nq0 i;
    public u85 j;
    public final h26 a = new h26(2);
    public long f = -1;

    @Override // defpackage.v72
    public final void a() {
        u85 u85Var = this.j;
        if (u85Var != null) {
            u85Var.getClass();
        }
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final void c() {
        x72 x72Var = this.b;
        x72Var.getClass();
        x72Var.l();
        this.b.t(new x30(-9223372036854775807L));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r25, defpackage.sd2 r26) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu3.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        oe1 oe1Var = (oe1) w72Var;
        h26 h26Var = this.a;
        h26Var.G(2);
        oe1Var.e(h26Var.a, 0, 2, false);
        if (h26Var.D() == 65496) {
            h26Var.G(2);
            oe1Var.e(h26Var.a, 0, 2, false);
            int iD = h26Var.D();
            this.d = iD;
            if (iD == 65504) {
                h26Var.G(2);
                oe1Var.e(h26Var.a, 0, 2, false);
                oe1Var.l(h26Var.D() - 2, false);
                h26Var.G(2);
                oe1Var.e(h26Var.a, 0, 2, false);
                this.d = h26Var.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            u85 u85Var = this.j;
            u85Var.getClass();
            u85Var.h(j, j2);
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.b = x72Var;
    }
}
