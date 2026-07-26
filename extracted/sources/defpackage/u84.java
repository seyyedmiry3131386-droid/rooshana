package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u84 {
    public static sr3 a(long j, Object obj) {
        sr3 sr3Var = (sr3) vy8.c.h(j, obj);
        if (((a2) sr3Var).a) {
            return sr3Var;
        }
        int size = sr3Var.size();
        sr3 sr3VarG = sr3Var.g(size == 0 ? 10 : size * 2);
        vy8.o(j, obj, sr3VarG);
        return sr3VarG;
    }
}
