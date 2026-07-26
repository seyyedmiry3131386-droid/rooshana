package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.list.items.recycler.SelectedListAddItemData;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class vm7 extends qg5 {
    public final og5 w;
    public t83 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm7(View view, sm7 sm7Var) {
        super(view);
        js3.p(sm7Var, "onClickListener");
        this.w = sm7Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        SelectedListAddItemData selectedListAddItemData = (SelectedListAddItemData) myketRecyclerData;
        js3.p(selectedListAddItemData, "data");
        t83 t83Var = this.x;
        if (t83Var == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton = t83Var.v;
        smallBoldTextButton.setText(selectedListAddItemData.a);
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_add;
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
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        smallBoldTextButton.setBigIcon(drawableMutate);
        qg5.v(view, this.w, this, selectedListAddItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof t83) {
            this.x = (t83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
