package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g27 {
    public static final i27 a;

    static {
        i27 i27Var = null;
        try {
            i27Var = (i27) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i27Var == null) {
            i27Var = new i27();
        }
        a = i27Var;
    }

    public static ps0 a(Class cls) {
        a.getClass();
        return new ps0(cls);
    }
}
