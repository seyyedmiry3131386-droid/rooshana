package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vk4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new e();
    public final vk4 a;
    public final vk4 b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public TimeModel(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.c = i4;
        this.g = i >= 12 ? 1 : 0;
        this.a = new vk4(59);
        this.b = new vk4(i4 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.c == 1) {
            return this.d % 24;
        }
        int i = this.d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.c == 1) {
            this.d = i;
        } else {
            this.d = (i % 12) + (this.g != 1 ? 0 : 12);
        }
    }

    public final void d(int i) {
        if (i != this.g) {
            this.g = i;
            int i2 = this.d;
            if (i2 < 12 && i == 1) {
                this.d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.d = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.d == timeModel.d && this.e == timeModel.e && this.c == timeModel.c && this.f == timeModel.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.c);
    }
}
