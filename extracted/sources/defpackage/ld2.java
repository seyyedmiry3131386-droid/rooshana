package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ld2 extends hk2 {
    public final long b;
    public final boolean c;
    public long d;

    public ld2(t18 t18Var, long j, boolean z) {
        super(t18Var);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.hk2, defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        js3.p(gh0Var, "sink");
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jF0 = super.f0(gh0Var, j);
        if (jF0 != -1) {
            this.d += jF0;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jF0 != -1) && j5 <= j3) {
            return jF0;
        }
        if (jF0 > 0 && j5 > j3) {
            long j6 = gh0Var.b - (j5 - j3);
            gh0 gh0Var2 = new gh0();
            gh0Var2.N0(gh0Var);
            gh0Var.X0(gh0Var2, j6);
            gh0Var2.b();
        }
        StringBuilder sbS = rm7.s(j3, "expected ", " bytes but got ");
        sbS.append(this.d);
        throw new IOException(sbS.toString());
    }
}
