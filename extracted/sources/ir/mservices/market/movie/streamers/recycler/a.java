package ir.mservices.market.movie.streamers.recycler;

import android.view.View;
import defpackage.a78;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f78;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.recycler.a;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public a78 y;

    public a(View view, f78 f78Var, f78 f78Var2) {
        super(view);
        this.w = f78Var;
        this.x = f78Var2;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        StreamerNameData streamerNameData = (StreamerNameData) myketRecyclerData;
        js3.p(streamerNameData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new StreamerNameViewHolder$onAttach$1(null, streamerNameData, this), 3);
        bt2.G(cc7.q(view), null, null, new StreamerNameViewHolder$onAttach$2(null, streamerNameData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        final StreamerNameData streamerNameData = (StreamerNameData) myketRecyclerData;
        js3.p(streamerNameData, "data");
        String str = streamerNameData.b;
        final a78 a78VarX = x();
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = a78VarX.w;
        a78VarX.x.setText(streamerNameData.a);
        SmallFillOvalButton smallFillOvalButton = a78VarX.v;
        js3.o(smallFillOvalButton, "highState");
        smallFillOvalButton.setVisibility(!streamerNameData.g ? 0 : 8);
        js3.o(smallEmptyMediumTextOvalButton, "lowState");
        smallEmptyMediumTextOvalButton.setVisibility(streamerNameData.g ? 0 : 8);
        final int i = 0;
        smallFillOvalButton.setOnClickListener(new View.OnClickListener() { // from class: c78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        a78 a78Var = a78VarX;
                        a78Var.v.setState(MyketProgressState.c);
                        a aVar = this;
                        og5 og5Var = aVar.w;
                        if (og5Var != null) {
                            SmallFillOvalButton smallFillOvalButton2 = a78Var.v;
                            js3.o(smallFillOvalButton2, "highState");
                            og5Var.m(smallFillOvalButton2, aVar, streamerNameData);
                        }
                        break;
                    default:
                        a78 a78Var2 = a78VarX;
                        a78Var2.w.setState(MyketProgressState.c);
                        a aVar2 = this;
                        og5 og5Var2 = aVar2.x;
                        if (og5Var2 != null) {
                            SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = a78Var2.w;
                            js3.o(smallEmptyMediumTextOvalButton2, "lowState");
                            og5Var2.m(smallEmptyMediumTextOvalButton2, aVar2, streamerNameData);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        smallEmptyMediumTextOvalButton.setOnClickListener(new View.OnClickListener() { // from class: c78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        a78 a78Var = a78VarX;
                        a78Var.v.setState(MyketProgressState.c);
                        a aVar = this;
                        og5 og5Var = aVar.w;
                        if (og5Var != null) {
                            SmallFillOvalButton smallFillOvalButton2 = a78Var.v;
                            js3.o(smallFillOvalButton2, "highState");
                            og5Var.m(smallFillOvalButton2, aVar, streamerNameData);
                        }
                        break;
                    default:
                        a78 a78Var2 = a78VarX;
                        a78Var2.w.setState(MyketProgressState.c);
                        a aVar2 = this;
                        og5 og5Var2 = aVar2.x;
                        if (og5Var2 != null) {
                            SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = a78Var2.w;
                            js3.o(smallEmptyMediumTextOvalButton2, "lowState");
                            og5Var2.m(smallEmptyMediumTextOvalButton2, aVar2, streamerNameData);
                        }
                        break;
                }
            }
        });
        MyketTextView myketTextView = a78VarX.y;
        myketTextView.setText(str);
        myketTextView.setVisibility(f88.n0(str) ? 8 : 0);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof a78) {
            this.y = (a78) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final a78 x() {
        a78 a78Var = this.y;
        if (a78Var != null) {
            return a78Var;
        }
        js3.V("binding");
        throw null;
    }
}
