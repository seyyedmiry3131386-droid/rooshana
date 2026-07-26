package defpackage;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.a;
import ir.mservices.market.version2.ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 {
    public String a;
    public final lu7 b;
    public dr1 c;
    public i10 d;
    public x57 e;
    public dr1 f;
    public final Context g;
    public final z4 h;

    public c5(lu7 lu7Var, Context context, t32 t32Var) {
        this.b = lu7Var;
        this.g = context;
        String strF = lu7Var.f(lu7.g, "");
        this.a = strF;
        if (TextUtils.isEmpty(strF)) {
            this.h = new z4(lu7Var);
        } else {
            z4 z4Var = new z4(lu7Var);
            z4Var.c = lu7Var.f(lu7.i, "");
            z4Var.d = z4.g(lu7Var, lu7.l);
            z4Var.b = lu7Var.f(lu7.m, "");
            z4Var.f = z4.g(lu7Var, lu7.n);
            z4Var.e = z4.g(lu7Var, lu7.h);
            z4Var.g = z4.g(lu7Var, lu7.o);
            z4Var.h = z4.g(lu7Var, lu7.p);
            z4Var.i = z4.g(lu7Var, lu7.r);
            z4Var.j = z4.g(lu7Var, lu7.s);
            this.h = z4Var;
        }
        t32Var.l(this, false);
    }

    public static String i(Context context, String str, String str2, String str3) {
        String str4;
        String string = context.getString(rs6.external_intent_filters_path_user);
        if (!string.isEmpty() && string.charAt(0) == '/') {
            string = string.substring(1);
        }
        if (TextUtils.isEmpty(str3)) {
            str4 = new Uri.Builder().scheme("https").authority("myket.ir").appendPath(string).build() + "/";
        } else {
            str4 = context.getString(rs6.profile_share_link_description, str3) + new Uri.Builder().scheme("https").authority("myket.ir").appendPath(string).build() + "/";
        }
        StringBuilder sbC = bl4.C(str4);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        sbC.append(str);
        return sbC.toString();
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        String strF = this.b.f(lu7.g, "");
        this.a = strF;
        return strF;
    }

    public final String b() {
        String str = lu7.q;
        lu7 lu7Var = this.b;
        String strF = lu7Var.f(str, "");
        if (!TextUtils.isEmpty(strF)) {
            return strF;
        }
        String string = UUID.randomUUID().toString();
        lu7Var.i(str, string);
        return string;
    }

    public final String c() {
        z4 z4Var = this.h;
        return TextUtils.isEmpty((String) z4Var.c) ? this.g.getString(rs6.anonymous) : (String) z4Var.c;
    }

    public final boolean d() {
        return !TextUtils.isEmpty((String) this.h.f);
    }

    public final boolean e() {
        return !TextUtils.isEmpty((String) this.h.b);
    }

    public final boolean f() {
        return !TextUtils.isEmpty((String) this.h.c);
    }

    public final void g(ImageView imageView, boolean z) {
        LayerDrawable layerDrawableS = cc7.s(imageView.getContext(), z);
        Context context = this.g;
        s57 s57VarC = a.b(context).c(context);
        s57VarC.getClass();
        s57VarC.o(new q57(imageView));
        z4 z4Var = this.h;
        if (TextUtils.isEmpty((String) z4Var.b)) {
            imageView.setImageDrawable(layerDrawableS);
        } else {
            ((f57) ((f57) zk8.O(context, (String) z4Var.b).d()).W(uv1.b()).l(layerDrawableS)).P(imageView);
        }
    }

    public final void h(String str, String str2, String str3) {
        if (this.a.equalsIgnoreCase(str)) {
            return;
        }
        this.a = str;
        this.b.i(lu7.g, str);
        z4 z4Var = this.h;
        z4Var.h = str2;
        z4Var.i(str2, lu7.p, true);
        z4Var.j = str3;
        z4Var.i(str3, lu7.s, true);
        l lVar = ((ir.mservices.market.common.model.a) this.f.get()).e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lVar.getClass();
        lVar.p(null, linkedHashMap);
        t32.b().g(new w4());
    }

    public void onEvent(ju juVar) {
        if (juVar.b == ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.b) {
            this.d.b("");
        }
    }
}
