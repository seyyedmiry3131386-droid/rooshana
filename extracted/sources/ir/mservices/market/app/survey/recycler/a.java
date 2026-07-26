package ir.mservices.market.app.survey.recycler;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.c13;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.ts5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public c13 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, ts5 ts5Var) {
        super(view);
        js3.p(ts5Var, "onClickListener");
        this.w = ts5Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AnswerData answerData = (AnswerData) myketRecyclerData;
        js3.p(answerData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AnswerViewHolder$onAttach$1(answerData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AnswerData answerData = (AnswerData) myketRecyclerData;
        js3.p(answerData, "data");
        c13 c13Var = this.x;
        if (c13Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketRadioButton myketRadioButton = c13Var.w;
        myketRadioButton.setText(answerData.a.getText());
        myketRadioButton.a(sj8.b(), sj8.b().c);
        myketRadioButton.setClickable(false);
        c13 c13Var2 = this.x;
        if (c13Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = c13Var2.v;
        js3.o(constraintLayout, "answerContainer");
        qg5.v(constraintLayout, this.w, this, answerData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof c13) {
            this.x = (c13) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
