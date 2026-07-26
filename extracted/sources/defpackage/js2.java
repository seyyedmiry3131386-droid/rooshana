package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class js2 {
    public final ArrayList a;
    public final List b;

    public js2(ArrayList arrayList, List list) {
        js3.p(list, "encryptedTopics");
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js2)) {
            return false;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        js2 js2Var = (js2) obj;
        List list = js2Var.b;
        ArrayList arrayList2 = js2Var.a;
        if (size != arrayList2.size()) {
            return false;
        }
        List list2 = this.b;
        return list2.size() == list.size() && new HashSet(arrayList).equals(new HashSet(arrayList2)) && new HashSet(list2).equals(new HashSet(list));
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }
}
