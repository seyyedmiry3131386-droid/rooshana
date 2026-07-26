package j$.time.format;

import j$.util.stream.u6;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public final Map a;

    public void b(u6 u6Var) {
        ((EnumMap) this.a).put(u6Var, 1);
    }

    public r(int i, Map map) {
        switch (i) {
            case 1:
                this.a = map;
                break;
            default:
                this.a = map;
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    HashMap map3 = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        String str = (String) entry2.getValue();
                        String str2 = (String) entry2.getValue();
                        Long l = (Long) entry2.getKey();
                        q qVar = b.b;
                        map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
                    }
                    ArrayList arrayList2 = new ArrayList(map3.values());
                    Collections.sort(arrayList2, b.b);
                    map2.put((v) entry.getKey(), arrayList2);
                    arrayList.addAll(arrayList2);
                    map2.put(null, arrayList);
                }
                Collections.sort(arrayList, b.b);
                break;
        }
    }

    public String a(long j, v vVar) {
        Map map = (Map) this.a.get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
