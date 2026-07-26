package ir.mservices.market.feedback.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextWatcher;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.ca2;
import defpackage.cc7;
import defpackage.h92;
import defpackage.i92;
import defpackage.js3;
import defpackage.lw;
import defpackage.mb0;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.v92;
import defpackage.xs0;
import defpackage.yq6;
import defpackage.z92;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int A = 0;
    public static final /* synthetic */ int z = 0;
    public final /* synthetic */ int w;
    public TextWatcher x;
    public a79 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                FeedbackBodyData feedbackBodyData = (FeedbackBodyData) myketRecyclerData;
                js3.p(feedbackBodyData, "data");
                View view = this.a;
                js3.o(view, "itemView");
                bt2.G(cc7.q(view), null, null, new FeedbackBodyViewHolder$onAttach$1(feedbackBodyData, this, null), 3);
                break;
            default:
                FeedbackPhoneNumberData feedbackPhoneNumberData = (FeedbackPhoneNumberData) myketRecyclerData;
                js3.p(feedbackPhoneNumberData, "data");
                View view2 = this.a;
                js3.o(view2, "itemView");
                bt2.G(cc7.q(view2), null, null, new FeedbackPhoneNumberViewHolder$onAttach$1(feedbackPhoneNumberData, this, null), 3);
                break;
        }
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                FeedbackBodyData feedbackBodyData = (FeedbackBodyData) myketRecyclerData;
                js3.p(feedbackBodyData, "data");
                x().w.setBackgroundResource(yq6.shape_edittext_tag);
                l lVar = (l) feedbackBodyData.a;
                x().w.getBackground().setColorFilter(new PorterDuffColorFilter(lVar.getValue() instanceof z92 ? sj8.b().A : sj8.b().w, PorterDuff.Mode.MULTIPLY));
                ca2 ca2Var = (ca2) lVar.getValue();
                MyketTextView myketTextView = x().v;
                js3.o(myketTextView, "errorTxt");
                myketTextView.setVisibility(!(ca2Var instanceof z92) ? 4 : 0);
                x().w.setOnFocusChangeListener(new i92(this, feedbackBodyData, 0));
                x().w.removeTextChangedListener(this.x);
                x().w.setText((CharSequence) ((ca2) lVar.getValue()).a);
                TextWatcher mb0Var = this.x;
                if (mb0Var == null) {
                    mb0Var = new mb0(2, feedbackBodyData);
                }
                this.x = mb0Var;
                x().w.addTextChangedListener(this.x);
                break;
            default:
                FeedbackPhoneNumberData feedbackPhoneNumberData = (FeedbackPhoneNumberData) myketRecyclerData;
                js3.p(feedbackPhoneNumberData, "data");
                y().v.setBackgroundResource(yq6.shape_edittext_tag);
                l lVar2 = (l) feedbackPhoneNumberData.a;
                y().v.getBackground().setColorFilter(new PorterDuffColorFilter(((ca2) lVar2.getValue()).b, PorterDuff.Mode.MULTIPLY));
                y().v.setOnFocusChangeListener(new xs0(3, feedbackPhoneNumberData));
                y().v.removeTextChangedListener(this.x);
                y().v.setText((CharSequence) ((ca2) lVar2.getValue()).a);
                TextWatcher mb0Var2 = this.x;
                if (mb0Var2 == null) {
                    mb0Var2 = new mb0(3, feedbackPhoneNumberData);
                }
                this.x = mb0Var2;
                y().v.addTextChangedListener(this.x);
                break;
        }
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                js3.p((FeedbackBodyData) myketRecyclerData, "data");
                x().w.removeTextChangedListener(this.x);
                this.x = null;
                break;
            default:
                js3.p((FeedbackPhoneNumberData) myketRecyclerData, "data");
                y().v.removeTextChangedListener(this.x);
                this.x = null;
                break;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.w) {
            case 0:
                if (!(a79Var instanceof h92)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (h92) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof v92)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (v92) a79Var;
                }
                break;
        }
    }

    public h92 x() {
        h92 h92Var = (h92) this.y;
        if (h92Var != null) {
            return h92Var;
        }
        js3.V("binding");
        throw null;
    }

    public v92 y() {
        v92 v92Var = (v92) this.y;
        if (v92Var != null) {
            return v92Var;
        }
        js3.V("binding");
        throw null;
    }
}
