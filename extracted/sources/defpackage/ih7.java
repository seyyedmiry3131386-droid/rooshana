package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ih7 extends y1 {
    public final ps0 a;
    public final List b;
    public final Object c = a.b(LazyThreadSafetyMode.b, new o06(20, this));
    public final Map d;
    public final LinkedHashMap e;

    public ih7(ps0 ps0Var, zw3[] zw3VarArr, px3[] px3VarArr, Annotation[] annotationArr) {
        this.a = ps0Var;
        this.b = EmptyList.a;
        if (zw3VarArr.length != px3VarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + ps0Var.d() + " should be marked @Serializable");
        }
        int iMin = Math.min(zw3VarArr.length, px3VarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(zw3VarArr[i], px3VarArr[i]));
        }
        Map mapS = b.S(arrayList);
        this.d = mapS;
        Set<Map.Entry> setEntrySet = mapS.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((px3) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + strA + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b.L(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (px3) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = ew.r0(annotationArr);
    }

    @Override // defpackage.y1
    public final px3 a(tz0 tz0Var, String str) {
        px3 px3Var = (px3) this.e.get(str);
        return px3Var != null ? px3Var : super.a(tz0Var, str);
    }

    @Override // defpackage.y1
    public final px3 b(q12 q12Var, Object obj) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        px3 px3Var = (px3) this.d.get(g27.a(obj.getClass()));
        px3 px3VarB = px3Var != null ? px3Var : super.b(q12Var, obj);
        if (px3VarB != null) {
            return px3VarB;
        }
        return null;
    }

    @Override // defpackage.y1
    public final zw3 c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return (no7) this.c.getValue();
    }
}
