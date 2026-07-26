package ir.mservices.market.app.update.common;

import defpackage.gr5;
import defpackage.p06;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.wt;
import defpackage.y97;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.viewModel.a;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateLaunchViewModel extends a {
    public final rv6 v;

    public UpdateLaunchViewModel(gr5 gr5Var) {
        super(false);
        this.v = d.A(new p06(((AppUpdateRepositoryImpl) ((wt) gr5Var.g)).b(), 2), y97.G(this), ru7.b, 0);
    }
}
