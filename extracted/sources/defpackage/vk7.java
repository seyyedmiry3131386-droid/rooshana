package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class vk7 implements uk7 {
    public final qk7 a;

    public vk7(qk7 qk7Var) {
        this.a = qk7Var;
    }

    public final List a(String str) {
        js3.p(str, "movieId");
        List list = (List) this.a.a.get(str);
        return list == null ? EmptyList.a : list;
    }
}
