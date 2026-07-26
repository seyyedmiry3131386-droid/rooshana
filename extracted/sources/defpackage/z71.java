package defpackage;

import coil3.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class z71 implements ar8 {
    public final int b;

    public z71(int i) {
        this.b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // defpackage.ar8
    public final hr8 a(ax axVar, ti3 ti3Var) {
        return !(ti3Var instanceof ib8) ? new no5(axVar, ti3Var) : ((ib8) ti3Var).c == DataSource.a ? new no5(axVar, ti3Var) : new a81(axVar, ti3Var, this.b);
    }
}
