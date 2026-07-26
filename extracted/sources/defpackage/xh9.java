package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xh9 {
    public final cm a;
    public final Feature b;

    public /* synthetic */ xh9(cm cmVar, Feature feature) {
        this.a = cmVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xh9) {
            xh9 xh9Var = (xh9) obj;
            if (vy2.w(this.a, xh9Var.a) && vy2.w(this.b, xh9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        hh2Var.d(this.a, "key");
        hh2Var.d(this.b, "feature");
        return hh2Var.toString();
    }
}
