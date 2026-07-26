package ir.mservices.market.app.detail.ui.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.se8;
import defpackage.sj8;
import defpackage.v48;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends qg5 {
    public static final /* synthetic */ int z = 0;
    public final og5 w;
    public final lw8 x;
    public se8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onTagClickListener");
        this.w = og5Var;
        w91 w91Var = (w91) qg5.r();
        this.x = (lw8) w91Var.E.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppTagData appTagData = (AppTagData) myketRecyclerData;
        js3.p(appTagData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppTagViewHolder$onAttach$1(appTagData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppTagData appTagData = (AppTagData) myketRecyclerData;
        js3.p(appTagData, "data");
        v48 v48Var = appTagData.e;
        x(appTagData, v48Var != null ? (Integer) v48Var.getValue() : null);
        se8 se8Var = this.y;
        if (se8Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = se8Var.v;
        lw8 lw8Var = this.x;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, appTagData.a.getLabel()));
        View view = this.a;
        myketTextView.setCompoundDrawablePadding(view.getResources().getDimensionPixelSize(pq6.margin_default_v2));
        myketTextView.setPadding(view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf), view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half), view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf), view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        se8 se8Var2 = this.y;
        if (se8Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = se8Var2.v;
        js3.o(myketTextView2, "tagView");
        qg5.v(myketTextView2, this.w, this, appTagData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof se8) {
            this.y = (se8) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(AppTagData appTagData, Integer num) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_double);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        Integer num2 = appTagData.d;
        Integer num3 = appTagData.b;
        if (js3.i(num, num2) && appTagData.c) {
            i = sj8.b().c;
            i2 = sj8.b().e;
            i3 = sj8.b().e;
            i4 = sj8.b().c;
        } else {
            i = sj8.b().n;
            i2 = sj8.b().l;
            i3 = sj8.b().w;
            i4 = sj8.b().n;
        }
        se8 se8Var = this.y;
        if (se8Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = se8Var.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.k = i2;
        ea7Var.n = i2;
        ea7Var.b = i2;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = i3;
        myketTextView.setBackground(ea7Var.a());
        myketTextView.setTextColor(i);
        if (num3 == null) {
            se8 se8Var2 = this.y;
            if (se8Var2 != null) {
                se8Var2.v.setCompoundDrawables(null, null, null, null);
                return;
            } else {
                js3.V("binding");
                throw null;
            }
        }
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int iIntValue = num3.intValue();
        try {
            drawable = q39.a(resources, iIntValue, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(iIntValue, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(iIntValue, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.MULTIPLY));
        drawableMutate.setBounds(0, 0, view.getResources().getDimensionPixelSize(pq6.small_text_button_tag_icon_size), view.getResources().getDimensionPixelSize(pq6.small_text_button_tag_icon_size));
        se8 se8Var3 = this.y;
        if (se8Var3 != null) {
            se8Var3.v.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        } else {
            js3.V("binding");
            throw null;
        }
    }
}
