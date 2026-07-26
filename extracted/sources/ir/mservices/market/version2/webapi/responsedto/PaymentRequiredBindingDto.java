package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentRequiredBindingDto implements Serializable {
    public static final String BINDING_ANY = "any";
    public static final String BINDING_MAIL = "mail";
    public static final String BINDING_NONE = "none";
    public static final String BINDING_PHONE = "phone";
    public String bindingType;
    public String iconUrl;
    public String subTitle;
    public String title;
}
