package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class df9 extends cf9 {
    public df9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var, windowInsets);
    }

    @Override // defpackage.if9
    public lf9 a() {
        return lf9.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.bf9, defpackage.if9
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df9)) {
            return false;
        }
        df9 df9Var = (df9) obj;
        return Objects.equals(this.c, df9Var.c) && Objects.equals(this.g, df9Var.g) && bf9.C(this.h, df9Var.h);
    }

    @Override // defpackage.if9
    public vp1 f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new vp1(displayCutout);
    }

    @Override // defpackage.if9
    public int hashCode() {
        return this.c.hashCode();
    }

    public df9(lf9 lf9Var, df9 df9Var) {
        super(lf9Var, df9Var);
    }
}
