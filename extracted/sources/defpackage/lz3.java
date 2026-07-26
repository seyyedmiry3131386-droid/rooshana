package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.setting.recycler.KidsModeData;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lz3 extends qg5 {
    public final og5 w;
    public vq7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz3(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        KidsModeData kidsModeData = (KidsModeData) myketRecyclerData;
        js3.p(kidsModeData, "data");
        vq7 vq7Var = this.x;
        if (vq7Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = vq7Var.x;
        myketTextView.setTextColor(sj8.b().m);
        View view = this.a;
        myketTextView.setText(view.getResources().getString(rs6.kids_mode_title));
        vq7 vq7Var2 = this.x;
        if (vq7Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = vq7Var2.w;
        myketTextView2.setTextColor(sj8.b().n);
        myketTextView2.setText(view.getResources().getString(rs6.kids_mode_message));
        vq7 vq7Var3 = this.x;
        if (vq7Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketSwitch myketSwitch = vq7Var3.v;
        myketSwitch.f();
        myketSwitch.setClickable(false);
        myketSwitch.setEnabled(false);
        myketSwitch.setChecked(kidsModeData.a);
        qg5.v(view, this.w, this, kidsModeData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof vq7) {
            this.x = (vq7) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
