package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class e81 implements Iterator {
    public final g81 a = new g81();
    public final StringBuilder b = new StringBuilder();
    public final int c;
    public int d;
    public final /* synthetic */ f81 e;

    public e81(f81 f81Var) {
        this.e = f81Var;
        this.c = ((String) f81Var.b).length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        g81 g81Var = this.a;
        g81Var.b = "";
        g81Var.c = "";
        StringBuilder sb = this.b;
        sb.setLength(0);
        int i = this.d;
        String strTrim = null;
        boolean z = false;
        String strTrim2 = null;
        while (true) {
            int i2 = this.c;
            if (i < i2) {
                char cCharAt = ((String) this.e.b).charAt(i);
                if (strTrim == null) {
                    if (':' == cCharAt) {
                        if (sb.length() > 0) {
                            strTrim = sb.toString().trim();
                        }
                        sb.setLength(0);
                    } else if (';' == cCharAt) {
                        sb.setLength(0);
                    } else if (Character.isWhitespace(cCharAt)) {
                        if (sb.length() > 0) {
                            z = true;
                        }
                    } else if (z) {
                        sb.setLength(0);
                        sb.append(cCharAt);
                        z = false;
                    } else {
                        sb.append(cCharAt);
                    }
                } else if (strTrim2 != null) {
                    continue;
                } else if (Character.isWhitespace(cCharAt)) {
                    if (sb.length() > 0) {
                        sb.append(cCharAt);
                    }
                } else if (';' == cCharAt) {
                    strTrim2 = sb.toString().trim();
                    sb.setLength(0);
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        this.d = i + 1;
                        g81Var.b = strTrim;
                        g81Var.c = strTrim2;
                        break;
                    }
                } else {
                    sb.append(cCharAt);
                }
                i++;
            } else if (strTrim != null && sb.length() > 0) {
                String strTrim3 = sb.toString().trim();
                g81Var.b = strTrim;
                g81Var.c = strTrim3;
                this.d = i2;
            }
        }
        return (TextUtils.isEmpty(g81Var.b) || TextUtils.isEmpty(g81Var.c)) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        g81 g81Var = this.a;
        String str = g81Var.b;
        String str2 = g81Var.c;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new NoSuchElementException();
        }
        return g81Var;
    }
}
