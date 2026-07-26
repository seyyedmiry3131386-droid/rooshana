package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.ProfileRequestDto;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;

/* JADX INFO: loaded from: classes3.dex */
public final class eh2 extends qg5 {
    public final og5 w;
    public p63 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(View view, vx5 vx5Var) {
        super(view);
        js3.p(vx5Var, "onFollowRequestClickListener");
        this.w = vx5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FollowRequestData followRequestData = (FollowRequestData) myketRecyclerData;
        js3.p(followRequestData, "data");
        ProfileRequestDto profileRequestDto = followRequestData.a;
        p63 p63Var = this.x;
        if (p63Var == null) {
            js3.V("binding");
            throw null;
        }
        p63Var.w.setText(profileRequestDto.getMessage());
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_16);
        view.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        p63 p63Var2 = this.x;
        if (p63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        p63Var2.v.setData(profileRequestDto.getAvatars());
        qg5.v(view, this.w, this, followRequestData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof p63) {
            this.x = (p63) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
