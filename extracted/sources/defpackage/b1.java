package defpackage;

import android.view.View;
import androidx.navigation.fragment.AbstractListDetailFragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ AbstractListDetailFragment a;
    public final /* synthetic */ SlidingPaneLayout b;

    public b1(AbstractListDetailFragment abstractListDetailFragment, SlidingPaneLayout slidingPaneLayout) {
        this.a = abstractListDetailFragment;
        this.b = slidingPaneLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        a1 a1Var = this.a.A0;
        js3.m(a1Var);
        SlidingPaneLayout slidingPaneLayout = this.b;
        a1Var.f(slidingPaneLayout.e && slidingPaneLayout.d());
    }
}
