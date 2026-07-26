package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class jd7 {
    public final LinkedHashMap a;
    public final rb4 b;

    public jd7(MapBuilder mapBuilder) {
        this.a = new LinkedHashMap();
        this.b = new rb4(mapBuilder);
    }

    public final boolean a(String str) {
        rb4 rb4Var = this.b;
        rb4Var.getClass();
        return ((LinkedHashMap) rb4Var.b).containsKey(str);
    }

    public final Object b(String str) {
        Object value;
        rb4 rb4Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) rb4Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) rb4Var.e;
        try {
            xb5 xb5Var = (xb5) linkedHashMap2.get(str);
            if (xb5Var != null && (value = ((l) xb5Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) rb4Var.d).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final rv6 c(Object obj, String str) {
        rb4 rb4Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) rb4Var.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) rb4Var.b;
        if (linkedHashMap.containsKey(str)) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) rb4Var.e;
            Object objB = linkedHashMap3.get(str);
            if (objB == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, obj);
                }
                objB = ja1.b(linkedHashMap2.get(str));
                linkedHashMap3.put(str, objB);
            }
            return new rv6((xb5) objB);
        }
        LinkedHashMap linkedHashMap4 = (LinkedHashMap) rb4Var.d;
        Object objB2 = linkedHashMap4.get(str);
        if (objB2 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, obj);
            }
            objB2 = ja1.b(linkedHashMap2.get(str));
            linkedHashMap4.put(str, objB2);
        }
        return new rv6((xb5) objB2);
    }

    public final void d(Object obj, String str) {
        if (obj != null) {
            ArrayList arrayList = ld7.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException(("Can't put value with type " + obj.getClass() + " into saved state").toString());
        }
        ArrayList arrayList2 = ld7.a;
        Object obj2 = this.a.get(str);
        bb5 bb5Var = obj2 instanceof bb5 ? (bb5) obj2 : null;
        if (bb5Var != null) {
            bb5Var.h(obj);
        }
        this.b.J(obj, str);
    }

    public jd7() {
        this.a = new LinkedHashMap();
        this.b = new rb4(b.I());
    }
}
