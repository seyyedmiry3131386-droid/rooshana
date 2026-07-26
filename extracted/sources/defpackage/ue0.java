package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 implements Runnable {
    public final /* synthetic */ ActionMenuView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BottomAppBar d;

    public ue0(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.d = bottomAppBar;
        this.a = actionMenuView;
        this.b = i;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        BottomAppBar bottomAppBar = this.d;
        this.a.setTranslationX(bottomAppBar.H(r3, i, z));
    }
}
