package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml {
    public static final ll a = new ll("");

    public static final List a(ll llVar, int i, int i2, k7 k7Var) {
        List list;
        if (i == i2 || (list = llVar.a) == null) {
            return null;
        }
        if (i != 0 || i2 < llVar.b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                kl klVar = (kl) list.get(i3);
                if ((k7Var != null ? ((Boolean) k7Var.invoke(klVar.a)).booleanValue() : true) && b(i, i2, klVar.b, klVar.c)) {
                    arrayList.add(new kl(ok4.t(klVar.b, i, i2) - i, ok4.t(klVar.c, i, i2) - i, (hl) klVar.a, klVar.d));
                }
            }
            return arrayList;
        }
        if (k7Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) k7Var.invoke(((kl) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
