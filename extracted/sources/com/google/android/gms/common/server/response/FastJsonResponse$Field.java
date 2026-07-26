package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import defpackage.hh2;
import defpackage.ti9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final ti9 CREATOR = new ti9();
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int g;
    public final Class h;
    public final String i;
    public zan j;
    public final StringToIntConverter k;

    public FastJsonResponse$Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = z2;
        this.f = str;
        this.g = i4;
        if (str2 == null) {
            this.h = null;
            this.i = null;
        } else {
            this.h = SafeParcelResponse.class;
            this.i = str2;
        }
        if (zaaVar == null) {
            this.k = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaaVar.b;
        if (stringToIntConverter == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.k = stringToIntConverter;
    }

    public static FastJsonResponse$Field u(int i, String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i, null);
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        hh2Var.d(Integer.valueOf(this.a), "versionCode");
        hh2Var.d(Integer.valueOf(this.b), "typeIn");
        hh2Var.d(Boolean.valueOf(this.c), "typeInArray");
        hh2Var.d(Integer.valueOf(this.d), "typeOut");
        hh2Var.d(Boolean.valueOf(this.e), "typeOutArray");
        hh2Var.d(this.f, "outputFieldName");
        hh2Var.d(Integer.valueOf(this.g), "safeParcelFieldId");
        String str = this.i;
        if (str == null) {
            str = null;
        }
        hh2Var.d(str, "concreteTypeName");
        Class cls = this.h;
        if (cls != null) {
            hh2Var.d(cls.getCanonicalName(), "concreteType.class");
        }
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            hh2Var.d(stringToIntConverter.getClass().getCanonicalName(), "converterName");
        }
        return hh2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.D(parcel, 6, this.f, false);
        uy6.I(parcel, 7, 4);
        parcel.writeInt(this.g);
        zaa zaaVar = null;
        String str = this.i;
        if (str == null) {
            str = null;
        }
        uy6.D(parcel, 8, str, false);
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            if (!(stringToIntConverter instanceof StringToIntConverter)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            zaaVar = new zaa(stringToIntConverter);
        }
        uy6.C(parcel, 9, zaaVar, i, false);
        uy6.K(iJ, parcel);
    }

    public FastJsonResponse$Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
        this.a = 1;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = str;
        this.g = i3;
        this.h = cls;
        if (cls == null) {
            this.i = null;
        } else {
            this.i = cls.getCanonicalName();
        }
        this.k = null;
    }
}
