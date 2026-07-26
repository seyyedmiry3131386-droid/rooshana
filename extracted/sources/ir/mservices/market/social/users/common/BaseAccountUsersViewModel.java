package ir.mservices.market.social.users.common;

import defpackage.ja1;
import defpackage.rv6;
import defpackage.xe2;
import ir.mservices.market.viewModel.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAccountUsersViewModel extends a {
    public final l v;
    public final rv6 w;

    public BaseAccountUsersViewModel() {
        super(true);
        l lVarB = ja1.b(Boolean.FALSE);
        this.v = lVarB;
        this.w = new rv6(lVarB);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new BaseAccountUsersViewModel$doRequest$1(this, null));
    }

    public abstract xe2 s();
}
