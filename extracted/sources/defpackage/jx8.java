package defpackage;

import android.os.Bundle;
import ir.mservices.market.login.ui.UnbindAllLoginDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.UnbindAllResultDTO;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jx8 implements gb8, h32 {
    public final /* synthetic */ UnbindAllLoginDialogFragment a;

    public /* synthetic */ jx8(UnbindAllLoginDialogFragment unbindAllLoginDialogFragment) {
        this.a = unbindAllLoginDialogFragment;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        UnbindAllLoginDialogFragment unbindAllLoginDialogFragment = this.a;
        tn2 tn2Var = unbindAllLoginDialogFragment.o1;
        js3.m(tn2Var);
        MyketTextView myketTextView = tn2Var.w;
        myketTextView.setVisibility(0);
        myketTextView.setText(((ErrorDTO) serializable).getTranslatedMessage());
        tn2 tn2Var2 = unbindAllLoginDialogFragment.o1;
        js3.m(tn2Var2);
        tn2Var2.v.setStateCommit(MyketProgressState.b);
        unbindAllLoginDialogFragment.T0();
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        UnbindAllResultDTO unbindAllResultDTO = (UnbindAllResultDTO) obj;
        UnbindAllLoginDialogFragment unbindAllLoginDialogFragment = this.a;
        tn2 tn2Var = unbindAllLoginDialogFragment.o1;
        js3.m(tn2Var);
        tn2Var.v.setStateCommit(MyketProgressState.b);
        hh2 hh2Var = new hh2(unbindAllLoginDialogFragment.F(), unbindAllResultDTO != null ? unbindAllResultDTO.getTranslatedMessage() : null);
        hh2Var.F(qs6.logout_toast);
        hh2Var.G();
        hh2.H(hh2Var);
        unbindAllLoginDialogFragment.R0(DialogResult.a, new Bundle());
    }
}
