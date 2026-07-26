package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 {
    public final List a;

    public fz0(List list) {
        this.a = list;
    }

    public final boolean a() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((gz0) list.get(i)).getClass();
        }
        return false;
    }
}
