package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class uu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) {
        return new AtomicBoolean(mw3Var.D());
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.k0(((AtomicBoolean) obj).get());
    }
}
