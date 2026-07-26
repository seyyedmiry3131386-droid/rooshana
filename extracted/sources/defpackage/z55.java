package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.movie.analytics.MovieClickEventBuilder;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.movie.ui.detail.review.a;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewAction;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData;
import ir.mservices.market.social.profile.user.UserProfileRefId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z55 implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieReviewsRecyclerListFragment b;

    public /* synthetic */ z55(MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment, int i) {
        this.a = i;
        this.b = movieReviewsRecyclerListFragment;
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
    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        String str;
        String accountKey;
        String accountKey2;
        int i = this.a;
        str = "";
        MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                MovieReviewData movieReviewData = (MovieReviewData) obj;
                int i2 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "view");
                js3.p((y55) qg5Var, "<unused var>");
                js3.p(movieReviewData, "recyclerData");
                FragmentActivity fragmentActivityF = movieReviewsRecyclerListFragment.F();
                if (fragmentActivityF != null) {
                    movieReviewsRecyclerListFragment.k1 = new n45(fragmentActivityF, movieReviewsRecyclerListFragment.r1);
                }
                n45 n45Var = movieReviewsRecyclerListFragment.k1;
                if (n45Var != null) {
                    int id = movieReviewData.a.getId();
                    String str2 = movieReviewData.b;
                    am2 am2Var = movieReviewsRecyclerListFragment.J0;
                    js3.o(am2Var, "fragmentNavigation");
                    n45Var.b(id, str2, view, am2Var, movieReviewsRecyclerListFragment.Q1());
                    return;
                }
                return;
            case 1:
                MovieUserSubmitReviewData movieUserSubmitReviewData = (MovieUserSubmitReviewData) obj;
                int i3 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(movieUserSubmitReviewData, "recyclerData");
                FragmentActivity fragmentActivityF2 = movieReviewsRecyclerListFragment.F();
                v48 v48Var = movieUserSubmitReviewData.b;
                MovieReviewDto movieReviewDto = (MovieReviewDto) v48Var.getValue();
                if (movieReviewDto != null && (accountKey = movieReviewDto.getAccountKey()) != null) {
                    str = accountKey;
                }
                MovieReviewDto movieReviewDto2 = (MovieReviewDto) v48Var.getValue();
                pk5.e(fragmentActivityF2, str, movieReviewDto2 != null ? movieReviewDto2.getNickname() : null, UserProfileRefId.j);
                return;
            case 2:
                a aVar = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData2 = (MovieUserSubmitReviewData) obj;
                int i4 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar, "viewHolder");
                js3.p(movieUserSubmitReviewData2, "recyclerData");
                MovieReviewDto movieReviewDto3 = (MovieReviewDto) movieUserSubmitReviewData2.b.getValue();
                movieReviewsRecyclerListFragment.S1(true, movieReviewDto3 != null ? Boolean.valueOf(movieReviewDto3.isLike()) : null, aVar.x());
                return;
            case 3:
                a aVar2 = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData3 = (MovieUserSubmitReviewData) obj;
                int i5 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar2, "viewHolder");
                js3.p(movieUserSubmitReviewData3, "recyclerData");
                MovieReviewDto movieReviewDto4 = (MovieReviewDto) movieUserSubmitReviewData3.b.getValue();
                movieReviewsRecyclerListFragment.S1(false, movieReviewDto4 != null ? Boolean.valueOf(movieReviewDto4.isLike()) : null, aVar2.x());
                return;
            case 4:
                a aVar3 = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData4 = (MovieUserSubmitReviewData) obj;
                int i6 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar3, "viewHolder");
                js3.p(movieUserSubmitReviewData4, "recyclerData");
                MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment2 = this.b;
                String str3 = ((a65) movieReviewsRecyclerListFragment2.l1.getValue()).a;
                MovieReviewDto movieReviewDto5 = (MovieReviewDto) movieUserSubmitReviewData4.b.getValue();
                pk5.d(movieReviewsRecyclerListFragment2.F(), new SubmitMovieReviewData(str3, movieReviewDto5 != null && movieReviewDto5.isLike(), aVar3.x(), w55.a, movieReviewsRecyclerListFragment2));
                return;
            case 5:
                int i7 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p((MovieUserSubmitReviewData) obj, "<unused var>");
                MovieClickEventBuilder movieClickEventBuilder = new MovieClickEventBuilder();
                movieClickEventBuilder.b("review_submit_comment");
                movieClickEventBuilder.a();
                movieReviewsRecyclerListFragment.R1().r(new MovieReviewAction.UpdateReviewUiState(v55.a));
                if (movieReviewsRecyclerListFragment.j1 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityF3 = movieReviewsRecyclerListFragment.F();
                Object obj2 = lw8.b;
                if (fragmentActivityF3 != null) {
                    Object systemService = fragmentActivityF3.getSystemService("input_method");
                    js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).toggleSoftInput(2, 1);
                    return;
                }
                return;
            case 6:
                MovieUserSubmitReviewData movieUserSubmitReviewData5 = (MovieUserSubmitReviewData) obj;
                int i8 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(movieUserSubmitReviewData5, "recyclerData");
                FragmentActivity fragmentActivityF4 = movieReviewsRecyclerListFragment.F();
                v48 v48Var2 = movieUserSubmitReviewData5.b;
                MovieReviewDto movieReviewDto6 = (MovieReviewDto) v48Var2.getValue();
                if (movieReviewDto6 != null && (accountKey2 = movieReviewDto6.getAccountKey()) != null) {
                    str = accountKey2;
                }
                MovieReviewDto movieReviewDto7 = (MovieReviewDto) v48Var2.getValue();
                pk5.e(fragmentActivityF4, str, movieReviewDto7 != null ? movieReviewDto7.getNickname() : null, UserProfileRefId.j);
                return;
            case 7:
                a aVar4 = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData6 = (MovieUserSubmitReviewData) obj;
                int i9 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar4, "viewHolder");
                js3.p(movieUserSubmitReviewData6, "recyclerData");
                MovieReviewDto movieReviewDto8 = (MovieReviewDto) movieUserSubmitReviewData6.b.getValue();
                movieReviewsRecyclerListFragment.S1(true, movieReviewDto8 != null ? Boolean.valueOf(movieReviewDto8.isLike()) : null, aVar4.x());
                return;
            case 8:
                a aVar5 = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData7 = (MovieUserSubmitReviewData) obj;
                int i10 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar5, "viewHolder");
                js3.p(movieUserSubmitReviewData7, "recyclerData");
                MovieReviewDto movieReviewDto9 = (MovieReviewDto) movieUserSubmitReviewData7.b.getValue();
                movieReviewsRecyclerListFragment.S1(false, movieReviewDto9 != null ? Boolean.valueOf(movieReviewDto9.isLike()) : null, aVar5.x());
                return;
            case 9:
                a aVar6 = (a) qg5Var;
                MovieUserSubmitReviewData movieUserSubmitReviewData8 = (MovieUserSubmitReviewData) obj;
                int i11 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p(aVar6, "viewHolder");
                js3.p(movieUserSubmitReviewData8, "recyclerData");
                MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment3 = this.b;
                String str4 = ((a65) movieReviewsRecyclerListFragment3.l1.getValue()).a;
                MovieReviewDto movieReviewDto10 = (MovieReviewDto) movieUserSubmitReviewData8.b.getValue();
                pk5.d(movieReviewsRecyclerListFragment3.F(), new SubmitMovieReviewData(str4, movieReviewDto10 != null && movieReviewDto10.isLike(), aVar6.x(), w55.a, movieReviewsRecyclerListFragment3));
                return;
            case 10:
                int i12 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p((MovieUserSubmitReviewData) obj, "<unused var>");
                movieReviewsRecyclerListFragment.R1().r(new MovieReviewAction.UpdateReviewUiState(v55.a));
                return;
            case 11:
                MovieReviewData movieReviewData2 = (MovieReviewData) obj;
                int i13 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((y55) qg5Var, "<unused var>");
                js3.p(movieReviewData2, "recyclerData");
                MovieClickEventBuilder movieClickEventBuilder2 = new MovieClickEventBuilder();
                movieClickEventBuilder2.b("review_buzz_others");
                movieClickEventBuilder2.a();
                String str5 = movieReviewData2.b;
                MovieReviewDto movieReviewDto11 = movieReviewData2.a;
                int id2 = movieReviewDto11.getId();
                oi0 oi0Var = movieReviewData2.c;
                pk5.d(movieReviewsRecyclerListFragment.F(), new LikeOrDislikeData(str5, id2, true, oi0Var != null ? oi0Var.b : movieReviewDto11.getPositiveLikes(), oi0Var != null ? oi0Var.c : movieReviewDto11.getNegativeLikes()));
                return;
            case 12:
                MovieReviewData movieReviewData3 = (MovieReviewData) obj;
                int i14 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((y55) qg5Var, "<unused var>");
                js3.p(movieReviewData3, "recyclerData");
                MovieClickEventBuilder movieClickEventBuilder3 = new MovieClickEventBuilder();
                movieClickEventBuilder3.b("review_buzz_others");
                movieClickEventBuilder3.a();
                String str6 = movieReviewData3.b;
                MovieReviewDto movieReviewDto12 = movieReviewData3.a;
                int id3 = movieReviewDto12.getId();
                oi0 oi0Var2 = movieReviewData3.c;
                pk5.d(movieReviewsRecyclerListFragment.F(), new LikeOrDislikeData(str6, id3, false, oi0Var2 != null ? oi0Var2.b : movieReviewDto12.getPositiveLikes(), oi0Var2 != null ? oi0Var2.c : movieReviewDto12.getNegativeLikes()));
                return;
            default:
                MovieReviewData movieReviewData4 = (MovieReviewData) obj;
                int i15 = MovieReviewsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((y55) qg5Var, "<unused var>");
                js3.p(movieReviewData4, "recyclerData");
                FragmentActivity fragmentActivityF5 = movieReviewsRecyclerListFragment.F();
                MovieReviewDto movieReviewDto13 = movieReviewData4.a;
                String accountKey3 = movieReviewDto13.getAccountKey();
                pk5.e(fragmentActivityF5, accountKey3 != null ? accountKey3 : "", movieReviewDto13.getNickname(), UserProfileRefId.j);
                return;
        }
    }
}
