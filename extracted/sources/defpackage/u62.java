package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerApplicationData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class u62 extends qg5 {
    public final /* synthetic */ int w;
    public final int x;
    public a79 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u62(View view, int i, int i2) {
        super(view);
        this.w = i2;
        this.x = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                ExtHeaderData extHeaderData = (ExtHeaderData) myketRecyclerData;
                js3.p(extHeaderData, "data");
                String str = extHeaderData.c;
                this.a.getLayoutParams().width = this.x;
                e23 e23Var = (e23) this.y;
                if (e23Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = e23Var.x;
                myketTextView.setText(str);
                myketTextView.setTextColor(sj8.b().m);
                e23 e23Var2 = (e23) this.y;
                if (e23Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = e23Var2.w;
                constraintLayout.setLayoutParams(constraintLayout.getLayoutParams());
                e23 e23Var3 = (e23) this.y;
                if (e23Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout2 = e23Var3.w;
                js3.o(constraintLayout2, "content");
                constraintLayout2.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
                e23 e23Var4 = (e23) this.y;
                if (e23Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                e23Var4.v.setData(extHeaderData.d);
                if (extHeaderData.h) {
                    return;
                }
                e23 e23Var5 = (e23) this.y;
                if (e23Var5 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView2 = e23Var5.x;
                myketTextView2.setAlpha(0.2f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = myketTextView2.animate();
                viewPropertyAnimatorAnimate.alpha(1.0f);
                viewPropertyAnimatorAnimate.setDuration(350L);
                viewPropertyAnimatorAnimate.start();
                extHeaderData.h = true;
                return;
            case 1:
                js3.p((ShimmerApplicationData) myketRecyclerData, "data");
                View view = this.a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i = this.x;
                layoutParams.width = i;
                z83 z83Var = (z83) this.y;
                if (z83Var == null) {
                    js3.V("binding");
                    throw null;
                }
                z83Var.v.getLayoutParams().width = i - view.getResources().getDimensionPixelSize(pq6.space_16);
                z83 z83Var2 = (z83) this.y;
                if (z83Var2 != null) {
                    z83Var2.v.getLayoutParams().height = i - view.getResources().getDimensionPixelSize(pq6.space_16);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            default:
                js3.p((ShimmerApplicationData) myketRecyclerData, "data");
                View view2 = this.a;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                int i2 = this.x;
                layoutParams2.width = i2;
                x83 x83Var = (x83) this.y;
                if (x83Var == null) {
                    js3.V("binding");
                    throw null;
                }
                x83Var.v.getLayoutParams().width = i2 - view2.getResources().getDimensionPixelSize(pq6.space_16);
                x83 x83Var2 = (x83) this.y;
                if (x83Var2 != null) {
                    x83Var2.v.getLayoutParams().height = i2 - view2.getResources().getDimensionPixelSize(pq6.space_16);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.w) {
            case 0:
                if (!(a79Var instanceof e23)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (e23) a79Var;
                }
                break;
            case 1:
                if (!(a79Var instanceof z83)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (z83) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof x83)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (x83) a79Var;
                }
                break;
        }
    }
}
