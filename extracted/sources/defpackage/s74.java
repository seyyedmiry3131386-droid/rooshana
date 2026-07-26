package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.activity.PushNotifDialogActivity;
import ir.myket.core.R;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class s74 extends z {
    static {
        rk1.a(s74.class.getSimpleName());
    }

    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Context context = q0Var.a;
        Uri data = q0Var.b.getData();
        Intent intent = null;
        if (data != null) {
            String queryParameter = data.getQueryParameter("url");
            String queryParameter2 = data.getQueryParameter("title");
            String str = queryParameter2 == null ? "" : queryParameter2;
            String queryParameter3 = data.getQueryParameter("icon");
            boolean z = Boolean.parseBoolean(data.getQueryParameter("webview"));
            String queryParameter4 = data.getQueryParameter("open");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            boolean booleanQueryParameter = data.getBooleanQueryParameter("menu", false);
            if (queryParameter != null && !f88.n0(queryParameter)) {
                if (!new Regex("^\\p{Alpha}+://.*$").f(queryParameter)) {
                    queryParameter = "http://".concat(queryParameter);
                }
                String str2 = queryParameter == null ? "" : queryParameter;
                if (!f88.n0(str2)) {
                    try {
                        new URL(str2);
                        Locale locale = Locale.getDefault();
                        js3.o(locale, "getDefault(...)");
                        String lowerCase = queryParameter4.toLowerCase(locale);
                        js3.o(lowerCase, "toLowerCase(...)");
                        if (!lowerCase.equals("external")) {
                            if (!lowerCase.equals("dialog")) {
                                return new dr3(new NavIntentDirections.WebView(new zc9(str2, str, false, booleanQueryParameter, z, true, false)));
                            }
                            Intent intent2 = new Intent(context, (Class<?>) PushNotifDialogActivity.class);
                            intent2.putExtra("BUNDLE_KEY_URL", str2);
                            intent2.putExtra("BUNDLE_KEY_TITLE", str);
                            intent2.putExtra("BUNDLE_KEY_ICON_PATH", queryParameter3);
                            intent2.addFlags(268435456);
                            return new dr3(intent2);
                        }
                        Intent intent3 = new Intent();
                        intent3.setAction("android.intent.action.VIEW");
                        intent3.addCategory("android.intent.category.BROWSABLE");
                        intent3.setData(Uri.parse(str2));
                        intent3.addFlags(268435456);
                        if (intent3.resolveActivity(context.getPackageManager()) == null) {
                            intent3 = null;
                        }
                        if (intent3 == null) {
                            lw.g(null, "could not handle this operation!", null);
                        } else {
                            intent = intent3;
                        }
                        return new dr3(intent);
                    } catch (MalformedURLException unused) {
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(R.string.external_intent_filters_host_link), true);
    }
}
