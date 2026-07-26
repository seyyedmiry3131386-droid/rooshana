package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.PayloadState;
import ir.mservices.market.pika.send.SendAppDetailFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sn7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendAppDetailFragment b;

    public /* synthetic */ sn7(SendAppDetailFragment sendAppDetailFragment, int i) {
        this.a = i;
        this.b = sendAppDetailFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ws5 ws5VarC;
        ws5 ws5VarC2;
        Long l;
        ws5 ws5VarC3;
        int i = this.a;
        SendAppDetailFragment sendAppDetailFragment = this.b;
        switch (i) {
            case 0:
                int i2 = SendAppDetailFragment.e1;
                FragmentActivity fragmentActivityF = sendAppDetailFragment.F();
                if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                    ws5VarC.b();
                    break;
                }
                break;
            case 1:
                int i3 = SendAppDetailFragment.e1;
                FragmentActivity fragmentActivityF2 = sendAppDetailFragment.F();
                if (fragmentActivityF2 != null && (ws5VarC2 = fragmentActivityF2.c()) != null) {
                    ws5VarC2.b();
                    break;
                }
                break;
            case 2:
                int i4 = SendAppDetailFragment.e1;
                if ((((PayloadState) sendAppDetailFragment.m1().I.a.getValue()) instanceof PayloadState.InProgress) && (l = (Long) sendAppDetailFragment.m1().K.a.getValue()) != null) {
                    long jLongValue = l.longValue();
                    Bundle bundle = new Bundle();
                    bundle.putLong("PAYLOAD_ID", jLongValue);
                    String strL = sendAppDetailFragment.L(rs6.cancel_send_alert_dialog);
                    js3.o(strL, "getString(...)");
                    pk5.g(sendAppDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(sendAppDetailFragment.l1(), "DIALOG_KEY_CANCEL_SEND", bundle, 8), null, strL, sendAppDetailFragment.L(rs6.stop_send), sendAppDetailFragment.L(rs6.button_cancel), true)), -1);
                    break;
                }
                break;
            case 3:
                int i5 = SendAppDetailFragment.e1;
                FragmentActivity fragmentActivityF3 = sendAppDetailFragment.F();
                if (fragmentActivityF3 != null && (ws5VarC3 = fragmentActivityF3.c()) != null) {
                    ws5VarC3.b();
                    break;
                }
                break;
            default:
                int i6 = SendAppDetailFragment.e1;
                ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                actionBarEventBuilder.b("pika_disconnect");
                actionBarEventBuilder.a();
                sendAppDetailFragment.o1();
                break;
        }
    }
}
