package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class im2 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final ProfileTabView A;
    public final NestedScrollView B;
    public final TryAgainView C;
    public final FrameLayout v;
    public final FrameLayout w;
    public final r63 x;
    public final ProfileTabView y;
    public final View z;

    public im2(ea1 ea1Var, View view, FrameLayout frameLayout, FrameLayout frameLayout2, r63 r63Var, ProfileTabView profileTabView, View view2, ProfileTabView profileTabView2, NestedScrollView nestedScrollView, TryAgainView tryAgainView) {
        super(1, view, ea1Var);
        this.v = frameLayout;
        this.w = frameLayout2;
        this.x = r63Var;
        this.y = profileTabView;
        this.z = view2;
        this.A = profileTabView2;
        this.B = nestedScrollView;
        this.C = tryAgainView;
    }
}
