package ir.mservices.market.login.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.qt4;
import ir.mservices.market.version2.webapi.responsedto.AccountInfoDto;

/* JADX INFO: loaded from: classes3.dex */
public final class PinBindData implements BindData {
    public static final Parcelable.Creator<PinBindData> CREATOR = new qt4(22);
    public final String a;
    public final String b;
    public int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public String h;

    public PinBindData(AccountInfoDto accountInfoDto, String str) {
        js3.p(accountInfoDto, "accountInfoDto");
        this.a = str;
        this.b = accountInfoDto.getTranslatedMessage();
        this.c = accountInfoDto.getLength();
        this.e = accountInfoDto.getAvatarUrl();
        this.f = accountInfoDto.getNickname();
        this.d = accountInfoDto.getDelayInSec();
        this.g = accountInfoDto.isVoiceMsgEnable();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.h);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte((byte) 0);
        parcel.writeString("");
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeByte((byte) 0);
        parcel.writeInt(this.d);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public PinBindData(Parcel parcel) {
        this.h = parcel.readString();
        String string = parcel.readString();
        this.a = string == null ? "" : string;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        parcel.readByte();
        parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        parcel.readByte();
        this.d = parcel.readInt();
        this.g = parcel.readByte() == 1;
    }
}
