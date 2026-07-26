package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import defpackage.d01;
import defpackage.dt2;
import defpackage.js3;
import defpackage.q81;
import defpackage.rq4;
import defpackage.ru7;
import defpackage.ur6;
import defpackage.v48;
import defpackage.vb7;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final v48 a(Context context) {
        v48 v48Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objA = linkedHashMap.get(context);
                if (objA == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    kotlinx.coroutines.channels.a aVarB = dt2.b(-1, 6, null);
                    objA = kotlinx.coroutines.flow.d.A(new vb7(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new q81(aVarB, rq4.s(Looper.getMainLooper())), aVarB, context, null)), js3.c(), ru7.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objA);
                }
                v48Var = (v48) objA;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v48Var;
    }

    public static final d01 b(View view) {
        Object tag = view.getTag(ur6.androidx_compose_ui_view_composition_context);
        if (tag instanceof d01) {
            return (d01) tag;
        }
        return null;
    }
}
