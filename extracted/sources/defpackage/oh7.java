package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.pika.send.recycler.SearchAppData;

/* JADX INFO: loaded from: classes3.dex */
public final class oh7 extends qg5 {
    public final lw8 A;
    public final og5 w;
    public final nm5 x;
    public d86 y;
    public mb0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh7(View view, up3 up3Var, nm5 nm5Var) {
        super(view);
        js3.p(up3Var, "onCloseClickListener");
        js3.p(nm5Var, "searchCallback");
        this.w = up3Var;
        this.x = nm5Var;
        this.A = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        SearchAppData searchAppData = (SearchAppData) myketRecyclerData;
        js3.p(searchAppData, "data");
        Resources resources = this.a.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_action_search;
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
        int i2 = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, mode));
        x().w.setImageDrawable(drawableMutate);
        x().x.setTextColor(sj8.b().n);
        x().v.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        x().y.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().p, mode));
        if (this.z == null) {
            this.z = new mb0(9, this);
            x().x.addTextChangedListener(this.z);
            x().x.setOnEditorActionListener(new ud4(2, this));
        }
        ImageView imageView = x().v;
        js3.o(imageView, "close");
        qg5.v(imageView, this.w, this, searchAppData);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((SearchAppData) myketRecyclerData, "data");
        this.z = null;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof d86) {
            this.y = (d86) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final d86 x() {
        d86 d86Var = this.y;
        if (d86Var != null) {
            return d86Var;
        }
        js3.V("binding");
        throw null;
    }
}
