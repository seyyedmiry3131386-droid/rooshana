package ir.mservices.market.purchaseTransaction.data;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseTransactionDTO implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String PURCHASE_STATUS_CAN_REFUND = "CanRefund";
    public static final String PURCHASE_STATUS_UNKNOWN = "Unknown";
    public static final String PURCHASE_STATUS_USER_PURCHASED = "UserPurchased";

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("orderDateTime")
    private final String orderDateTime;

    @vo7("orderId")
    private final String orderId;

    @vo7("packageName")
    private final String packageName;

    @vo7("price")
    private final String price;

    @vo7("purchaseStatus")
    private String purchaseStatus;

    @vo7("title")
    private final String title;

    @vo7("trackingNumber")
    private final String trackingNumber;

    @vo7("type")
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public PurchaseTransactionDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        js3.p(str, "orderDateTime");
        js3.p(str2, "purchaseStatus");
        js3.p(str3, "orderId");
        js3.p(str4, "trackingNumber");
        js3.p(str5, "title");
        js3.p(str6, "iconUrl");
        js3.p(str7, "type");
        js3.p(str8, "price");
        this.orderDateTime = str;
        this.purchaseStatus = str2;
        this.orderId = str3;
        this.trackingNumber = str4;
        this.title = str5;
        this.iconUrl = str6;
        this.type = str7;
        this.price = str8;
        this.packageName = str9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PurchaseTransactionDTO.class.equals(obj.getClass())) {
            PurchaseTransactionDTO purchaseTransactionDTO = (PurchaseTransactionDTO) obj;
            if (js3.i(this.orderDateTime, purchaseTransactionDTO.orderDateTime) && js3.i(this.purchaseStatus, purchaseTransactionDTO.purchaseStatus) && js3.i(this.orderId, purchaseTransactionDTO.orderId) && js3.i(this.trackingNumber, purchaseTransactionDTO.trackingNumber) && js3.i(this.type, purchaseTransactionDTO.type) && js3.i(this.packageName, purchaseTransactionDTO.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getOrderDateTime() {
        return this.orderDateTime;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPurchaseStatus() {
        return this.purchaseStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingNumber() {
        return this.trackingNumber;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.orderDateTime, this.purchaseStatus, this.orderId, this.trackingNumber, this.type, this.packageName);
    }

    public final void setPurchaseStatus(String str) {
        js3.p(str, "<set-?>");
        this.purchaseStatus = str;
    }
}
