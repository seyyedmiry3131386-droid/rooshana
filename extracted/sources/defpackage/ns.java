package defpackage;

import com.google.android.gms.common.annotation.KeepName;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ns {

    @KeepName
    public ms serverList;

    @KeepName
    public List<String> serviceList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        List<String> list = this.serviceList;
        if (list == null ? nsVar.serviceList != null : !list.equals(nsVar.serviceList)) {
            return false;
        }
        ms msVar = this.serverList;
        ms msVar2 = nsVar.serverList;
        return msVar == null ? msVar2 == null : msVar.equals(msVar2);
    }

    public final int hashCode() {
        List<String> list = this.serviceList;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        ms msVar = this.serverList;
        return iHashCode + (msVar != null ? msVar.hashCode() : 0);
    }

    public final String toString() {
        return "ServiceServerList{serviceList=" + this.serviceList + ", serverList=" + this.serverList + '}';
    }
}
