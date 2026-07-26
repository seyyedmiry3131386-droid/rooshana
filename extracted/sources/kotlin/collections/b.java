package kotlin.collections;

import defpackage.gu9;
import defpackage.js3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends gu9 {
    public static Map I() {
        EmptyMap emptyMap = EmptyMap.a;
        js3.n(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object J(Map map, Object obj) {
        js3.p(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap K(Pair... pairArr) {
        HashMap map = new HashMap(L(pairArr.length));
        R(map, pairArr);
        return map;
    }

    public static int L(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map M(Pair pair) {
        js3.p(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.a, pair.b);
        js3.o(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map N(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return I();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L(pairArr.length));
        R(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap O(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(L(pairArr.length));
        R(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap P(Map map, Map map2) {
        js3.p(map, "<this>");
        js3.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map Q(Map map, Pair pair) {
        js3.p(map, "<this>");
        if (map.isEmpty()) {
            return M(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.a, pair.b);
        return linkedHashMap;
    }

    public static final void R(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.a, pair.b);
        }
    }

    public static Map S(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return I();
        }
        if (size == 1) {
            return M((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a, pair.b);
        }
        return linkedHashMap;
    }

    public static Map T(Map map) {
        js3.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? U(map) : V(map) : I();
    }

    public static LinkedHashMap U(Map map) {
        js3.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map V(Map map) {
        js3.p(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        js3.o(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
