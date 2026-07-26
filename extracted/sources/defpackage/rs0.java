package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rs0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public rs0(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            Lifecycle$Event lifecycle$Event = (Lifecycle$Event) entry.getValue();
            List arrayList = (List) this.a.get(lifecycle$Event);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(lifecycle$Event, arrayList);
            }
            arrayList.add((ss0) entry.getKey());
        }
    }

    public static void a(List list, g64 g64Var, Lifecycle$Event lifecycle$Event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ss0 ss0Var = (ss0) list.get(size);
                Method method = ss0Var.b;
                try {
                    int i = ss0Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, g64Var);
                    } else if (i == 2) {
                        method.invoke(obj, g64Var, lifecycle$Event);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
