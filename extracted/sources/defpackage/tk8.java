package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tk8 {
    public static final ThreadLocal a = new ThreadLocal();

    public static g42 a() {
        ThreadLocal threadLocal = a;
        g42 g42Var = (g42) threadLocal.get();
        if (g42Var != null) {
            return g42Var;
        }
        ed0 ed0Var = new ed0(Thread.currentThread());
        threadLocal.set(ed0Var);
        return ed0Var;
    }
}
