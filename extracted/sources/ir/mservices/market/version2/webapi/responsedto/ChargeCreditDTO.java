package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ChargeCreditDTO implements Serializable {
    private int amount;
    private String amountStr;
    private String giftStr;

    public int getAmount() {
        return this.amount;
    }

    public String getAmountStr() {
        return this.amountStr;
    }

    public String getGiftStr() {
        return this.giftStr;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public void setAmountStr(String str) {
        this.amountStr = str;
    }

    public void setGiftStr(String str) {
        this.giftStr = str;
    }
}
