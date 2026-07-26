package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.myket.core.R;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fg5 {
    public static final Regex a = new Regex("(.+\\.)*myket\\.(ir|net)");

    public static final Intent a(Context context, File file) {
        Object d87Var;
        js3.p(context, "context");
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            d87Var = new e87(FileProvider.d(context, file));
        } else {
            d87Var = new d87();
        }
        intent.setData((Uri) (d87Var instanceof d87 ? Uri.fromFile(file) : ((e87) d87Var).a));
        return intent;
    }

    public static final Intent b(Context context, File file) {
        Object d87Var;
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            d87Var = new e87(intent.putExtra("android.intent.extra.STREAM", FileProvider.d(context, file)));
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            return intent;
        }
        return intent;
    }

    public static final boolean c(Uri uri) {
        js3.p(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            return a.f(host);
        }
        return false;
    }

    public static final void d(Context context, String str, String str2) {
        js3.p(str2, "title");
        if (str == null || f88.n0(str) || context == null) {
            return;
        }
        if (!new Regex("^\\p{Alpha}+://.*$").f(str)) {
            str = "http://".concat(str);
        }
        if (str == null) {
            str = "";
        }
        String strN = dw1.n("myket://", context.getString(R.string.external_intent_filters_host_link));
        LinkedHashMap linkedHashMapO = b.O(new Pair("url", str));
        if (!f88.n0(str2)) {
            linkedHashMapO.put("title", str2);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(js8.j(strN, null, null, null, linkedHashMapO, true))).addFlags(268435456).setPackage(NearbyRepository.SERVICE_ID);
        js3.o(intent, "setPackage(...)");
        context.startActivity(intent);
    }
}
