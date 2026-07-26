package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.internal.d;
import androidx.compose.material3.n;

/* JADX INFO: loaded from: classes.dex */
public final class wu7 implements hm5 {
    public final /* synthetic */ n a;
    public final /* synthetic */ dp2 b;

    public wu7(n nVar, dp2 dp2Var) {
        Orientation orientation = Orientation.a;
        this.a = nVar;
        this.b = dp2Var;
    }

    @Override // defpackage.hm5
    public final long G(int i, long j) {
        Orientation orientation = Orientation.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        d dVar = this.a.d;
        float f = dVar.f(fIntBitsToFloat);
        float fE = Float.isNaN(dVar.e()) ? 0.0f : dVar.e();
        dVar.i.i(f);
        return a(f - fE);
    }

    public final long a(float f) {
        Orientation orientation = Orientation.a;
        Orientation orientation2 = Orientation.a;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    @Override // defpackage.hm5
    public final Object c0(long j, g51 g51Var) {
        Orientation orientation = Orientation.a;
        float fC = e49.c(j);
        n nVar = this.a;
        float fG = nVar.d.g();
        float fC2 = nVar.d.d().c();
        if (fC >= 0.0f || fG <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new e49(j);
    }

    @Override // defpackage.hm5
    public final long u(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        d dVar = this.a.d;
        Orientation orientation = Orientation.a;
        float f = dVar.f(Float.intBitsToFloat((int) (4294967295L & j2)));
        float fE = Float.isNaN(dVar.e()) ? 0.0f : dVar.e();
        dVar.i.i(f);
        return a(f - fE);
    }

    @Override // defpackage.hm5
    public final Object v(long j, long j2, g51 g51Var) {
        Orientation orientation = Orientation.a;
        this.b.invoke(new Float(e49.c(j2)));
        return new e49(j2);
    }
}
