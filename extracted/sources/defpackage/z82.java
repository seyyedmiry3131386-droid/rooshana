package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class z82 extends gk2 {
    public final dp2 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z82(by7 by7Var, dp2 dp2Var) {
        super(by7Var);
        js3.p(by7Var, "delegate");
        this.b = dp2Var;
    }

    @Override // defpackage.gk2, defpackage.by7
    public final void X0(gh0 gh0Var, long j) {
        if (this.c) {
            gh0Var.skip(j);
            return;
        }
        try {
            this.a.X0(gh0Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.gk2, defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.gk2, defpackage.by7, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
