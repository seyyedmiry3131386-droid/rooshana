package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class se0 extends js3 {
    public final /* synthetic */ int i;
    public final /* synthetic */ BottomAppBar j;

    public se0(BottomAppBar bottomAppBar, int i) {
        this.j = bottomAppBar;
        this.i = i;
    }

    @Override // defpackage.js3
    public final void I(FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.y;
        floatingActionButton.setTranslationX(this.j.I(this.i));
        floatingActionButton.l(new re0(this), true);
    }
}
