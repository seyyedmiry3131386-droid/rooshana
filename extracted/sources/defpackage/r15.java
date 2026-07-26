package defpackage;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r15 implements r7, og5 {
    public final /* synthetic */ MovieDetailRecyclerListFragment a;

    public /* synthetic */ r15(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment) {
        this.a = movieDetailRecyclerListFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = MovieDetailRecyclerListFragment.H1;
        js3.p(bool, "it");
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.a;
        FragmentActivity fragmentActivityF = movieDetailRecyclerListFragment.F();
        if (fragmentActivityF != null) {
            d56 d56Var = movieDetailRecyclerListFragment.k1;
            if (d56Var != null) {
                d56Var.a(fragmentActivityF, bool.booleanValue());
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        rc rcVar = (rc) qg5Var;
        AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
        int i = MovieDetailRecyclerListFragment.H1;
        js3.p(view, "view");
        js3.p(rcVar, "viewHolder");
        js3.p(addaxBoxData, "recyclerData");
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
        clickEventBuilder.b("addax_action_movie_detail_" + addaxBoxDto.getId());
        clickEventBuilder.a();
        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
        clickEventBuilder2.b("addax_action_movie_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
        clickEventBuilder2.a();
        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
        clickEventBuilder3.b("addax_action_movie_detail_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
        clickEventBuilder3.a();
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.a;
        FragmentActivity fragmentActivityF = movieDetailRecyclerListFragment.F();
        if (fragmentActivityF != null) {
            new wv8(fragmentActivityF, movieDetailRecyclerListFragment.z1).m(view, rcVar, addaxBoxData);
        }
    }
}
