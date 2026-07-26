package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myMarket.recycler.MyMarketAboutData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zc5 extends qg5 {
    public final og5 w;
    public final og5 x;
    public xc5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc5(View view, md5 md5Var, md5 md5Var2) {
        super(view);
        js3.p(md5Var, "onInviteFriendClickListener");
        js3.p(md5Var2, "onAboutClickListener");
        this.w = md5Var;
        this.x = md5Var2;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        MyMarketAboutData myMarketAboutData = (MyMarketAboutData) myketRecyclerData;
        js3.p(myMarketAboutData, "data");
        ImageView imageView = x().z;
        Resources resources = this.a.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.actionbar_logo;
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
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        MyketTextView myketTextView = x().y;
        js3.o(myketTextView, "inviteFriend");
        myketTextView.setVisibility(0);
        MyketTextView myketTextView2 = x().x;
        js3.o(myketTextView2, "divider");
        myketTextView2.setVisibility(0);
        MyketTextView myketTextView3 = x().v;
        js3.o(myketTextView3, "about");
        myketTextView3.setVisibility(0);
        MyketTextView myketTextView4 = x().y;
        js3.o(myketTextView4, "inviteFriend");
        qg5.v(myketTextView4, this.w, this, myMarketAboutData);
        MyketTextView myketTextView5 = x().v;
        js3.o(myketTextView5, "about");
        qg5.v(myketTextView5, this.x, this, myMarketAboutData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof xc5) {
            this.y = (xc5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final xc5 x() {
        xc5 xc5Var = this.y;
        if (xc5Var != null) {
            return xc5Var;
        }
        js3.V("binding");
        throw null;
    }
}
