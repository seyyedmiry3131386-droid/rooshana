package defpackage;

import android.os.Bundle;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class au5 extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        hp hpVar;
        js3.p(er3Var, "intentFragmentFactory");
        if (q0Var.g(2)) {
            q0Var.h(2);
            q0Var.d = q0Var.b.getBundleExtra("BUNDLE_KEY_EXTERNAL_APPLICATION");
        }
        Bundle bundle = q0Var.d;
        if (bundle == null) {
            lw.g(null, "ACTION_APPLICATION: Bundle is Null!", null);
            return null;
        }
        int iA = q0Var.a();
        try {
            hpVar = m91.m(bundle);
        } catch (Exception unused) {
            String string = bundle.getString("packageName", "");
            js3.o(string, "getString(...)");
            boolean z = bundle.getBoolean("BUNDLE_KEY_IS_DOWNLOAD", false);
            Tracker tracker = (Tracker) dt2.p(bundle, "BUNDLE_KEY_LAUNCH_SOURCE", Tracker.class);
            if (tracker == null) {
                tracker = new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, "", "app");
            }
            String string2 = bundle.getString("BUNDLE_KEY_QUERY", "");
            String string3 = bundle.getString("refId", "");
            js3.o(string3, "getString(...)");
            hpVar = new hp(string, z, tracker, false, string2, string3, null, null, null, null, null, null, null);
        }
        if (iA == 104 || iA == 105) {
            er3Var.a.a(hpVar.a);
        }
        return new dr3(new NavIntentDirections.AppDetail(new hp(hpVar.a, hpVar.b, hpVar.c, hpVar.d, hpVar.e, hpVar.f, hpVar.g, hpVar.h, hpVar.i, hpVar.j, hpVar.k, hpVar.l, hpVar.m)));
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        return m88.T(q0Var.b.getAction(), "ir.mservices.market.ACTION_APPLICATION", true);
    }
}
