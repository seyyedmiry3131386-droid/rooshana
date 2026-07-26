package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tc implements r61 {
    public final r61 a;
    public final float b;

    public tc(float f, r61 r61Var) {
        while (r61Var instanceof tc) {
            r61Var = ((tc) r61Var).a;
            f += ((tc) r61Var).b;
        }
        this.a = r61Var;
        this.b = f;
    }

    @Override // defpackage.r61
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        return this.a.equals(tcVar.a) && this.b == tcVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
