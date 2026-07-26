package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements nq8 {
    public final nq8 b;

    public ps2(nq8 nq8Var) {
        ok4.p(nq8Var, "Argument must not be null");
        this.b = nq8Var;
    }

    @Override // defpackage.nq8
    public final g67 a(Context context, g67 g67Var, int i, int i2) {
        ns2 ns2Var = (ns2) g67Var.get();
        g67 qc0Var = new qc0(a.a(context).a, ((us2) ns2Var.a.b).l);
        nq8 nq8Var = this.b;
        g67 g67VarA = nq8Var.a(context, qc0Var, i, i2);
        if (!qc0Var.equals(g67VarA)) {
            qc0Var.a();
        }
        ((us2) ns2Var.a.b).c(nq8Var, (Bitmap) g67VarA.get());
        return g67Var;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof ps2) {
            return this.b.equals(((ps2) obj).b);
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.b.hashCode();
    }
}
