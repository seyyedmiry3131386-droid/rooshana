package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mh4 {
    public static final kh4 a;
    public static final kh4 b;

    static {
        kh4 kh4Var = null;
        try {
            kh4Var = (kh4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kh4Var;
        b = new kh4();
    }
}
