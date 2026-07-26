package ir.mservices.market.social.profile.list;

import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.social.profile.list.ProfileListAction;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ze2 {
    public final /* synthetic */ ProfileListViewModel a;

    public b(ProfileListViewModel profileListViewModel) {
        this.a = profileListViewModel;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        if (((Boolean) obj).booleanValue()) {
            ProfileListViewModel profileListViewModel = this.a;
            if (profileListViewModel.W && !profileListViewModel.B) {
                l lVar = profileListViewModel.A.b;
                Boolean bool = Boolean.FALSE;
                lVar.getClass();
                lVar.p(null, bool);
                profileListViewModel.onRefreshAction(new ProfileListAction.RefreshAction(true));
            }
        }
        return tx8.a;
    }
}
