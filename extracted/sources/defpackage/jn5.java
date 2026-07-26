package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jn5 {
    public static final hn5 a;
    public static final hn5 b;

    static {
        hn6 hn6Var = hn6.c;
        hn5 hn5Var = null;
        try {
            hn5Var = (hn5) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hn5Var;
        b = new hn5();
    }
}
