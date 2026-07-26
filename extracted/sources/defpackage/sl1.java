package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperTitleRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class sl1 extends qg5 {
    public final og5 w;
    public ql1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl1(View view, ap apVar) {
        super(view);
        js3.p(apVar, "onClickListener");
        this.w = apVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        DeveloperTitleRowData developerTitleRowData = (DeveloperTitleRowData) myketRecyclerData;
        js3.p(developerTitleRowData, "data");
        ql1 ql1Var = this.x;
        if (ql1Var == null) {
            js3.V("binding");
            throw null;
        }
        ql1Var.v.y.setText(developerTitleRowData.b);
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, developerTitleRowData);
        ql1 ql1Var2 = this.x;
        if (ql1Var2 == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton = ql1Var2.v.w;
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
        smallBoldTextButton.setSmallIcon(drawable);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ql1) {
            this.x = (ql1) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
