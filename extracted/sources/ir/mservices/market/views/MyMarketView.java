package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a5;
import defpackage.a79;
import defpackage.b5;
import defpackage.b77;
import defpackage.c5;
import defpackage.ea7;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qd5;
import defpackage.sj8;
import defpackage.t32;
import defpackage.uy6;
import defpackage.yq6;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketView extends Hilt_MyMarketView {
    public c5 s;
    public final qd5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMarketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = qd5.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qd5 qd5Var = (qd5) a79.f0(layoutInflaterFrom, js6.my_market_view, this, true, null);
        js3.o(qd5Var, "inflate(...)");
        this.t = qd5Var;
        u();
    }

    public final c5 getAccountManager() {
        c5 c5Var = this.s;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t32.b().l(this, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t32.b().o(this);
    }

    public final void onEvent(a5 a5Var) {
        js3.p(a5Var, "profileEvent");
        u();
    }

    public final void setAccountManager(c5 c5Var) {
        js3.p(c5Var, "<set-?>");
        this.s = c5Var;
    }

    public final void t() {
        Drawable drawable;
        ImageView imageView = this.t.v;
        Context context = imageView.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().p;
        ea7Var.c(96);
        ea7Var.p = sj8.b().O.c;
        ea7Var.j = true;
        ea7Var.h = 0;
        imageView.setBackground(ea7Var.a());
        Resources resources = imageView.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_person;
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
        imageView.setImageDrawable(drawableMutate);
    }

    public final void u() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.padding_root_icon);
        boolean zD = getAccountManager().d();
        qd5 qd5Var = this.t;
        if (zD) {
            getAccountManager().g(qd5Var.v, true);
            String str = (String) getAccountManager().h.b;
            if (str == null || f88.n0(str)) {
                t();
            } else {
                ConstraintLayout constraintLayout = qd5Var.w;
                js3.o(constraintLayout, "layout");
                uy6.n(sj8.b().O.c, constraintLayout);
                qd5Var.v.setBackground(null);
                dimensionPixelSize = 0;
            }
        } else {
            t();
        }
        ImageView imageView = qd5Var.v;
        imageView.getLayoutParams().height = imageView.getResources().getDimensionPixelSize(pq6.root_icon_size);
        imageView.getLayoutParams().width = imageView.getResources().getDimensionPixelSize(pq6.root_icon_size);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void onEvent(b5 b5Var) {
        u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyMarketView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
