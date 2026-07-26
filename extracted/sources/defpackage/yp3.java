package defpackage;

import android.os.Bundle;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class yp3 extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        NavIntentDirections appDetail;
        js3.p(er3Var, "intentFragmentFactory");
        if (q0Var.g(1024)) {
            q0Var.h(1024);
            q0Var.e = q0Var.b.getExtras();
        }
        Bundle bundle = q0Var.e;
        if (bundle == null) {
            lw.g(null, "EXTERNAL_APPLICATION: Bundle is Null!", null);
            return null;
        }
        int iA = q0Var.a();
        String string = bundle.getString("packageName", "");
        if (er3Var.g.g.size() > 0) {
            if (iA == 104 || iA == 105) {
                a aVar = er3Var.a;
                aVar.d.clear();
                aVar.c.clear();
                aVar.i();
            }
            String lowerCase = "APPS".toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
            appDetail = new NavIntentDirections.DownloadList(new rr1(lowerCase));
        } else {
            if (iA == 104 || iA == 105) {
                er3Var.a.a(string);
            }
            js3.m(string);
            appDetail = new NavIntentDirections.AppDetail(new hp(string, false, new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, "", "installing"), false, null, "NotificationInstalling", null, null, null, null, null, null, null));
        }
        return new dr3(appDetail);
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        return "ir.mservices.market.ACTION_INSTALLING_LIST".equalsIgnoreCase(q0Var.b.getAction());
    }
}
