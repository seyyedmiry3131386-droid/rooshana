package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ChargeCreditsListDto implements Serializable {
    private List<ChargeCreditDTO> items;

    public ChargeCreditsListDto(List<ChargeCreditDTO> list) {
        this.items = list;
    }

    public List<ChargeCreditDTO> getItems() {
        return this.items;
    }
}
