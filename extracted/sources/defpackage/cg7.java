package defpackage;

import ir.myket.movie.common.domain.common.ItemType;

/* JADX INFO: loaded from: classes3.dex */
public final class cg7 {
    public final pj3 a;

    public cg7(pj3 pj3Var) {
        js3.p(pj3Var, "screenshots");
        this.a = pj3Var;
        ItemType itemType = ItemType.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg7) && js3.i(this.a, ((cg7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScreenshotWrapper(screenshots=" + this.a + ")";
    }
}
