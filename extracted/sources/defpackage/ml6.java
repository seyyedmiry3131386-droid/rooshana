package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;

/* JADX INFO: loaded from: classes3.dex */
public final class ml6 extends qg5 {
    public final og5 w;
    public final og5 x;
    public b23 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml6(View view, gl6 gl6Var, gl6 gl6Var2) {
        super(view);
        js3.p(gl6Var, "onMoreClickListener");
        js3.p(gl6Var2, "onTitleClickListener");
        this.w = gl6Var;
        this.x = gl6Var2;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileListTitleData profileListTitleData = (ProfileListTitleData) myketRecyclerData;
        js3.p(profileListTitleData, "data");
        b23 b23Var = this.y;
        if (b23Var == null) {
            js3.V("binding");
            throw null;
        }
        b23Var.x.setText(profileListTitleData.a);
        b23 b23Var2 = this.y;
        if (b23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        b23Var2.w.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        b23 b23Var3 = this.y;
        if (b23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = b23Var3.v;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.x, this, profileListTitleData);
        b23 b23Var4 = this.y;
        if (b23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = b23Var4.w;
        js3.o(imageView, "more");
        qg5.v(imageView, this.w, this, profileListTitleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof b23) {
            this.y = (b23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
