package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class zm8 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Intent intent = q0Var.b;
        Uri data = intent.getData();
        if (data == null) {
            lw.g(null, "uri is empty, intent:" + intent, null);
            return null;
        }
        String queryParameter = data.getQueryParameter("url");
        String queryParameter2 = data.getQueryParameter("title");
        boolean booleanQueryParameter = data.getBooleanQueryParameter("menu", false);
        boolean booleanQueryParameter2 = data.getBooleanQueryParameter("divider", false);
        boolean booleanQueryParameter3 = data.getBooleanQueryParameter("showToolbar", true);
        boolean booleanQueryParameter4 = data.getBooleanQueryParameter("cacheControl", false);
        if (queryParameter != null && !f88.n0(queryParameter)) {
            if (!new Regex("^\\p{Alpha}+://.*$").f(queryParameter)) {
                queryParameter = "http://".concat(queryParameter);
            }
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str = queryParameter;
            if (!f88.n0(str)) {
                try {
                    new URL(str);
                    return new dr3(new NavIntentDirections.Togo(new xm8(str, queryParameter2, booleanQueryParameter, booleanQueryParameter2, booleanQueryParameter3, booleanQueryParameter4, false)));
                } catch (MalformedURLException unused) {
                }
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_togo), true);
    }
}
