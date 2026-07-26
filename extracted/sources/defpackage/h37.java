package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h37 implements r61 {
    public final float a;

    public h37(float f) {
        this.a = f;
    }

    @Override // defpackage.r61
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h37) && this.a == ((h37) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return dw1.k((int) (this.a * 100.0f), "%", new StringBuilder());
    }
}
