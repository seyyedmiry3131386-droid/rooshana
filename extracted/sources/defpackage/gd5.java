package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myMarket.recycler.MyMarketHeaderData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class gd5 extends qg5 {
    public final og5 w;
    public final c5 x;
    public final lw8 y;
    public ed5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd5(View view, md5 md5Var) {
        super(view);
        js3.p(md5Var, "onActionClickListener");
        this.w = md5Var;
        w91 w91Var = (w91) qg5.r();
        this.x = (c5) w91Var.L.get();
        this.y = (lw8) w91Var.E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        String string;
        String string2;
        MyMarketHeaderData myMarketHeaderData = (MyMarketHeaderData) myketRecyclerData;
        js3.p(myMarketHeaderData, "data");
        boolean z = myMarketHeaderData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.my_market_avatar_height);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        ConstraintLayout constraintLayout = x().y;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().N;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().w;
        constraintLayout.setBackground(ea7Var.a());
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
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
        SmallBoldTextButton smallBoldTextButton = x().v;
        if (z) {
            smallBoldTextButton.setPrimaryColor(sj8.b().m);
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            string = lw8.e(lw8Var, myMarketHeaderData.b);
        } else {
            smallBoldTextButton.setPrimaryColor(sj8.b().c);
            string = view.getResources().getString(rs6.account_login);
            js3.m(string);
        }
        smallBoldTextButton.setText(string);
        ThemeData themeDataB = sj8.b();
        smallBoldTextButton.setPrimaryColor(z ? themeDataB.n : themeDataB.c);
        smallBoldTextButton.setSmallIcon(drawable);
        smallBoldTextButton.setEnabled(!z);
        c5 c5Var = this.x;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        c5Var.g(x().w, false);
        MyketTextView myketTextView = x().z;
        if (!z) {
            string2 = view.getResources().getString(rs6.anonymous);
        } else {
            if (c5Var == null) {
                js3.V("accountManager");
                throw null;
            }
            string2 = c5Var.c();
        }
        myketTextView.setText(string2);
        ConstraintLayout constraintLayout2 = x().y;
        js3.o(constraintLayout2, "content");
        qg5.v(constraintLayout2, this.w, this, myMarketHeaderData);
        boolean z2 = myMarketHeaderData.c;
        View viewFindViewById = view.findViewById(rr6.badge);
        Drawable background = viewFindViewById.getBackground();
        int i2 = sj8.b().A;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i2, mode));
        viewFindViewById.setVisibility(8);
        if (!z2 || !z) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().A, mode));
            viewFindViewById.setVisibility(0);
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ed5) {
            this.z = (ed5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ed5 x() {
        ed5 ed5Var = this.z;
        if (ed5Var != null) {
            return ed5Var;
        }
        js3.V("binding");
        throw null;
    }
}
