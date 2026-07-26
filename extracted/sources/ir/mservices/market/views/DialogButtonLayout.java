package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.fa1;
import defpackage.ii0;
import defpackage.js3;
import defpackage.js6;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogButtonLayout extends ConstraintLayout {
    public ii0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ii0.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ii0 ii0Var = (ii0) a79.f0(layoutInflaterFrom, js6.buttons_dialog, this, true, null);
        js3.o(ii0Var, "inflate(...)");
        setBinding(ii0Var);
        setColor(sj8.b().c);
    }

    public final ii0 getBinding() {
        ii0 ii0Var = this.q;
        if (ii0Var != null) {
            return ii0Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void setBinding(ii0 ii0Var) {
        js3.p(ii0Var, "<set-?>");
        this.q = ii0Var;
    }

    public final void setColor(int i) {
        getBinding().v.setTextColor(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        getBinding().v.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTitle(java.lang.String r3) {
        /*
            r2 = this;
            ii0 r0 = r2.getBinding()
            ir.mservices.market.views.BigTextButton r0 = r0.v
            if (r3 == 0) goto L1d
            boolean r1 = defpackage.f88.n0(r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r3 = 0
        L10:
            if (r3 == 0) goto L1d
            ii0 r1 = r2.getBinding()
            ir.mservices.market.views.BigTextButton r1 = r1.v
            r1.setText(r3)
            r3 = 0
            goto L1f
        L1d:
            r3 = 8
        L1f:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.DialogButtonLayout.setTitle(java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogButtonLayout(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
