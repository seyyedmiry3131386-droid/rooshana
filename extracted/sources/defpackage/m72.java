package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m72 {
    public static final k72 a = new k72();
    public static final k72 b;

    static {
        hn6 hn6Var = hn6.c;
        k72 k72Var = null;
        try {
            k72Var = (k72) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = k72Var;
    }
}
