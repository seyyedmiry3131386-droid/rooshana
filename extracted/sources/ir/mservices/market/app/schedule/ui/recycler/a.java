package ir.mservices.market.app.schedule.ui.recycler;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.v33;
import defpackage.xe7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public v33 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, xe7 xe7Var) {
        super(view);
        js3.p(xe7Var, "enableScheduleUpdateClickListener");
        this.w = xe7Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) myketRecyclerData;
        js3.p(manageUpdateScheduleData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ManageScheduleUpdateViewHolder$onAttach$1(manageUpdateScheduleData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) myketRecyclerData;
        js3.p(manageUpdateScheduleData, "data");
        v33 v33Var = this.x;
        if (v33Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = v33Var.x;
        js3.o(frameLayout, "clickableLayout");
        og5 og5Var = this.w;
        qg5.v(frameLayout, og5Var, this, manageUpdateScheduleData);
        v33 v33Var2 = this.x;
        if (v33Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = v33Var2.w;
        js3.o(frameLayout2, "actionSwitchLayout");
        qg5.v(frameLayout2, og5Var, this, manageUpdateScheduleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v33) {
            this.x = (v33) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
