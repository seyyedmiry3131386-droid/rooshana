package ir.mservices.market.version2.webapi.responsedto;

import defpackage.bf5;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationStateListDto implements Serializable, bf5 {
    private List<ApplicationStateDto> items;

    @Override // defpackage.bf5
    public boolean endOfList() {
        return true;
    }

    public List<ApplicationStateDto> getItems() {
        return this.items;
    }

    public void setItems(List<ApplicationStateDto> list) {
        this.items = list;
    }
}
