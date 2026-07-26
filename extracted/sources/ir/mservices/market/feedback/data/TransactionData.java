package ir.mservices.market.feedback.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c88;
import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String date;
    private final String imgUrl;
    private final String orderId;
    private final String packageName;
    private final String price;
    private final String title;
    private final String type;

    public static final class CREATOR implements Parcelable.Creator<TransactionData> {
        public /* synthetic */ CREATOR(yd1 yd1Var) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionData createFromParcel(Parcel parcel) {
            js3.p(parcel, "parcel");
            return new TransactionData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransactionData[] newArray(int i) {
            return new TransactionData[i];
        }
    }

    public TransactionData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        js3.p(str, "title");
        js3.p(str2, "date");
        js3.p(str3, "imgUrl");
        js3.p(str4, "price");
        js3.p(str5, "type");
        js3.p(str6, "orderId");
        this.title = str;
        this.date = str2;
        this.imgUrl = str3;
        this.price = str4;
        this.type = str5;
        this.orderId = str6;
        this.packageName = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getImgUrl() {
        return this.imgUrl;
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

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.date);
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.price);
        parcel.writeString(this.type);
        parcel.writeString(this.orderId);
        parcel.writeString(this.packageName);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionData(Parcel parcel) {
        js3.p(parcel, "parcel");
        int i = c88.a;
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        this(str, str2, str3, str4, str5, str6, string7 == null ? "" : string7);
    }
}
