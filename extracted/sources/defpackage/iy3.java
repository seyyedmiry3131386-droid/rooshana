package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends gx4 implements hy3 {
    public dp2 o;
    public dp2 p;

    @Override // defpackage.hy3
    public final boolean i(KeyEvent keyEvent) {
        dp2 dp2Var = this.p;
        if (dp2Var != null) {
            return ((Boolean) dp2Var.invoke(new by3(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.hy3
    public final boolean x(KeyEvent keyEvent) {
        dp2 dp2Var = this.o;
        if (dp2Var != null) {
            return ((Boolean) dp2Var.invoke(new by3(keyEvent))).booleanValue();
        }
        return false;
    }
}
