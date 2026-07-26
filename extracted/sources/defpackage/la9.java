package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.virtualKeyboard.a;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardItemData;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class la9 extends qg5 {
    public final og5 w;
    public ka9 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la9(View view, a aVar) {
        super(view);
        js3.p(aVar, "onItemClickListener");
        this.w = aVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        VirtualKeyboardItemData virtualKeyboardItemData = (VirtualKeyboardItemData) myketRecyclerData;
        js3.p(virtualKeyboardItemData, "data");
        ka9 ka9Var = this.x;
        if (ka9Var == null) {
            js3.V("binding");
            throw null;
        }
        View view = ka9Var.l;
        js3.o(view, "getRoot(...)");
        qg5.v(view, this.w, this, virtualKeyboardItemData);
        ka9 ka9Var2 = this.x;
        if (ka9Var2 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = ka9Var2.l;
        View view3 = this.a;
        Context context = view3.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.h = 0;
        ea7Var.c(view3.getContext().getResources().getDimensionPixelSize(pq6.space_4));
        ea7Var.j = true;
        view2.setBackground(ea7Var.a());
        ka9 ka9Var3 = this.x;
        if (ka9Var3 != null) {
            ka9Var3.v.setText(virtualKeyboardItemData.a);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        boolean z = a79Var instanceof ka9;
        if (z) {
            this.x = (ka9) a79Var;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            lw.g(null, "binding is incompatible", null);
        }
    }
}
