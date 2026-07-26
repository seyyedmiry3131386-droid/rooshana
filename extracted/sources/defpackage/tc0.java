package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public tc0(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            uc0.f();
            porterDuffColorFilter = uc0.a(gu9.E(j), te.U(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(gu9.E(j), te.W(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        return zu0.c(this.b, tc0Var.b) && this.c == tc0Var.c;
    }

    public final int hashCode() {
        int i = zu0.i;
        return (tw8.a(this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        bl4.F(this.b, ", blendMode=", sb);
        sb.append((Object) y40.L(this.c));
        sb.append(')');
        return sb.toString();
    }
}
