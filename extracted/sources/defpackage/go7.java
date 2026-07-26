package defpackage;

import android.text.TextUtils;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b6;
import io.sentry.f;
import io.sentry.g4;
import io.sentry.h0;
import io.sentry.n5;
import io.sentry.protocol.g0;
import io.sentry.z3;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class go7 implements z3, g4, n5 {
    public final /* synthetic */ hf5 a;

    public /* synthetic */ go7(hf5 hf5Var) {
        this.a = hf5Var;
    }

    @Override // io.sentry.n5
    public f b(f fVar, h0 h0Var) {
        this.a.getClass();
        if (TextUtils.isEmpty(fVar.g) || (!fVar.g.equals("ui.swipe") && !fVar.g.equals("ui.scroll"))) {
            List listAsList = Arrays.asList(".png", ".jpg", ".jpeg", ".webp", ".ts", ".vtt");
            V v = fVar.f.get("url");
            if (v == 0) {
                return fVar;
            }
            String string = v.toString();
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (string.endsWith((String) it.next())) {
                }
            }
            return fVar;
        }
        return null;
    }

    @Override // io.sentry.g4
    public void d(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) b6Var;
        hf5 hf5Var = this.a;
        hf5Var.a = sentryAndroidOptions;
        sentryAndroidOptions.setRelease("10.2.8");
        sentryAndroidOptions.setEnvironment("production");
        sentryAndroidOptions.setMaxBreadcrumbs(300);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"(?!)"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        sentryAndroidOptions.setTracePropagationTargets(DesugarCollections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put("store", LinkDTO.LINK_TYPE_MYKET_INTENT);
        map.put("deviceType", yq2.c0(hf5Var.b));
        for (Map.Entry entry : map.entrySet()) {
            if (TextUtils.isEmpty((CharSequence) entry.getKey()) || TextUtils.isEmpty((CharSequence) entry.getValue())) {
                lw.g(null, "Sentry SetTag key or value is empty", "key:" + ((String) entry.getKey()) + ", value:" + ((String) entry.getValue()));
            } else {
                sentryAndroidOptions.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
        sentryAndroidOptions.setBeforeBreadcrumb(new go7(hf5Var));
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        g0 g0Var = new g0();
        hf5 hf5Var = this.a;
        String strY = wq2.y(hf5Var.b);
        String strB = hf5Var.c.b();
        String strA = hf5Var.c.a();
        if (TextUtils.isEmpty(strY)) {
            strY = ApplicationStateDto.STATE_NONE;
        }
        if (TextUtils.isEmpty(strB)) {
            strB = ApplicationStateDto.STATE_NONE;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = ApplicationStateDto.STATE_NONE;
        }
        g0Var.b = strA + "/" + strY + "/" + strB;
        a1Var.n(g0Var);
    }
}
