package defpackage;

import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends rs5 implements xy7 {
    public final SlidingPaneLayout d;

    public a1(SlidingPaneLayout slidingPaneLayout) {
        super(true);
        this.d = slidingPaneLayout;
        slidingPaneLayout.n.add(this);
    }

    @Override // defpackage.rs5
    public final void b() {
        this.d.a();
    }
}
