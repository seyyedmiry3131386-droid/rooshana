package com.google.firebase.datastorage;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bj6;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.eb1;
import defpackage.g27;
import defpackage.js3;
import defpackage.ox3;
import defpackage.tv8;
import defpackage.ut3;
import defpackage.ut4;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference2Impl;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ ox3[] d;
    public final String a;
    public final ThreadLocal b;
    public final eb1 c;

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        g27.a.getClass();
        d = new ox3[]{propertyReference2Impl};
    }

    public a(Context context, String str) {
        js3.p(context, "context");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = new ThreadLocal();
        this.c = (eb1) tv8.v(str, new ut4(9, new ut3(this, 0)), new ut3(this, 1), 8).a(context, d[0]);
    }

    public final void a(dp2 dp2Var) {
    }

    public final Map b() {
        return (Map) bt2.Q(EmptyCoroutineContext.a, new JavaDataStorage$getAllSync$1(this, null));
    }

    public final Object c(bj6 bj6Var) {
        js3.p(bj6Var, "key");
        return bt2.Q(EmptyCoroutineContext.a, new JavaDataStorage$getSync$1(this, bj6Var, null));
    }

    public final void d(bj6 bj6Var, Long l) {
        js3.p(bj6Var, "key");
    }
}
