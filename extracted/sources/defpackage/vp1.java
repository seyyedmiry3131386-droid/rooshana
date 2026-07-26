package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vp1 {
    public final DisplayCutout a;

    public vp1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final no3 a() {
        return Build.VERSION.SDK_INT >= 30 ? no3.d(p3.n(this.a)) : no3.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vp1.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((vp1) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
