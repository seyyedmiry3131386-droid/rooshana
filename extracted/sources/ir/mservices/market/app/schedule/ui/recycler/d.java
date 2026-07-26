package ir.mservices.market.app.schedule.ui.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.g83;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.q39;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.xe7;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends qg5 {
    public final og5 w;
    public g83 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, xe7 xe7Var) {
        super(view);
        js3.p(xe7Var, "scheduleTypeClickListener");
        this.w = xe7Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ScheduleTypeData scheduleTypeData = (ScheduleTypeData) myketRecyclerData;
        js3.p(scheduleTypeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ScheduleTypeViewHolder$onAttach$1(scheduleTypeData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        ScheduleTypeData scheduleTypeData = (ScheduleTypeData) myketRecyclerData;
        js3.p(scheduleTypeData, "data");
        g83 g83Var = this.x;
        if (g83Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = g83Var.v;
        View view = this.a;
        myketTextView.setText(view.getResources().getString(scheduleTypeData.c));
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
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        myketTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        FrameLayout frameLayout = g83Var.x;
        js3.o(frameLayout, "scheduleTypeLayout");
        qg5.v(frameLayout, this.w, this, scheduleTypeData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g83) {
            this.x = (g83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
