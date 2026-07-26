package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationList implements Serializable {
    public ArrayList<ApplicationDTO> apps;

    public ApplicationList(ArrayList<ApplicationDTO> arrayList) {
        this.apps = arrayList;
    }
}
