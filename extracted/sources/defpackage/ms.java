package defpackage;

import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ms {

    @KeepName
    public int id;

    @KeepName
    public int index = 0;

    @KeepName
    public List<String> servers;

    public ms(int i, ArrayList arrayList) {
        this.id = i;
        this.servers = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        List<String> list = this.servers;
        List<String> list2 = ((ms) obj).servers;
        return list == null ? list2 == null : list.equals(list2);
    }

    public final int hashCode() {
        List<String> list = this.servers;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerList{id=");
        sb.append(this.id);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", servers=");
        return dw1.t(sb, this.servers, '}');
    }
}
