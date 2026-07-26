package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.nearby.zziq;
import com.google.android.gms.nearby.messages.Message;
import defpackage.hm9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new hm9(12);
    public final int a;
    public final int b;
    public final Message c;
    public final zze d;
    public final zza e;
    public final zziq f;
    public final byte[] g;

    public Update(int i, int i2, Message message, zze zzeVar, zza zzaVar, zziq zziqVar, byte[] bArr) {
        this.a = i;
        boolean zU = u(i2, 2);
        this.b = true == zU ? 2 : i2;
        this.c = message;
        this.d = true == zU ? null : zzeVar;
        this.e = true == zU ? null : zzaVar;
        this.f = true == zU ? null : zziqVar;
        this.g = true == zU ? null : bArr;
    }

    public static boolean u(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.b == update.b && vy2.w(this.c, update.c) && vy2.w(this.d, update.d) && vy2.w(this.e, update.e) && vy2.w(this.f, update.f) && Arrays.equals(this.g, update.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.Update.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.w(parcel, 7, this.g, false);
        uy6.K(iJ, parcel);
    }
}
