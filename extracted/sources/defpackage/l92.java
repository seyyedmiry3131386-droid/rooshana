package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTransactionData;

/* JADX INFO: loaded from: classes3.dex */
public final class l92 extends qg5 {
    public final og5 w;
    public ma2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(View view, p92 p92Var) {
        super(view);
        js3.p(p92Var, "onChooseTransactionItemClickListener");
        this.w = p92Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FeedbackChooseTransactionData feedbackChooseTransactionData = (FeedbackChooseTransactionData) myketRecyclerData;
        js3.p(feedbackChooseTransactionData, "data");
        ma2 ma2Var = this.x;
        if (ma2Var == null) {
            js3.V("binding");
            throw null;
        }
        Drawable background = ma2Var.v.getBackground();
        int i = sj8.b().w;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i, mode));
        ma2 ma2Var2 = this.x;
        if (ma2Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ma2Var2.w.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        ma2 ma2Var3 = this.x;
        if (ma2Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = ma2Var3.v;
        js3.o(constraintLayout, "layout");
        qg5.v(constraintLayout, this.w, this, feedbackChooseTransactionData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ma2) {
            this.x = (ma2) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
