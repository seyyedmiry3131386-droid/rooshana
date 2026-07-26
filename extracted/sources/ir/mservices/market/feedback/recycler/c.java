package ir.mservices.market.feedback.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.ca2;
import defpackage.cc7;
import defpackage.j92;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.p92;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.y92;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public static final /* synthetic */ int y = 0;
    public final og5 w;
    public j92 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, p92 p92Var) {
        super(view);
        js3.p(p92Var, "onChooseTopicItemClickListener");
        this.w = p92Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        FeedbackChooseTopicData feedbackChooseTopicData = (FeedbackChooseTopicData) myketRecyclerData;
        js3.p(feedbackChooseTopicData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new FeedbackChooseTopicViewHolder$onAttach$1(feedbackChooseTopicData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FeedbackChooseTopicData feedbackChooseTopicData = (FeedbackChooseTopicData) myketRecyclerData;
        js3.p(feedbackChooseTopicData, "data");
        x().v.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        y((ca2) feedbackChooseTopicData.a.getValue());
        ConstraintLayout constraintLayout = x().x;
        js3.o(constraintLayout, "topicLayout");
        qg5.v(constraintLayout, this.w, this, feedbackChooseTopicData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j92) {
            this.x = (j92) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final j92 x() {
        j92 j92Var = this.x;
        if (j92Var != null) {
            return j92Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void y(ca2 ca2Var) {
        boolean z = ca2Var instanceof y92;
        x().x.setEnabled(!z);
        x().x.setClickable(!z);
        x().x.getBackground().setColorFilter(new PorterDuffColorFilter(ca2Var.b, PorterDuff.Mode.MULTIPLY));
        String str = (String) ca2Var.a;
        if (str == null) {
            x().w.setTextColor(sj8.b().n);
        } else {
            x().w.setText(str);
            x().w.setTextColor(ca2Var instanceof y92 ? sj8.b().n : sj8.b().m);
        }
    }
}
