package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.nearby.zziq;
import defpackage.dw1;
import defpackage.nj9;
import defpackage.rm7;
import defpackage.rq4;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new nj9(10);
    public static final zziq[] g = {zziq.d};
    public final int a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final zziq[] e;
    public final long f;

    public Message(int i, byte[] bArr, String str, String str2, zziq[] zziqVarArr, long j) {
        this.a = i;
        rq4.n(str2);
        this.c = str2;
        this.d = str == null ? "" : str;
        this.f = j;
        rq4.n(bArr);
        int length = bArr.length;
        Object[] objArr = {Integer.valueOf(length), 102400};
        if (!(length <= 102400)) {
            throw new IllegalArgumentException(String.format("Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", objArr));
        }
        this.b = bArr;
        this.e = (zziqVarArr == null || zziqVarArr.length == 0) ? g : zziqVarArr;
        boolean z = str2.length() <= 32;
        Object[] objArr2 = {Integer.valueOf(str2.length()), 32};
        if (!z) {
            throw new IllegalArgumentException(String.format("Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", objArr2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.d, message.d) && TextUtils.equals(this.c, message.c) && Arrays.equals(this.b, message.b) && this.f == message.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c, Integer.valueOf(Arrays.hashCode(this.b)), Long.valueOf(this.f)});
    }

    public final String toString() {
        byte[] bArr = this.b;
        return dw1.k(bArr == null ? 0 : bArr.length, " bytes]}", rm7.t("Message{namespace='", this.d, "', type='", this.c, "', content=["));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 1, this.b, false);
        uy6.D(parcel, 2, this.c, false);
        uy6.D(parcel, 3, this.d, false);
        uy6.G(parcel, 4, this.e, i);
        uy6.I(parcel, 5, 8);
        parcel.writeLong(this.f);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
