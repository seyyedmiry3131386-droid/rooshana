package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.social.users.common.recycler.OwnUsersEmptyData;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ey5 extends qg5 {
    public final og5 w;
    public da3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey5(View view, p50 p50Var) {
        super(view);
        js3.p(p50Var, "onClickListener");
        this.w = p50Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        OwnUsersEmptyData ownUsersEmptyData = (OwnUsersEmptyData) myketRecyclerData;
        js3.p(ownUsersEmptyData, "data");
        LottieAnimationView lottieAnimationView = x().w;
        js3.m(lottieAnimationView);
        boolean z = ownUsersEmptyData.c;
        lottieAnimationView.setVisibility(!z ? 0 : 8);
        a.e(lottieAnimationView, qs6.no_followers);
        MyketTextView myketTextView = x().y;
        js3.o(myketTextView, "title");
        myketTextView.setVisibility(z ? 8 : 0);
        MyketTextView myketTextView2 = x().y;
        View view = this.a;
        myketTextView2.setText(view.getResources().getString(ownUsersEmptyData.a));
        x().x.setText(view.getResources().getString(ownUsersEmptyData.b));
        x().v.setText(view.getResources().getString(rs6.menu_item_mynet));
        BigFillOvalButton bigFillOvalButton = x().v;
        js3.o(bigFillOvalButton, "actionButton");
        qg5.v(bigFillOvalButton, this.w, this, ownUsersEmptyData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof da3) {
            this.x = (da3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final da3 x() {
        da3 da3Var = this.x;
        if (da3Var != null) {
            return da3Var;
        }
        js3.V("binding");
        throw null;
    }
}
