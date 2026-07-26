package defpackage;

import androidx.media3.common.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class td2 extends q68 {
    public ud2 n;
    public hg0 o;

    @Override // defpackage.q68
    public final long b(h26 h26Var) {
        byte[] bArr = h26Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            h26Var.K(4);
            h26Var.E();
        }
        int iP = bt2.P(i, h26Var);
        h26Var.J(0);
        return iP;
    }

    @Override // defpackage.q68
    public final boolean c(h26 h26Var, long j, rn6 rn6Var) {
        byte[] bArr = h26Var.a;
        ud2 ud2Var = this.n;
        if (ud2Var == null) {
            ud2 ud2Var2 = new ud2(bArr, 17);
            this.n = ud2Var2;
            rj2 rj2VarA = ud2Var2.c(Arrays.copyOfRange(bArr, 9, h26Var.c), null).a();
            rj2VarA.l = tv4.m("audio/ogg");
            rn6Var.b = new b(rj2VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            hg0 hg0Var = this.o;
            if (hg0Var != null) {
                hg0Var.a = j;
                rn6Var.c = hg0Var;
            }
            ((b) rn6Var.b).getClass();
            return false;
        }
        qq4 qq4VarX = ct2.x(h26Var);
        ud2 ud2Var3 = new ud2(ud2Var.a, ud2Var.b, ud2Var.c, ud2Var.d, ud2Var.e, ud2Var.g, ud2Var.h, ud2Var.j, qq4VarX, ud2Var.l);
        this.n = ud2Var3;
        hg0 hg0Var2 = new hg0();
        hg0Var2.c = ud2Var3;
        hg0Var2.d = qq4VarX;
        hg0Var2.a = -1L;
        hg0Var2.b = -1L;
        this.o = hg0Var2;
        return true;
    }

    @Override // defpackage.q68
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
