package defpackage;

import android.view.View;
import ir.mservices.market.app.suggest.search.ui.recycler.SuggestData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.core.utils.SafeURLSpan;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class rb8 extends qg5 {
    public final og5 w;
    public final og5 x;
    public w93 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb8(View view, jb8 jb8Var, jb8 jb8Var2) {
        super(view);
        js3.p(jb8Var, "onSuggestClickListener");
        js3.p(jb8Var2, "onViewButtonClickListener");
        this.w = jb8Var;
        this.x = jb8Var2;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SuggestData suggestData = (SuggestData) myketRecyclerData;
        js3.p(suggestData, "data");
        String str = suggestData.b;
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, suggestData);
        w93 w93Var = this.y;
        if (w93Var == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = w93Var.y;
        js3.o(smallEmptyMediumTextOvalButton, "viewButton");
        qg5.v(smallEmptyMediumTextOvalButton, this.x, this, suggestData);
        w93 w93Var2 = this.y;
        if (w93Var2 == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = w93Var2.w;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.app_icon_size));
        String str2 = suggestData.d ? suggestData.c : "";
        Pattern pattern = SafeURLSpan.d;
        AvatarImageView.setImage$default(avatarImageView, str2, ry7.q(str, null, false, 2).toString(), Integer.valueOf(view.getResources().getDimensionPixelSize(pq6.round_drawable_default_border_radius)), null, 8, null);
        w93 w93Var3 = this.y;
        if (w93Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = w93Var3.x;
        js3.o(myketTextView, "textTitle");
        MyketTextView.setTextFromHtml$default(myketTextView, str, 2, null, null, false, 28, null);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof w93) {
            this.y = (w93) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
