package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.ExtendedViewPager;
import me.relex.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uo2 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final ImageView v;
    public final ImageView w;
    public final CircleIndicator x;
    public final ConstraintLayout y;
    public final ExtendedViewPager z;

    public uo2(ea1 ea1Var, View view, ImageView imageView, ImageView imageView2, CircleIndicator circleIndicator, ConstraintLayout constraintLayout, ExtendedViewPager extendedViewPager) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = imageView2;
        this.x = circleIndicator;
        this.y = constraintLayout;
        this.z = extendedViewPager;
    }
}
