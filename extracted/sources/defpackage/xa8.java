package defpackage;

import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xa8 implements v72 {
    public final cb8 a;
    public cp8 f;
    public int g;
    public byte[] e = j29.b;
    public final h26 d = new h26();
    public final b b = null;
    public final ArrayList c = new ArrayList();
    public int h = 0;
    public long[] i = j29.c;
    public long j = -9223372036854775807L;

    public xa8(cb8 cb8Var) {
        this.a = cb8Var;
    }

    @Override // defpackage.v72
    public final void a() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final void c(wa8 wa8Var) {
        vy2.t(this.f);
        byte[] bArr = wa8Var.b;
        int length = bArr.length;
        h26 h26Var = this.d;
        h26Var.getClass();
        h26Var.H(bArr.length, bArr);
        this.f.d(length, h26Var);
        this.f.a(wa8Var.a, 1, length, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r21, defpackage.sd2 r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa8.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        return true;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        int i = this.h;
        vy2.s((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        vy2.s(this.h == 0);
        cp8 cp8VarO = x72Var.o(0, 3);
        this.f = cp8VarO;
        b bVar = this.b;
        if (bVar != null) {
            cp8VarO.f(bVar);
            x72Var.l();
            x72Var.t(new nm3(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }
}
