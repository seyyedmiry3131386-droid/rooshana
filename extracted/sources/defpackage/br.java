package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.app.detail.ui.recycler.AppMyketSocialData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class br extends qg5 {
    public final og5 w;
    public final og5 x;
    public if5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(View view, ap apVar, ap apVar2) {
        super(view);
        js3.p(apVar, "onInstagramClickListener");
        js3.p(apVar2, "onTelegramClickListener");
        this.w = apVar;
        this.x = apVar2;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppMyketSocialData appMyketSocialData = (AppMyketSocialData) myketRecyclerData;
        js3.p(appMyketSocialData, "data");
        if5 if5Var = this.y;
        if (if5Var == null) {
            js3.V("binding");
            throw null;
        }
        Drawable drawable = if5Var.v.getDrawable();
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        if5 if5Var2 = this.y;
        if (if5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        if5Var2.w.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        if5 if5Var3 = this.y;
        if (if5Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = if5Var3.v;
        js3.o(imageView, "instagram");
        qg5.v(imageView, this.w, this, appMyketSocialData);
        if5 if5Var4 = this.y;
        if (if5Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView2 = if5Var4.w;
        js3.o(imageView2, "telegram");
        qg5.v(imageView2, this.x, this, appMyketSocialData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof if5) {
            this.y = (if5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
