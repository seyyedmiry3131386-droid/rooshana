package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class dp1 extends hk2 {
    public boolean b;
    public final /* synthetic */ mp1 c;
    public final /* synthetic */ fp1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp1(t18 t18Var, mp1 mp1Var, fp1 fp1Var) {
        super(t18Var);
        this.c = mp1Var;
        this.d = fp1Var;
    }

    @Override // defpackage.hk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        mp1 mp1Var = this.c;
        fp1 fp1Var = this.d;
        synchronized (mp1Var) {
            int i = fp1Var.h - 1;
            fp1Var.h = i;
            if (i == 0 && fp1Var.f) {
                mp1Var.P(fp1Var);
            }
        }
    }
}
