package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class in5 {
    public static final gn5 a;
    public static final gn5 b;

    static {
        gn5 gn5Var = null;
        try {
            gn5Var = (gn5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = gn5Var;
        b = new gn5();
    }
}
