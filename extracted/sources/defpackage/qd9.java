package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.welcome.recycler.WelcomeBirthdayData;
import ir.mservices.market.views.BirthdayPicker;

/* JADX INFO: loaded from: classes3.dex */
public final class qd9 extends qg5 {
    public final og5 w;
    public ga3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd9(View view, rd9 rd9Var) {
        super(view);
        js3.p(rd9Var, "onChangeDateListener");
        this.w = rd9Var;
        w91 w91Var = (w91) qg5.r();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        WelcomeBirthdayData welcomeBirthdayData = (WelcomeBirthdayData) myketRecyclerData;
        js3.p(welcomeBirthdayData, "data");
        if (yq2.n0(this.a.getContext())) {
            ga3 ga3Var = this.x;
            if (ga3Var == null) {
                js3.V("binding");
                throw null;
            }
            ga3Var.w.setGravity(17);
        }
        ga3 ga3Var2 = this.x;
        if (ga3Var2 == null) {
            js3.V("binding");
            throw null;
        }
        BirthdayPicker birthdayPicker = ga3Var2.v;
        birthdayPicker.setDate((String) welcomeBirthdayData.a.getValue());
        birthdayPicker.setOnDateChangeListener(new a67(28, this));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ga3) {
            this.x = (ga3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
