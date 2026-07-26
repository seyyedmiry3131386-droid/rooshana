package retrofit2;

import defpackage.g77;
import defpackage.h77;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    public final int a;
    public final transient h77 b;

    public HttpException(h77 h77Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        g77 g77Var = h77Var.a;
        int i = g77Var.d;
        sb.append(i);
        sb.append(" ");
        sb.append(g77Var.c);
        super(sb.toString());
        this.a = i;
        this.b = h77Var;
    }
}
