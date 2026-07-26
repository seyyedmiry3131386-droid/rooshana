package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.feedback.recycler.FeedbackTransactionData;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class la2 extends qg5 {
    public final og5 w;
    public final lw8 x;
    public ja2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(View view, v4 v4Var) {
        super(view);
        js3.p(v4Var, "onItemClickListener");
        this.w = v4Var;
        this.x = (lw8) ((w91) qg5.r()).E.get();
    }

    public static SpannableString z(int i, String str) {
        if (f88.n0(str)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        return spannableString;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FeedbackTransactionData feedbackTransactionData = (FeedbackTransactionData) myketRecyclerData;
        js3.p(feedbackTransactionData, "data");
        View view = this.a;
        Resources resources = view.getResources();
        PurchaseTransactionDTO purchaseTransactionDTO = feedbackTransactionData.a;
        ConstraintLayout constraintLayout = y().x;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.i = sj8.b().q;
        ea7Var.h = resources.getDimensionPixelSize(pq6.border_size);
        ea7Var.i = Ripple.a(sj8.b().O, sj8.b().v);
        ea7Var.c(resources.getDimensionPixelSize(pq6.margin_default_v2_oneHalf));
        constraintLayout.setBackground(ea7Var.a());
        MyketTextView myketTextView = y().D;
        js3.o(myketTextView, "type");
        x(rs6.type, myketTextView, purchaseTransactionDTO.getType());
        MyketTextView myketTextView2 = y().z;
        js3.o(myketTextView2, "price");
        int i = rs6.price;
        lw8 lw8Var = this.x;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        x(i, myketTextView2, lw8.e(lw8Var, purchaseTransactionDTO.getPrice()));
        MyketTextView myketTextView3 = y().C;
        js3.o(myketTextView3, "trackingNumber");
        int i2 = rs6.tracking_number;
        lw8 lw8Var2 = this.x;
        if (lw8Var2 == null) {
            js3.V("uiUtils");
            throw null;
        }
        x(i2, myketTextView3, lw8.e(lw8Var2, purchaseTransactionDTO.getTrackingNumber()));
        MyketTextView myketTextView4 = y().y;
        js3.o(myketTextView4, "date");
        int i3 = rs6.date;
        lw8 lw8Var3 = this.x;
        if (lw8Var3 == null) {
            js3.V("uiUtils");
            throw null;
        }
        x(i3, myketTextView4, lw8.e(lw8Var3, purchaseTransactionDTO.getOrderDateTime()));
        AppIconView appIconView = y().v;
        js3.o(appIconView, "appIcon");
        AppIconView.setImageUrl$default(appIconView, purchaseTransactionDTO.getIconUrl(), null, false, 6, null);
        y().B.setText(purchaseTransactionDTO.getTitle());
        if (m88.T(purchaseTransactionDTO.getPurchaseStatus(), PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN, true)) {
            MyketTextView myketTextView5 = y().A;
            myketTextView5.setText(view.getResources().getString(rs6.purchase_unsuccessful));
            myketTextView5.setTextColor(sj8.b().A);
        } else {
            MyketTextView myketTextView6 = y().A;
            myketTextView6.setText(view.getResources().getString(rs6.purchase_successful));
            myketTextView6.setTextColor(sj8.b().x);
        }
        ConstraintLayout constraintLayout2 = y().x;
        js3.o(constraintLayout2, "container");
        qg5.v(constraintLayout2, this.w, this, feedbackTransactionData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ja2) {
            this.y = (ja2) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(int i, MyketTextView myketTextView, String str) {
        myketTextView.setText("");
        myketTextView.append(z(sj8.b().n, t61.i(this.a.getResources().getString(i), ": ")));
        myketTextView.append(z(sj8.b().n, str));
    }

    public final ja2 y() {
        ja2 ja2Var = this.y;
        if (ja2Var != null) {
            return ja2Var;
        }
        js3.V("binding");
        throw null;
    }
}
