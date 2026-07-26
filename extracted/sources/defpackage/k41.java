package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k41 {
    public final ArrayList a;
    public final HashMap b;

    public k41(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.a = new ArrayList();
                break;
        }
    }

    public void a(Object obj, String str) {
        obj.getClass();
        this.b.put(str, obj);
        this.a.remove(str);
    }

    public synchronized List b(String str) {
        List arrayList;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<k67> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (k67 k67Var : list) {
                    if ((k67Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(k67Var.b)) && !arrayList.contains(k67Var.b)) {
                        arrayList.add(k67Var.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
