package defpackage;

import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vv5 extends q68 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(h26 h26Var, byte[] bArr) {
        if (h26Var.a() < bArr.length) {
            return false;
        }
        int i = h26Var.b;
        byte[] bArr2 = new byte[bArr.length];
        h26Var.h(bArr2, 0, bArr.length);
        h26Var.J(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.q68
    public final long b(h26 h26Var) {
        byte[] bArr = h26Var.a;
        return (((long) this.i) * bt2.B(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.q68
    public final boolean c(h26 h26Var, long j, rn6 rn6Var) {
        if (e(h26Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(h26Var.a, h26Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListK = bt2.k(bArrCopyOf);
            if (((b) rn6Var.b) == null) {
                rj2 rj2Var = new rj2();
                rj2Var.l = tv4.m("audio/ogg");
                rj2Var.m = tv4.m("audio/opus");
                rj2Var.E = i;
                rj2Var.F = 48000;
                rj2Var.p = arrayListK;
                rn6Var.b = new b(rj2Var);
                return true;
            }
        } else {
            if (!e(h26Var, p)) {
                vy2.t((b) rn6Var.b);
                return false;
            }
            vy2.t((b) rn6Var.b);
            if (!this.n) {
                this.n = true;
                h26Var.K(8);
                jv4 jv4VarG = c67.g(ImmutableList.o((String[]) c67.i(h26Var, false, false).b));
                if (jv4VarG != null) {
                    rj2 rj2VarA = ((b) rn6Var.b).a();
                    rj2VarA.k = jv4VarG.b(((b) rn6Var.b).l);
                    rn6Var.b = new b(rj2VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.q68
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
