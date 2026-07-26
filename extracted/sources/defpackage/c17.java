package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c17 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReelsFragment b;

    public /* synthetic */ c17(ReelsFragment reelsFragment, int i) {
        this.a = i;
        this.b = reelsFragment;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        ReelsFragment reelsFragment = this.b;
        switch (i) {
            case 0:
                reelsFragment.e1 = (ValueAnimator) obj;
                break;
            default:
                aw0 aw0Var = (aw0) obj;
                int i2 = ReelsFragment.i1;
                js3.p(aw0Var, "it");
                ja4 ja4Var = aw0Var.a;
                if (ja4Var instanceof ga4) {
                    km2 km2Var = reelsFragment.a1;
                    js3.m(km2Var);
                    MyketTextView myketTextView = km2Var.w;
                    js3.o(myketTextView, "hintText");
                    myketTextView.setVisibility(8);
                    km2 km2Var2 = reelsFragment.a1;
                    js3.m(km2Var2);
                    MyketTextView myketTextView2 = km2Var2.z;
                    js3.o(myketTextView2, "retry");
                    myketTextView2.setVisibility(0);
                    km2 km2Var3 = reelsFragment.a1;
                    js3.m(km2Var3);
                    km2Var3.x.d(false);
                    km2 km2Var4 = reelsFragment.a1;
                    js3.m(km2Var4);
                    FrameLayout frameLayout = km2Var4.y;
                    js3.o(frameLayout, "progressLayout");
                    frameLayout.setVisibility(8);
                } else if (ja4Var instanceof ha4) {
                    km2 km2Var5 = reelsFragment.a1;
                    js3.m(km2Var5);
                    MyketTextView myketTextView3 = km2Var5.w;
                    js3.o(myketTextView3, "hintText");
                    myketTextView3.setVisibility(8);
                    km2 km2Var6 = reelsFragment.a1;
                    js3.m(km2Var6);
                    MyketTextView myketTextView4 = km2Var6.z;
                    js3.o(myketTextView4, "retry");
                    myketTextView4.setVisibility(8);
                    km2 km2Var7 = reelsFragment.a1;
                    js3.m(km2Var7);
                    FrameLayout frameLayout2 = km2Var7.y;
                    js3.o(frameLayout2, "progressLayout");
                    frameLayout2.setVisibility(0);
                    km2 km2Var8 = reelsFragment.a1;
                    js3.m(km2Var8);
                    km2Var8.x.d(true);
                } else {
                    reelsFragment.getClass();
                }
                reelsFragment.b1 = aw0Var.c instanceof ga4;
                break;
        }
        return tx8Var;
    }
}
