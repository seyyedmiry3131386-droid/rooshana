package defpackage;

import ir.mservices.market.app.search.result.data.SearchItemDto;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.views.FastDownloadView;

/* JADX INFO: loaded from: classes3.dex */
public final class hs extends ml9 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bn6 o;
    public final /* synthetic */ AppSearchRecyclerListFragment p;

    public /* synthetic */ hs(bn6 bn6Var, AppSearchRecyclerListFragment appSearchRecyclerListFragment, int i) {
        this.n = i;
        this.o = bn6Var;
        this.p = appSearchRecyclerListFragment;
    }

    @Override // defpackage.ml9
    public final void v(FastDownloadView fastDownloadView, r82 r82Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.n;
        bn6 bn6Var = this.o;
        AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.p;
        switch (i) {
            case 0:
                if (r82Var != null && (str = r82Var.b) != null) {
                    int i2 = AppSearchRecyclerListFragment.e1;
                    appSearchRecyclerListFragment.W0(SearchItemDto.APP_LIST, str);
                }
                bn6Var.n(fastDownloadView, r82Var);
                break;
            case 1:
                if (r82Var != null && (str2 = r82Var.b) != null) {
                    int i3 = AppSearchRecyclerListFragment.e1;
                    appSearchRecyclerListFragment.W0(SearchItemDto.APP_SUMMARY, str2);
                }
                bn6Var.n(fastDownloadView, r82Var);
                break;
            case 2:
                if (r82Var != null && (str3 = r82Var.b) != null) {
                    int i4 = AppSearchRecyclerListFragment.e1;
                    appSearchRecyclerListFragment.W0(SearchItemDto.APP_SCREENSHOT, str3);
                }
                bn6Var.n(fastDownloadView, r82Var);
                break;
            case 3:
                if (r82Var != null && (str4 = r82Var.b) != null) {
                    int i5 = AppSearchRecyclerListFragment.e1;
                    appSearchRecyclerListFragment.W0(SearchItemDto.APP_COMPACT, str4);
                }
                bn6Var.n(fastDownloadView, r82Var);
                break;
            default:
                if (r82Var != null && (str5 = r82Var.b) != null) {
                    int i6 = AppSearchRecyclerListFragment.e1;
                    appSearchRecyclerListFragment.W0(SearchItemDto.APP_COMPACT, str5);
                }
                bn6Var.n(fastDownloadView, r82Var);
                break;
        }
    }
}
