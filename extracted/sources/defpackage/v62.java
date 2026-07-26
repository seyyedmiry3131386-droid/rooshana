package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class v62 extends qg5 {
    public final int w;
    public final og5 x;
    public g23 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(int i, og5 og5Var, View view) {
        super(view);
        js3.p(og5Var, "onExtensionHeaderClickListener");
        this.w = i;
        this.x = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        ExtHeaderData extHeaderData = (ExtHeaderData) myketRecyclerData;
        js3.p(extHeaderData, "data");
        boolean z = extHeaderData.e;
        View view = this.a;
        view.getLayoutParams().width = this.w;
        String str = extHeaderData.c;
        if (str == null || f88.n0(str)) {
            g23 g23Var = this.y;
            if (g23Var == null) {
                js3.V("binding");
                throw null;
            }
            g23Var.w.setVisibility(8);
        } else {
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
            g23 g23Var2 = this.y;
            if (g23Var2 == null) {
                js3.V("binding");
                throw null;
            }
            SmallBoldTextButton smallBoldTextButton = g23Var2.x;
            ThemeData themeDataB = sj8.b();
            smallBoldTextButton.setPrimaryColor(z ? themeDataB.j : themeDataB.c);
            smallBoldTextButton.setSmallIcon(drawable);
            smallBoldTextButton.setText(rs6.all);
            smallBoldTextButton.setTextColor(z ? sj8.b().j : sj8.b().c);
            g23 g23Var3 = this.y;
            if (g23Var3 == null) {
                js3.V("binding");
                throw null;
            }
            g23Var3.w.getLayoutParams().height = -2;
            g23 g23Var4 = this.y;
            if (g23Var4 == null) {
                js3.V("binding");
                throw null;
            }
            g23Var4.w.setVisibility(0);
            g23 g23Var5 = this.y;
            if (g23Var5 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = g23Var5.y;
            myketTextView.setText(str);
            myketTextView.setTextColor(sj8.b().m);
            g23 g23Var6 = this.y;
            if (g23Var6 == null) {
                js3.V("binding");
                throw null;
            }
            g23Var6.v.setData(extHeaderData.d);
            g23 g23Var7 = this.y;
            if (g23Var7 == null) {
                js3.V("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = g23Var7.w;
            js3.o(constraintLayout, "content");
            qg5.v(constraintLayout, this.x, this, extHeaderData);
        }
        if (extHeaderData.h) {
            return;
        }
        g23 g23Var8 = this.y;
        if (g23Var8 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = g23Var8.y;
        myketTextView2.setAlpha(0.2f);
        myketTextView2.animate().alpha(1.0f).setDuration(350L).start();
        g23 g23Var9 = this.y;
        if (g23Var9 == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton2 = g23Var9.x;
        smallBoldTextButton2.setAlpha(0.2f);
        smallBoldTextButton2.animate().alpha(1.0f).setDuration(350L).start();
        extHeaderData.h = true;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g23) {
            this.y = (g23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
