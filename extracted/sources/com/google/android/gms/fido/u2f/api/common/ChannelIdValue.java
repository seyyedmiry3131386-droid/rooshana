package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bl4;
import defpackage.sk9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new sk9(25);
    public final ChannelIdValueType a;
    public final String b;
    public final String c;

    public enum ChannelIdValueType implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();
        public final int a;

        ChannelIdValueType(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.a = u(i);
            this.b = str;
            this.c = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ChannelIdValueType u(int i) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.a) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(bl4.q(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.a;
        ChannelIdValueType channelIdValueType2 = this.a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.b.equals(channelIdValue.b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.c.equals(channelIdValue.c);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.a;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.c.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a.a;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        uy6.D(parcel, 3, this.b, false);
        uy6.D(parcel, 4, this.c, false);
        uy6.K(iJ, parcel);
    }

    public ChannelIdValue(String str) {
        this.b = str;
        this.a = ChannelIdValueType.STRING;
        this.c = null;
    }
}
