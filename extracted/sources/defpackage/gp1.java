package defpackage;

import coil3.disk.a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public ry g;
    public int h;
    public final /* synthetic */ a i;

    public gp1(a aVar, String str) {
        this.i = aVar;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final ip1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            a aVar = this.i;
            if (i >= size) {
                this.h++;
                return new ip1(aVar, this);
            }
            if (!aVar.q.D((s26) arrayList.get(i))) {
                try {
                    aVar.J(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
