package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class rr9 {
    public static final wv a = new wv(0);

    public static synchronized void a() {
        wv wvVar = a;
        Iterator it = ((vv) wvVar.values()).iterator();
        if (it.hasNext()) {
            ((rr9) it.next()).getClass();
            throw null;
        }
        wvVar.clear();
    }
}
