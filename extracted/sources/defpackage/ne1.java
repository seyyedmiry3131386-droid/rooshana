package defpackage;

import kotlinx.coroutines.android.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ne1 {
    public static final qi1 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.android.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [me1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [qi1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [me1] */
    static {
        String property;
        ?? r0;
        int i = zd8.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            ug1 ug1Var = up1.a;
            r0 = sg4.a;
            a aVar = r0.f;
            if (!(r0 != 0)) {
                r0 = me1.j;
            }
        } else {
            r0 = me1.j;
        }
        a = r0;
    }
}
