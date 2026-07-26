package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersRowData;
import ir.mservices.market.social.profile.list.app.recycler.ProfileListAppListData;
import ir.mservices.market.social.profile.list.movie.recycler.ProfileListMovieListData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class fl6 extends a {
    public final /* synthetic */ int K = 2;
    public og5 L;

    public /* synthetic */ fl6(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        switch (this.K) {
            case 0:
                return new qc3(1);
            case 1:
                return new t35(1);
            default:
                return new rw5(1);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        switch (this.K) {
        }
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        switch (this.K) {
        }
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                js3.p((ProfileListAppListData) nestedRecyclerData, "data");
                TypedValue typedValue = new TypedValue();
                this.a.getResources().getValue(pq6.app_card_count, typedValue, true);
                return typedValue.getFloat();
            case 1:
                js3.p((ProfileListMovieListData) nestedRecyclerData, "data");
                TypedValue typedValue2 = new TypedValue();
                this.a.getResources().getValue(pq6.small_movie_card_count, typedValue2, true);
                return typedValue2.getFloat();
            default:
                js3.p((OtherStreamersRowData) nestedRecyclerData, "data");
                TypedValue typedValue3 = new TypedValue();
                this.a.getResources().getValue(pq6.other_streamers_card_count, typedValue3, true);
                return typedValue3.getFloat();
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                ProfileListAppListData profileListAppListData = (ProfileListAppListData) nestedRecyclerData;
                js3.p(profileListAppListData, "data");
                super.s(profileListAppListData);
                l06 l06Var = this.C;
                js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                og5 og5Var = this.L;
                js3.p(og5Var, "<set-?>");
                ((qc3) l06Var).o = og5Var;
                break;
            case 1:
                ProfileListMovieListData profileListMovieListData = (ProfileListMovieListData) nestedRecyclerData;
                js3.p(profileListMovieListData, "data");
                super.s(profileListMovieListData);
                l06 l06Var2 = this.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesHorizontalDataAdapter");
                og5 og5Var2 = this.L;
                js3.p(og5Var2, "<set-?>");
                ((t35) l06Var2).m = og5Var2;
                break;
            default:
                OtherStreamersRowData otherStreamersRowData = (OtherStreamersRowData) nestedRecyclerData;
                js3.p(otherStreamersRowData, "data");
                super.s(otherStreamersRowData);
                l06 l06Var3 = this.C;
                js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.movie.streamers.recycler.OtherStreamerRowAdapter");
                ((rw5) l06Var3).m = new ts5(1, this);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                ProfileListAppListData profileListAppListData = (ProfileListAppListData) myketRecyclerData;
                js3.p(profileListAppListData, "data");
                super.s(profileListAppListData);
                l06 l06Var = this.C;
                js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                og5 og5Var = this.L;
                js3.p(og5Var, "<set-?>");
                ((qc3) l06Var).o = og5Var;
                break;
            case 1:
                ProfileListMovieListData profileListMovieListData = (ProfileListMovieListData) myketRecyclerData;
                js3.p(profileListMovieListData, "data");
                super.s(profileListMovieListData);
                l06 l06Var2 = this.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesHorizontalDataAdapter");
                og5 og5Var2 = this.L;
                js3.p(og5Var2, "<set-?>");
                ((t35) l06Var2).m = og5Var2;
                break;
            default:
                OtherStreamersRowData otherStreamersRowData = (OtherStreamersRowData) myketRecyclerData;
                js3.p(otherStreamersRowData, "data");
                super.s(otherStreamersRowData);
                l06 l06Var3 = this.C;
                js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.movie.streamers.recycler.OtherStreamerRowAdapter");
                ((rw5) l06Var3).m = new ts5(1, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl6(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, gl6 gl6Var) {
        super(view, graphicUtils$Dimension, z);
        js3.p(gl6Var, "onAppDigestedClickListener");
        this.L = gl6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl6(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, gl6 gl6Var, byte b) {
        super(view, graphicUtils$Dimension, z);
        js3.p(gl6Var, "onMovieClickListener");
        this.L = gl6Var;
    }
}
