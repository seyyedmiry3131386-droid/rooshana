package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new th9(9);
    public final int a;
    public final int b;
    public final Long c;
    public final Long d;
    public final int e;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = l;
        this.d = l2;
        this.e = i3;
        if (l != null && l2 != null && l2.longValue() != 0 && l2.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.B(parcel, 3, this.c);
        uy6.B(parcel, 4, this.d);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.K(iJ, parcel);
    }
}
