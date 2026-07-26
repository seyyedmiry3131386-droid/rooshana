package ir.mservices.market.version2.core.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import defpackage.am2;
import defpackage.dc7;
import defpackage.f88;
import defpackage.fg5;
import defpackage.js3;
import defpackage.js8;
import defpackage.lw;
import defpackage.sj8;
import defpackage.w91;
import defpackage.wn5;
import defpackage.wt5;
import defpackage.xf5;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SafeURLSpan extends URLSpan {
    public static final Pattern d = Pattern.compile("myket://\\S+");
    public static final dc7 e = new dc7();
    public final wt5 a;
    public final boolean b;
    public final xf5 c;

    public SafeURLSpan(String str, wt5 wt5Var, boolean z) {
        super(str);
        this.a = wt5Var;
        this.b = z;
        this.c = (xf5) ((w91) ApplicationLauncher.o.b()).F.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        js3.p(view, "widget");
        if (!this.b) {
            Uri uri = Uri.parse(getURL());
            String scheme = uri.getScheme();
            if (scheme == null || f88.n0(scheme)) {
                return;
            }
            Context context = view.getContext();
            if (context == 0) {
                lw.g(null, null, null);
                return;
            }
            if (LinkDTO.LINK_TYPE_MYKET_INTENT.equalsIgnoreCase(scheme)) {
                js8.q(context, uri, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    return;
                } else {
                    context.startActivity(intent);
                }
            } else if ((context instanceof FragmentActivity) && (context instanceof am2)) {
                if (fg5.c(uri)) {
                    js8.q(context, uri, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
                } else {
                    xf5 xf5Var = this.c;
                    if (xf5Var == null) {
                        js3.V("myketUIUtils");
                        throw null;
                    }
                    String string = uri.toString();
                    js3.o(string, "toString(...)");
                    xf5Var.k((FragmentActivity) context, (am2) context, string, "", false, false, false, false, true, false);
                }
            } else if (wn5.d(context)) {
                String string2 = uri.toString();
                js3.o(string2, "toString(...)");
                wn5.a0(sj8.b().l, context, string2);
            } else {
                js8.q(context, uri, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
            }
            if ("mailto".equalsIgnoreCase(scheme)) {
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                intent2.putExtra("com.android.browser.application_id", context.getPackageName());
                if (intent2.resolveActivity(context.getPackageManager()) == null) {
                    return;
                } else {
                    context.startActivity(intent2);
                }
            }
        }
        wt5 wt5Var = this.a;
        if (wt5Var != null) {
            wt5Var.n(getURL());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        js3.p(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
