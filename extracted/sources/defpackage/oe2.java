package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class oe2 {
    public final pt2 a;
    public final /* synthetic */ FloatingActionButton b;

    public oe2(FloatingActionButton floatingActionButton, pt2 pt2Var) {
        this.b = floatingActionButton;
        this.a = pt2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oe2) && ((oe2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
