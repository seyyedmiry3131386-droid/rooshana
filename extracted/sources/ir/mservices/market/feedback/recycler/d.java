package ir.mservices.market.feedback.recycler;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.n92;
import defpackage.og5;
import defpackage.p92;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rm7;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.feedback.data.TransactionData;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends qg5 {
    public static final /* synthetic */ int A = 0;
    public final og5 w;
    public final og5 x;
    public final lw8 y;
    public n92 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, p92 p92Var, p92 p92Var2) {
        super(view);
        js3.p(p92Var, "onCloseClickListener");
        js3.p(p92Var2, "onEditClickListener");
        this.w = p92Var;
        this.x = p92Var2;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        FeedbackChosenTransactionData feedbackChosenTransactionData = (FeedbackChosenTransactionData) myketRecyclerData;
        js3.p(feedbackChosenTransactionData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new FeedbackChosenTransactionViewHolder$onAttach$1(feedbackChosenTransactionData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FeedbackChosenTransactionData feedbackChosenTransactionData = (FeedbackChosenTransactionData) myketRecyclerData;
        js3.p(feedbackChosenTransactionData, "data");
        n92 n92Var = this.z;
        if (n92Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = n92Var.B;
        View view = this.a;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().q;
        ea7Var.i = sj8.b().q;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_8));
        frameLayout.setBackground(ea7Var.a());
        ImageButton imageButton = n92Var.w;
        int i = sj8.b().c;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageButton.setColorFilter(new PorterDuffColorFilter(i, mode));
        ImageButton imageButton2 = n92Var.y;
        imageButton2.setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        y((TransactionData) feedbackChosenTransactionData.a.getValue());
        boolean z = feedbackChosenTransactionData.b;
        imageButton2.setVisibility(z ? 0 : 8);
        imageButton.setVisibility(z ? 0 : 8);
        qg5.v(imageButton, this.w, this, feedbackChosenTransactionData);
        qg5.v(imageButton2, this.x, this, feedbackChosenTransactionData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof n92) {
            this.z = (n92) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(int i, MyketTextView myketTextView, String str) {
        myketTextView.setText("");
        String strI = t61.i(this.a.getResources().getString(i), ": ");
        int i2 = sj8.b().n;
        SpannableString spannableString = new SpannableString(strI);
        spannableString.setSpan(new ForegroundColorSpan(i2), 0, spannableString.length(), 33);
        myketTextView.append(spannableString);
        int i3 = sj8.b().n;
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new ForegroundColorSpan(i3), 0, spannableString2.length(), 33);
        myketTextView.append(spannableString2);
    }

    public final void y(TransactionData transactionData) {
        n92 n92Var = this.z;
        if (n92Var == null) {
            js3.V("binding");
            throw null;
        }
        if (transactionData != null) {
            n92Var.z.setText(transactionData.getTitle());
            AppIconView appIconView = n92Var.v;
            js3.o(appIconView, "appIcon");
            AppIconView.setImageUrl$default(appIconView, transactionData.getImgUrl(), null, false, 6, null);
            MyketTextView myketTextView = n92Var.x;
            js3.o(myketTextView, "date");
            int i = rs6.date;
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            x(i, myketTextView, lw8.e(lw8Var, transactionData.getDate()));
            MyketTextView myketTextView2 = n92Var.A;
            js3.o(myketTextView2, "token");
            int i2 = rs6.tracking_number;
            lw8 lw8Var2 = this.y;
            if (lw8Var2 == null) {
                js3.V("uiUtils");
                throw null;
            }
            x(i2, myketTextView2, lw8.e(lw8Var2, transactionData.getOrderId()));
            MyketTextView myketTextView3 = n92Var.C;
            js3.o(myketTextView3, "type");
            int i3 = rs6.type;
            String type = transactionData.getType();
            lw8 lw8Var3 = this.y;
            if (lw8Var3 != null) {
                x(i3, myketTextView3, rm7.q(type, " ( ", lw8.e(lw8Var3, transactionData.getPrice()), " ) "));
            } else {
                js3.V("uiUtils");
                throw null;
            }
        }
    }
}
