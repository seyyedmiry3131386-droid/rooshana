package ir.mservices.market.social.profile.list.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.gl6;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t13;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public t13 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, gl6 gl6Var) {
        super(view);
        js3.p(gl6Var, "onClickListener");
        this.w = gl6Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileListAddData profileListAddData = (ProfileListAddData) myketRecyclerData;
        js3.p(profileListAddData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileListAddViewHolder$onAttach$1(profileListAddData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        ProfileListAddData profileListAddData = (ProfileListAddData) myketRecyclerData;
        js3.p(profileListAddData, "data");
        t13 t13Var = this.x;
        if (t13Var == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton = t13Var.w;
        smallBoldTextButton.setText(rs6.profile_list_add_list);
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_add;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        smallBoldTextButton.setBigIcon(drawableMutate);
        qg5.v(view, this.w, this, profileListAddData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof t13) {
            this.x = (t13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
