package ir.mservices.market.movie.ui.detail;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.google.android.material.tabs.TabLayout;
import defpackage.bt2;
import defpackage.js3;
import defpackage.og5;
import defpackage.qg5;
import defpackage.r7;
import defpackage.zl;
import ir.mservices.market.movie.ui.detail.MovieDetailAction;
import ir.mservices.market.movie.ui.detail.recycler.MovieTabData;
import ir.mservices.market.movie.ui.detail.recycler.e;
import ir.mservices.market.views.MovieTabView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements og5, r7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    public /* synthetic */ a(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, int i) {
        this.a = i;
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        int i = this.a;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        switch (i) {
            case 2:
                int i2 = MovieDetailRecyclerListFragment.H1;
                js3.p(activityResult, "it");
                if (activityResult.a == -1) {
                    movieDetailRecyclerListFragment.X1().r(new MovieDetailAction.ShowTrailerReplayIcon(true));
                    Intent intent = activityResult.b;
                    if (intent != null && intent.getBooleanExtra("BUNDLE_KEY_MOVIE_TRAILER_PLAY_MOVIE", false)) {
                        bt2.G(androidx.lifecycle.b.a(movieDetailRecyclerListFragment), null, null, new MovieDetailRecyclerListFragment$onViewCreated$1$1(movieDetailRecyclerListFragment, null), 3);
                        break;
                    }
                }
                break;
            default:
                int i3 = MovieDetailRecyclerListFragment.H1;
                js3.p(activityResult, "it");
                if (activityResult.a == -1) {
                    androidx.lifecycle.b.a(movieDetailRecyclerListFragment).a(new MovieDetailRecyclerListFragment$onViewCreated$2$1(movieDetailRecyclerListFragment, activityResult, null));
                }
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        e eVar = (e) qg5Var;
        MovieTabData movieTabData = (MovieTabData) obj;
        switch (i) {
            case 0:
                int i2 = MovieDetailRecyclerListFragment.H1;
                js3.p(view, "view");
                js3.p(eVar, "<unused var>");
                js3.p(movieTabData, "<unused var>");
                ir.mservices.market.version2.core.utils.a.c(movieDetailRecyclerListFragment, 0L, new MovieDetailRecyclerListFragment$onActivityCreated$2$1(movieDetailRecyclerListFragment, view, null));
                return;
            default:
                int i3 = MovieDetailRecyclerListFragment.H1;
                js3.p(view, "view");
                js3.p(eVar, "<unused var>");
                js3.p(movieTabData, "<unused var>");
                int selectedTabPosition = ((TabLayout) view).getSelectedTabPosition();
                e eVar2 = movieDetailRecyclerListFragment.B1;
                if (eVar2 == null) {
                    js3.V("movieTabViewHolder");
                    throw null;
                }
                MovieTabView movieTabView = eVar2.x().z;
                eVar2.y = true;
                com.google.android.material.tabs.b bVarJ = movieTabView.j(selectedTabPosition);
                if (bVarJ != null) {
                    TabLayout tabLayout = bVarJ.f;
                    if (tabLayout == null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    tabLayout.n(bVarJ, true);
                }
                zl zlVar = new zl(selectedTabPosition, 6, eVar2);
                eVar2.z = zlVar;
                movieTabView.post(zlVar);
                ir.mservices.market.version2.core.utils.a.c(movieDetailRecyclerListFragment, 0L, new MovieDetailRecyclerListFragment$createDataAdapter$1$26$1(movieDetailRecyclerListFragment, view, null));
                return;
        }
    }
}
