package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeReelListDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x35 extends a {
    public final og5 K;
    public final og5 L;
    public final SmallBoldTextButton M;
    public final MyketTextView N;
    public final ConstraintLayout O;

    public x35(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z);
        this.K = og5Var;
        this.L = og5Var2;
        View viewFindViewById = view.findViewById(rr6.section_more_title);
        js3.o(viewFindViewById, "findViewById(...)");
        this.M = (SmallBoldTextButton) viewFindViewById;
        this.N = (MyketTextView) view.findViewById(rr6.title);
        this.O = (ConstraintLayout) view.findViewById(rr6.header_layout);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new w35(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        MovieHomeReelsRowData movieHomeReelsRowData = (MovieHomeReelsRowData) nestedRecyclerData;
        js3.p(movieHomeReelsRowData, "data");
        super.s(movieHomeReelsRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsHorizontalDataAdapter");
        ((w35) l06Var).m = this.K;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t(MovieHomeReelsRowData movieHomeReelsRowData) {
        Drawable drawable;
        js3.p(movieHomeReelsRowData, "data");
        super.t(movieHomeReelsRowData);
        HomeReelListDto homeReelListDto = movieHomeReelsRowData.g;
        String headerTitle = homeReelListDto != null ? homeReelListDto.getHeaderTitle() : null;
        MyketTextView myketTextView = this.N;
        myketTextView.setText(headerTitle);
        myketTextView.setTextColor(sj8.b().m);
        Resources resources = this.a.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        int i2 = sj8.b().j;
        SmallBoldTextButton smallBoldTextButton = this.M;
        smallBoldTextButton.setPrimaryColor(i2);
        smallBoldTextButton.setTextColor(sj8.b().j);
        smallBoldTextButton.setSmallIcon(drawable);
        String headerTitle2 = homeReelListDto != null ? homeReelListDto.getHeaderTitle() : null;
        boolean z = headerTitle2 == null || f88.n0(headerTitle2);
        ConstraintLayout constraintLayout = this.O;
        js3.o(constraintLayout, "headerLayout");
        constraintLayout.setVisibility(!z ? 0 : 8);
        smallBoldTextButton.setVisibility(z ? 8 : 0);
        qg5.v(constraintLayout, this.L, this, movieHomeReelsRowData);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieHomeReelsRowData movieHomeReelsRowData = (MovieHomeReelsRowData) myketRecyclerData;
        js3.p(movieHomeReelsRowData, "data");
        super.s(movieHomeReelsRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsHorizontalDataAdapter");
        ((w35) l06Var).m = this.K;
    }
}
