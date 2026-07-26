package ir.mservices.market.version2.webapi.responsedto;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentConfigDTO implements Serializable {
    public static final String V1 = "v1";
    public static final String V2 = "v2";
    private PaymentRequiredBindingDto binding;
    private String discountIconUrl;
    private String discountMessage;
    private List<GatewayDTO> gateways;
    private String guarantee;
    private String iconUrl;
    private String layoutMode;
    private String price;
    private String realPrice;
    private String title;

    public PaymentRequiredBindingDto getBinding() {
        return this.binding;
    }

    public String getDiscountIconUrl() {
        return this.discountIconUrl;
    }

    public String getDiscountMessage() {
        return this.discountMessage;
    }

    public List<GatewayDTO> getGateways() {
        return this.gateways;
    }

    public String getGuarantee() {
        return this.guarantee;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getLayoutMode() {
        String str = this.layoutMode;
        return (str == null || TextUtils.isEmpty(str)) ? "v1" : this.layoutMode;
    }

    public String getPrice() {
        return this.price;
    }

    public String getRealPrice() {
        return this.realPrice;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDiscountMessage(String str) {
        this.discountMessage = str;
    }

    public void setGateways(List<GatewayDTO> list) {
        this.gateways = list;
    }

    public void setGuarantee(String str) {
        this.guarantee = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRealPrice(String str) {
        this.realPrice = str;
    }
}
