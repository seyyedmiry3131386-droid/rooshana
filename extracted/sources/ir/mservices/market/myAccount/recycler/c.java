package ir.mservices.market.myAccount.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cv;
import defpackage.f88;
import defpackage.js3;
import defpackage.lc5;
import defpackage.lw;
import defpackage.lw8;
import defpackage.nc5;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qs3;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v48;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public final og5 w;
    public lc5 x;
    public final lw8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, qs3 qs3Var) {
        super(view);
        js3.p(qs3Var, "onClickListener");
        this.w = qs3Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MyAccountItemData myAccountItemData = (MyAccountItemData) myketRecyclerData;
        js3.p(myAccountItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MyAccountItemViewHolder$onAttach$1(null, myAccountItemData, this), 3);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof lc5) {
            this.x = (lc5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void t(MyAccountItemData myAccountItemData) {
        Drawable drawable;
        js3.p(myAccountItemData, "data");
        v48 v48Var = myAccountItemData.b.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_2xl);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_l);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        String string = null;
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
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        lc5 lc5Var = this.x;
        if (lc5Var == null) {
            js3.V("binding");
            throw null;
        }
        lc5Var.v.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        lc5 lc5Var2 = this.x;
        if (lc5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        lc5Var2.w.setImageDrawable(drawable);
        lc5 lc5Var3 = this.x;
        if (lc5Var3 == null) {
            js3.V("binding");
            throw null;
        }
        lc5Var3.x.setText(myAccountItemData.a);
        MyAccountItemsType myAccountItemsType = (MyAccountItemsType) ((Pair) v48Var.getValue()).a;
        String string2 = (String) ((Pair) v48Var.getValue()).b;
        lc5 lc5Var4 = this.x;
        if (lc5Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = lc5Var4.y;
        if (string2 == null || f88.n0(string2)) {
            int iOrdinal = myAccountItemsType.ordinal();
            if (iOrdinal == 1) {
                string = view.getResources().getString(rs6.enter_name);
            } else if (iOrdinal == 2) {
                string = view.getResources().getString(rs6.enter_bio);
            } else if (iOrdinal == 3) {
                string = view.getResources().getString(rs6.gender);
            } else if (iOrdinal == 4) {
                string = view.getResources().getString(rs6.enter_city);
            } else if (iOrdinal == 5) {
                string = view.getResources().getString(rs6.enter_birthday);
            }
            myketTextView.setText(string);
            myketTextView.setTextColor(sj8.b().n);
            myketTextView.setBold(false);
        } else {
            if (nc5.a[myAccountItemsType.ordinal()] == 1) {
                Resources resources2 = view.getResources();
                Gender.d.getClass();
                Gender genderV = cv.v(string2);
                string2 = resources2.getString(genderV != null ? genderV.b : rs6.gender);
            }
            js3.m(string2);
            myketTextView.setBold(true);
            myketTextView.setTextColor(sj8.b().m);
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            myketTextView.setText(lw8.e(lw8Var, string2));
        }
        view.setClickable(true);
        qg5.v(view, this.w, this, myAccountItemData);
    }
}
