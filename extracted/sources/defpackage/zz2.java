package defpackage;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 extends lm4 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public ai0 C;
    public x03 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public ImmutableList I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final xa1 p;
    public final db1 q;
    public final ai0 r;
    public final boolean s;
    public final boolean t;
    public final hm8 u;
    public final xe1 v;
    public final List w;
    public final DrmInitData x;
    public final qh3 y;
    public final h26 z;

    public zz2(xe1 xe1Var, xa1 xa1Var, db1 db1Var, b bVar, boolean z, xa1 xa1Var2, db1 db1Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, hm8 hm8Var, DrmInitData drmInitData, ai0 ai0Var, qh3 qh3Var, h26 h26Var, boolean z6, boolean z7, ee6 ee6Var) {
        super(xa1Var, db1Var, bVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = db1Var2;
        this.p = xa1Var2;
        this.F = db1Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = hm8Var;
        this.t = z4;
        this.v = xe1Var;
        this.w = list;
        this.x = drmInitData;
        this.r = ai0Var;
        this.y = qh3Var;
        this.z = h26Var;
        this.L = z6;
        this.n = z7;
        this.I = ImmutableList.q();
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (wu8.L(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.ra4
    public final void a() {
        ai0 ai0Var;
        this.D.getClass();
        if (this.C == null && (ai0Var = this.r) != null) {
            v72 v72VarB = ((v72) ai0Var.b).b();
            if ((v72VarB instanceof dt8) || (v72VarB instanceof go2)) {
                this.C = this.r;
                this.F = false;
            }
        }
        db1 db1Var = this.q;
        xa1 xa1Var = this.p;
        if (this.F) {
            xa1Var.getClass();
            db1Var.getClass();
            c(xa1Var, db1Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // defpackage.ra4
    public final void b() {
        this.G = true;
    }

    public final void c(xa1 xa1Var, db1 db1Var, boolean z, boolean z2) {
        db1 db1VarC;
        boolean z3;
        long j;
        if (z) {
            z3 = this.E != 0;
            db1VarC = db1Var;
        } else {
            long j2 = this.E;
            long j3 = db1Var.g;
            db1VarC = db1Var.c(j2, j3 != -1 ? j3 - j2 : -1L);
            z3 = false;
        }
        try {
            oe1 oe1VarG = g(xa1Var, db1VarC, z2);
            if (z3) {
                oe1VarG.d(this.E, false);
            }
            while (!this.G && ((v72) this.C.b).d(oe1VarG, ai0.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((v72) this.C.b).h(0L, 0L);
                        j = oe1VarG.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (oe1VarG.d - db1Var.f);
                    throw th;
                }
            }
            j = oe1VarG.d;
            this.E = (int) (j - db1Var.f);
        } finally {
            tv8.i(xa1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e(int i) {
        vy2.s(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oe1 g(defpackage.xa1 r33, defpackage.db1 r34, boolean r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz2.g(xa1, db1, boolean):oe1");
    }
}
