package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v84 {
    public static final u84 a;
    public static final u84 b;

    static {
        hn6 hn6Var = hn6.c;
        u84 u84Var = null;
        try {
            u84Var = (u84) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u84Var;
        b = new u84();
    }
}
