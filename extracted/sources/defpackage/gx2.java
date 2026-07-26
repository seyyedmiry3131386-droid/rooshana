package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class gx2 extends qg5 {
    public final og5 w;
    public m23 x;
    public final dp3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(View view, el7 el7Var) {
        super(view);
        js3.p(el7Var, "onRemoveClickListener");
        this.w = el7Var;
        this.y = (dp3) ((w91) qg5.r()).v.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        HarmFulAppViewData harmFulAppViewData = (HarmFulAppViewData) myketRecyclerData;
        js3.p(harmFulAppViewData, "viewData");
        m23 m23Var = this.x;
        if (m23Var == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = m23Var.v;
        dp3 dp3Var = this.y;
        if (dp3Var == null) {
            js3.V("installManager");
            throw null;
        }
        String str = harmFulAppViewData.a;
        appIconView.setImageBitmap(dp3Var.k(str));
        m23 m23Var2 = this.x;
        if (m23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = m23Var2.w;
        dp3 dp3Var2 = this.y;
        if (dp3Var2 == null) {
            js3.V("installManager");
            throw null;
        }
        myketTextView.setText(dp3Var2.m(str));
        m23 m23Var3 = this.x;
        if (m23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = m23Var3.y;
        smallEmptyMediumTextOvalButton.setTextColor(sj8.b().c);
        smallEmptyMediumTextOvalButton.a();
        View view = this.a;
        smallEmptyMediumTextOvalButton.setText(view.getResources().getString(rs6.show_permission_setting));
        smallEmptyMediumTextOvalButton.setPadding(view.getResources().getDimensionPixelSize(pq6.space_12));
        m23 m23Var4 = this.x;
        if (m23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = m23Var4.y;
        js3.o(smallEmptyMediumTextOvalButton2, "permissionSetting");
        qg5.v(smallEmptyMediumTextOvalButton2, this.w, this, harmFulAppViewData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof m23) {
            this.x = (m23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
