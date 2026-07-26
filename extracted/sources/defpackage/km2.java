package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class km2 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final View A;
    public final ViewPager2 B;
    public final ImageView v;
    public final MyketTextView w;
    public final LoadingView x;
    public final FrameLayout y;
    public final MyketTextView z;

    public km2(ea1 ea1Var, View view, ImageView imageView, MyketTextView myketTextView, LoadingView loadingView, FrameLayout frameLayout, MyketTextView myketTextView2, View view2, ViewPager2 viewPager2) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = myketTextView;
        this.x = loadingView;
        this.y = frameLayout;
        this.z = myketTextView2;
        this.A = view2;
        this.B = viewPager2;
    }
}
