package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class tk3 extends z {
    public final /* synthetic */ int c;

    public /* synthetic */ tk3(int i) {
        this.c = i;
    }

    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String str;
        switch (this.c) {
            case 0:
                js3.p(er3Var, "intentFragmentFactory");
                Bundle extras = q0Var.b.getExtras();
                String string = extras != null ? extras.getString("BUNDLE_KEY_URL") : null;
                Context context = q0Var.a;
                if (string != null) {
                    t61.v(string, "parse(...)", context, null, null);
                }
                er3Var.f.a.b("notification_dis_over_apps_click", new String[0]);
                return null;
            case 1:
                js3.p(er3Var, "intentFragmentFactory");
                Intent intent = q0Var.b;
                Uri data = intent.getData();
                String queryParameter = data != null ? data.getQueryParameter("bind") : null;
                Uri data2 = intent.getData();
                String queryParameter2 = data2 != null ? data2.getQueryParameter("defaultValue") : null;
                Uri data3 = intent.getData();
                String queryParameter3 = data3 != null ? data3.getQueryParameter("nextIntent") : null;
                Uri data4 = intent.getData();
                String queryParameter4 = data4 != null ? data4.getQueryParameter("iconUrl") : null;
                Uri data5 = intent.getData();
                String queryParameter5 = data5 != null ? data5.getQueryParameter("title") : null;
                Uri data6 = intent.getData();
                String queryParameter6 = data6 != null ? data6.getQueryParameter("subtitle") : null;
                if (!er3Var.b.d() || queryParameter3 == null || f88.n0(queryParameter3)) {
                    return new dr3(m88.T(queryParameter, "email", true) ? UserManagerIntentFragment.H0("TYPE_BIND_EMAIL", queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, false) : m88.T(queryParameter, PaymentRequiredBindingDto.BINDING_PHONE, true) ? UserManagerIntentFragment.H0("TYPE_BIND_PHONE", queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, false) : UserManagerIntentFragment.H0("TYPE_NOT_LOGIN", queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, false));
                }
                t61.v(queryParameter3, "parse(...)", q0Var.a, NearbyRepository.SERVICE_ID, null);
                return null;
            default:
                js3.p(er3Var, "intentFragmentFactory");
                List listE = q0Var.e();
                if (listE == null || (str = (String) a.q0(0, listE)) == null) {
                    str = "";
                }
                u86 u86Var = new u86(str);
                dr3 dr3Var = new dr3();
                dr3Var.b = -1;
                dr3Var.f = u86Var;
                dr3Var.a = 32;
                return dr3Var;
        }
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        List listE;
        switch (this.c) {
            case 0:
                return js3.i(q0Var.b.getAction(), "ir.mservices.market_ACTION_DISPLAY_OVER_APPS");
            case 1:
                return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_login), true);
            default:
                return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_pin), true) && (listE = q0Var.e()) != null && !listE.isEmpty();
        }
    }
}
