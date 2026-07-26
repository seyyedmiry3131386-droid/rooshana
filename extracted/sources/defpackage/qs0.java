package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class qs0 {
    public final String a;
    public List b;
    public final ArrayList c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public qs0(String str) {
        js3.p(str, "serialName");
        this.a = str;
        this.b = EmptyList.a;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static void a(qs0 qs0Var, String str, no7 no7Var) {
        EmptyList emptyList = EmptyList.a;
        qs0Var.getClass();
        js3.p(str, "elementName");
        js3.p(no7Var, "descriptor");
        js3.p(emptyList, "annotations");
        if (!qs0Var.d.add(str)) {
            StringBuilder sbN = t61.n("Element with name '", str, "' is already registered in ");
            sbN.append(qs0Var.a);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        qs0Var.c.add(str);
        qs0Var.e.add(no7Var);
        qs0Var.f.add(emptyList);
        qs0Var.g.add(false);
    }
}
