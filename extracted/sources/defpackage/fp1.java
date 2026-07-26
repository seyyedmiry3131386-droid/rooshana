package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class fp1 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public ry g;
    public int h;
    public long i;
    public final /* synthetic */ mp1 j;

    public fp1(mp1 mp1Var, String str) {
        js3.p(str, "key");
        this.j = mp1Var;
        this.a = str;
        mp1Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            ArrayList arrayList = this.c;
            s26 s26Var = this.j.a;
            String string = sb.toString();
            js3.o(string, "toString(...)");
            arrayList.add(s26Var.e(string));
            sb.append(".tmp");
            ArrayList arrayList2 = this.d;
            s26 s26Var2 = this.j.a;
            String string2 = sb.toString();
            js3.o(string2, "toString(...)");
            arrayList2.add(s26Var2.e(string2));
            sb.setLength(length);
        }
    }

    public final hp1 a() {
        TimeZone timeZone = ih9.a;
        if (!this.e) {
            return null;
        }
        mp1 mp1Var = this.j;
        if (!mp1Var.l && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                t18 t18VarK0 = mp1Var.b.k0((s26) this.c.get(i));
                if (!mp1Var.l) {
                    this.h++;
                    t18VarK0 = new dp1(t18VarK0, mp1Var, this);
                }
                arrayList.add(t18VarK0);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    gh9.b((t18) it.next());
                }
                try {
                    mp1Var.P(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new hp1(this.j, this.a, this.i, arrayList, jArr);
    }
}
