package defpackage;

import com.google.android.gms.common.annotation.KeepName;
import ir.mservices.market.version2.manager.serverUrl.AppServersModel$AppServersParseException;
import ir.mservices.market.version2.webapi.responsedto.ServerUrlDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qs {
    public static final th0 a;
    public static final fz1 b;

    @KeepName
    public ms defaultServerList;

    @KeepName
    public String fallbackServerUrl;

    @KeepName
    public List<ns> serviceServerLists;

    static {
        int i = 28;
        a = new th0(i);
        b = new fz1(i);
    }

    public static ArrayList a(os osVar, List list) throws AppServersModel$AppServersParseException {
        if (list == null || list.size() == 0) {
            throw new AppServersModel$AppServersParseException("Given list is empty");
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strJ = osVar.j((String) it.next());
            if (strJ != null) {
                if (arrayList.contains(strJ)) {
                    list.toString();
                } else {
                    arrayList.add(strJ);
                }
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        throw new AppServersModel$AppServersParseException("No item is valid in list, " + list);
    }

    public static qs b(ServerUrlDTO serverUrlDTO, String str) {
        if (serverUrlDTO == null) {
            throw new AppServersModel$AppServersParseException("Given ServerUrlDTO is null");
        }
        qs qsVar = new qs();
        List<String> asl = serverUrlDTO.getAsl();
        th0 th0Var = a;
        ms msVar = new ms(-1, a(th0Var, asl));
        qsVar.defaultServerList = msVar;
        if (str == null) {
            qsVar.fallbackServerUrl = msVar.servers.get(0);
        } else {
            String strJ = th0Var.j(str);
            qsVar.fallbackServerUrl = strJ;
            if (strJ == null) {
                throw new AppServersModel$AppServersParseException("Fallback server URL is not correct, ".concat(str));
            }
        }
        List<ServerUrlDTO.ServiceServerList> serviceServerLists = serverUrlDTO.getServiceServerLists();
        if (serviceServerLists != null && serviceServerLists.size() != 0) {
            qsVar.serviceServerLists = new ArrayList(serviceServerLists.size());
            for (int i = 0; i < serviceServerLists.size(); i++) {
                ServerUrlDTO.ServiceServerList serviceServerList = serviceServerLists.get(i);
                ArrayList arrayListA = a(b, serviceServerList.getServiceList());
                ms msVar2 = new ms(i, a(th0Var, serviceServerList.getServerList()));
                List<ns> list = qsVar.serviceServerLists;
                ns nsVar = new ns();
                nsVar.serviceList = arrayListA;
                nsVar.serverList = msVar2;
                list.add(nsVar);
            }
        }
        return qsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        String str = this.fallbackServerUrl;
        if (str == null ? qsVar.fallbackServerUrl != null : !str.equals(qsVar.fallbackServerUrl)) {
            return false;
        }
        ms msVar = this.defaultServerList;
        if (msVar == null ? qsVar.defaultServerList != null : !msVar.equals(qsVar.defaultServerList)) {
            return false;
        }
        List<ns> list = this.serviceServerLists;
        List<ns> list2 = qsVar.serviceServerLists;
        return list == null ? list2 == null : list.equals(list2);
    }

    public final int hashCode() {
        String str = this.fallbackServerUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ms msVar = this.defaultServerList;
        int iHashCode2 = (iHashCode + (msVar != null ? msVar.hashCode() : 0)) * 31;
        List<ns> list = this.serviceServerLists;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppServersModel{fallbackServerUrl='");
        sb.append(this.fallbackServerUrl);
        sb.append("', defaultServerList=");
        sb.append(this.defaultServerList);
        sb.append(", serviceServerLists=");
        return dw1.t(sb, this.serviceServerLists, '}');
    }
}
