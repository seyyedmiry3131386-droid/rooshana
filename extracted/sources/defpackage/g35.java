package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g35 extends a {
    public og5 K;
    public og5 L;
    public final SmallBoldTextButton M;
    public final MyketTextView N;
    public final ConstraintLayout O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g35(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        View viewFindViewById = view.findViewById(rr6.section_more_title);
        js3.o(viewFindViewById, "findViewById(...)");
        this.M = (SmallBoldTextButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(rr6.header_title);
        js3.o(viewFindViewById2, "findViewById(...)");
        this.N = (MyketTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(rr6.header_row);
        js3.o(viewFindViewById3, "findViewById(...)");
        this.O = (ConstraintLayout) viewFindViewById3;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new f35(1);
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
        MovieHomeBannersRowData movieHomeBannersRowData = (MovieHomeBannersRowData) nestedRecyclerData;
        js3.p(movieHomeBannersRowData, "data");
        super.s(movieHomeBannersRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersHorizontalDataAdapter");
        ((f35) l06Var).m = this.L;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t(MovieHomeBannersRowData movieHomeBannersRowData) {
        Drawable drawable;
        js3.p(movieHomeBannersRowData, "data");
        boolean z = movieHomeBannersRowData.j;
        boolean z2 = movieHomeBannersRowData.h;
        super.t(movieHomeBannersRowData);
        HomeMovieBannerListDto homeMovieBannerListDto = movieHomeBannersRowData.g;
        this.N.setText(homeMovieBannerListDto != null ? homeMovieBannerListDto.getHeaderTitle() : null);
        String headerTitle = homeMovieBannerListDto != null ? homeMovieBannerListDto.getHeaderTitle() : null;
        ConstraintLayout constraintLayout = this.O;
        SmallBoldTextButton smallBoldTextButton = this.M;
        if (headerTitle == null || f88.n0(headerTitle)) {
            smallBoldTextButton.setVisibility(8);
        } else {
            if (z2) {
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
                ThemeData themeDataB = sj8.b();
                smallBoldTextButton.setPrimaryColor(z ? themeDataB.j : themeDataB.c);
                smallBoldTextButton.setTextColor(z ? sj8.b().j : sj8.b().c);
                smallBoldTextButton.setSmallIcon(drawable);
            }
            qg5.v(constraintLayout, this.K, this, movieHomeBannersRowData);
            smallBoldTextButton.setVisibility(z2 ? 0 : 8);
            i = 0;
        }
        constraintLayout.setVisibility(i);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieHomeBannersRowData movieHomeBannersRowData = (MovieHomeBannersRowData) myketRecyclerData;
        js3.p(movieHomeBannersRowData, "data");
        super.s(movieHomeBannersRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersHorizontalDataAdapter");
        ((f35) l06Var).m = this.L;
    }
}
