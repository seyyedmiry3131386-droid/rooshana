package com.microsoft.clarity.q;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static Class a(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        HashMap map = p.a;
        if (map.get(str) == null) {
            map.put(str, Class.forName(str));
        }
        Object obj = map.get(str);
        js3.m(obj);
        return (Class) obj;
    }

    public static Method a(String str, String str2, Class... clsArr) {
        Object objInvoke;
        js3.p(str, "cls");
        js3.p(str2, "method");
        js3.p(clsArr, "parameterTypes");
        try {
            objInvoke = new n(str, str2, clsArr).invoke();
        } catch (Exception unused) {
            objInvoke = null;
        }
        return (Method) objInvoke;
    }
}
