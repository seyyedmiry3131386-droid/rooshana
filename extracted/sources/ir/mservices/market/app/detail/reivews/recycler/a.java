package ir.mservices.market.app.detail.reivews.recycler;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cp;
import defpackage.d;
import defpackage.ea7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.r45;
import defpackage.sj8;
import defpackage.xc;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int A = 0;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public xc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, cp cpVar, cp cpVar2, cp cpVar3) {
        super(view);
        js3.p(cpVar, "onLikeClickListener");
        js3.p(cpVar2, "onDislikeClickListener");
        js3.p(cpVar3, "onMoreClickListener");
        this.w = cpVar;
        this.x = cpVar2;
        this.y = cpVar3;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) myketRecyclerData;
        js3.p(aIReviewSummaryData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AIReviewSummaryViewHolder$onAttach$1(aIReviewSummaryData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new AIReviewSummaryViewHolder$onAttach$2(aIReviewSummaryData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AIReviewSummaryData aIReviewSummaryData = (AIReviewSummaryData) myketRecyclerData;
        js3.p(aIReviewSummaryData, "data");
        xc xcVarX = x();
        View view = this.a;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(pq6.space_8);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.space_m);
        xcVarX.l.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
        ConstraintLayout constraintLayout = xcVarX.y;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = view.getContext().getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var.i = sj8.b().v;
        constraintLayout.setBackground(ea7Var.a());
        View view2 = xcVarX.x;
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().q;
        ea7Var2.h = 0;
        ea7Var2.e = dimensionPixelSize;
        ea7Var2.b();
        ea7Var2.d = dimensionPixelSize;
        ea7Var2.b();
        ea7Var2.f = 0;
        ea7Var2.b();
        ea7Var2.g = 0;
        ea7Var2.b();
        view2.setBackground(ea7Var2.a());
        MyketTextView myketTextView = xcVarX.B;
        Context context3 = view.getContext();
        js3.o(context3, "getContext(...)");
        ea7 ea7Var3 = new ea7(context3);
        ea7Var3.b = sj8.b().l;
        ea7Var3.h = 0;
        ea7Var3.c(dimensionPixelSize);
        myketTextView.setBackground(ea7Var3.a());
        MyketTextView myketTextView2 = xcVarX.v;
        js3.o(myketTextView2, PackageListMetaDataDTO.KEY_DESCRIPTION);
        MyketTextView.setExpandableMarkdownText$default(myketTextView2, aIReviewSummaryData.a.getText(), null, 12, ((Boolean) aIReviewSummaryData.c.getValue()).booleanValue(), false, new d(this, aIReviewSummaryData, 0), 18, null);
        MyketImageButton myketImageButton = x().z;
        Context context4 = view.getContext();
        js3.o(context4, "getContext(...)");
        ea7 ea7Var4 = new ea7(context4);
        ea7Var4.b = sj8.b().l;
        ea7Var4.c(100);
        ea7Var4.h = 0;
        myketImageButton.setBackground(ea7Var4.a());
        MyketImageButton myketImageButton2 = x().w;
        Context context5 = view.getContext();
        js3.o(context5, "getContext(...)");
        ea7 ea7Var5 = new ea7(context5);
        ea7Var5.b = sj8.b().l;
        ea7Var5.c(100);
        ea7Var5.h = 0;
        myketImageButton2.setBackground(ea7Var5.a());
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        int dimensionPixelSize5 = view.getResources().getDimensionPixelSize(pq6.space_20);
        MyketImageButton myketImageButton3 = xcVarX.z;
        float f = dimensionPixelSize5;
        myketImageButton3.setOutlineProvider(new r45(dimensionPixelSize4, f));
        MyketImageButton myketImageButton4 = xcVarX.w;
        myketImageButton4.setOutlineProvider(new r45(dimensionPixelSize4, f));
        qg5.v(myketImageButton3, this.w, this, aIReviewSummaryData);
        qg5.v(myketImageButton4, this.x, this, aIReviewSummaryData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof xc) {
            this.z = (xc) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final xc x() {
        xc xcVar = this.z;
        if (xcVar != null) {
            return xcVar;
        }
        js3.V("binding");
        throw null;
    }
}
