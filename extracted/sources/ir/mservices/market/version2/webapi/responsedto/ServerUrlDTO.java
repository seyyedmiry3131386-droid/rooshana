package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ServerUrlDTO implements Serializable {
    private List<String> asl;
    private List<ServiceServerList> serviceServerLists;

    public static class ServiceServerList implements Serializable {
        private List<String> serverList;
        private List<String> serviceList;

        public List<String> getServerList() {
            return this.serverList;
        }

        public List<String> getServiceList() {
            return this.serviceList;
        }

        public void setServerList(List<String> list) {
            this.serverList = list;
        }

        public void setServiceList(List<String> list) {
            this.serviceList = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ServiceServerList{serviceList=");
            sb.append(this.serviceList);
            sb.append(", serverList=");
            return dw1.t(sb, this.serverList, '}');
        }
    }

    public List<String> getAsl() {
        return this.asl;
    }

    public List<ServiceServerList> getServiceServerLists() {
        return this.serviceServerLists;
    }

    public void setAsl(List<String> list) {
        this.asl = list;
    }

    public void setServiceServerLists(List<ServiceServerList> list) {
        this.serviceServerLists = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerUrlDTO{asl=");
        sb.append(this.asl);
        sb.append(", serviceServerLists=");
        return dw1.t(sb, this.serviceServerLists, '}');
    }
}
