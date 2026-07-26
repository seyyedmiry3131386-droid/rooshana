package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.virtualKeyboard.a;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardRemoveData;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class qa9 extends qg5 {
    public final og5 w;
    public oa9 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa9(View view, a aVar) {
        super(view);
        js3.p(aVar, "onRemoveClickListener");
        this.w = aVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        VirtualKeyboardRemoveData virtualKeyboardRemoveData = (VirtualKeyboardRemoveData) myketRecyclerData;
        js3.p(virtualKeyboardRemoveData, "data");
        oa9 oa9Var = this.x;
        if (oa9Var == null) {
            js3.V("binding");
            throw null;
        }
        View view = oa9Var.l;
        js3.o(view, "getRoot(...)");
        qg5.v(view, this.w, this, virtualKeyboardRemoveData);
        oa9 oa9Var2 = this.x;
        if (oa9Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = oa9Var2.w;
        View view2 = this.a;
        Context context = view2.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().u;
        ea7Var.h = 0;
        ea7Var.c(view2.getContext().getResources().getDimensionPixelSize(pq6.space_4));
        ea7Var.j = true;
        frameLayout.setBackground(ea7Var.a());
        oa9 oa9Var3 = this.x;
        if (oa9Var3 != null) {
            oa9Var3.v.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY));
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        boolean z = a79Var instanceof oa9;
        if (z) {
            this.x = (oa9) a79Var;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            lw.g(null, "binding is incompatible", null);
        }
    }
}
