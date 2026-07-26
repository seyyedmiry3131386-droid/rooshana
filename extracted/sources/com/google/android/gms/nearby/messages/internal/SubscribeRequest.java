package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.cu9;
import defpackage.dw1;
import defpackage.hm9;
import defpackage.is9;
import defpackage.o40;
import defpackage.rm7;
import defpackage.rx9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new hm9(9);
    public final int a;
    public final is9 b;
    public final Strategy c;
    public final cu9 d;
    public final MessageFilter e;
    public final PendingIntent f;
    public final int g;
    public final String h;
    public final String i;
    public final byte[] j;
    public final boolean k;
    public final rx9 l;
    public final boolean m;
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        is9 is9Var;
        cu9 cu9Var;
        this.a = i;
        rx9 rx9Var = null;
        if (iBinder == null) {
            is9Var = null;
        } else {
            IBinder iBinder4 = iBinder;
            IInterface iInterfaceQueryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            is9Var = iInterfaceQueryLocalInterface instanceof is9 ? (is9) iInterfaceQueryLocalInterface : new is9(iBinder4);
        }
        this.b = is9Var;
        this.c = strategy;
        if (iBinder2 == null) {
            cu9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface2 instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface2 : new cu9(iBinder2);
        }
        this.d = cu9Var;
        this.e = messageFilter;
        this.f = pendingIntent;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = bArr;
        this.k = z;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            rx9Var = iInterfaceQueryLocalInterface3 instanceof rx9 ? (rx9) iInterfaceQueryLocalInterface3 : new rx9(iBinder3, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback", 3);
        }
        this.l = rx9Var;
        this.m = z2;
        this.n = ClientAppContext.u(clientAppContext, str2, str, z2);
        this.o = z3;
        this.p = i3;
        this.q = i4;
    }

    public final String toString() {
        String strK;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        String strValueOf5 = String.valueOf(this.f);
        byte[] bArr = this.j;
        if (bArr == null) {
            strK = null;
        } else {
            strK = dw1.k(bArr.length, " bytes>", new StringBuilder(SimpleComparison.LESS_THAN_OPERATION));
        }
        String strValueOf6 = String.valueOf(this.l);
        String strValueOf7 = String.valueOf(this.n);
        StringBuilder sbT = rm7.t("SubscribeRequest{messageListener=", strValueOf, ", strategy=", strValueOf2, ", callback=");
        o40.I(strValueOf3, ", filter=", strValueOf4, ", pendingIntent=", sbT);
        o40.I(strValueOf5, ", hint=", strK, ", subscribeCallback=", sbT);
        sbT.append(strValueOf6);
        sbT.append(", useRealClientApiKey=");
        sbT.append(this.m);
        sbT.append(", clientAppContext=");
        sbT.append(strValueOf7);
        sbT.append(", isDiscardPendingIntent=");
        sbT.append(this.o);
        sbT.append(", zeroPartyPackageName=");
        o40.I(this.h, ", realClientPackageName=", this.i, ", isIgnoreNearbyPermission=", sbT);
        sbT.append(this.k);
        sbT.append(", callingContext=");
        sbT.append(this.q);
        sbT.append("}");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        is9 is9Var = this.b;
        uy6.y(parcel, 2, is9Var == null ? null : is9Var.o);
        uy6.C(parcel, 3, this.c, i, false);
        cu9 cu9Var = this.d;
        uy6.y(parcel, 4, cu9Var == null ? null : cu9Var.o);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.I(parcel, 7, 4);
        parcel.writeInt(this.g);
        uy6.D(parcel, 8, this.h, false);
        uy6.D(parcel, 9, this.i, false);
        uy6.w(parcel, 10, this.j, false);
        uy6.I(parcel, 11, 4);
        parcel.writeInt(this.k ? 1 : 0);
        rx9 rx9Var = this.l;
        uy6.y(parcel, 12, rx9Var != null ? rx9Var.o : null);
        uy6.I(parcel, 13, 4);
        parcel.writeInt(this.m ? 1 : 0);
        uy6.C(parcel, 14, this.n, i, false);
        uy6.I(parcel, 15, 4);
        parcel.writeInt(this.o ? 1 : 0);
        uy6.I(parcel, 16, 4);
        parcel.writeInt(this.p);
        uy6.I(parcel, 17, 4);
        parcel.writeInt(this.q);
        uy6.K(iJ, parcel);
    }
}
