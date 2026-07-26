package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class pt8 extends qt8 {
    public final /* synthetic */ qt8 a;

    public pt8(qt8 qt8Var) {
        this.a = qt8Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() != JsonToken.i) {
            return this.a.b(mw3Var);
        }
        mw3Var.J();
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (obj == null) {
            uw3Var.u();
        } else {
            this.a.c(uw3Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
