package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class qw5 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String str;
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        List listE = q0Var.e();
        if (listE != null && (str = (String) a.q0(0, listE)) != null && !f88.n0(str)) {
            if (!str.equals(er3Var.b.h.e()) && !str.equals((String) er3Var.b.h.i)) {
                UserProfileRefId userProfileRefId = UserProfileRefId.b;
                return new dr3(new NavIntentDirections.UserProfile(new o19(str, "", "other_profile_intent")));
            }
            if (!er3Var.b.d()) {
                String dataString = intent.getDataString();
                if (dataString != null) {
                    return new dr3(UserManagerIntentFragment.I0("TYPE_NOT_LOGIN", dataString, true));
                }
            } else {
                if (er3Var.b.f()) {
                    NavIntentDirections.Profile profile = new NavIntentDirections.Profile();
                    Uri data = intent.getData();
                    return new dr3(profile, 0, data != null ? data.getBooleanQueryParameter("currentTab", false) : false);
                }
                String dataString2 = intent.getDataString();
                if (dataString2 != null) {
                    return new dr3(UserManagerIntentFragment.I0("TYPE_NICKNAME_NOT_SET", dataString2, true));
                }
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_user_profile), true);
    }
}
