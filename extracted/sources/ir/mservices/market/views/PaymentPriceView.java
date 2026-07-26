package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.s89;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentPriceView extends RelativeLayout {
    public final s89 a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentPriceView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void setPrice(String str, String str2) {
        s89 s89Var = this.a;
        s89Var.v.setText(str);
        MyketTextView myketTextView = s89Var.w;
        myketTextView.setText(str2);
        myketTextView.setVisibility(str2 == null || f88.n0(str2) ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = s89.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        s89 s89Var = (s89) a79.f0(layoutInflaterFrom, js6.view_payment_price, this, true, null);
        js3.o(s89Var, "inflate(...)");
        this.a = s89Var;
        s89Var.w.setPaintFlags(s89Var.v.getPaintFlags() | 16);
    }
}
