package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zx5 extends qg5 {
    public final og5 w;
    public w63 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx5(View view, vx5 vx5Var) {
        super(view);
        js3.p(vx5Var, "onOwnProfileTipClickListener");
        this.w = vx5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        OwnProfileTipData ownProfileTipData = (OwnProfileTipData) myketRecyclerData;
        js3.p(ownProfileTipData, "data");
        MessageBoxDto messageBoxDto = ownProfileTipData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_16);
        view.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        w63 w63Var = this.x;
        if (w63Var == null) {
            js3.V("binding");
            throw null;
        }
        w63Var.y.setText(messageBoxDto.getText());
        w63 w63Var2 = this.x;
        if (w63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = w63Var2.x;
        js3.o(imageView, "image");
        String iconUrl = messageBoxDto.getIconUrl();
        int i = 8;
        imageView.setVisibility((iconUrl == null || f88.n0(iconUrl)) ? 8 : 0);
        String iconUrl2 = messageBoxDto.getIconUrl();
        if (iconUrl2 != null) {
            if (f88.n0(iconUrl2)) {
                iconUrl2 = null;
            }
            if (iconUrl2 != null) {
                Context context = view.getContext();
                js3.o(context, "getContext(...)");
                f57 f57VarL = zk8.O(context, iconUrl2).L(new qc(3, this));
                w63 w63Var3 = this.x;
                if (w63Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                f57VarL.P(w63Var3.x);
            }
        }
        w63 w63Var4 = this.x;
        if (w63Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = w63Var4.v;
        js3.m(myketTextView);
        String actionText = messageBoxDto.getActionText();
        if (actionText != null && !f88.n0(actionText)) {
            i = 0;
        }
        myketTextView.setVisibility(i);
        myketTextView.setText(messageBoxDto.getActionText());
        w63 w63Var5 = this.x;
        if (w63Var5 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = w63Var5.w;
        js3.o(constraintLayout, "container");
        qg5.v(constraintLayout, this.w, this, ownProfileTipData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof w63) {
            this.x = (w63) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
