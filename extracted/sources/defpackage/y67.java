package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y67 {
    public final Resources a;
    public final Resources.Theme b;

    public y67(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y67.class == obj.getClass()) {
            y67 y67Var = (y67) obj;
            if (this.a.equals(y67Var.a) && Objects.equals(this.b, y67Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
