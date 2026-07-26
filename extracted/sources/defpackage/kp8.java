package defpackage;

import android.os.Bundle;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.TrackingAppPaymentBottomDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kp8 implements gb8, h32 {
    public final /* synthetic */ TrackingAppPaymentBottomDialogFragment a;

    public /* synthetic */ kp8(TrackingAppPaymentBottomDialogFragment trackingAppPaymentBottomDialogFragment) {
        this.a = trackingAppPaymentBottomDialogFragment;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        String translatedMessage = ((ErrorDTO) serializable).getTranslatedMessage();
        TrackingAppPaymentBottomDialogFragment trackingAppPaymentBottomDialogFragment = this.a;
        np8 np8Var = trackingAppPaymentBottomDialogFragment.h1;
        js3.m(np8Var);
        MyketTextView myketTextView = np8Var.x;
        myketTextView.setText(translatedMessage);
        myketTextView.setVisibility(0);
        np8 np8Var2 = trackingAppPaymentBottomDialogFragment.h1;
        js3.m(np8Var2);
        np8Var2.v.setStateCommit(MyketProgressState.b);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        this.a.R0(DialogResult.a, new Bundle());
    }
}
