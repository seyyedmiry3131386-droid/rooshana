package ir.mservices.market.social.welcome.recycler;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.ma3;
import defpackage.mb0;
import defpackage.og5;
import defpackage.qg5;
import defpackage.rd9;
import defpackage.yq2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.welcome.recycler.c;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public final og5 w;
    public final og5 x;
    public ma3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, rd9 rd9Var, rd9 rd9Var2) {
        super(view);
        js3.p(rd9Var, "onNameChangedListener");
        js3.p(rd9Var2, "onActionDoneListener");
        this.w = rd9Var;
        this.x = rd9Var2;
        qg5.r();
    }

    public static final void x(c cVar, String str) {
        cVar.y().y.requestFocus();
        MyketTextView myketTextView = cVar.y().v;
        myketTextView.setText(str);
        myketTextView.setVisibility(0);
        cVar.y().w.setErrorEnabled(true);
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        WelcomeNameData welcomeNameData = (WelcomeNameData) myketRecyclerData;
        js3.p(welcomeNameData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new WelcomeNameViewHolder$onAttach$1(welcomeNameData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        final WelcomeNameData welcomeNameData = (WelcomeNameData) myketRecyclerData;
        js3.p(welcomeNameData, "data");
        y().y.setText((CharSequence) welcomeNameData.a.getValue());
        y().y.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wd9
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                c cVar = this.a;
                og5 og5Var = cVar.x;
                View view = cVar.a;
                js3.o(view, "itemView");
                og5Var.m(view, cVar, welcomeNameData);
                return true;
            }
        });
        if (yq2.n0(this.a.getContext())) {
            y().x.setGravity(17);
        }
        MyketEditText myketEditText = y().y;
        js3.o(myketEditText, "username");
        myketEditText.addTextChangedListener(new mb0(13, this));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ma3) {
            this.y = (ma3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ma3 y() {
        ma3 ma3Var = this.y;
        if (ma3Var != null) {
            return ma3Var;
        }
        js3.V("binding");
        throw null;
    }
}
