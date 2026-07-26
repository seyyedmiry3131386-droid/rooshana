package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class aq extends qg5 {
    public final og5 w;
    public il1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onInfoClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) myketRecyclerData;
        js3.p(appDeveloperInfoModuleData, "data");
        hl1 hl1Var = appDeveloperInfoModuleData.a;
        String str = hl1Var.c;
        if (f88.n0(str)) {
            lw.g(null, null, null);
            return;
        }
        boolean z = hl1Var instanceof el1;
        boolean z2 = !z;
        x().v.setFocusable(z2);
        x().v.setClickable(z2);
        FrameLayout frameLayout = x().v;
        js3.o(frameLayout, "clickView");
        qg5.v(frameLayout, z ? null : this.w, this, appDeveloperInfoModuleData);
        if (z && hl1Var.e) {
            x().x.setVisibility(0);
            x().x.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
        } else {
            x().x.setVisibility(8);
        }
        MyketTextView myketTextView = x().w;
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = hl1Var.a;
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
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        myketTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
        x().y.setText(str);
        x().w.setText(view.getResources().getString(hl1Var.b));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof il1) {
            this.x = (il1) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final il1 x() {
        il1 il1Var = this.x;
        if (il1Var != null) {
            return il1Var;
        }
        js3.V("binding");
        throw null;
    }
}
