package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.reels.data.ReelHomeDto;
import ir.mservices.market.reels.home.ui.recycler.ReelHomeData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class r17 extends qg5 {
    public final og5 w;
    public n17 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r17(View view, h17 h17Var) {
        super(view);
        js3.p(h17Var, "onReelClickListener");
        this.w = h17Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ReelHomeData reelHomeData = (ReelHomeData) myketRecyclerData;
        js3.p(reelHomeData, "data");
        ReelHomeDto reelHomeDto = reelHomeData.a;
        n17 n17Var = this.x;
        if (n17Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = n17Var.v;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.w, this, reelHomeData);
        n17 n17Var2 = this.x;
        if (n17Var2 == null) {
            js3.V("binding");
            throw null;
        }
        n17Var2.x.c("", reelHomeDto.getThumbnailUrl());
        n17 n17Var3 = this.x;
        if (n17Var3 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = n17Var3.v;
        js3.o(frameLayout2, "clickableLayout");
        View view = this.a;
        uy6.q(frameLayout2, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)), 1);
        String duration = reelHomeDto.getDuration();
        if (duration != null) {
            n17 n17Var4 = this.x;
            if (n17Var4 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = n17Var4.w;
            js3.m(myketTextView);
            myketTextView.setVisibility(0);
            MyketTextView.setTextFromHtml$default(myketTextView, duration, 2, null, null, false, 28, null);
            myketTextView.measure(0, 0);
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().J.f;
            ea7Var.c(myketTextView.getMeasuredHeight() / 2);
            ea7Var.h = 0;
            myketTextView.setBackground(ea7Var.a());
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof n17) {
            this.x = (n17) a79Var;
        } else {
            lw.g(null, "Incompatible view binding", null);
        }
    }
}
