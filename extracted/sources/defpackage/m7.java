package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.android.core.t0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@jl5("activity")
public class m7 extends kl5 {
    public final Context c;
    public final Activity d;

    public m7(Context context) {
        Object next;
        this.c = context;
        Iterator it = mo7.s(new k7(0), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
    }

    @Override // defpackage.kl5
    public final wi5 a() {
        return new l7(this);
    }

    @Override // defpackage.kl5
    public final wi5 c(wi5 wi5Var, Bundle bundle, lj5 lj5Var) {
        Intent intent;
        int intExtra;
        l7 l7Var = (l7) wi5Var;
        yb ybVar = l7Var.b;
        if (l7Var.g == null) {
            throw new IllegalStateException(dw1.k(ybVar.a, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(l7Var.g);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = l7Var.h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    js3.m(strGroup);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    di5 di5Var = (di5) l7Var.e().get(strGroup);
                    sj5 sj5Var = di5Var != null ? di5Var.a : null;
                    stringBuffer.append(sj5Var != null ? sj5Var.f(sj5Var.a(bundle, strGroup)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity2 = this.d;
        if (activity2 == null) {
            intent2.addFlags(268435456);
        }
        if (lj5Var != null && lj5Var.a) {
            intent2.addFlags(536870912);
        }
        if (activity2 != null && (intent = activity2.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", ybVar.a);
        Context context = this.c;
        Resources resources = context.getResources();
        if (lj5Var != null) {
            int i = lj5Var.h;
            int i2 = lj5Var.i;
            if ((i <= 0 || !js3.i(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !js3.i(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                js3.m(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2));
            } else {
                t0.m("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + l7Var);
            }
        }
        context.startActivity(intent2);
        if (lj5Var != null && activity2 != null) {
            int i3 = lj5Var.f;
            int i4 = lj5Var.g;
            if ((i3 > 0 && js3.i(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && js3.i(resources.getResourceTypeName(i4), "animator"))) {
                t0.m("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + l7Var);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity2.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.kl5
    public final boolean j() {
        Activity activity2 = this.d;
        if (activity2 == null) {
            return false;
        }
        activity2.finish();
        return true;
    }
}
