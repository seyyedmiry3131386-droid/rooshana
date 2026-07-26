package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.fa1;
import defpackage.fw;
import defpackage.js3;
import defpackage.js6;
import defpackage.sj8;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogArrowComponent extends ConstraintLayout {
    public fw q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogArrowComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = fw.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        fw fwVar = (fw) a79.f0(layoutInflaterFrom, js6.arrow_dialog_component, this, true, null);
        js3.o(fwVar, "inflate(...)");
        this.q = fwVar;
        setTheme(sj8.b());
    }

    public final fw getBinding() {
        return this.q;
    }

    public final void setBinding(fw fwVar) {
        js3.p(fwVar, "<set-?>");
        this.q = fwVar;
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "theme");
        this.q.v.getBackground().setColorFilter(new PorterDuffColorFilter(themeData.n, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogArrowComponent(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
