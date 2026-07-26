package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.feedback.FeedbackTransactionFragment;
import ir.mservices.market.feedback.FeedbackTransactionViewModel;
import ir.mservices.market.movie.ui.search.result.MovieSearchRecyclerListFragment;
import ir.mservices.market.myAccount.city.SelectCityFragment;
import ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class gp extends uz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uz6
    public void a(RecyclerView recyclerView, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 1:
                sy7.m(recyclerView);
                return;
            case 2:
                if (i == 1) {
                    if (((fs) obj).P != null) {
                        lw8.a(recyclerView);
                        return;
                    } else {
                        js3.V("uiUtils");
                        throw null;
                    }
                }
                return;
            case 3:
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = (AppSearchRecyclerListFragment) obj;
                rn8 rn8Var = (rn8) appSearchRecyclerListFragment.F();
                if (rn8Var != null) {
                    rn8Var.l(false);
                }
                if (i == 1) {
                    if (appSearchRecyclerListFragment.Y0 != null) {
                        lw8.b(appSearchRecyclerListFragment.F());
                        return;
                    } else {
                        js3.V("uiUtils");
                        throw null;
                    }
                }
                return;
            case 4:
            case 6:
            case 8:
            case 11:
            case 14:
            case 15:
            case 17:
            default:
                return;
            case 5:
                int i3 = FeedbackTransactionFragment.Z0;
                l lVar = ((FeedbackTransactionViewModel) ((FeedbackTransactionFragment) obj).Y0.getValue()).x;
                Boolean boolValueOf = Boolean.valueOf(recyclerView.canScrollVertically(-1));
                lVar.getClass();
                lVar.p(null, boolValueOf);
                return;
            case 7:
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = (InstalledAppsRecyclerListFragment) obj;
                if (installedAppsRecyclerListFragment.i1 != null) {
                    lw8.b(installedAppsRecyclerListFragment.F());
                    return;
                } else {
                    js3.V("uiUtils");
                    throw null;
                }
            case 9:
                if (i == 1) {
                    if (((p65) obj).L != null) {
                        lw8.a(recyclerView);
                        return;
                    } else {
                        js3.V("uiUtils");
                        throw null;
                    }
                }
                return;
            case 10:
                MovieSearchRecyclerListFragment movieSearchRecyclerListFragment = (MovieSearchRecyclerListFragment) obj;
                rn8 rn8Var2 = (rn8) movieSearchRecyclerListFragment.F();
                if (rn8Var2 != null) {
                    rn8Var2.l(false);
                }
                if (i == 1) {
                    if (movieSearchRecyclerListFragment.Y0 != null) {
                        lw8.b(movieSearchRecyclerListFragment.F());
                        return;
                    } else {
                        js3.V("uiUtils");
                        throw null;
                    }
                }
                return;
            case 12:
                t06.l = i == 0;
                return;
            case 13:
                t06.l = i == 0;
                sy7.m(recyclerView);
                return;
            case 16:
                SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = (SearchHistoryRecyclerListFragment) obj;
                bt5 bt5VarF = searchHistoryRecyclerListFragment.F();
                rn8 rn8Var3 = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
                if (rn8Var3 != null) {
                    rn8Var3.l(sy7.i(recyclerView));
                }
                if (i == 1) {
                    if (searchHistoryRecyclerListFragment.a1 != null) {
                        lw8.b(searchHistoryRecyclerListFragment.F());
                        return;
                    } else {
                        js3.V("uiUtils");
                        throw null;
                    }
                }
                return;
            case 18:
                SelectCityFragment selectCityFragment = (SelectCityFragment) obj;
                if (i == 1) {
                    selectCityFragment.R1();
                    lw8.b(selectCityFragment.F());
                    selectCityFragment.R1();
                    lw8.a(recyclerView);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.uz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
