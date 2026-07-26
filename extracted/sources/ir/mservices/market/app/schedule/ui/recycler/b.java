package ir.mservices.market.app.schedule.ui.recycler;

import android.content.Context;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.e83;
import defpackage.ea7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.xe7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public final og5 x;
    public e83 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, xe7 xe7Var, xe7 xe7Var2) {
        super(view);
        js3.p(xe7Var, "startTimeClickListener");
        js3.p(xe7Var2, "endTimeClickListener");
        this.w = xe7Var;
        this.x = xe7Var2;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ScheduleTimeData scheduleTimeData = (ScheduleTimeData) myketRecyclerData;
        js3.p(scheduleTimeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ScheduleTimeViewHolder$onAttach$1(null, scheduleTimeData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ScheduleTimeData scheduleTimeData = (ScheduleTimeData) myketRecyclerData;
        js3.p(scheduleTimeData, "data");
        e83 e83Var = this.y;
        if (e83Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = e83Var.y;
        myketTextView.setText(scheduleTimeData.a);
        View view = this.a;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().q;
        ea7Var.i = sj8.b().v;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.round_drawable_default_border_radius));
        ea7Var.h = 1;
        ea7Var.j = true;
        myketTextView.setBackground(ea7Var.a());
        MyketTextView myketTextView2 = e83Var.w;
        myketTextView2.setText(scheduleTimeData.b);
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().q;
        ea7Var2.i = sj8.b().v;
        ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.round_drawable_default_border_radius));
        ea7Var2.h = 1;
        ea7Var2.j = true;
        myketTextView2.setBackground(ea7Var2.a());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof e83) {
            this.y = (e83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
