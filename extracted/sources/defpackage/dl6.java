package defpackage;

import android.content.Context;
import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dl6 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        List listD = q0Var.d();
        String str = listD != null ? (String) a.q0(0, listD) : null;
        List listD2 = q0Var.d();
        String str2 = listD2 != null ? (String) a.q0(1, listD2) : null;
        List listD3 = q0Var.d();
        if (listD3 != null) {
        }
        if (!er3Var.b.d()) {
            String dataString = intent.getDataString();
            if (dataString != null) {
                return new dr3(UserManagerIntentFragment.I0("TYPE_NOT_LOGIN", dataString, true));
            }
        } else if (!er3Var.b.f()) {
            String dataString2 = intent.getDataString();
            if (dataString2 != null) {
                return new dr3(UserManagerIntentFragment.I0("TYPE_NICKNAME_NOT_SET", dataString2, false));
            }
        } else {
            if (q0Var.b(rs6.external_intent_path_segments_share).equals(str)) {
                Context context = q0Var.a;
                z4 z4Var = er3Var.b.h;
                String strI = c5.i(context, z4Var.e(), (String) z4Var.i, (String) z4Var.c);
                js3.o(strI, "shareProfileLink(...)");
                au7.a(context, strI, new v7(27));
                return null;
            }
            if (q0Var.b(rs6.external_intent_path_segments_followers).equals(str2) && str != null && !f88.n0(str)) {
                List listE = q0Var.e();
                String str3 = listE != null ? (String) a.q0(0, listE) : null;
                if (str3 != null && !f88.n0(str3)) {
                    return str3.equals(er3Var.b.h.e()) ? new dr3(new NavIntentDirections.Followers(new j4(str3))) : new dr3(new NavIntentDirections.OtherFollowers(new dw5(str3)));
                }
            } else {
                if (q0Var.b(rs6.external_intent_path_segments_requests).equals(str)) {
                    return new dr3(new NavIntentDirections.Requests());
                }
                if (!q0Var.b(rs6.external_intent_path_segments_followings).equals(str2) || str == null || f88.n0(str)) {
                    lw.d(null, null, q0Var);
                    lw.d(null, null, intent);
                    lw.d(null, null, intent.getDataString());
                    return new dr3(new NavIntentDirections.Profile());
                }
                List listE2 = q0Var.e();
                String str4 = listE2 != null ? (String) a.q0(0, listE2) : null;
                if (str4 != null && !f88.n0(str4)) {
                    return str4.equals(er3Var.b.h.e()) ? new dr3(new NavIntentDirections.Following(new p4(str4))) : new dr3(new NavIntentDirections.OtherFollowing(new fw5(str4)));
                }
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_profile), true);
    }
}
