package defpackage;

import androidx.media3.common.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hz7 implements iv4 {
    public final ArrayList a;

    public hz7(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((gz7) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((gz7) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((gz7) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        vy2.j(!z);
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ void b(pp4 pp4Var) {
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hz7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
