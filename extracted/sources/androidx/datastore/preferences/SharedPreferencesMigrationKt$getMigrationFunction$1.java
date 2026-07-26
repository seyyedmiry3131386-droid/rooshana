package androidx.datastore.preferences;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bj6;
import defpackage.g51;
import defpackage.js3;
import defpackage.mu7;
import defpackage.pb5;
import defpackage.rp2;
import defpackage.s7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ mu7 a;
    public /* synthetic */ pb5 b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, (g51) obj3);
        sharedPreferencesMigrationKt$getMigrationFunction$1.a = (mu7) obj;
        sharedPreferencesMigrationKt$getMigrationFunction$1.b = (pb5) obj2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        mu7 mu7Var = this.a;
        pb5 pb5Var = this.b;
        Set setKeySet = pb5Var.a().keySet();
        ArrayList arrayList = new ArrayList(wu0.V(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((bj6) it.next()).a);
        }
        Map<String, ?> all = mu7Var.a.getAll();
        js3.o(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = mu7Var.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.b.L(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = kotlin.collections.a.T0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        pb5 pb5Var2 = new pb5(kotlin.collections.b.U(pb5Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                pb5Var2.f(s7.e(str), value2);
            } else if (value2 instanceof Float) {
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                pb5Var2.f(new bj6(str), value2);
            } else if (value2 instanceof Integer) {
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                pb5Var2.f(new bj6(str), value2);
            } else if (value2 instanceof Long) {
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                pb5Var2.f(new bj6(str), value2);
            } else if (value2 instanceof String) {
                pb5Var2.f(s7.c0(str), value2);
            } else if (value2 instanceof Set) {
                pb5Var2.f(s7.d0(str), (Set) value2);
            }
        }
        return new pb5(kotlin.collections.b.U(pb5Var2.a()), true);
    }
}
