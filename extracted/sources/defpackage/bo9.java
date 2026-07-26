package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo9 extends fu2 {
    public static final qq4 m = new qq4("Nearby.CONNECTIONS_API", new qh9(7), new th0(26));
    public yk9 l;

    public final void g(String str) {
        x41 x41VarA;
        yk9 yk9Var = this.l;
        synchronized (yk9Var) {
            wv wvVar = yk9Var.c;
            if (!wvVar.containsKey(str)) {
                wvVar.put(str, new Object());
            }
            x41VarA = yk9Var.a(this, wvVar.get(str), "connection");
        }
        yk9 yk9Var2 = this.l;
        jx9 jx9Var = new jx9();
        jx9Var.d = x41VarA;
        jx9Var.b = th0.y;
        jx9Var.c = fz1.v;
        jx9Var.a = 1268;
        yk9Var2.b(this, jx9Var.b());
    }

    public final void h(String str) {
        o94 o94Var;
        yk9 yk9Var = this.l;
        synchronized (yk9Var) {
            wv wvVar = yk9Var.c;
            if (!wvVar.containsKey(str)) {
                wvVar.put(str, new Object());
            }
            Object obj = wvVar.get(str);
            rq4.o(obj, "Listener must not be null");
            rq4.l("connection", "Listener type must not be empty");
            o94Var = new o94(obj, "connection");
        }
        yk9Var.d(this, o94Var);
    }
}
