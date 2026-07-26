package ir.mservices.market.movie.ui.detail.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import defpackage.bt2;
import defpackage.c65;
import defpackage.cc7;
import defpackage.d04;
import defpackage.ds6;
import defpackage.e65;
import defpackage.js3;
import defpackage.l45;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q15;
import defpackage.qg5;
import defpackage.rr6;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends qg5 {
    public final d04 A;
    public final RecyclerView B;
    public final int C;
    public final og5 w;
    public final int x;
    public c65 y;
    public MovieScreenshotsLayoutManager z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, GraphicUtils$Dimension graphicUtils$Dimension, q15 q15Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(q15Var, "onScreenshotClickListener");
        this.w = q15Var;
        View viewFindViewById = view.findViewById(rr6.recycler_view);
        js3.o(viewFindViewById, "findViewById(...)");
        this.B = (RecyclerView) viewFindViewById;
        int integer = view.getResources().getInteger(ds6.movie_screen_shots_span);
        this.C = integer;
        this.A = (d04) ((w91) qg5.r()).p.get();
        this.x = ((((graphicUtils$Dimension.a - view.getResources().getDimensionPixelSize(pq6.vertical_movie_tab_width)) - (view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) * 2)) - ((integer * 2) * view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner))) - (((integer - 1) * 2) * view.getResources().getDimensionPixelSize(pq6.movie_screen_shot_item_padding))) / integer;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieScreenshotsData movieScreenshotsData = (MovieScreenshotsData) myketRecyclerData;
        js3.p(movieScreenshotsData, "data");
        l45 l45Var = new l45(this.C);
        l45Var.n = this.x;
        MovieScreenshotsLayoutManager movieScreenshotsLayoutManager = this.z;
        if (movieScreenshotsLayoutManager == null) {
            js3.V("layoutManager");
            throw null;
        }
        movieScreenshotsLayoutManager.K = new e65(0, l45Var);
        og5 og5Var = this.w;
        js3.p(og5Var, "<set-?>");
        l45Var.m = og5Var;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieScreenshotsViewHolder$onAttach$1$2(l45Var, this, movieScreenshotsData, null), 3);
        this.B.setAdapter(l45Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        js3.p((MovieScreenshotsData) myketRecyclerData, "data");
        View view = this.a;
        js3.o(view.getContext(), "getContext(...)");
        int i = this.C;
        MovieScreenshotsLayoutManager movieScreenshotsLayoutManager = new MovieScreenshotsLayoutManager(i);
        this.z = movieScreenshotsLayoutManager;
        RecyclerView recyclerView = this.B;
        recyclerView.setLayoutManager(movieScreenshotsLayoutManager);
        h hVar = this.y;
        if (hVar != null) {
            recyclerView.f0(hVar);
        }
        d04 d04Var = this.A;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.setLayoutDirection(d04Var.f() ? 1 : 0);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.movie_screen_shot_item_padding);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_screen_shot_item_padding);
        d04 d04Var2 = this.A;
        if (d04Var2 == null) {
            js3.V("languageHelper");
            throw null;
        }
        c65 c65Var = new c65(dimensionPixelSize, dimensionPixelSize2, d04Var2.f(), i);
        recyclerView.i(c65Var);
        this.y = c65Var;
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((MovieScreenshotsData) myketRecyclerData, "data");
        this.B.setAdapter(null);
    }
}
