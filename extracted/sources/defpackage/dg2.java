package defpackage;

import androidx.compose.ui.focus.FocusStateImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 extends gx4 implements fg2 {
    public dp2 o;
    public FocusStateImpl p;

    @Override // defpackage.fg2
    public final void U(FocusStateImpl focusStateImpl) {
        if (js3.i(this.p, focusStateImpl)) {
            return;
        }
        this.p = focusStateImpl;
        this.o.invoke(focusStateImpl);
    }
}
