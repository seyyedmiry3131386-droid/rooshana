package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aa5 implements nq8 {
    public final List b;

    public aa5(nq8... nq8VarArr) {
        if (nq8VarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = Arrays.asList(nq8VarArr);
    }

    @Override // defpackage.nq8
    public final g67 a(Context context, g67 g67Var, int i, int i2) {
        Iterator it = this.b.iterator();
        g67 g67Var2 = g67Var;
        while (it.hasNext()) {
            g67 g67VarA = ((nq8) it.next()).a(context, g67Var2, i, i2);
            if (g67Var2 != null && !g67Var2.equals(g67Var) && !g67Var2.equals(g67VarA)) {
                g67Var2.a();
            }
            g67Var2 = g67VarA;
        }
        return g67Var2;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nq8) it.next()).b(messageDigest);
        }
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof aa5) {
            return this.b.equals(((aa5) obj).b);
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.b.hashCode();
    }
}
