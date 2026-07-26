package ir.mservices.market.app.schedule.ui.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f83;
import defpackage.js3;
import defpackage.lw;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public f83 w;

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ScheduleTipData scheduleTipData = (ScheduleTipData) myketRecyclerData;
        js3.p(scheduleTipData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ScheduleTipViewHolder$onAttach$1(scheduleTipData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        js3.p((ScheduleTipData) myketRecyclerData, "data");
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_empty_info;
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
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.icon_info_span_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        f83 f83Var = this.w;
        if (f83Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = f83Var.v;
        SpannableString spannableString = new SpannableString(view.getResources().getString(rs6.info_scheduled_download));
        spannableString.setSpan(new ImageSpan(drawable), 0, 1, 18);
        myketTextView.setText(spannableString);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof f83) {
            this.w = (f83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
