package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class tv1 implements nq8 {
    public final nq8 b;
    public final boolean c;

    public tv1(nq8 nq8Var, boolean z) {
        this.b = nq8Var;
        this.c = z;
    }

    @Override // defpackage.nq8
    public final g67 a(Context context, g67 g67Var, int i, int i2) {
        pc0 pc0Var = a.a(context).a;
        Drawable drawable = (Drawable) g67Var.get();
        qc0 qc0VarQ = c26.q(pc0Var, drawable, i, i2);
        if (qc0VarQ != null) {
            g67 g67VarA = this.b.a(context, qc0VarQ, i, i2);
            if (!g67VarA.equals(qc0VarQ)) {
                return new qc0(context.getResources(), g67VarA);
            }
            g67VarA.a();
            return g67Var;
        }
        if (!this.c) {
            return g67Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof tv1) {
            return this.b.equals(((tv1) obj).b);
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.b.hashCode();
    }
}
