package defpackage;

import android.content.pm.PackageInstaller;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment;
import ir.mservices.market.pika.receive.ReceiveViewModel;
import ir.mservices.market.pika.receive.model.a;
import ir.mservices.market.pika.receive.recycler.ReceivedAppData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kw6 implements r7, og5 {
    public final /* synthetic */ ReceiveAppRecyclerListFragment a;

    public /* synthetic */ kw6(ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment) {
        this.a = receiveAppRecyclerListFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        PackageInstaller.SessionInfo sessionInfo;
        Object value;
        int i = ReceiveAppRecyclerListFragment.p1;
        js3.p((ActivityResult) obj, "it");
        ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.a;
        ReceiveViewModel receiveViewModelR1 = receiveAppRecyclerListFragment.R1();
        int i2 = receiveAppRecyclerListFragment.R1().y;
        a aVar = receiveViewModelR1.v;
        yq2 yq2Var = np3.g;
        dp3 dp3Var = aVar.b;
        List<PackageInstaller.SessionInfo> mySessions = aVar.a.getPackageManager().getPackageInstaller().getMySessions();
        js3.o(mySessions, "getMySessions(...)");
        Iterator<T> it = mySessions.iterator();
        while (true) {
            if (!it.hasNext()) {
                sessionInfo = null;
                break;
            } else {
                sessionInfo = (PackageInstaller.SessionInfo) it.next();
                if (sessionInfo.getSessionId() == i2) {
                    break;
                }
            }
        }
        if (sessionInfo == null || aVar.i < sessionInfo.getProgress()) {
            return;
        }
        String str = (String) aVar.e.get(Integer.valueOf(i2));
        if (str != null) {
            Integer num = (Integer) aVar.g.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                if (dp3Var.G(str)) {
                    Integer numP = dp3Var.p(str);
                    yq2Var = (numP != null && numP.intValue() == iIntValue) ? pp3.g : qp3.g;
                }
            }
            Long l = (Long) aVar.d.get(str);
            if (l != null) {
                long jLongValue = l.longValue();
                l lVar = aVar.c;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(Long.valueOf(jLongValue), new kp3(yq2Var, str))))));
            }
        }
        receiveViewModelR1.C = false;
        receiveViewModelR1.r();
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        ReceivedAppData receivedAppData = (ReceivedAppData) obj;
        int i = ReceiveAppRecyclerListFragment.p1;
        js3.p(view, "<unused var>");
        js3.p((ir.mservices.market.pika.receive.recycler.a) qg5Var, "<unused var>");
        js3.p(receivedAppData, "recyclerData");
        long j = receivedAppData.a;
        Bundle bundle = new Bundle();
        bundle.putLong("PAYLOAD_ID", j);
        int i2 = rs6.cancel_receive_alert_dialog;
        ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.a;
        String strL = receiveAppRecyclerListFragment.L(i2);
        js3.o(strL, "getString(...)");
        pk5.g(receiveAppRecyclerListFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(receiveAppRecyclerListFragment.Q1(), "DIALOG_KEY_CANCEL_RECEIVE", bundle, 8), null, strL, receiveAppRecyclerListFragment.L(rs6.stop_receive), receiveAppRecyclerListFragment.L(rs6.button_cancel), true)), -1);
    }
}
