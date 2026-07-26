package ir.mservices.market.versionNote.ui;

import defpackage.bn6;
import ir.mservices.market.viewModel.a;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionNoteViewModel extends a {
    public final bn6 v;

    public VersionNoteViewModel(bn6 bn6Var) {
        super(true);
        this.v = bn6Var;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new VersionNoteViewModel$doRequest$1(this, null));
    }
}
