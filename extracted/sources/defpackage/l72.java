package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l72 {
    public static final j72 a = new j72();
    public static final j72 b;

    static {
        j72 j72Var = null;
        try {
            j72Var = (j72) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = j72Var;
    }
}
