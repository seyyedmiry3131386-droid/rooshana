package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nh4 {
    public static final lh4 a;
    public static final lh4 b;

    static {
        hn6 hn6Var = hn6.c;
        lh4 lh4Var = null;
        try {
            lh4Var = (lh4) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = lh4Var;
        b = new lh4();
    }
}
